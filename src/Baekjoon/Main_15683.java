package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_15683 {
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
    static int[] dr={1, 0, -1, 0};                     //상 우 하 좌
    static int[] dc={0, 1,  0, -1};
    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine(), " ");
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new int[R][C];

        for(int r=0; r<R; r++){
            st = new StringTokenizer(br.readLine()," ");
            for(int c=0; c<C; c++){
                map[r][c] = Integer.parseInt(st.nextToken());
            }
        }
        result=0;
        for(int r=0; r<R; r++){
            for(int c=0; c<C; c++){
                if(map[r][c] != 0 && map[r][c] != -1 && map[r][c] != 6){
                    BFS(r, c);
                }
            }
        }
        printMap(map);
    }

    private static void BFS(int r, int c){
        Queue<Point> qu =new LinkedList<>();
        qu.add(new Point(r, c));

        while(!qu.isEmpty()){
            Point cur = qu.poll();

            for(int d=0; d<4; d++){

            }
        }
    }

    private static boolean isIn(int r, int c){
        return (r>=0 && r<R && c>=0 && c<C);
    }
    private static int getSolution(){
        int temp=0;
        for(int r=0; r<R; r++){
            for(int c=0; c<C; C++){
                if(map[r][c] == 0){
                    temp++;
                }
            }
        }
        return temp;
    }
    private static void printMap(int[][] arr){
        for(int[] rows:map){
            System.out.println(Arrays.toString(rows));
        }
    }
}
