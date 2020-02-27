package SWExpertAcademy.D3;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_6900 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int sum=0;
            String[] lotto = new String[n];
            int[] money = new int[n];
            for(int i=0; i<n; i++){
                lotto[i] = sc.next();
                money[i] = sc.nextInt();
            }
            String[] _lotto = new String[m];
            for(int i=0; i<m; i++){
                _lotto[i] = sc.next();
            }


        }
    }
}
