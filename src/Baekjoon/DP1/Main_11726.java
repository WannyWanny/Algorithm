package Baekjoon.DP1;

import java.util.Scanner;

public class Main_11726 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        long[] dp = new long[1001];
        dp[1] = 1;
        dp[2] = 2;
        if(n>=3){
            for(int i=3; i<=n; i++){
                dp[i] = dp[i-1]+dp[i-2];
                dp[i] %= 10007;
            }
        }
        System.out.println(dp[n]);
    }
}
