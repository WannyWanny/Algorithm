package SWExpertAcademy.D2;

import java.util.Scanner;

public class Solution_2005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T =sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int N = sc.nextInt();
            int[][] arr = new int[N][N];
            arr[0][0] = 1;

            for(int r=0; r<N; r++)
                arr[r][0] = 1;

            for(int r=1; r<N; r++){
                for(int c=1; c<r+1; c++){
                    arr[r][c] += arr[r-1][c-1];
                    arr[r][c] += arr[r-1][c];
                }
            }

            System.out.println("#"+tc);
            for(int r=0; r<N; r++){
                for(int c=0; c<N; c++){
                    if(arr[r][c] != 0)
                        System.out.print(arr[r][c]+" ");
                }
                System.out.println();
            }
        }//end of test
    }
}
