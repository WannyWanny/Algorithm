package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_2817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            int Ans=0;
            for(int i=0; i<arr.length; i++)
                arr[i] = sc.nextInt();

            for(int i=0; i<(1<<arr.length); i++){
                int sum=0;
                for(int j=0; j<arr.length; j++){
                    if((i&(1<<j)) !=0){
                        sum += arr[j];
                    }
                }
                if(sum==k) Ans++;
                sum=0;
            }

            System.out.println("#"+tc+" "+Ans);
        }
    }
}
