package Baekjoon.분할정복;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main_1992 {
    static StringBuilder sb = new StringBuilder();
    static int[][] map;
    static int temp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        map = new int[n][n];
        int[] num = new int[n];
        temp = 0;
        for(int r=0; r<n; r++){
            String str = br.readLine();
            for(int c=0; c<n; c++){
                num[c] = str.charAt(c);
                map[r][c] = (int)num[c]-48;
            }
        }
        CutPaper(n, 0, 0);
        System.out.println(sb.toString());
    }

    private static void CutPaper(int n, int r, int c) {
        if(Check(n, r, c)){
            sb.append(temp);
        }else{
            sb.append("(");
            CutPaper(n/2, r, c);
            CutPaper(n/2, r, c+n/2);
            CutPaper(n/2, r+n/2, c);
            CutPaper(n/2, r+n/2, c+n/2);
            sb.append(")");
        }
    }

    private static boolean Check(int n, int r, int c){
        int color = map[r][c];
        for(int i=r; i<r+n; i++){
            for(int j=c; j<c+n; j++){
                if(color != map[i][j]) return false;
            }
        }
        temp = color;
        return true;
    }


}