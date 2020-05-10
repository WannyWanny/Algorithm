package Baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_14499 {
    static class Dice{
        int r;
        int c;

        public Dice(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
    static int R, C, K;
    static int[][] map;
    static int[] dir;
    static int[] dr={0, 0, -1, 1};                 //동 서 남 북
    static int[] dc={1, -1, 0, 0};
    static ArrayList<Dice> list = new ArrayList<>();
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        int y = sc.nextInt();
        int x = sc.nextInt();
        K = sc.nextInt();
        map = new int[R][C];
        dir = new int[K];
        list.add(new Dice(y, x));

        for(int r=0; r<R; r++){
            for(int c=0; c<C; c++){
                map[r][c] = sc.nextInt();
            }
        }
        for(int k=0; k<K; k++){
            dir[k] = sc.nextInt()-1;
        }


    }
}
