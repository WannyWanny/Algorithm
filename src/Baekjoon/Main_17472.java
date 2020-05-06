package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_17472 {
    static class Point{
        int r;
        int c;
        int dis;            //다리 길이
        int idx;            //섬 번호

        public Point(int r, int c, int dis, int idx) {
            this.r = r;
            this.c = c;
            this.dis = dis;
            this.idx = idx;
        }
    }
    static int R, C, islandsIdx, MIN;
    static int[][] map;
    static boolean[][] visited;
    static int[] dr={0, 0, -1, 1};
    static int[] dc={1, -1, 0, 0};
    static List<Point> islands;
    static List<Point> bridges;

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        islandsIdx=2;
        MIN = Integer.MAX_VALUE;
        map = new int[R][C];
        visited =new boolean[R][C];
        islands = new LinkedList<>();
        bridges = new LinkedList<>();

        for(int r=0; r<R; r++){
            st =new StringTokenizer(br.readLine(), " ");
            for(int c=0; c<C; c++){
                map[r][c] = Integer.parseInt(st.nextToken());
            }
        }

        for(int r=0; r<R; r++){
            for(int c=0; c<C; c++){
                if(map[r][c] == 1){
                    WriteIdx(r, c);
                    islandsIdx++;
                }
            }
        }


        System.out.println("섬출력");
        for(int[] rows:map){
            System.out.println(Arrays.toString(rows));
        }
    }

    private static void Connect(Point p){

    }

    private static void WriteIdx(int r, int c){
        Queue<Point> qu = new LinkedList<>();
        Point p = new Point(r, c, 0, islandsIdx);

        qu.offer(p);
        islands.add(p);
        map[r][c] = islandsIdx;

        while(!qu.isEmpty()){
            Point front = qu.poll();

            for(int d=0; d<4; d++){
                int nr = front.r+dr[d];
                int nc = front.c+dc[d];

                if(isIn(nr, nc)){
                    if(map[nr][nc] == 1){
                        map[nr][nc] = islandsIdx;
                        p = new Point(nr, nc, 0, islandsIdx);
                        qu.offer(p);
                        islands.add(p);
                    }
                }
            }
        }
    }



    private static boolean isIn(int r, int c){
        return (r>=0 && r<R && c>=0 && c<C);
    }
}
