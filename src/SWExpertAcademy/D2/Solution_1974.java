package SWExpertAcademy.D2;

import java.util.Scanner;

public class Solution_1974 {
    static int N = 9;
    static int answer = 45;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            boolean sudoku = true;
            int[][] map = new int[N][N];

            for(int r=0; r<N; r++){
                for(int c=0; c<N; c++){
                    map[r][c] = sc.nextInt();
                }
            }
            int sum = 0;

            //가로 판별
            if(sudoku) {
                for (int r = 0; r < N; r++) {
                    for (int c = 0; c < N; c++) {
                        sum += map[r][c];
                    }
                    if (sum != answer) {
                        sudoku = false;
                        break;
                    }
                    sum=0;
                }
            }

            //세로 판별
            if(sudoku) {
                for (int r = 0; r < N; r++) {
                    for (int c = 0; c < N; c++) {
                        sum += map[c][r];
                    }
                    if (sum != answer) {
                        sudoku = false;
                        break;
                    }
                    sum=0;
                }
            }

            //한칸 판별
            if(sudoku) {
                for (int r = 0; r < N; r+=3) {
                    for (int c = 0; c < N; c+=3) {
                        for(int i=r; i<r+3; i++){
                            for(int j=c; j<c+3; j++){
                                sum += map[i][j];
                            }
                        }
                        if (sum != answer) {
                            sudoku = false;
                            break;
                        }
                        sum=0;
                    }
                }
            }
            if(sudoku)
                System.out.println("#"+tc+" "+1);
            else
                System.out.println("#"+tc+" "+0);

        }//end of test
    }
}
