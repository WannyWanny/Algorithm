package Baekjoon;

import java.util.Scanner;

public class Main_15684 {
    static int R, CNT , C, ans=-1;
    static boolean[][] ladder;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();           //세로
        CNT  =sc.nextInt();           //가로선
        C = sc.nextInt();           //가로

        ladder =new boolean[R+1][C+1];

        for(int i=0; i<CNT; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            ladder[a][b+1] = true;
            ladder[b+1][a] = true;
        }

        printMap(ladder);

        DFS(1, 1, 0, ladder);

    }

    private static void DFS(int r, int c, int cnt, boolean[][] temp){

    }

    private static void printMap(boolean[][] a){
        for(int r=0; r<R; r++){
            for(int c=0; c<C; c++){
                System.out.print(a[r][c]+" ");
            }
            System.out.println();
        }
    }
}
