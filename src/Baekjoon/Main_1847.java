package Baekjoon.스택;

import java.util.Scanner;
import java.util.Stack;

public class Main_1847 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> st = new Stack<Integer>();
        boolean flag = true;
        int[] arr =new int[n];
        StringBuilder sb =new StringBuilder();
        int num=1;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();

            if(flag){
                if(num<=arr[i]){
                    while(num<=arr[i]){
                        st.push(num++);
                        sb.append("+ \n");
                    }
                }
                if(st.isEmpty()) flag = false;
                else{
                    while(st.peek() >= arr[i]){
                        st.pop();
                        sb.append("- \n");
                        if(st.isEmpty()) break;
                    }
                }
            }
        }

        if(flag)
            System.out.println(sb.toString());
        else
            System.out.println("NO");

    }
}
