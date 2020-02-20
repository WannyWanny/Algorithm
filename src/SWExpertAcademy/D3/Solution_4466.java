package SWExpertAcademy.D3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution_4466 {
    static int T, n,k;
    static Integer[] score;
    static int Ans;

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1;tc<=T; tc++){
            n = sc.nextInt();
            k = sc.nextInt();
            score = new Integer[n];
            for(int i=0; i<n; i++){
                score[i]=sc.nextInt();
            }

            Arrays.sort(score, Collections.reverseOrder());
            Ans=0;
            for(int i=0; i<k; i++){
                Ans += score[i];
            }
            System.out.println("#"+tc+" "+Ans);
        }
    }
}
