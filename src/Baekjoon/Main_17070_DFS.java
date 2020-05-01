package Baekjoon.기타;

import java.util.Scanner;

public class Main_17070_DFS {
    static int Ans=0;
    static int N;
    static int[][] map;
    static int dir=-1;
    static int cnt=0;
    static int[] dr = {0, 0, 1, 1};
    static int[] dc = {0, 1, 1, 0};
    //1가로 2대각선 3세로
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        map = new int[N+2][N+2];

        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                map[i][j] = sc.nextInt();
            }
        }
        dfs(1, 2, 1, new boolean[N+2][N+2]);

        System.out.println(Ans);
    }

    private static void dfs(int r, int c, int dir, boolean[][] visited){
        if(r==N && c==N){
            //목표지점 도착
            cnt++;
            return;
        }
        if(dir ==1){
            for(int k=1; k<=2; k++){
                int nc = c+dc[k];
                int nr = r+dr[k];
                if(nr>=1 && nr<=N && nc>=1 && nc<=N&&check(r, c, k)){
                    dfs(nr, nc, k, visited);
                }
            }
        }
        else if(dir==2){
            for(int k=1; k<=3; k++){
                int nc = c+dc[k];
                int nr = r+dr[k];
                if(nr>=1 && nr<=N && nc>=1 && nc<=N&&check(r, c, k)){
                    dfs(nr, nc, k, visited);
                }
            }
        }
        else if(dir==3){
            for(int k=2; k<=3; k++){
                int nc = c+dc[k];
                int nr = r+dr[k];
                if(nr>=1 && nr<=N && nc>=1 && nc<=N&&check(r, c, k)){
                    dfs(nr, nc, k, visited);
                }
            }
        }

    }

    private static boolean check(int r, int c, int k){
        if(k==1){
            if(map[r][c+1] ==0)
                return true;
        }
        else if(k==2){
            if(map[r+1][c+1] ==0 && map[r][c+1]==0 && map[r][c+1]==0)
                return true;
        }
        else if(k==3){
            if(map[r+1][c]==0){
                return true;
            }
        }
        return false;
    }

}
