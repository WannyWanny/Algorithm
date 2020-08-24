package Baekjoon;

import java.util.Scanner;

public class Main_14890 {
    static int[][] map;
    static int N, L;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        L = sc.nextInt();
        map = new int[N][N];
        for(int r=0; r<N; r++){
            for(int c=0; c<N; c++){
                map[r][c] = sc.nextInt();
            }
        }
    }
}
