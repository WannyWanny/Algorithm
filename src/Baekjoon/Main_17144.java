package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_17144 {
    static class Point{
        int r;
        int c;

        public Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
    static int[][] map;
    static int[][] _map;
    static int R, C, T;
    static int[] dr={0, 0, 1, -1};
    static int[] dc={1, -1, 0, 0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine(), " ");
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());
        map = new int[R][C];
        for(int r=0; r<R; r++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int c=0; c<C; c++){
                map[r][c] = Integer.parseInt(st.nextToken());
            }
        }

        for(int t=0; t<T; t++){
            Spread();
        }

        System.out.println(getResult());
    }

    private static void Spread(){
        ArrayList<Point> list =new ArrayList<>();
        _map = new int[R][C];
        for(int r=0; r<R; r++){
            for(int c=0; c<C; c++){
                if(map[r][c] > 0){
                    int cnt=0;
                    for(int d=0; d<4; d++){
                        int nc = c+dc[d];
                        int nr = r+dr[d];
                        if(nr<0 || nr>=R || nc<0 || nc>=C || map[nr][nc] == -1) continue;

                        _map[nr][nc] += map[r][c]/5;
                        cnt++;
                    }
                    _map[r][c] += map[r][c]-(map[r][c]/5)*cnt;
                }else if(map[r][c] == -1){
                    _map[r][c] = -1;
                    list.add(new Point(r, c));
                }
            }
        }
        for(int r=0; r<R; r++){
            map[r] = Arrays.copyOf(_map[r], C);
        }
        cleanAir(list.get(0), list.get(1));
    }

    private static void cleanAir(Point up, Point down){
        for(int c=0; c<C-1; c++){
            if(_map[up.r][c] == -1 || _map[down.r][c] == -1){
                map[up.r][c+1]=0;
                map[down.r][c+1]=0;
            }else{
                map[up.r][c+1] = _map[up.r][c];
                map[down.r][c+1] = _map[down.r][c];
            }

            map[0][c] = _map[0][c+1];
            map[R-1][c] = _map[R-1][c+1];
        }

        for(int r=0; r<R-1; r++){
            if(r<up.r){
                map[r+1][0] = _map[r][0];
                map[r][C-1] = _map[r+1][C-1];
            }else if(r >= down.r){
                map[r+1][C-1] = _map[r][C-1];
                map[r][0] = _map[r+1][0];
            }
        }

        map[up.r][up.c] = -1;
        map[down.r][down.c] = -1;
    }

    private static int getResult(){
        int ans=0;
        for(int r=0; r<R; r++){
            for(int c=0; c<C; c++){
                if(map[r][c] >=0) ans += map[r][c];
            }
        }
        return ans;

    }

}
