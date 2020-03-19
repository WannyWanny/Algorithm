package SWExpertAcademy.D4;

import java.util.Scanner;

public class Solution_5987 {
    static int N, M;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            N = sc.nextInt();
            M = sc.nextInt();
            long ans=0;


        }
    }

    private static long Factorial(long n){
        if(n==1)
            return 1;
        else
            return Factorial(n-1)*n;
    }
}
