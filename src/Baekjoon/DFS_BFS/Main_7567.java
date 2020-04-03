package Baekjoon.DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_7567 {
    static int R, C;
    static int[][] arr;
    static int[] dr = {-1, 0, 1, 0};
    static int[] dc = {0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        C = sc.nextInt();
        R = sc.nextInt();
        arr = new int[R][C];
        for(int r=0; r<R; r++){
            for(int c=0; c<C; c++){
                arr[r][c] = sc.nextInt();
            }
        }
        BFS();
    }
    private static void BFS(){
        Queue<Point> qu = new LinkedList<>();
        for(int r=0; r<R; r++){
            for(int c=0; c<C; c++){
                if(arr[r][c] == 1){
                    qu.add(new Point(r, c));
                }
            }
        }

        while(!qu.isEmpty()) {
            Point front = qu.poll();
            for (int k = 0; k < 4; k++) {

                int nc = front.c + dc[k];
                int nr = front.r + dr[k];
                if (isIn(nr, nc)) {
                    if (arr[nr][nc] == 0) {
                        arr[nr][nc] = arr[front.r][front.c] + 1;
                        qu.add(new Point(nr, nc));
                    }
                }
            }
        }
        int max=0;
        for(int r=0; r<R; r++){
            for(int c=0; c<C; c++){
                if(arr[r][c] == 0){
                    System.out.println(-1);
                    return;
                }
                max = Math.max(max, arr[r][c]);
            }
        }
        System.out.println(max-1);
        return;
    }

    private static boolean isIn(int r, int c){
        return (r<R && r>=0 && c<C && c>=0);
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
