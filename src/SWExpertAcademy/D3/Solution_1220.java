package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_1220 {
    static int ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int tc = 1; tc <= 10; tc++) {
            ans = 0;
            int N = sc.nextInt();
            int[][] input = new int[N][N];

            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    input[r][c] = sc.nextInt();
                }
            }                               //1 N, 2 S

            for(int c=0; c<N; c++){
                int cnt=0;
                for(int r=0; r<N; r++){
                    if(input[r][c] == 2 && cnt == 1){
                        ans++;
                        cnt=0;
                    }
                    else if(input[r][c] ==1 && cnt==0){
                        cnt++;
                    }
                }
            }

            System.out.println("#" + tc + " " + ans);
        }//end of test
    }

}