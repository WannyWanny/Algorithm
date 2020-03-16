package SWExpertAcademy.D4;

import java.util.Scanner;

public class Solution_1868 {
    static int T, N;
    static char[][] map;
    static boolean[][] visited;
    static int[] dr={-1, -1, -1, 0, 1, 1, 1, 0};
    static int[] dc={-1, 0, 1, 1, 1, 0, -1, -1};
    static int Ans;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            N = sc.nextInt();
            map = new char[N][N];
            visited = new boolean[N][N];
            Ans = Integer.MAX_VALUE;
            for(int r=0; r<N; r++){
                String str = sc.next();
                for(int c=0; c<N; c++){
                    map[r][c] = str.charAt(c);
                }
            }
            DFS(0, 0);


        }
    }
    private static void DFS(int r, int c){

        for(int k=0; k<8; k++){
            int nc=c+dc[k];
            int nr=r+dr[k];
            if(!isIn(nr, nc)) continue;

        }
    }

    private static void printMap(){
        for(int r=0; r<N; r++){
            for(int c=0; c<N; c++){
                System.out.print(map[r][c]+" ");
            }
            System.out.println();
        }
    }

    private static boolean isIn(int r, int c){
        if(r<0 || r>=N || c<0 || c>=N) return false;
        else
            return true;
    }
}
