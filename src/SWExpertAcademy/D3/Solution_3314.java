package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_3314 {
    static int T;
    static int[] arr;
    static int sum, avg;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            arr = new int[5];
            for(int i=0; i<5; i++){
                arr[i]=sc.nextInt();
            }

            sum=0;
            for(int i=0; i<5; i++){
                if(arr[i] <40) arr[i] = 40;
                sum += arr[i];
            }

            avg = sum/5;

            System.out.println("#"+tc+" "+avg);
        }
    }
}
