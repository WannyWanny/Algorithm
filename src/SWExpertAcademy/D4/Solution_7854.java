package SWExpertAcademy.D4;

import java.util.Scanner;

public class Solution_7854 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int x = sc.nextInt();
            long temp = 34517;
            int res=0;
            for(int i=1; i<=x; i++){
                if((temp*10+i) % i==0) res++;
            }

            System.out.println("#"+tc+" "+res);
        }

    }
}

