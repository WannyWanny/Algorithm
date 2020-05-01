package Baekjoon.스택;

import java.io.*;
import java.util.Stack;


public class Main_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            String str = br.readLine();

            if(str.equals(".")){
                bw.flush();
                bw.close();
                return;
            }

            Stack<Character> stack = new Stack<Character>();
            boolean result = true;

            for(char one: str.toCharArray()){
                if(one=='(' || one =='[')
                    stack.push(one);
                else  if(one==')'){
                    if(stack.isEmpty() || stack.pop() != '('){
                        result = false;
                        break;
                    }
                } else if(one == ']'){
                    if(stack.isEmpty() || stack.pop() != ']'){
                        result = false;
                        break;
                    }
                }
            }

            if(!stack.isEmpty())
                result = false;

            if(result)
                bw.write("yes\n");
            else
                bw.write("no\n");
        }
    }
}
