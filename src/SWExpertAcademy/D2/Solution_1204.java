package SWExpertAcademy.D2;

import java.util.Scanner;

public class Solution_1204 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            sc.nextInt();
            int[] score = new int[1001];
            int[] cnt= new int[101];

            for(int i=0; i<1000; i++){
                score[i] = sc.nextInt();
                cnt[score[i]]++;
            }

            int max = 0;

            for(int i=0; i<100; i++){
                if(score[max] <= score[i])
                    max = i;
            }

            System.out.println("#"+tc+" "+max);
        }//end of test
    }
}
