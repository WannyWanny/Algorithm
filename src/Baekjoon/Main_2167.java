package Baekjoon;

import java.util.Scanner;

public class Main_2167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        for(int r=0; r<n; r++){
            for(int c=0; c<m; c++){
                arr[r][c] = sc.nextInt();
            }
        }

        int T = sc.nextInt();
        for(int tc=0; tc<T; tc++){
            int r1 = sc.nextInt()-1;
            int c1 = sc.nextInt()-1;
            int r2 = sc.nextInt()-1;
            int c2 = sc.nextInt()-1;

            int ans=0;

            for(int r=r1; r<=r2; r++){
                for(int c=c1; c<=c2; c++){
                    ans += arr[r][c];
                }
            }
            System.out.println(ans);
        }
    }
}
