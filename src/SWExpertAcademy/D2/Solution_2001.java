package SWExpertAcademy.D2;

import java.util.Scanner;

public class Solution_2001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            int m = sc.nextInt();

            for(int r=0; r<n; r++){
                for(int c=0; c<n; c++){
                    arr[r][c] =sc.nextInt();
                }
            }

            int max = Integer.MIN_VALUE;
            int sum=0;


            for(int r=0; r<n-m+1; r++){
                for(int c=0; c<n-m+1; c++){
                    for(int k=r; k<r+m; k++){
                        for(int j=c; j<c+m; j++){
                            sum += arr[k][j];
                        }
                    }
                    if(sum > max) max = sum;
                    sum=0;
                }
            }
            System.out.println("#"+tc+" "+max);
        }
    }
}
