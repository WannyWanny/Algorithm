package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_3750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            long num = sc.nextLong();
            while(num>=10){
                num = Func(num);
            }

            System.out.println("#"+tc+" "+num);
        }
    }

    private static long Func(long n){
        long sum=0;
        for(long i=n; i>0; i/=10){
            sum += i%10;
        }
        return sum;
    }
}
