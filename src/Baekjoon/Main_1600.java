package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1600 {
    static int R, C, K, res;
    static int[][] map;
    static boolean[][] visited;
    static int[] dr={-1, 1, 0, 0};
    static int[] dc={0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        K = Integer.parseInt(st.nextToken());
        st =new StringTokenizer(br.readLine(), " ");
        C = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        res=0;
        map = new int[R][C];
        visited = new boolean[R][C];

        for(int r=0; r<R; r++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int c=0; c<C; c++){
                map[r][c] = Integer.parseInt(st.nextToken());
            }
        }

        DFS(0, 0, K);

        if(res==0)
            System.out.println(-1);
        else
            System.out.println(res);
    }

    private static void DFS(int r, int c, int cnt){
        if(r == R-1 && c == C-1){
            return;
        }

        
    }
}
