package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1600 {
    static class Point{
        int r;
        int c;
        int horse;

        public Point(int r, int c, int horse) {
            this.r = r;
            this.c = c;
            this.horse = horse;
        }
    }
    static int R, C, K, res;
    static boolean flag;
    static int[][] map;
    static boolean[][][] visited;
    static int[] dr={-1, 1, 0, 0, -2, -1, 1, 2, 2, 1, -1, -2};
    static int[] dc={0, 0, -1, 1, 1, 2, 2, 1, -1, -2, -2, -1};
    static Queue<Point> qu =new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        K = Integer.parseInt(st.nextToken());
        st =new StringTokenizer(br.readLine(), " ");
        C = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        res=0;
        map = new int[R][C];
        visited = new boolean[R][C][K+1];

        for(int r=0; r<R; r++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int c=0; c<C; c++){
                map[r][c] = Integer.parseInt(st.nextToken());
            }
        }

        visited[0][0][K] = true;


        BFS();
    }

    private static void BFS(){
        qu.add(new Point(0, 0, K));
        flag = false;

        while(!qu.isEmpty()){
            int size = qu.size();

            for(int s=0; s<size; s++){
                Point cur = qu.poll();

                if(cur.r == R-1 && cur.c == C-1){
                    flag = true;
                    return;
                }

                for(int d=0; d<4; d++){
                    int nc = cur.c+dc[d];
                    int nr = cur.r+dr[d];

                    if(isIn(nr, nc)){
                        if(visited[nr][nc][cur.horse] || map[nr][nc] == 1) continue;
                        visited[nr][nc][cur.horse] = true;
                        qu.add(new Point(nr, nc, cur.horse));
                    }
                }

                if(cur.horse > 0){
                    for(int d=4; d<12; d++){
                        int nr = cur.r+dr[d];
                        int nc = cur.c+dc[d];

                        if(isIn(nr, nc)){
                            if(visited[nr][nc][cur.horse-1] || map[nr][nc] == 1) continue;
                            visited[nr][nc][cur.horse-1] = true;
                            qu.add(new Point(nr, nc, cur.horse-1));
                        }
                    }
                }
            }
            res++;
        }
        System.out.println(flag ? res : -1);
    }


    private static boolean isIn(int r, int c){
        return (r>=0 && r<R && c>=0 && c<C);
    }
}
