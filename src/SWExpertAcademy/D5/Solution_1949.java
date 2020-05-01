package SWExpertAcademy.D5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1949 {
    static int N, K, res;
    static int[][] map;
    static boolean[][] visited;
    static int[] dr={0, 0, 1, -1};
    static int[] dc={1, -1, 0, 0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=T; tc++){
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            map = new int[N][N];
            visited = new boolean[N][N];
            int height = Integer.MIN_VALUE;
            for(int r=0; r<N; r++){
                st = new StringTokenizer(br.readLine());
                for(int c=0; c<N; c++){
                    map[r][c] = Integer.parseInt(st.nextToken());
                    height = Math.max(height, map[r][c]);
                }
            }

            res=Integer.MIN_VALUE;
            for(int r=0; r<N; r++){
                for(int c=0; c<N; c++){
                    //실행
                    if(map[r][c] == height){
                        DFS(r, c, false, 1);
                    }
                }
            }

            System.out.println("#"+tc+" "+res);

        }
    }

    private static void DFS(int r, int c, boolean flag, int cnt){
        visited[r][c] = true;
        for(int d=0; d<4; d++){
            int nr = r+dr[d];
            int nc = c+dc[d];
            if(!isIn(nr, nc) || visited[nr][nc]) continue;
            if(map[r][c] > map[nc][nc]){
                DFS(nr, nc, flag, cnt+1);
            }else{
                if(!flag){
                    for(int i=1; i<=K; i++){
                        if(map[r][c] > map[nr][nc]-i){
                            map[nc][nc]-=i;
                            DFS(nr, nc, true, cnt+1);
                            map[nc][nc]+=i;
                        }
                    }
                }
            }
        }

        visited[r][c] = false;
        res = Math.max(res, cnt);
    }

    private static boolean isIn(int r, int c){
        return (r<N && r>=0 && c<N && c>=0);
    }
}
