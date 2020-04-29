package SWExpertAcademy.D4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_4050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int tc=1; tc<=T; tc++){
            int n = Integer.parseInt(br.readLine());
            st =new StringTokenizer(br.readLine());

            int[] arr = new int[n];

            for(int i=0; i<arr.length; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);

            int m = n/3;
            int sum=0;
            for(int i=0; i<arr.length; i++){
                sum += arr[i];
            }
            int idx=n-3;
            for(int i=0; i<m; i++){
                sum -= arr[idx];
                idx-=3;
            }
            System.out.println("#"+tc+" "+sum);

        }
    }
}
