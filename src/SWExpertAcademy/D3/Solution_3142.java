package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_3142 {
    static int T, n, m;
    static int a, b;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            n = sc.nextInt();
            m = sc.nextInt();
            b = n-m;
            a = m-b;
            System.out.println("#"+tc+" "+a+" "+b);
        }
    }
}
