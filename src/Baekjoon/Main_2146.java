package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_2146 {
    static class Point{
        int r;
        int c;
        int dis;    //다리의 길이
        int idx;    //섬의 index
        public Point(int r, int c,int dis, int idx) {
            this.r = r;
            this.c = c;
            this.dis = dis;
            this.idx = idx;
        }
    }
    static int N, idx, min;
    static int[][] map;
    static boolean[][] visited;
    static int[] dr = {0, 0, -1, 1};
    static int[] dc = {1, -1, 0, 0};
    static List<Point> points;
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];
        StringTokenizer st;
        for(int r=0; r<N; r++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int c=0; c<N; c++){
                map[r][c] = Integer.parseInt(st.nextToken());
            }
        }
        points = new LinkedList<>();
        idx=2;
        for(int r=0; r<N; r++){
            for(int c=0; c<N; c++){
                if(map[r][c] == 1){
                    BFS(r, c);
                    idx++;
                }
            }
        }

        System.out.println("섬 정보 확인");
        for(int[] row: map){
            System.out.println(Arrays.toString(row));
        }

        min = Integer.MAX_VALUE;
        for(Point p: points){
            GetShortestDis(p);
        }
        System.out.println(min);

    }

    private static void GetShortestDis(Point p){
        Queue<Point> q = new LinkedList<>();
        q.offer(p);
        for(boolean[] row:visited){
            Arrays.fill(row, false);
        }

        while(!q.isEmpty()){
            Point front = q.poll();
            if(front.dis > min) break;

            for(int d=0; d<4; d++){
                int nr = front.r+dr[d];
                int nc = front.c+dc[d];

                if(isIn(nr, nc) && !visited[nr][nc]){
                    visited[nr][nc] = true;
                    if(map[nr][nc] == front.idx) continue;
                    else if(map[nr][nc] == 0){
                        q.offer(new Point(nr, nc, front.dis+1, front.idx));
                    }else if(map[nr][nc] != front.idx){
                        min = Math.min(min, front.dis);
                        return;
                    }
                }
            }
        }
    }

    private static void BFS(int r, int c){
        Queue<Point> qu = new LinkedList<>();
        Point p = new Point(r, c, 0, idx);
        qu.add(p);
        map[r][c] = idx;

        points.add(p);
        while(!qu.isEmpty()){
            Point front = qu.poll();

            for(int d=0; d<4; d++){
                int nc = front.c+dc[d];
                int nr = front.r+dr[d];

                if(isIn(nr, nc)){
                    if(map[nr][nc] == 1){
                        map[nr][nc] = idx;
                        p = new Point(nr, nc, 0, idx);
                        qu.offer(p);
                        points.add(p);
                    }
                }
            }
        }
    }

    private static boolean isIn(int r, int c){
        return (r>=0 && r<N && c>=0 && c<N);
    }
}
