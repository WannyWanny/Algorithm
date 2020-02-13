package SWExpertAcademy.D4;

import java.util.Scanner;
import java.util.Stack;

public class Solution_1224 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int tc = 1; tc <= 10; tc++) {
            Stack<Character> stack = new Stack<>();             //연산자 담는 스택
            Stack<Integer> calStack = new Stack<>();            //계산결과를 담을 스택
            int len = sc.nextInt();
            String str = sc.next();
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (Character.isDigit(c)) {
                    sb.append(c);
                }
                else{
                    if(stack.isEmpty()){
                        stack.push(c);
                    }
                    else if(c == '+'){
                        while(!stack.isEmpty() && stack.peek() !='('){
                            sb.append(stack.pop());
                        }
                        stack.push(c);
                    }
                    else if(c == '*'){
                        while(!stack.isEmpty() && stack.peek() != '+' && stack.peek() !='('){
                            sb.append(stack.pop());
                        }
                        stack.push(c);
                    } else if(c == '('){
                        stack.push(c);
                    }
                    else if(c == ')'){
                        char top = stack.pop();
                        while(!stack.isEmpty() && top != '('){
                            sb.append(top);
                            top = stack.pop();
                        }
                    }
                }
            }
            while(!stack.isEmpty())
                sb.append(stack.pop());

            //중위연산자를 후위연산자로 바꿧으니 계산 실행
            for(int i=0; i<sb.length(); i++){
                char ch = sb.charAt(i);

                if(Character.isDigit(ch))
                    calStack.push(ch-'0');
                else{
                    int num2 = calStack.pop();
                    int num1 = calStack.pop();
                    switch(ch){
                        case '+':
                            calStack.push(num1+num2);
                            break;
                        case '*':
                            calStack.push(num1*num2);
                    }
                }
            }
            System.out.println("#"+tc+" "+calStack.pop());
        }

    }
}

