package D2;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_1946 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T =sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int n=sc.nextInt();
            char[] alp = new char[n];
            int[] arr = new int[n];

            for(int i=0; i<n; i++){
                alp[i]=sc.next().charAt(0);
                arr[i] = sc.nextInt();
            }

            System.out.println("#"+tc);

            int cnt=0;

            for(int i=0; i<n; i++){
                cnt=0;
                for(int j=0; j<arr[i]; j++){
                    System.out.print(alp[i]);
                    cnt++;
                    if (cnt == 10) {
                        System.out.println();
                        continue;
                    }
                }
            }
        }
    }
}
