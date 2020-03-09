package SWExpertAcademy.D5;

import java.util.Scanner;

public class Solution_7793 {
    static int R, C;
    static int[] dc={1, -1, 0, 0};         //동 서 남 북
    static int[] dr={0, 0, 1, -1};
    static boolean[][] visited;
    static char[][] map;
    static int Ans;
    static int endR, endC;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            R = sc.nextInt();
            C = sc.nextInt();
            map = new char[R][C];
            visited = new boolean[R][C];
            int startR=0;
            int startC=0;
            endR=0; endC=0;
            for(int r=0; r<R; r++){
                String str = sc.next();
                for(int c=0; c<C; c++){
                    map[r][c] = str.charAt(c);
                }
            }

            for(int r=0; r<R; r++){
                for(int c=0; c<C; c++){
                    if(map[r][c] == 'D'){
                        startR = r;
                        startC = c;
                    }
                    else if(map[r][c] == 'S'){
                        endR = r;
                        endC = c;
                    }
                }
            }
            Ans=0;
            DFS(startR, startC, 0);
            if(Ans==0)
                System.out.println("#"+tc+" GAME OVER");
            else
                System.out.println("#"+tc+" "+Ans);

        }
    }

    private static void DFS(int r, int c, int cnt){
        visited[r][c] = true;
        //목표지점 도달
        if(r==endR && c==endC){
            Ans=cnt;
            return;
        }

        int dCnt=0;         //사방이 막혔는지 확인
        for(int k=0; k<4; k++){
            int nc = c+dc[k];
            int nr = r+dr[k];
            if(nc<0 || nc>=C || nr<0 || nr>=R) continue;
            deathHand(nr, nc);
            if(map[nr][nc]=='*'){
                dCnt++;
            }
            if(dCnt==4){
                Ans=0;
                break;
            }
            if(map[nr][nc] == 'X') continue;
            if(map[nr][nc] == '*') continue;
            if(visited[nr][nc]) continue;
            DFS(nr, nc, cnt+1);
            visited[nr][nc] = false;
        }
    }

    private static void deathHand(int r, int c){
        if(map[r][c] == '*'){
            for(int k=0; k<4; k++){
                int nc=c+dc[k];
                int nr=r+dr[k];
                if(nc<0 || nc>=C || nr<0 || nr>=R) continue;
                if(map[nr][nc] == '.') map[nr][nc]='*';
            }
        }
    }
}
