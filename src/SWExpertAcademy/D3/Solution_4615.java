package SWExpertAcademy.D3;
import java.util.Scanner;
public class Solution_4615 {
    static int N;
    static int[] dc = {0,  1, 1, 1, 0, -1, -1, -1};               //8방
    static int[] dr = {-1, -1, 0, 1, 1, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int ansW=0;
        int ansB=0;
        for(int tc=1; tc<=T; tc++){
            N = sc.nextInt();
            int M = sc.nextInt();
            int[][] board = new int[N][N];

            board[N/2][N/2] = 2;
            board[N/2-1][N/2-1] = 2;
            board[N/2-1][N/2] = 1;
            board[N/2][N/2-1] = 1;

            for(int i=0; i<M; i++){
                int r = sc.nextInt()-1;
                int c = sc.nextInt()-1;
                int doll = sc.nextInt();                   //1 B, 2 W
                board[r][c] = doll;
                for(int k=0; k<8; k++){
                    boolean flag = false;
                    int nr = r + dr[k];
                    int nc = c + dc[k];
                    while(Check(nr, nc) && board[nr][nc] != doll){
                        if(board[nr][nc] == 0){
                            flag = false;
                            break;
                        }
                        flag = true;
                        nr += dr[k];
                        nc += dc[k];
                    }
                    if(Check(nr, nc) && flag){
                        nc = c+ dc[k];
                        nr = r+ dr[k];
                        while(board[nr][nc] != doll){
                            board[nr][nc] = doll;
                            nr += dr[k];
                            nc += dc[k];
                        }
                    }
                }

            }

            for(int r=0; r<N; r++){
                for(int c=0; c<N; c++){
                    if(board[r][c] == 1)
                        ansB++;
                    else if(board[r][c] == 2)
                        ansW++;
                }
            }

            System.out.println("#"+tc+" "+ansB+" "+ansW);
        }//end of test
    }

    private static void Print(int[][] arr){
        for(int r=0; r<arr.length; r++){
            for(int c=0; c<arr[r].length; c++){
                System.out.print(arr[r][c]+" ");
            }
            System.out.println();
        }
    }

    private static boolean Check(int row, int col) {
        return row>=0 && row<N && col>=0 && col<N;
    }
}
