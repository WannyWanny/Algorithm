package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_7964 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int n = sc.nextInt();
            int d = sc.nextInt();
            int[] arr = new int[n+2];
            arr[0] = 1;
            for(int i=1; i<arr.length-1; i++)
                arr[i] = sc.nextInt();
            arr[n+1] = 1;

            int ans=0;
            int dist=d;
            for(int i=1; i<arr.length; i++){
                if(arr[i]==1) dist=d;
                else if(arr[i]==0){
                    dist--;
                    if(dist==0){
                        dist = d;
                        ans++;
                    }
                }
            }

            System.out.println("#"+tc+" "+ans);
        }
    }
}
