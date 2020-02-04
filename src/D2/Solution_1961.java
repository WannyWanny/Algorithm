package D2;

import java.util.Scanner;

public class Solution_1961 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int N = sc.nextInt();
            int[][] arr = new int[N][N];
            int[][] tmp1 = new int[N][N];
            int[][] tmp2 = new int[N][N];
            int[][] tmp3 = new int[N][N];

            for(int r=0; r<N; r++){
                for(int c=0; c<N; c++){
                    arr[r][c] = sc.nextInt();
                }
            }

            for(int r=0; r<N; r++){
                for(int c=0; c<N; c++){
                     tmp1[c][N-1-r] = arr[r][c];
                }
            }

            for(int r=0; r<N; r++){
                for(int c=0; c<N; c++){
                    tmp2[c][N-1-r] = tmp1[r][c];
                }
            }

            for(int r=0; r<N; r++){
                for(int c=0; c<N; c++){
                    tmp3[c][N-1-r] = tmp2[r][c];
                }
            }

            System.out.println("#"+tc+" ");
            for(int r=0; r<N; r++){
                for(int c=0; c<N; c++){
                    System.out.print(tmp1[r][c]);
                }
                System.out.printf(" ");
                for(int c=0; c<N; c++){
                    System.out.print(tmp2[r][c]);
                }
                System.out.printf(" ");
                for(int c=0; c<N; c++){
                    System.out.print(tmp3[r][c]);
                }
                System.out.println();
            }

        }//end of test
    }
}
