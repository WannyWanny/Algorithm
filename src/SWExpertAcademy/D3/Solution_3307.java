package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_3307 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int Ans=0;
            int[] dp = new int[N];
            for(int i=0; i<N; i++){
                dp[i]=1;
                for(int j=0; j<i; j++){
                    if(arr[i]>arr[j]){
                        dp[i] = Math.max(dp[i], dp[j]+1);
                    }
                }
            }

            for(int i=0; i<N; i++){
                Ans = Math.max(Ans, dp[i]);
            }
            System.out.println("#"+tc+" "+Ans);

        }
    }
}
