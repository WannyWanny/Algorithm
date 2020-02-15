package SWExpertAcademy.D2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution_1983 {
    static String[] grade ={"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int tc=1; tc<=T; tc++){
            int n=sc.nextInt();
            int k=sc.nextInt()-1;
            Integer[] score = new Integer[n];

            for(int i=0; i<n; i++){
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                int n3 = sc.nextInt();
                score[i] = (n1*35+n2*45+n3*20);
            }
            int k_score = score[k];
            Arrays.sort(score, Collections.reverseOrder());
            int k_rank = Arrays.asList(score).indexOf(k_score);

            System.out.println("#"+tc+" "+grade[(k_rank*10)/n]);
        }//end of test
    }
}
