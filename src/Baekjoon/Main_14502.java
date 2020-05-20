package Baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_14502 {
    static class Point{
        int r;
        int c;

        public Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
    static int R, C, ans;
    static int[][] map;
    static int[][] copy;
    static List<Point> virus = new ArrayList<>();
    static int[] dr={-1, 1, 0, 0};
    static int[] dc={0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        map = new int[R][C];
        copy = new int[R][C];
        ans = Integer.MIN_VALUE;
        for(int r=0; r<R; r++){
            for(int c=0; c<C; c++){
                map[r][c] = sc.nextInt();
                if(map[r][c] == 2){
                    virus.add(new Point(r, c));
                }
            }
        }
        DFS(0, 0);

        System.out.println(ans);

    }

    static void DFS(int start, int depth) {
        if (depth == 3) {
            // 맵 복사
            copyMap();

            // 바이러스 퍼트리기
            for (Point p : virus) {
                spreadVirus(p.r, p.c);
            }

            // 안전영역 크기 구하기
            ans = Math.max(ans, getAns());
            return;
        }

        for (int i = start; i < R * C; i++) {
            int x = i / C;
            int y = i % C;

            if (map[x][y] == 0) {
                map[x][y] = 1;
                DFS(i + 1, depth + 1);
                map[x][y] = 0;
            }
        }
    }

    private static int getAns(){
        int temp = 0;
        for(int r=0; r<R; r++){
            for(int c=0; c<C; c++){
                if(copy[r][c] == 0){
                    temp++;
                }
            }
        }

        return temp;
    }
    private static void spreadVirus(int r, int c){
        for(int d=0; d<4; d++){
            int nr = r+dr[d];
            int nc = c+dc[d];

            if(isIn(nr, nc)){
                if(copy[nr][nc] == 0){
                    copy[nr][nc] = 2;
                    spreadVirus(nr, nc);
                }
            }
        }
    }

    private static void copyMap(){
        for(int r=0; r<R; r++){
            for(int c=0; c<C; c++){
                copy[r][c] = map[r][c];
            }
        }
    }

    private static boolean isIn(int r, int c){
        return (r>=0 && r<R && c>=0 && c<C);
    }

}
