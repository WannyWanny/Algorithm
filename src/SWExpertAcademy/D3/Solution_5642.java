package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_5642 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int N = sc.nextInt();
            long[] dp = new long[100001];
            for(int i=0; i<N; i++)
                dp[i] = sc.nextLong();
            long max = dp[0];
            for(int i=1; i<N; i++){
                if(dp[i-1]>0 && dp[i]+dp[i-1]>0)
                    dp[i]+=dp[i-1];

                if(max<dp[i]){
                    max=dp[i];
                }
            }

            System.out.println("#"+tc+" "+max);
        }
    }
}
