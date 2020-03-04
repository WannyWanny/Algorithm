package SWExpertAcademy.D4;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_9282 {
    static int T, n, m;
    static int Ans;
    static int[][] arr;
    static int[][][][] dp;          //r c h w
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            n = sc.nextInt();
            m = sc.nextInt();
            arr = new int[n][m];
            dp = new int[n+1][m+1][n+1][m+1];

            for(int[][][] d1:dp){
                for(int[][] d2:d1){
                    for(int[] d3:d2){
                        Arrays.fill(d3, Integer.MAX_VALUE);
                    }
                }
            }
            for(int r=0; r<n; r++){
                for(int c=0; c<m; c++){
                    arr[r][c] = sc.nextInt();
                }
            }

            Ans = dfs(0, 0, n, m);
            System.out.println("#"+tc+" "+Ans);

        }
    }


    private static int dfs(int r, int c, int h, int w){
        if(w==1 && h==1)
            return 0;
        if(dp[r][c][h][w] != Integer.MAX_VALUE){
            return dp[r][c][h][w];
        }
        int sum=0;

        //기존에 있던 덩어리의 건포도 개수
        for(int i=r; i<r+h; i++){
            for(int j=c; j<c+w; j++){
                sum += arr[i][j];
            }
        }

        //가로로 나누어서 최소비용을 구한ㄴ다
        for(int i=1; i<h; i++){
            //위쪽 비용
            int sum1=dfs(r, c, i, w);
            //아래쪽 비용
            int sum2=dfs(r+1, c, h-i, w);
            int sum3 = sum+sum1+sum2;
            dp[r][c][h][w] = Math.min(dp[r][c][h][w], sum3);
        }

        //세로로 나누어서 최소비용을 구한다
        for(int i=1; i<w; i++){
            //왼쪽 비용
            int sum1 = dfs(r, c, h, i);
            //오른쪽 비용
            int sum2 = dfs(r, c+1, h, w-i);
            int sum3 = sum+sum1+sum2;
            dp[r][c][h][w] = Math.min(dp[r][c][h][w], sum3);
        }

        return dp[r][c][h][w];
    }
}
