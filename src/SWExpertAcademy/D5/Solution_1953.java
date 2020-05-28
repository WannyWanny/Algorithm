package SWExpertAcademy.D5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution_1953 {
    static class Hole{
        int r;
        int c;

        public Hole(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
    static int R, C, sr, sC, ans, L;
    static int[][] map;
    static boolean[][] isHide;
    static int[] dr={-1, 0, 1, 0};
    static int[] dc={0, -1, 0, 1};
    static int[][] pipe={{1, 1, 1, 1}, {1, 0, 1, 0}, {0, 1, 0, 1}, {1, 0 ,0, 1}, {0,0,1,1},{0,1,1,0},{1,1,0,0}};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            ans = 0;
            R = sc.nextInt();
            C = sc.nextInt();
            sr = sc.nextInt();
            sC = sc.nextInt();
            L = sc.nextInt();
            map = new int[R][C];
            isHide = new boolean[R][C];
            for(int r=0; r<R; r++){
                for(int c=0; c<C; c++){
                    map[r][c] = sc.nextInt();
                }
            }

            Queue<Hole> qu = new LinkedList<>();
            qu.add(new Hole(sr, sC));

            isHide[sr][sC] = true;
            int time=1;
            while(!qu.isEmpty()){
                if(time==L) break;
                int size = qu.size();
                for(int i=0; i<size; i++){
                    Hole cur = qu.poll();
                    for(int d=0; d<4; d++){
                        int nr = cur.r+dr[d];
                        int nc = cur.c+dc[d];

                        if(isIn(nr, nc)){
                            if(!isHide[nr][nc] && map[nr][nc] !=0){
                                if(pipe[map[cur.r][cur.c]-1][d]==1 && pipe[map[nr][nc]-1][(d+2)%4]==1){
                                    isHide[nr][nc] = true;
                                    qu.add(new Hole(nr, nc));
                                }
                            }
                        }
                    }
                }
                time++;
            }

            for(int r=0; r<R; r++){
                for(int c=0; c<C; c++){
                    if(isHide[r][c]) ans++;
                }
            }

            System.out.println("#"+tc+" "+ans);
        }
    }


    private static boolean isIn(int r, int c){
        return (r>=0 && r<R && c>=0 && c<C);
    }
}
