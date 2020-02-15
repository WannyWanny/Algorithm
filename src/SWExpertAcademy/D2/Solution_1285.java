package SWExpertAcademy.D2;

import java.util.Scanner;

public class Solution_1285 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int N = sc.nextInt();
            int[] arr = new int[N];

            for(int i =0; i<N; i++){
                arr[i] = sc.nextInt();
            }
            int min = Integer.MAX_VALUE;
            int dis=0;
            for(int i=0; i<N; i++){
                min = Math.min(dis, Math.abs(arr[i]));
            }
            int cnt=0;
            for(int i=0; i<N; i++){
                if(Math.abs(arr[i]) == dis)
                    cnt++;
            }
            System.out.println("#"+tc+" "+dis+" "+cnt);

        }//end of test
    }
}
