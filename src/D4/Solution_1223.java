import java.util.Scanner;
import java.util.Stack;

public class Solution_1223 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int tc = 1; tc <= 10; tc++) {
            Stack<Character> stack = new Stack<>();                     //연산자 담는 스택
            int len = sc.nextInt();
            String str = sc.next();
            char[] ch = new char[len];
            int ans=0;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (Character.isDigit(c)) {
                     ch[i]=stack.push(c);
                    System.out.print(ch[i]);
                }
                else{
                    if(stack.isEmpty()){
                        stack.push(c);
                    }
                    else if(c == '+'){
                        while(!stack.isEmpty()){
                         ch[i]=stack.pop();
                        }
                        stack.push(c);
                    }
                    else if(c == '*'){
                        while(!stack.isEmpty() && stack.peek() != '+'){
                            ch[i]=stack.pop();
                        }
                         stack.push(c);
                    }
                }
            }
            for(int i=0; i<ch.length; i++) {
                System.out.print(ch[i]);
            }
           // System.out.println("#"+tc+" "+ans);
        }
    }
}
