package SWExpertAcademy.D4;

import java.util.Scanner;

public class Solution_9659 {
    static final int MOD = 998244353;
    //재귀쓰면 분명 시간초과 나게 생김. DP로 ㄱㄱ
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int n = sc.nextInt();
            int[] t = new int[n+1];
            int[] a = new int[n+1];
            int[] b = new int[n+1];
            for(int i=2; i<=n; i++){
                t[i] = sc.nextInt();
                a[i] = sc.nextInt();
                b[i] = sc.nextInt();
            }

            System.out.print("#"+tc);
            int m = sc.nextInt();
            long[] dp = new long[51];       //정답 받을 배열
            for(int i=0; i<m; i++){
                int num = sc.nextInt();
                dp[0] = 1;
                dp[1] = num;
                for(int j=2; j<=n; j++){
                    if(t[j]==1){
                        dp[j] = (dp[a[j]]+dp[b[j]])%MOD;
                    }
                    else if(t[j]==2){
                        dp[j] = (a[j]*dp[b[j]])%MOD;
                    }
                    else if(t[j]==3){
                        dp[j] = (dp[a[j]]*dp[b[j]])%MOD;
                    }
                }
                System.out.print(" "+dp[n]);
            }
            System.out.println();
        }
    } // end of main
}
