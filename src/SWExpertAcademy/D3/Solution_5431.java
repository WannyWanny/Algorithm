package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_5431 {
    static int T, n, k;
    static boolean[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            n = sc.nextInt();
            k = sc.nextInt();
            arr = new boolean[n];

            for(int i=0; i<k; i++){
                arr[sc.nextInt()-1]=true;
            }

            System.out.print("#"+tc+" ");
            for(int i=0; i<n; i++){
                if(arr[i] == false){
                    System.out.print((i+1)+" ");
                }
            }
            System.out.println();

        }

    }
}
