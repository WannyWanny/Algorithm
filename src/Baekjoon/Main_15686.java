package Baekjoon.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main_15686 {
    static class Point{
        int r;
        int c;

        public Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
    static int N, M;
    static int[][] map;
    static List<Point> chicken = new ArrayList<Point>();
    static List<Point> home = new ArrayList<Point>();
    static int res = Integer.MAX_VALUE;
    static Point[] selected;

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M =  Integer.parseInt(st.nextToken());
        map = new int[N][N];
        selected = new Point[M];

        for(int r=0; r<N; r++){
            st =new StringTokenizer(br.readLine(), " ");
            for(int c=0; c<N; c++){
                map[r][c] =  Integer.parseInt(st.nextToken());

                if(map[r][c] == 1) home.add(new Point(r, c));
                if(map[r][c] == 2) chicken.add(new Point(r, c));
            }
        }
        Solve(0, 0);
        System.out.println(res);

    }

    private static void Solve(int idx, int cnt){
        if(cnt==M){
            int dis=0;          //각 집과 해당치킨집의 거리

            //각 집에서 가장 가까운 치킨집의 거리를 구하자
            for(int i=0; i<home.size(); i++){
                Point node = home.get(i);
                int min = Integer.MAX_VALUE;
                for(int j=0; j<M; j++){
                    Point node2 = selected[j];
                    min = Math.min(min, getDistance(node.r, node.c, node2.r, node2.c));
                }
                dis += min;
            }

            res = Math.min(res, dis);
            return;
        }

        for(int i=idx; i<chicken.size(); i++){
            selected[cnt] = chicken.get(i);
            Solve(i+1, cnt+1);
        }
    }


    private static int getDistance(int r1, int c1, int r2, int c2){
        return Math.abs(r1-r2)+Math.abs(c1-c2);
    }



    private static boolean isIn(int r, int c){
        return (r>=0 && r<N && c>=0 && c<N);
    }
}
