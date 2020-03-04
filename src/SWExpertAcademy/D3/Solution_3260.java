package SWExpertAcademy.D3;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution_3260 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            BigInteger num1 = sc.nextBigInteger();
            BigInteger num2 = sc.nextBigInteger();
            BigInteger result;

            result = num1.add(num2);

            System.out.println("#"+tc+" "+result);
        }
    }
}
