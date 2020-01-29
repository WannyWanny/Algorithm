package D4;
import java.util.Stack;
import java.util.Scanner;

public class Solution_5432_stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int result=0;
            Stack<Character> stack = new Stack<>();
            String str = sc.next();
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i) == '('){
                    stack.push('(');
                }
                else if(str.charAt(i) == ')'){
                    stack.pop();
                    if(str.charAt(i-1)=='('){
                        result += stack.size();
                    }
                    else if(str.charAt(i-1)==')'){
                        result++;
                    }
                }
            }

            System.out.println("#"+tc+" "+result);
        }//end of test
    }
}
