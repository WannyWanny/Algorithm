package Baekjoon.DP1;

import java.util.Scanner;

public class Main_1904 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        long[] dp = new long[1000001];
        int n = sc.nextInt();
        dp[1] = 1; dp[2]=2;
        for(int i=3; i<dp.length; i++){
            dp[i] = (dp[i-2]+dp[i-1])%15746;
        }
        System.out.println(dp[n]);
    }
}
