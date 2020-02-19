package SWExpertAcademy.D3;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_8658 {
    static int T;
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            arr = new int[10];
            for(int i=0; i<10; i++){
                arr[i] = sc.nextInt();
            }

            int[] sumArr = new int[10];
            for(int i=0; i<10; i++){
                sumArr[i] = getSum(arr[i]);
            }
            Arrays.sort(sumArr);

            System.out.println("#"+tc+" "+sumArr[9]+" "+sumArr[0]);

        }//end of test
    }

    private static int getSum(int num){
        int sum=0;
        while(num>=10){
            sum += num%10;
            num /=10;
        }
        sum+=num;
        return sum;
    }
}
