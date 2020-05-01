package Baekjoon.분할정복;

import java.util.Scanner;

public class Main_2630 {
    static int[][] map;
    static int cntW=0, cntB=0;

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        map = new int[n][n];
        for(int r=0; r<n; r++){
            for(int c=0; c<n; c++){
                map[r][c] = sc.nextInt();
            }
        }
        CutPaper(n, 0, 0);
        System.out.println(cntW+"\n"+cntB);
    }

    static void CutPaper(int n, int r, int c){
        if(isSame(n, r, c)){
            if(map[r][c] == 0) cntW++;
            else cntB++;
            return;
        }

        CutPaper(n/2, r, c);
        CutPaper(n/2, r+n/2, c);
        CutPaper(n/2, r, c+n/2);
        CutPaper(n/2, r+n/2, c+n/2);
    }

    static Boolean isSame(int n, int r, int c){
        int color = map[r][c];
        for(int i=r; i<r+n; i++) {
            for (int j = c; j < c + n; j++) {
                if (color != map[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
