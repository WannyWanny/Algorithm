package Baekjoon.백트래킹;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main_2580 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[][] map;
    static class Point{
        int r;
        int c;
        Point(int r, int c){
            this.r=r;
            this.c=c;
        }
    }
    static ArrayList<Point> list =new ArrayList<>();
    static int size;
    static boolean flag;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        map = new int[9][9];
        for(int r=0; r<9; r++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int c = 0; c < 9; c++) {
                map[r][c] = Integer.parseInt(st.nextToken());
                if(map[r][c]==0){
                    list.add(new Point(r, c));
                }
            }
        }
        flag = false;
        size = list.size();
        backTracking(0, 0);
        printMap();

        br.close();
        bw.flush();
        bw.close();
    }

    private static void printMap() throws IOException {
        for(int r=0; r<9; r++){
            for(int c=0; c<9; c++){
                bw.write(String.valueOf(map[r][c]+" "));
            }
            bw.newLine();
        }
    }

    private static void backTracking(int idx, int cnt){
        if(flag) return;

    }

}
