package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_6692 {
    static int T, N;
    static double[] p;
    static double[] x;
    static double Ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            N = sc.nextInt();
            p = new double[N];
            x = new double[N];
            for(int i=0; i<N; i++){
                p[i] = sc.nextDouble();
                x[i] = sc.nextDouble();
            }
            Ans=0.0;
            for(int i=0; i<N; i++){
                Ans += p[i]*x[i];
            }

            System.out.println("#"+tc+" "+Ans);
        }
    }
}
