package Baekjoon;

import java.util.Scanner;

public class Main_2747 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[50];
        arr[1] = 1;
        for(int i=2; i<=45; i++){
            arr[i] = arr[i-2]+arr[i-1];
        }

        System.out.println(arr[n]);

    }
}
