package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_2805 {
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            N = sc.nextInt();
            int[][] map = new int[N][N];

            for(int r=0; r<N; r++){
                for(int c=0; c<N; c++){
                    map[r][c] = sc.nextInt();
                }
            }

            for(int r=0; r<N; r++){
                for(int c=0; c<N; c++){
                    System.out.print(map[r][c]+" ");
                }
                System.out.println();
            }

            int s = N/2;
            int sum=0;
            int K=1;
            for(int r=0; r<N; r++){
                for(int c=0; c<K; c++){
                    sum += map[r][s];
                    s -=2;
                }
                K+=2;
                if(K == N){
                    for(int c=K; c>0; c--){
                        sum += map[r][s];
                        s += 2;
                    }
                    K -=2;
                }
            }
            System.out.println("#"+tc+" "+sum);
        }//end of test
    }
}

/*
        1
        5
        1 4 0 5 4
        4 4 2 5 0
        0 2 0 3 2
        5 1 2 0 4
        5 2 2 1 2 */