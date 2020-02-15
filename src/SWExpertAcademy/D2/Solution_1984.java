package SWExpertAcademy.D2;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_1984 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int[] arr = new int[10];

            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }
            int sum=0;

            Arrays.sort(arr);

            for(int i=1; i<arr.length-1; i++){
                sum += arr[i];
            }
            double avg = sum/8.0;
            int ans = (int)Math.round(avg);
            System.out.println("#"+tc+" "+ans);
        }//end of test
    }
}
