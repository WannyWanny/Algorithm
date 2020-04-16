package SWExpertAcademy.D4;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution_1249 {
    static int[][] map;
    static boolean[][] visited;
    static int result, N;
    static int[] dr={0, 0, -1, 1};
    static int[] dc={1, -1, 0, 0};
    static PriorityQueue<Point> pq;

    static class Point implements Comparable<Point>{
        int r;
        int c;
        int weight;

        public Point(int r, int c, int weight) {
            this.r = r;
            this.c = c;
            this.weight = weight;
        }

        @Override
        public int compareTo(Point o) {
           if(this.weight > o.weight)
               return 1;
           else
               return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            N = sc.nextInt();
            map = new int[N][N];
            visited = new boolean[N][N];
            result=0;
            pq = new PriorityQueue<>();
            for(int r=0; r<N; r++){
                String str = sc.next();
                for(int c=0; c<N; c++){
                    map[r][c] = str.charAt(c)-'0';
                }
            }

            BFS(0, 0, map[0][0]);
            System.out.println("#"+tc+" "+result);
        }
    }

    private static void BFS(int r, int c, int weight){
        pq.add(new Point(r, c, weight));

        visited[r][c] = true;

        while(!pq.isEmpty()){
            Point front = pq.poll();
            for(int d=0; d<4; d++){
                int nr = front.r+dr[d];
                int nc = front.c+dc[d];
                if(nr == N-1 && nc == N-1){
                    result = front.weight;
                    return;
                }
                if(isIn(nr, nc) && !visited[nr][nc]){
                    pq.add(new Point(nr, nc, front.weight+map[nr][nc]));
                    visited[nr][nc]= true;
                }
            }
        }
        return;

    }

    private static boolean isIn(int r, int c){
        return (r>=0 && r<N && c>=0 && c<N);
    }
}
