package Baekjoon;

import java.util.Scanner;

public class Main_2875 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        System.out.println(Math.min(Math.min(N/2, M), (N+M-K)/3));
    }
}
