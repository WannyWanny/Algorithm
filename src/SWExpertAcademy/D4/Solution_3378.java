package SWExpertAcademy.D4;

import java.util.Scanner;

public class Solution_3378 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] v = new int[n];
            int[] c =new int[n];
            for(int i=0; i<n; i++){
                v[i] = sc.nextInt();
                c[i] = sc.nextInt();
            }
            int max = Integer.MIN_VALUE;
            for(int i=0; i<(1<<n); i++){
                int vSum=0;
                int cSum=0;
                for(int j=0; j<n; j++){
                    if((i&(1<<j))!=0) {
                        System.out.print(v[j]);
                        vSum += v[j];
                        cSum += c[j];
                        if(vSum > k) break;
                        max = Math.max(max, cSum);
                    }
                }
                System.out.println();
            }

            System.out.println("#"+tc+" "+max);

        }
    }
}
