package D2;

import java.util.Scanner;

public class Solution_1954 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T =sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int N = sc.nextInt();
            int m = N;
            int[][] arr = new int[N+1][N+1];
            int num=1;
            int row = 0;
            int col = -1;
            int direction =1;

            while(true) {
                if (N == 0) break;
                for (int i = 0; i < N; i++) {
                    col += direction;
                    arr[row][col] = num++;
                }
                N--;
                for (int i = 0; i < N; i++) {
                    row += direction;
                    arr[row][col] = num++;
                }
                direction *= (-1);
            }
            System.out.println("#"+tc);

            for(int r=0; r<m; r++){
                for(int c=0; c<m; c++){
                    System.out.print(arr[r][c]+" ");
                }
                System.out.println();
            }

        }
    }
}
