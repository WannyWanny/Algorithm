package D3;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_5603 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();

        for(int tc=1; tc<=T;tc++){
            int N = sc.nextInt();
            int[] arr = new int[N];
            for(int i=0; i<N; i++)
                arr[i] = sc.nextInt();

            int sum=0;
            for(int i=0; i<N; i++)
                sum += arr[i];
            int mid = sum/arr.length;
            int cnt=0;

            for(int i=0; i<N; i++){
                if(arr[i] < mid)
                    cnt += mid-arr[i];
                else
                    cnt += arr[i]-mid;
            }
            System.out.println("#"+tc+" "+(cnt/2));

        }//end of test
    }
}
