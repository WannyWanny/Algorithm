package SWExpertAcademy.D3;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution_5549 {
    static int T;
    static BigInteger n = new BigInteger("0");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T =sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            n = sc.nextBigInteger();

            n = n.remainder(BigInteger.valueOf(2));

            BigInteger odd = new BigInteger("1");
            BigInteger even = new BigInteger("0");
            System.out.print("#"+tc+" ");
            if(n.equals(even))
                System.out.println("Even");
            else if(n.equals(odd))
                System.out.println("Odd");
        }
    }
}
