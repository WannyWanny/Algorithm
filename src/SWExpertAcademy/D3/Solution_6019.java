package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_6019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            double d = sc.nextDouble();
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double f = sc.nextDouble();
            double Ans = 0.0;

            double time = d/(a+b);
            Ans = f*time;
            System.out.println("#"+tc+" "+Ans);
        }
    }
}
