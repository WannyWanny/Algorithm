package Baekjoon;

import java.util.Scanner;

public class Main_14500 {
    static int R, C, ans=0;
    static int[][] map;
    static boolean[][] visited;
    static int[] dr={-1, 0, 1, 0};
    static int[] dc={0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        map = new int[R][C];
        visited = new boolean[R][C];
        for(int r=0; r<R; r++){
            for(int c=0; c<C; c++){
                map[r][c] = sc.nextInt();
            }
        }

        for(int r=0; r<R; r++){
            for(int c=0; c<C; c++){
                visited[r][c] = true;
                DFS(r, c, 0, 0);
                getFuck(r, c);
                visited[r][c] = false;
            }
        }


        System.out.println(ans);
    }

    private static void DFS(int r, int c, int depth, int sum){
        if(depth == 4){
            ans = Math.max(ans, sum);
            return;
        }

        for(int d=0; d<4; d++){
            int nr = r+dr[d];
            int nc = c+dc[d];

            if(isIn(nr, nc)){
                if(!visited[nr][nc]){
                    visited[nr][nc] = true;
                    DFS(nr, nc, depth+1, sum+map[nr][nc]);
                    visited[nr][nc] = false;
                }
            }
        }
    }

    private static void getFuck(int r, int c){
        int wing=4;
        int min = Integer.MAX_VALUE;
        int sum = map[r][c];

        for(int d=0; d<4; d++){
            int nr = r+dr[d];
            int nc = c+dc[d];

            if(wing<=2) return;

            if(!isIn(nr, nc)){
                wing--;
                continue;
            }

            min = Math.min(min, map[nr][nc]);
            sum += map[nr][nc];

            if(wing==4){
                sum -= min;
            }
            ans = Math.max(ans, sum);
        }
    }

    private static boolean isIn(int r, int c){
        return (r>=0 && r<R && c>=0 && c<C);
    }
}
