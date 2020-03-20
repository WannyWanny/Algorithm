package Baekjoon.백트래킹;

import java.util.Scanner;

public class Main_14888 {
    static int N;
    static int[] arr;
    static int[] op;
    static int max, min;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N];
        op = new int[4];
        for(int i=0; i<N; i++) arr[i]=sc.nextInt();
        for(int i=0; i<4; i++) op[i] = sc.nextInt();
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
    }

}
