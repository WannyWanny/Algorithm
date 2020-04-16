package SWExpertAcademy.D4;

import java.util.Scanner;

public class Solution_1868 {
    static int N;
    static char[][] map;
    static boolean[][] visited;
    static int[] dr={-1, -1, -1, 0, 1, 1, 1, 0};
    static int[] dc={-1, 0, 1, -1, 1, 0, -1, 1};
    static int result;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            N = sc.nextInt();
            map = new char[N][N];
            visited =new boolean[N][N];
            result=0;
            for(int r=0; r<N; r++){
                String str = sc.next();
                for(int c=0; c<N; c++){
                    map[r][c] = str.charAt(c);
                }
            }

            for(int r=0; r<N; r++){
                for(int c=0; c<N; c++){
                    if(map[r][c]!='.')continue;
                    if(map[r][c] == '.'){
                        result++;
                        DFS(r, c);
                    }
                }
            }

            for(int r=0; r<N; r++){
                for(int c=0; c<N; c++){
                    if(map[r][c] =='.') result++;
                }
            }

            System.out.println("#"+tc+" "+result);
        }
    }

    private static int check(int r, int c){
        int mine = 0;
        for(int d=0; d<8; d++){
            int nr=r+dr[d];
            int nc=c+dc[d];
            if(Isin(nr, nc) && map[nr][nc] =='*') mine++;
        }
        return mine;
    }

    private static void DFS(int r, int c){
        visited[r][c] = true;
        int mine =  check(r, c);
        map[r][c] = (char)(mine+'0');
        if(mine!=0) return;

        for(int d=0; d<8; d++){
            int nr = r+dr[d];
            int nc = c+dc[d];
            if(Isin(nr, nc)){
                if(!visited[nr][nc] && map[nr][nc] =='.'){
                    DFS(nr, nc);
                }
            }
        }
    }

    private static boolean Isin(int r, int c){
        return (r>=0 && r<N && c>=0 && c<N);
    }
}
