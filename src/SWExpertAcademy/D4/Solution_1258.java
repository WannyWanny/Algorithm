package SWExpertAcademy.D4;

import java.util.Scanner;

public class Solution_1258 {
    static int T, N, cnt=0;
    static int x, y;
    static int[][] map;
    static int[] size;
    static int[] row;
    static int[] col;
    static boolean isNemo;
    static boolean isSearch;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T =sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            N=sc.nextInt();
            map = new int[N][N];

            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    map[i][j]=sc.nextInt();
                }
            }

            size = new int[100];
            row = new int[100];
            col = new int[100];
            for(int r=0; r<N; r++){
                for(int c=0; c<N; c++){
                    x=0; y=0;
                    //사각형을 탐색 못하다가 0이 아닌 숫자 발견
                    if(!isSearch && map[r][c] !=0){
                        cnt++;
                        isSearch=true;
                    }
                    //사각형을 발견했으면 행과 열의 크기를 찾아내야지
                    while(isSearch) {
                        for (int r2 = r; r2 < N; r2++) {
                            for (int c2 = c+1; c2 < N; c2++) {
                                if (map[r2][c2]!=0){
                                    x++;
                                }
                                else if(map[r2][c2] == 0){
                                    break;
                                }
                            }
                            if(map[r2][c] != 0){
                                y++;
                            }
                            else if(map[r2][c] == 0){
                                isSearch = false;
                            }

                        }
                        row[cnt]=y;
                        col[cnt]=x;

                    }

                }
            }
            System.out.println("#"+tc+" "+cnt);
        } // end of test
    }

}
