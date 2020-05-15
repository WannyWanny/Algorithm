package Baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_2636 {
    static class Point{
        int r;
        int c;

        public Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
    static int R, C;
    static int[][] map;
    static boolean[][] visited;
    static int[] dr = {-1, 0, 1, 0};
    static int[] dc = {0, 1, 0, -1};
    static int TIME, CNT;
    static Queue<Point> cheeseQ = new LinkedList<>();
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        map = new int[R][C];
        TIME = 0;
        CNT = 0;

        for(int r=0; r<R; r++){
            for(int c=0; c<C; c++){
                map[r][c] = sc.nextInt();
            }
        }

        while(true){
            visited = new boolean[R][C];

            checkOutsideAir();
            for(int r=0; r<R; r++){
                for(int c=0; c<C; c++){
                    if(map[r][c] == 1 && isEdge(r, c)){
                        BFS(r, c);
                    }
                }
            }

            if(cheeseQ.isEmpty()) break;

            CNT = cheeseQ.size();

            while(!cheeseQ.isEmpty()){
                Point cur = cheeseQ.poll();
                map[cur.r][cur.c] = -1;
            }
            TIME++;
        }

        System.out.println(TIME+"\n"+CNT);
    }

    private static void BFS(int r, int c){
        Queue<Point> qu = new LinkedList<>();
        qu.add(new Point(r, c));
        visited[r][c] = true;

        while(!qu.isEmpty()){
            Point cur = qu.poll();

            if(isEdge(cur.r, cur.c)){
                map[cur.r][cur.c] = 2;
                cheeseQ.add(new Point(cur.r, cur.c));
            }

            for(int d=0; d<4; d++){
                int nr = cur.r+dr[d];
                int nc = cur.c+dc[d];

                if(isIn(nr, nc) && map[nr][nc] == 1 && !visited[nr][nc]){
                    qu.add(new Point(nr, nc));
                    visited[nr][nc] = true;
                }
            }
        }
    }


//    1에 둘러쌓여 있는지 판단하는 메소드
    private static boolean isEdge(int r, int c){
        for(int d=0; d<4; d++){
            int nr = r+dr[d];
            int nc = c+dc[d];

            if(map[nr][nc] == -1) return true;
        }
        return false;
    }

    private static void checkOutsideAir(){
        Queue<Point> qu = new LinkedList<>();
        boolean[][] visitedAir = new boolean[R][C];

        qu.add(new Point(0, 0));
        map[0][0] = -1;
        visitedAir[0][0] = true;

        while(!qu.isEmpty()){
            Point cur = qu.poll();

            for(int d=0; d<4; d++){
                int nr = cur.r+dr[d];
                int nc = cur.c+dc[d];

                if(isIn(nr, nc) && !visitedAir[nr][nc] && map[nr][nc] <=0){
                    map[nr][nc] = -1;
                    visitedAir[nr][nc] = true;
                    qu.add(new Point(nr, nc));
                }
            }
        }

    }

    private static boolean isIn(int r, int c){
        return (r<R && r>=0 && c<C && c>=0);
    }
}
