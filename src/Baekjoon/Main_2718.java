package Baekjoon.DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_2718 {
    static int R, C;
    static int[][] map;
    static boolean[][] visited;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        map = new int[R][C];
        visited = new boolean[R][C];
        for(int r=0; r<R; r++){
            String str = sc.next();
            for(int c=0; c<C; c++){
                map[r][c] = Integer.parseInt(str.charAt(c)+"");
            }
        }
        visited[0][0] = true;
        BFS();
        System.out.println(map[R-1][C-1]);
    }

    private static void BFS(){
        Queue<Point> queue = new LinkedList<Point>();
        queue.offer(new Point(0, 0));

        while(!queue.isEmpty()){
            Point front = queue.poll();
            for(int k=0; k<4; k++){
                int nc = front.col+dc[k];
                int nr = front.row+dr[k];

                if(isIn(nr, nc)){
                    if(map[nr][nc]!=0 && !visited[nr][nc]){
                        queue.offer(new Point(nr, nc));
                        map[nr][nc] = map[front.row][front.col]+1;
                        visited[nr][nc]=true;
                    }
                }
            }
        }
    }

    static class Point{
        int row;
        int col;
        public Point(int row, int col){
            super();
            this.row = row;
            this.col = col;
        }
    }

    static private boolean isIn(int r, int c){
        return (r>=0 && c>=0 && r<R && c<C);
    }
}
