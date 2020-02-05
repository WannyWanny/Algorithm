package D2;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_1970 {
    static int money[]= {50000, 10000, 5000, 1000, 500, 100, 50, 10};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int tc=1; tc<=T; tc++){
            int num = sc.nextInt();
            int[] moneyCnt = new int[money.length];
            for(int i=0; i<money.length; i++){
                if(num >= money[i]){
                    moneyCnt[i] = num/money[i];
                    num -= (moneyCnt[i]*money[i]);
                }
            }

            System.out.println("#"+tc);
            for(int i=0; i<moneyCnt.length; i++)
                System.out.print(moneyCnt[i]+" ");
            System.out.println();

        }//end of test
    }
}
