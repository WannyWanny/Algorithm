package SWExpertAcademy.D2;

import java.util.Scanner;

public class Solution_1284 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        for(int test_case=1; test_case<=T; test_case++){
            int P = sc.nextInt();
            int Q = sc.nextInt();
            int R = sc.nextInt();
            int S = sc.nextInt();
            int W = sc.nextInt();
            int a, b;                   //A와 B의 요금
            a = P * W;
            if(W > R)
                b = Q + (W-R)*S;
            else
                b = Q;

            if(a < b)
                System.out.println("#"+test_case+" "+a);
            else
                System.out.println("#"+test_case+" "+b);

        }
    }
}
