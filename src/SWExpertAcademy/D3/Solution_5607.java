package SWExpertAcademy.D3;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution_5607 {
    static final int MOD = 1234567891;

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T =sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int n = sc.nextInt();
            int r = sc.nextInt();
            BigInteger res = Factorial(n, r);
            System.out.println("#"+tc+" "+res);
        }
    }

    private static BigInteger Factorial(int n, int r){
        long[] arr = new long[n+1];
        arr[0] = 1;
        for(int i=1; i<=n; i++){
            arr[i] = arr[i-1]*i%MOD;
        }
        BigInteger mod = BigInteger.valueOf(MOD);
        BigInteger a = BigInteger.valueOf(arr[n]).remainder(mod);
        BigInteger b = BigInteger.valueOf(arr[r]).modInverse(mod).remainder(mod);
        BigInteger c = BigInteger.valueOf(arr[n-r]).modInverse(mod).remainder(mod);
        return a.multiply(b).multiply(c).remainder(mod);
    }
}
