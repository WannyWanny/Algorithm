package Baekjoon.sw기출;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_14501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int[] t = new int[n+10];
        int[] p = new int[n+10];
        int[] dp = new int[n+10];
        for(int i=1; i<=n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            t[i] = Integer.parseInt(st.nextToken());
            p[i] = Integer.parseInt(st.nextToken());
        }

        int max = Integer.MIN_VALUE;

        for(int i=1; i<=n+1; i++){
            dp[i] = Math.max(dp[i], max);
            dp[t[i]+i] = Math.max(dp[t[i]+i], p[i]+dp[i]);

            max = Math.max(dp[i], max);
        }

        System.out.println(max);
    }
}
