package SWExpertAcademy.D4;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_3347 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            int[] brr = new int[m];
            int[] cnt = new int[n];
            int idx=0;
            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }
            for(int i=0; i<brr.length; i++){
                brr[i] = sc.nextInt();
            }

            for(int i=0; i<brr.length; i++){
                for(int j=0; j<arr.length; j++){
                    if(brr[i] >=arr[j]){
                        cnt[j]++;
                        break;
                    }
                }
            }
            int max = cnt[0];
            for(int i=0; i<arr.length; i++){
                if(max < cnt[i]) {
                    max = cnt[i];
                    idx = i;
                }
            }
            System.out.println("#"+tc+" "+(++idx));
        }
    }
}
