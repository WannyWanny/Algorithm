package Baekjoon.백트래킹;

import java.util.Scanner;

public class Main_14889 {
    static int N;
    static int[][] map;
    static boolean[] visited;
    static int ans;

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        N = sc.nextInt();
        map = new int[N][N];
        for(int r=0; r<N; r++){
            for(int c=0; c<N; c++){
                map[r][c] = sc.nextInt();
            }
        }
        visited = new boolean[N];
        ans = Integer.MAX_VALUE;
        DFS(0, 0);
        System.out.println(ans);
    }

    private static void DFS(int cnt, int idx) {
        if(idx>=N) return;
        if(cnt == N/2){
            int sum1=0;
            int sum2=0;
            for(int i=0; i<N; i++){
                for(int j=i+1; j<N; j++){
                    if(visited[i] != visited[j]) continue;
                    if(visited[i]) sum1+= map[i][j]+map[j][i];
                    else
                        sum2+=map[i][j]+map[j][i];
                }
            }
            ans = Math.min(ans, Math.abs(sum1-sum2));
        }

        for(int i=idx; i<N; i++){
            visited[i]=true;
            DFS(cnt+1, idx+1);
            visited[i]=false;
        }
    }
}
