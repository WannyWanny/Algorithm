package SWExpertAcademy.D4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Solution_1227 {
    static final int MAX = 100;
    static int[] dr = {0, 0, 1, -1};
    static int[] dc = {1, -1, 0, 0};
    static int[][] map;
    static boolean[][] visited;
    static boolean flag;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int tc=1; tc<=10; tc++){
            int t = sc.nextInt();
            map = new int[MAX][MAX];
            visited = new boolean[MAX][MAX];
            flag = false;
            for(int r=0; r<MAX; r++){
                String str = sc.next();
                for(int c=0; c<MAX; c++){
                    map[r][c] = str.charAt(c)-'0';
                }
            }

            for(int r=0; r<MAX; r++){
                for(int c=0; c<MAX; c++){
                    if(map[r][c] == 2){
                        BFS(r, c);
                    }
                }
            }

            System.out.print("#"+tc+" ");
            if(!flag)
                System.out.println(0);
            else
                System.out.println(1);

        }
    }

    private static void BFS(int r, int c){
        Queue<Point> qu = new LinkedList<>();
        qu.add(new Point(r, c));
        visited[r][c] = true;

        while(!qu.isEmpty()){
            Point front = qu.poll();
            for(int k=0; k<4; k++){
                int nr = front.r+dr[k];
                int nc = front.c+dc[k];

                if(isIn(nr, nc)){
                    if(!visited[nr][nc] && map[nr][nc] != 1){
                        visited[nr][nc] = true;
                        qu.add(new Point(nr, nc));
                        if(map[nr][nc] == 3){
                            flag = true;
                            return;
                        }
                    }
                }
            }
        }
    }

    private static boolean isIn(int r, int c){
        return (r >=0 && r<100 && c>=0 && c<100);
    }

    static class Point{
        int r;
        int c;

        public Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
}
