package SWExpertAcademy.D3;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_6958 {
    static int T, N, M;
    static int[][] arr;
    static int[] cntScore;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();

        for(int tc=1; tc<=T; tc++) {
            N = sc.nextInt();
            M = sc.nextInt();

            arr = new int[N][M];
            cntScore = new int[N];
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < M; c++) {
                    arr[r][c] = sc.nextInt();
                }
            }

            for (int r = 0; r < N; r++) {
                for (int c = 0; c < M; c++) {
                    cntScore[r] += arr[r][c];
                }
            }

            int max = 0;
            int maxPos=0;
            int cnt=0;
            for (int i = 0; i < N; i++) {
                if (max < cntScore[i]) {
                    max = cntScore[i];
                }
            }
            for(int i=0; i<N; i++){
                if(max == cntScore[i]){
                    cnt++;
                    maxPos = i+1;
                }
            }
            System.out.println("#"+tc+" "+cnt+" "+max);
        }
    }
}
