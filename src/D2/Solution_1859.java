package D2;

import java.util.Scanner;

public class Solution_1859 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int N = sc.nextInt();
            int[] arr = new int[N];
            long ans=0;
            int sum=0;
            int pos;
            int max=Integer.MIN_VALUE;
            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }

            for(int i=0; i<arr.length; i++){
                max = Math.max(max, arr[i]);
                if(arr[i] == max){
                    pos = i;
                    if(pos==0) break;
                    for(int j=0; j<pos; j++){
                        sum += arr[j];
                    }
                    
                }
            }

        }//end of test
    }
}
