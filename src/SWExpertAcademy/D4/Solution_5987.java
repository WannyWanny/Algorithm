package SWExpertAcademy.D4;

import java.util.Scanner;

public class Solution_5987 {
    static int N, M;
    static long ans;
    static int[] needs;
    static long[] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int f,s;
            N = sc.nextInt();
            M = sc.nextInt();
            needs = new int[N];
            dp = new long[(1<<N)];
            ans=0;
            for(int i=0; i<M; i++){
                f=sc.nextInt()-1;
                s=sc.nextInt()-1;
                needs[f] |=(1<<s);
            }
            ans=DFS(0);
            System.out.println("#"+tc+" "+ans);
        }
    }
    private static long DFS(int idx){
        if(idx==(1<<N)-1){
            return 1;
        }
        if(dp[idx]>0){
            return dp[idx];
        }
        //순열
        for(int i=0; i<N; i++){
            //순열
            if((idx&1<<i)==0){
                if((idx&needs[i])==needs[i]){
                    //순열
                    dp[idx]+=DFS(idx| 1<<i);
                }
            }
        }
        return dp[idx];
    }
}
