package SWExpertAcademy.D2;

import java.util.Scanner;

public class Solution_1959 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] A = new int[n];
            int[] B = new int[m];
            int max = 0;

            for(int i=0;i<A.length;i++){
                A[i] = sc.nextInt();
            }
            for(int i=0;i<B.length;i++){
                B[i] = sc.nextInt();
            }

            if(n < m)
                max = addArr(A, B);
            else
                max = addArr(B, A);

            System.out.println("#"+tc+" "+max);
            }

        }
    private static int addArr(int[] a, int[] b){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<=(b.length - a.length); i++){
            int sum = 0;
            for(int j=0; j<a.length; j++)
                sum += a[j]*b[i+j];
            max = Math.max(max, sum);
        }
        return max;
    }
}
