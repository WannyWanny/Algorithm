package Baekjoon.분할정복;

import java.util.Scanner;

public class Main_1780 {
    static int[][] map;
    static int[] cnt;              //-1 0 1개수 카운트

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        map = new int[n][n];
        cnt = new int[3];
        for(int r=0; r<n; r++){
            for(int c=0; c<n; c++){
                map[r][c] = sc.nextInt();
            }
        }

        Divide(n, 0, 0);
        System.out.println(cnt[0]+"\n"+cnt[1]+"\n"+cnt[2]);
    }

    private static void Divide(int n, int r, int c){
        if(Check(n, r, c)){
            if(map[r][c] == -1) cnt[0]++;
            else if(map[r][c] == 0) cnt[1]++;
            else                    cnt[2]++;
            return;
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                Divide(n/3, r+(n/3)*i, c+(n/3)*j);
            }
        }
    }

    private static boolean Check(int n, int r, int c){
        int temp = map[r][c];
        for(int i=r; i<r+n; i++){
            for(int j=c; j<c+n; j++){
                if(temp != map[i][j]){
                    return false;
                }
            }
        }

        return true;
    }
}
