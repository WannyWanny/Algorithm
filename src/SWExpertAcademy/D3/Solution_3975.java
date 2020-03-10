package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_3975 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            int n1 = a*d;
            int n2 = b*c;
            if(n1 > n2)
                System.out.println("#"+tc+" ALICE");
            else if(n1 == n2)
                System.out.println("#"+tc+" DRAW");
            else
                System.out.println("#"+tc+" BOB");
        }
    }
}
