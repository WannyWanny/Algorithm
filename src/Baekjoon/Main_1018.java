/*package 브루트_포스;

import java.util.Scanner;
public class Sol_1018 {
    static Scanner sc = new Scanner(System.in);
    static int n = sc.nextInt();
    static int m = sc.nextInt();
    static int[][] board = new int[n][m];
    public static void main(String[] args) {
        for(int i=0; i<n; i++)
        {
            String t = sc.next();
            for(int j=0; j<m; j++)
                board[i][j] = t.charAt(j);
        }
        int result = Integer.MAX_VALUE;

    }

    private static int solve(int x, int y) {
        //검정색으로 시작할 경우
        int res1 = 0;
        int temp = 'B';
        for (int i = 0; i < x + 8; i++) {
            if(board[i][y] != temp) res1++;{
                for (int j = y + 1; j < y + 8; j++) {
                    res1++;
                    if (temp == 'B') temp = 'W';
                    else temp = 'B';
                }
            }else temp = board[i][j];
        }
    }
}
*/
//다시 풀어 볼것