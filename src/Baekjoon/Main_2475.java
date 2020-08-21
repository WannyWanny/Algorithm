package Baekjoon;

import java.util.Scanner;

public class Main_2475 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr = new int[5];
        int temp=0;
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            temp += arr[i]*arr[i];
        }

        System.out.println(temp%10);
    }
}
