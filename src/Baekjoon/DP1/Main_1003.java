package Baekjoon.DP1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=T; tc++){
            long[][] dp = new long[41][2];
            dp[0][0] = 1; dp[0][1]=0;
            dp[1][0] = 0; dp[1][1]=1;
            for(int i=2; i<dp.length; i++){
                dp[i][0] = dp[i-2][0]+dp[i-1][0];
                dp[i][1] = dp[i-2][1]+dp[i-1][1];
            }

            int N = Integer.parseInt(br.readLine());
            System.out.println(dp[N][0]+" "+dp[N][1]);
        }
    }
}
