package SWExpertAcademy.D3;

        import java.util.Scanner;

public class Solution_3376 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int n = sc.nextInt();
            long[] dp = new long[101];
            dp[1] = 1;
            dp[2] = 1;
            dp[3] = 1;
            dp[4] = 2;
            dp[5] = 2;

            if(n > 5){
                for(int i=6; i<=n; i++){
                    dp[i] = dp[i-1]+dp[i-5];
                }
            }

            System.out.println("#"+tc+" "+dp[n]);

        }
    }
}
