package SWExpertAcademy.D4;

import java.util.Scanner;

public class Solution_1226 {
    static int[][] map;
    static boolean[][] visited;
    static int[] dr={0, 0, -1, 1};
    static int[] dc={1, -1, 0, 0};
    static int flag;
    static int rEnd, cEnd;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        for(int tc=1; tc<=10; tc++){
            sc.nextLine();
            map = new int[16][16];
            visited = new boolean[16][16];
            int rPos=0, cPos=0;
            rEnd=0; cEnd=0;
            flag=0;
            for(int r=0; r<16; r++){
                String[] str = sc.nextLine().split("");
                for(int c=0; c<str.length; c++){
                    map[r][c] = Integer.parseInt(str[c]);
                    if(map[r][c] == 2){
                        rPos = r;
                        cPos = c;
                    }
                    else if(map[r][c]==3){
                        rEnd=r;
                        cEnd=c;
                    }
                }
            }

            DFS(rPos, cPos);
            System.out.println("#"+tc+" "+flag);
        }
    }

    private static void DFS(int r, int c){
        visited[r][c] = true;
        if(r==rEnd && c==cEnd){
            flag = 1;
            return;
        }
        for(int k=0; k<4; k++){
            int nc = c+dc[k];
            int nr = r+dr[k];
            if(isIn(nr, nc)){
                if(!visited[nr][nc] && map[nr][nc]!=1){
                    DFS(nr, nc);
                }
            }
        }
    }

    private static boolean isIn(int r, int c){
        return (r>=0 && r<16 && c>=0 && c<16);
    }
}
