package SWExpertAcademy.D4;

import java.util.Scanner;

public class Solution_1486 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int n = sc.nextInt();
            int b = sc.nextInt();
            int min = Integer.MAX_VALUE;
            int[] arr =new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            for(int i=0; i<(1<<n); i++){
                int res=0;
                for(int j=0; j<n; j++){
                    if((i&(1<<j)) !=0){
                        res += arr[j];
                    }
                }
                if(res>=b){
                    min = Math.min(res-b, min);
                }
            }

            System.out.println("#"+tc+" "+min);
        }
    }
}
