package Baekjoon.기타;

import java.util.Scanner;

public class Main_17070 {
    static int[] dr = {0, 1, 1};
    static int[] dc = {1, 0, 1};
    static int Ans=0;
    static int N;
    static int[][] map;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            N = sc.nextInt();
            map = new int[N][N];
            for(int r=0; r<N; r++){
                for(int c=0; c<N; c++){
                    map[r][c] = sc.nextInt();
                }
            }

            Solve(0, 1, 0);
            System.out.println(Ans);
    }

    private static void Solve(int r, int c, int pipe){
        //0가로 1세로 2대각선
        if(r == N-1 && c==N-1){
            Ans++;
            return;
        }

        for(int i=0; i<3; i++){
            int nc = c+dc[i];
            int nr = r+dr[i];

            if(nc>=N || nr>=N || map[nr][nc] ==1){
                continue;
            }

            //가로일땐 세로가 안되고 세로일때는 가로가 안된다.
            if((i==0 && pipe==1) || (i==1 && pipe==0)){
                continue;
            }

            //대각선으로 이동할 경우 바로 대각선이동이 아니라 가로->세로 이동이다.
            if((i==2 && map[r][c+1]==1) || (i==2 && map[r+1][c] ==1)) {
                continue;
            }

            Solve(nr, nc, i);
        }
    }
}
