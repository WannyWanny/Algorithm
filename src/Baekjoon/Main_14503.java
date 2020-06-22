package Baekjoon;

import java.util.Scanner;

public class Main_14503 {
    static int R, C;
    static int[][] map;
    static int[] dr={1, 0, -1, 0};         //북 동 남 서
    static int[] dc={0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        map = new int[R][C];
        int sR = sc.nextInt();
        int sC = sc.nextInt();
        int dir = sc.nextInt();
    }
}
