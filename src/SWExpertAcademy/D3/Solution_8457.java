package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_8457 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int n = sc.nextInt();
            int b = sc.nextInt();
            int e = sc.nextInt();
            int[] arr = new int[n];
            boolean[] ans = new boolean[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            for(int i=0; i<n; i++){
                for(int j=arr[i]; j<=b+e; j+=arr[i]){
                    if(j>=b-e){
                        ans[i]=true;
                        break;
                    }
                }
            }

            int cnt=0;
            for(int i=0; i<ans.length; i++){
                if(ans[i]) cnt++;
            }
            System.out.println("#"+tc+" "+cnt);
        }
    }
}
