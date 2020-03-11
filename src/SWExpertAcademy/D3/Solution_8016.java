package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_8016 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            long n = sc.nextLong();
            long left, right;
            right = n*n*2-1;
            left = (n-1)*(n-1)*2-1+2;
            System.out.println("#"+tc+" "+left+" "+right);
        }
    }
}
