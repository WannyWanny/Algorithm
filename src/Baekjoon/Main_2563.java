package Baekjoon;

import java.util.Scanner;

public class Main_2563 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        boolean[][] arr = new boolean[101][101];
        int[][] input = new int[N][2];

        for(int i=0; i<N; i++){
            for(int j=0; j<2; j++){
                input[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<N; i++){
            for(int r=input[i][0]; r<input[i][0]+10; r++){
                for(int c=input[i][1]; c<input[i][1]+10; c++){
                    arr[r][c] = true;
                }
            }
        }
        int ans=0;
        for(int r=0; r<arr.length; r++){
            for(int c=0; c<arr[0].length; c++){
                if(arr[r][c]) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}
