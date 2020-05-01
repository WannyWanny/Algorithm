package Baekjoon.스택;

import java.util.Scanner;
import java.util.Stack;

public class Main_10773 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int k = sc.nextInt();
        Stack<Integer> st = new Stack<Integer>();
        for(int i=1; i<=k; i++){
            int n = sc.nextInt();
            if(n != 0){
                st.push(n);
            }
            else if(n == 0){
                st.pop();
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum += st.peek();
            st.pop();
        }

        System.out.println(sum);
    }
}
