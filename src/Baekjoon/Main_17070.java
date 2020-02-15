package Baekjoon;

import java.util.Scanner;

public class Main_17070 {
    static int[] dr = {0, 1, -1};
    static int[] dc = {1, 1, 0};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int N = sc.nextInt();
            int status=1;                 //1가로 2세로 3대각선
            int[][] map = new int[N][N];
            for(int r=0; r<N; r++){
                for(int c=0; c<N; c++){
                    map[r][c] = sc.nextInt();
                }
            }

            map[0][0]=1;
            map[0][1]=2;
            int ans=0;
            while(true){
                if(map[N-1][N-1]==2) break;
                switch (status){
                    case 1:

                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
            }

        }//end of test
    }
}
