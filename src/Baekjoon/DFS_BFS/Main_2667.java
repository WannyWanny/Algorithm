package Baekjoon.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main_2667 {
    static int N, cnt;
    static int[][] map;
    static boolean[][] visited;
    static PriorityQueue<Integer> pq;
    static int[] dr = {-1, 0, 1, 0};           //상하좌우
    static int[] dc = {0, 1, 0, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];
        pq = new PriorityQueue<Integer>();
        for(int r=0; r<N; r++){
            String str = br.readLine();
            for(int c=0; c<N; c++){
                map[r][c] = Integer.parseInt(str.charAt(c)+"");
            }
        }

        for(int r=0; r<N; r++){
            for(int c=0; c<N; c++){
                if(map[r][c]==1 && !visited[r][c]){
                    cnt=1;
                    DFS(r, c);
                    pq.add(cnt);
                }
            }
        }
        System.out.println(pq.size());
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
    private static int DFS(int r, int c){
        visited[r][c] = true;
        for(int k=0; k<4; k++){
            int nr=r+dr[k];
            int nc=c+dc[k];
            if(isIn(nr, nc)){
                if(map[nr][nc]==1 && !visited[nr][nc]){
                    DFS(nr, nc);
                    cnt++;
                }
            }
        }
        return cnt;
    }

    private static boolean isIn(int r, int c){
        return (r>=0 && c>=0 && r<N && c<N);
    }
}
