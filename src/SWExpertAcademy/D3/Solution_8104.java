package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_8104 {
    static int T;
    static int N, K;
    static int[] score;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T=sc.nextInt();

        for(int tc=1; tc<=T; tc++){
            N = sc.nextInt();
            K = sc.nextInt();
            score = new int[K];

            //홀수
            if (N % 2 == 1) {
                score[0] = 1 * (N / 2 + 1) + K * (N - 1) * (N / 2 + 1);
            }
            //짝수
            else if (N % 2 == 0) {
                score[0] = 1 * (N / 2) + K * (N / 2) * N;
            }

            if(N%2==0) {
                for (int i = 1; i < K; i++) {
                    score[i] = score[i - 1];
                }
            }
            else if(N%2==1){
                for(int i=1; i<K; i++){
                    score[i] = score[i-1]+1;
                }
            }

            System.out.print("#"+tc);
            for(int i=0; i<score.length; i++){
                System.out.print(" "+score[i]);
            }
            System.out.println();
        }//end of test
    }
}

