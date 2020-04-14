package SWExpertAcademy.D4;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_7829 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int P = sc.nextInt();
            int[] arr = new int[P];
            for(int i=0; i<P; i++)
                arr[i] = sc.nextInt();
            Arrays.sort(arr);
            int res = arr[0]*arr[arr.length-1];
            System.out.println("#"+tc+" "+res);
        }
    }
}
