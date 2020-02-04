package D2;

import java.util.Scanner;

public class Solution_1974 {
    static int N = 9;
    static int sum = 45;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int[][] map = new int[N][N];

            for(int r=0; r<N; r++){
                for(int c=0; c<N; c++){
                    map[r][c] = sc.nextInt();
                }
            }


        }//end of test
    }
}
