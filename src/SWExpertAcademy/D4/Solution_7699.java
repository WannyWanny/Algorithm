package SWExpertAcademy.D4;
import java.util.Scanner;

public class Solution_7699 {
    static int[][] map;
    static int T, R, C;
    static int[] dr={1, -1, 0, 0};         //상하좌우
    static int[] dc={0, 0, -1, 1};
    static int Ans;
    static int[] visited;

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            R = sc.nextInt();
            C = sc.nextInt();
            map = new int[R][C];
            Ans=0;
            visited = new int[26+1];
            for(int r=0; r<R; r++){
                String str = sc.next();
                for (int c=0; c<C; c++){
                    map[r][c] = str.charAt(c)-'A';
                }
            }

            DFS(0, 0, 1);
            System.out.println("#"+tc+" "+Ans);

        }
    }

    private static void DFS(int r, int c, int cnt){

        Ans = Math.max(Ans, cnt);
        visited[map[r][c]] = 1;
        int nc, nr;

        for(int k=0; k<4; k++){
            nc = c+dc[k];
            nr = r+dr[k];

            if(nr<0 || nr>=R || nc<0 || nc>=C) continue;
            if(visited[map[nr][nc]]==1) continue;

            DFS(nr, nc, cnt+1);
            visited[map[nr][nc]]=0;

        }
    }
}
