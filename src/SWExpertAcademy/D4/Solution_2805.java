package D3;

import java.util.Scanner;

public class Solution_2805 {
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            N = sc.nextInt();
            int sum=0;

            for(int i=N/2; i>=0; i--){
                String str = sc.next();
                for(int j=i; j<N-i; j++){
                    sum += str.charAt(j)-'0';
                }
            }
            for(int i=1; i<=N/2; i++){
                String str = sc.next();
                for(int j=i; j<N-i; j++){
                    sum += str.charAt(j)-'0';
                }
            }

            System.out.println("#"+tc+" "+sum);
        }//end of test
    }
}
