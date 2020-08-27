package Baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class Main_2504 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<String> st = new Stack<>();
        int val = 0;

        st.push(String.valueOf(str.charAt(0)));

        for(int i=1; i<str.length(); i++){
            String temp = String.valueOf(str.charAt(i));
//            case 1: 여는 괄호1, 2
            if(temp.equals("(") || temp.equals("[")){
                st.push(temp);
            }
//            case 2: 닫는 괄호1
            else if(temp.equals(")")){
                if(st.peek().equals("(")){
                    st.pop();
                    st.push("2");
                }
                else{
                    int num=0;
                    while(!st.isEmpty()){
                        String pop = st.pop();
                        if(pop.equals(")") || pop.equals("[") || pop.equals("]")){
                            System.out.println(0);
                            return;
                        }
                        if(pop.equals("(")){
                            st.push(String.valueOf(num*2));
                            break;
                        }
                        num += Integer.parseInt(pop);
                    }
                    if(st.isEmpty()){
                        System.out.println(0);
                        return;
                    }
                }
            }
//            case 3: 닫는 괄호2    -> case 2랑 동일
            else if(temp.equals("]")){
                if(st.peek().equals("[")){
                    st.pop();
                    st.push("3");
                }
                else{
                    int num=0;
                    while(!st.isEmpty()){
                        String pop = st.pop();
                        if(pop.equals(")") || pop.equals("(") || pop.equals("]")){
                            System.out.println(0);
                            return;
                        }
                        if(pop.equals("[")){
                            st.push(String.valueOf(num*3));
                            break;
                        }
                        num += Integer.parseInt(pop);
                    }
                    if(st.isEmpty()){
                        System.out.println(0);
                        return;
                    }
                }
            }
//            case 4: 예외처리
            else{
                System.out.println(0);
                return;
            }
        }   //end of for

//        숫자 전부 더하자
        while(!st.isEmpty()){
            String pop = st.pop();
            if(pop.equals("(")||pop.equals(")") || pop.equals("[") || pop.equals("]")){
                System.out.println(0);
                return;
            }
            val += Integer.parseInt(pop);
        }
//        값 출력
        System.out.println(val);
    }
}
