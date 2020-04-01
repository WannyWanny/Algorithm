package Baekjoon.DFS_BFS;

import java.io.IOException;
import java.util.Scanner;

public class Main_1012 {
    static int R, C, K, cnt;
    static int[][] map;
    static boolean[][] visited;
    static int[] dr = {-1, 0, 1, 0};
    static int[] dc = {0, 1, 0, -1};
    public static void main(String[] args) throws IOException {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++) {
            C = sc.nextInt();
            R = sc.nextInt();
            K = sc.nextInt();
            map = new int[R][C];
            visited = new boolean[R][C];
            cnt = 0;

            for(int i=1; i<=K; i++){
                int c = sc.nextInt();
                int r = sc.nextInt();
                map[r][c] = 1;
            }
            for(int r=0; r<R; r++){
                for(int c=0; c<C; c++){
                    if(map[r][c]==1 && !visited[r][c]) {
                        cnt++;
                        DFS(r, c);
                    }
                }
            }

            System.out.println(cnt);
        }//end of test
    }//end of main

    private static void DFS(int r, int c){
        visited[r][c]=true;
        for(int k=0; k<4; k++){
            int nr = r+dr[k];
            int nc = c+dc[k];
            if(isIn(nr, nc)){
                if(!visited[nr][nc] && map[nr][nc] == 1){
                    DFS(nr, nc);
                }
            }
        }
    }

    private static boolean isIn(int r, int c){
        return (r>=0 && c>=0 && c<C && r<R);
    }
}
