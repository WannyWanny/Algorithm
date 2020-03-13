package SWExpertAcademy.D3;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_6190 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int n = sc.nextInt();
            int[] arr =new int[n];
            int max = Integer.MIN_VALUE;
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            for(int i=0; i<n-1; i++){
                for(int j=i+1; j<n; j++){
                    int temp = arr[i]*arr[j];
                    if(Danzo(temp) && max < temp) max = temp;
                }
            }


            System.out.println("#"+tc+" "+max);
        }
    }

    private static boolean Danzo(int n){
        int num1 = n%10;
        n/=10;

        while(n!=0){
            int num2 = n%10;
            n/=10;
            if(num1<num2) return false;
            num1 = num2;
        }
        return true;
    }
}
