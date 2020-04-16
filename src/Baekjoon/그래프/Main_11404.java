package Baekjoon.그래프;

import java.util.Scanner;

public class Main_11404 {
    static final int INF = 100000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int n = sc.nextInt();
        int[][] dp = new int[v+1][v+1];

        for(int r=1; r<=v; r++){
            for(int c=1; c<=v; c++){
                if(r==c) continue;
                dp[r][c] = INF;
            }
        }

        for(int i=0; i<n; i++){
            int s = sc.nextInt();
            int e = sc.nextInt();
            int m = sc.nextInt();
            dp[s][e] = Math.min(dp[s][e], m);
        }

        for(int m=1; m<=v; m++){
            for(int s=1; s<=v; s++){
                for(int e=1; e<=v; e++){
                    dp[s][e] = Math.min(dp[s][m]+dp[m][e], dp[s][e]);
                }
            }
        }

        for(int r=1; r<=v; r++){
            for(int c=1; c<=v; c++){
                System.out.print(dp[r][c]+" ");
            }
            System.out.println();
        }
    }
}
