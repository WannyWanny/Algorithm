package SWExpertAcademy.D5;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_5656 {
    static int T, N, R, C;
    static int[][] map;
    static boolean[][] visited;
    static int[] dr={-1, 1, 0, 0};
    static int[] dc={0, 0, -1, 1};
    static int Ans;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            N = sc.nextInt();
            C = sc.nextInt();
            R = sc.nextInt();
            map = new int[R][C];
            visited = new boolean[R][C];
            Ans=0;
            for(int r=0; r<R; r++){
                for(int c=0; c<C; c++){
                    map[r][c] =sc.nextInt();
                }
            }

            printMap(map);

        }
    }

    private static void printMap(int[][] arr){
        for(int r=0; r<R; r++){
            for(int c=0; c<C; c++){
                System.out.print(arr[r][c]+" ");
            }
            System.out.println();
        }
    }

    private static void breakBrick(int r, int cnt, int[][] map){
        if(r==0){

            return;
        }
        for(int c=0; c<C; c++){
            breakBrick(r, cnt, map);
        }
    }

    private static boolean isIn(int r, int c){
        if(r<0 || r>=R || c<0  || c>=C) return false;
        else return true;
    }
}
