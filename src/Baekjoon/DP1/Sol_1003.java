package Baekjoon.DP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sol_1003 {
    private static int chkZero = 0;
    private static int chkOne = 0;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            int m = Integer.parseInt(br.readLine());
            long[] dp = new long[40];
            dp[0] = 0;
            dp[1] = 1;
            for (int j = 2; j <= m; j++) {
                    dp[j] = dp[j - 2] + dp[j - 1];
            }
            for(int k=0; k<m; k++){
                if(dp[k] == 0)
                    chkZero++;
                if(dp[k] == 1)
                    chkOne++;
               }
            System.out.println(chkZero + " "+chkOne);
        }
    }
}
