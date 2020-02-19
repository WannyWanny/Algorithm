package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_1206 {
    static int N;
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int tc=1; tc<=10; tc++){
            N = sc.nextInt();
            arr = new int[N+1];

            for(int i=0; i<N; i++){
                arr[i] = sc.nextInt();
            }


        }
    }

    private static int getMax(int idx){
        int max=0;
        for(int i=idx-2; i<idx+2; i++){
            if(max < arr[i]) max = arr[i];
        }
        return max;
    }
}
