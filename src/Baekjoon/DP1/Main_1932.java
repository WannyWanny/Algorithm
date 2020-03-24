package Baekjoon.DP1;

import java.util.Scanner;

public class Main_1932 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dp = new int[n+1][n+1];
        for(int r=0; r<n; r++){
            for(int c=0; c<=r; c++){
                dp[r][c] = sc.nextInt();
            }
        }

        int max=0;
        for(int i=1; i<=n; i++){
            for(int j=0; j<=i; j++){
                if(j==0) dp[i][j] += dp[i-1][j];
                else if(j==i) dp[i][j] += dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-1])+dp[i][j];

                if(max<dp[i][j]) max=dp[i][j];
            }
        }

        System.out.println(max);
    }
}
