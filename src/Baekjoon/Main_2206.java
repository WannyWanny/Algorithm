package Baekjoon.DFS_BFS;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_2206 {
    static int R, C, ans;
    static int[][] visited;
    static int[][] map;
    static int[] dr = {0, 0, -1, 1};
    static int[] dc = {-1, 1, 0, 0};
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        ans=0;
        map = new int[R][C];
        for(int r=0; r<R; r++){
            String str = sc.next();
            for(int c=0; c<C; c++){
                map[r][c] = str.charAt(c)-'0';
            }
        }


        visited = new int[R][C];
        BFS();
        if(ans == Integer.MAX_VALUE)
            System.out.println(-1);
        else
            System.out.println(ans);
    }

    private static void BFS(){
        visited[0][0] = 1;
        Queue<Point> qu =new LinkedList<Point>();
        qu.add(new Point(0, 0, 1, 0));

        while(!qu.isEmpty()){
            Point front = qu.poll();

            if(front.r == R-1 && front.c == C-1){
                ans = front.dis;
                break;
            }

            for(int k=0; k<4; k++){
                int nc = front.c+dc[k];
                int nr = front.r+dr[k];

                if(!isIn(nr, nc)) continue;
                if(visited[nr][nc] <= front.drill) continue;
                //벽이 아닐 때
                if(map[nr][nc]==0){
                    visited[nr][nc] = front.drill;
                    qu.add(new Point(nr, nc, front.dis+1, front.drill));
                }
                //벽일 때
                else{
                    if(front.drill==0) {
                        visited[nr][nc] = front.drill + 1;
                        qu.add(new Point(nr, nc, front.dis + 1, front.drill + 1));
                    }
                }
            }
        }
    }

    static private boolean isIn(int r, int c){
        return (r>=0 && r<R && c>=0 && c<C);
    }

    static class Point{
        int r;
        int c;
        int dis;
        int drill;

        public Point(int r, int c,int dis, int drill) {
            this.r = r;
            this.c = c;
            this.dis = dis;
            this.drill = drill;
        }
    }
}
