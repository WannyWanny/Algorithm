package SWExpertAcademy.D4;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_1861 {
    static int T, N;
    static int[][] map;
    static int[] dr={-1, 1, 0, 0};     //상 하 좌 우
    static int[] dc={0, 0, -1, 1};
    static int[][] mapCnt;
    static int cnt;
    static int max;
    static int Ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            N = sc.nextInt();
            map = new int[N][N];
            mapCnt = new int[N][N];
            max=1;
            cnt=1;
            int[] arr = new int[N*N];
            for(int r=0; r<N; r++){
                for(int c=0; c<N; c++){
                    map[r][c] = sc.nextInt();
                }
            }

            for(int r=0; r<N; r++){
                for(int c=0; c<N; c++){
                    dfs(r, c);
                    mapCnt[r][c]=cnt;
                    cnt=1;
                }
            }
            int a=0;
            for(int r=0; r<N; r++){
                for(int c=0; c<N; c++){
                    if(max <= mapCnt[r][c]){
                        max = mapCnt[r][c];
                        Ans = map[r][c];
                        arr[a]=Ans;
                        a++;
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
            System.out.println(Ans);

        }//end of test
    }

    private static int dfs(int r, int c){
        for(int k=0; k<4; k++){
            int nc=c+dc[k];
            int nr=r+dr[k];

            if(check(nr, nc) && map[r][c]+1 == map[nr][nc]){
                cnt++;
                dfs(nr, nc);
            }
        }
        return cnt;
    }

    private static boolean check(int nr, int nc){
        if(nc<0 || nc>=N || nr<0 || nr>=N)
            return false;
        else
            return true;
    }
}
