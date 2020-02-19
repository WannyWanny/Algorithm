package SWExpertAcademy.D3;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_8500 {
    static int T, N;
    static int[] arr;
    static int Ans;

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            N = sc.nextInt();
            arr = new int[N];
            for(int i=0; i<N; i++)
                arr[i] = sc.nextInt();
            Arrays.sort(arr);
            Ans=0;
            for(int i=0; i<N; i++){
                Ans += arr[i];
            }
            Ans +=(N+arr[N-1]);

            System.out.println("#"+tc+" "+Ans);
        }
    }
}
