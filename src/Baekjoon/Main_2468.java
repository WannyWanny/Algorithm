package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_2468{
    static int N;
    static int[][] map;
    static int maxArea;
    static int cnt;
    static boolean[][] visited;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args)  throws Exception{
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<N; i++){
            String[] str = br.readLine().split(" ");
            for(int j=0; j<N; j++){
                map[i][j] = Integer.parseInt(str[j]);
            }
        }

        for(int r=0; r<N; r++){
            for(int c=0; c<N; c++){
                min = Math.min(min, map[r][c]);
                max = Math.max(max, map[r][c]);
            }
        }

        maxArea=1;
        for(int k=min; k<=max; k++){
            cnt=0;
            visited = new boolean[N][N];
            for(int r=0; r<N; r++){
                for(int c=0; c<N; c++){
                    if(visited[r][c] == false && map[r][c] >= k){
                        cnt++;
                        dfs(r, c, k);
                    }
                }
            }
            if(maxArea < cnt) maxArea = cnt;
        }
        System.out.println(maxArea);

    }

    static int[] dr={-1, 0, 1, 0};
    static int[] dc={0, 1, 0, -1};
    private static void dfs(int r, int c, int h){
        visited[r][c] = true;
        for(int d=0; d<4; d++){
            int nc = c+dc[d];
            int nr = r+dr[d];
            if(nc>=0 && nr>=0 && nc<N & nr<N){
                if(visited[nr][nc] == false && map[nr][nc] >=h){
                    dfs(nr, nc, h);
                }
            }
        }
    }
}
