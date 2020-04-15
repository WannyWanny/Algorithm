package SWExpertAcademy.D4;

import java.util.Scanner;

public class Solution_1211 {
    static int[][] map;
    static boolean[][] visited;
    static int[] dr={0, 0, 1};
    static int[] dc={1, -1, 0};

    static int index, min;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int tc=1; tc<=10; tc++){
            sc.nextLine();
            map = new int[100][100];

            index=0;
            min = Integer.MAX_VALUE;
            for(int r=0; r<100; r++){
                for(int c=0; c<100; c++){
                    map[r][c] = sc.nextInt();
                }
            }
            for(int c=0; c<100; c++){
                if(map[0][c] == 1){
                    visited = new boolean[100][100];
                    DFS(0, c, 0);
                }
            }
            System.out.println("#"+tc+" "+index);
        }
    }

    private static void DFS(int r, int c, int count){
        if(r==99 && min > count){
            index = c;
            min = count;
            return;
        }
        for(int d=0; d<3; d++){
            int nr = r+dr[d];
            int nc = c+dc[d];
            if(nr>=0 && nc>=0 && nr<100 && nc<100 &&
                    !visited[nr][nc] && map[nr][nc]==1){
                visited[nr][nc]=true;
                DFS(nr, nc, count++);
                break;
            }
        }
    }
}
