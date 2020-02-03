package D2;

import java.util.Scanner;

public class Solution_1979 {
    static int N;
    static int K;
    static int answer;
    static int[][] input;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            answer = 0;
            N = sc.nextInt();
            K = sc.nextInt();
            input = new int[N+2][N+2];

            for(int r=0; r<N; r++){
                for(int c=0; c<N; c++){
                    input[r][c] = sc.nextInt();
                }
            }

            for(int r=1; r<=N; r++){
                for(int c=1; c<=N; c++){
                    if(input[r][c]==1)
                       answer += checkPuzzle(r, c);
                }
            }

            System.out.println("#"+tc+" "+answer);
        }
    }

    private static int checkPuzzle(int x, int y){
        int cnt=0;
        int blank=1;

        //가로 판별
        for(int i=x+1; x<=N; i++){
            if(input[i][y] == 1)
                blank++;
            else
                break;
        }
        if(blank == K && input[x-1][y] == 0){
            cnt++;
        }
        blank=1;

        //세로판별
        for(int i=y+1; y<=N; i++){
            if(input[x][i] == 1)
                blank++;
            else
                break;
        }
        if(blank == K && input[x][y-1] == 0){
            cnt++;
        }

        return cnt;
    }
}
