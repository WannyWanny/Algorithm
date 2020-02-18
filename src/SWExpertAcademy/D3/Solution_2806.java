package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_2806 {
    static int T, N;
    static int[][] map;
    static int Ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            N = sc.nextInt();
            map = new int[N][N];

            Ans=0;
            backtrack(0);
            System.out.println("#"+tc+" "+Ans);
        }

    }

    private static void backtrack(int idx){
        if(idx == map.length){
            //다 골랐으므로 개수 증가
            Ans++;
            return;
        }

        for(int i=0; i<map[idx].length; i++){
            if(isPossible(idx, i)){
                map[idx][i] = 1;
                backtrack(idx+1);
                map[idx][i]=0;
            }
        }
    }

    private static boolean isPossible(int r, int c){
        //내 위로 퀸이 있는가
        for(int i=r; i>=0; i--){
            if(map[i][c]==1)
                return false;
        }

        //왼쪽 위로 퀸이 있는가
        for(int i=r, j=c; i>=0 && j>=0; i--, j--){
            if(map[i][j]==1)
                return false;
        }

        //오른쪽 위로 퀸이 있는가
        for(int i=r, j=c; i>=0 && j<map[i].length; i--, j++){
            if(map[i][j]==1)
                return false;
        }

        return true;
    }
}
