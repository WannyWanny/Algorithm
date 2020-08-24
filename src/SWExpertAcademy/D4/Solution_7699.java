package SWExpertAcademy.D4;

import java.util.Scanner;

public class Solution_7699 {
    static int R, C, ans;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static int[][] arr;
    static boolean[] alpha;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            R = sc.nextInt();
            C = sc.nextInt();
            arr = new int[R][C];
            alpha = new boolean[26];
            for(int r=0; r<R; r++) {
                String str = sc.next();
                for (int c = 0; c < C; c++) {
                    arr[r][c] = str.charAt(c)-'A';
                }
            }
            ans=0;
            Search(0, 0, 1);
            System.out.println("#"+tc+" "+ans);
        }
    }

    private static void Search(int r, int c, int cnt){
//        값 비교
        ans = Math.max(ans, cnt);
//        초기 설정
        alpha[arr[r][c]] = true;

//        완전탐색
        for(int d=0; d<4; d++){
            int nc = c+dc[d];
            int nr = r+dr[d];
            if(isIn(nr, nc) && !alpha[arr[nr][nc]]){
                Search(nr, nc, cnt+1);
                alpha[arr[nr][nc]]=false;
            }
        }
    }

    private static boolean isIn(int r, int c){
        return (r>=0 && r<R && c>=0 && c<C);
    }
}
