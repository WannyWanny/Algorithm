package D3;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_1234 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 10;
        for(int tc=1; tc<=T; tc++){
            int n = sc.nextInt();
            String str = sc.nextLine();
            int[] arr = new int[n+1];
            for(int i=1; i<=n; i++){
                arr[i] = str.charAt(i)-'0';
            }

            for(int i=1; i<n; i++){
                if(arr[i] == arr[i+1]){
                    
                }
            }
        }
    }
}
