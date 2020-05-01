package Baekjoon.DP1;

import java.util.Scanner;

public class Main_9461 {
    public static void main(String[] args) {
        long[] dp = new long[101];
        dp[1] = 1; dp[2]=1; dp[3]=1; dp[4]=2; dp[5]=2;
        for(int i=6; i<dp.length; i++){
            dp[i] = dp[i-1]+dp[i-5];
        }

        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int N = sc.nextInt();
            System.out.println(dp[N]);
        }
    }
}
