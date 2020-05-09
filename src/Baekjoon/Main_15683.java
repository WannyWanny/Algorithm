package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_15683 {
    static class Camera{
        int r;
        int c;
        int type;

        public Camera(int r, int c, int type) {
            this.r = r;
            this.c = c;
            this.type = type;
        }
    }
    static int R, C, result;
    static int[][] map;
    static ArrayList<Camera> list = new ArrayList<Camera>();

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine(), " ");
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        map = new int[R][C];
        for(int r=0; r<R; r++){
            st = new StringTokenizer(br.readLine()," ");
            for(int c=0; c<C; c++){
                int v = Integer.parseInt(st.nextToken());
                map[r][c] = v;
                if(1<=v && v<=5){
                    list.add(new Camera(r, c, v));
                }
            }
        }
        result=Integer.MAX_VALUE;
        DFS(0, map);
        System.out.println(result);

    }

//                          몇번째 cctv를 확인중인가            이 전 맵의 정보
    private static void DFS(int idx, int[][] prev){
        int[][] visited = new int[R][C];

//        종료 조건. 모든 cctv를 다 확인 했을시 사각지대 갯수를 확인하고 종료한다.
        if(idx == list.size()){
            int cnt = Count(prev);

            result = Math.min(result, cnt);

            return;
        }

        Camera cur = list.get(idx);
        int r = cur.r;
        int c = cur.c;
        int type = cur.type;

        switch(type){
            case 1:
                for(int d=0; d<4; d++){
                    for(int i=0; i<R; i++){
                        visited[i] = Arrays.copyOf(prev[i], C);
                    }
                    detect(visited, r, c, d);
                    DFS(idx+1, visited);
                }
                break;
            case 2:
                for(int d=0; d<4; d++){
                    for(int i=0; i<R; i++){
                        visited[i] = Arrays.copyOf(prev[i], C);
                    }
                    detect(visited, r, c, d);
                    detect(visited, r, c, d+2);
                    DFS(idx+1, visited);
                }
                break;
            case 3:
                for(int d=0; d<4; d++){
                    for(int i=0; i<R; i++){
                        visited[i] = Arrays.copyOf(prev[i], C);
                    }
                    detect(visited, r, c, d);
                    detect(visited, r, c, (d+1)%4);
                    DFS(idx+1, visited);
                }
                break;
            case 4:
                for(int d=0; d<4; d++){
                    for(int i=0; i<R; i++){
                        visited[i] = Arrays.copyOf(prev[i], C);
                    }
                    detect(visited, r, c, d);
                    detect(visited, r, c, (d+1)%4);
                    detect(visited, r, c, (d+2)%4);
                    DFS(idx+1, visited);
                }
                break;
            case 5:
                for(int i=0; i<R; i++){
                    visited[i] = Arrays.copyOf(prev[i], C);
                }
                detect(visited, r, c, 0);
                detect(visited, r, c, 1);
                detect(visited, r, c, 2);
                detect(visited, r, c, 3);
                DFS(idx+1, visited);
                break;
        }
    }

//                              전에 사용하던 배열, r,  c,       방향
//                     순서대로 좌 하 우 상
    private static void detect(int[][] visited, int r, int c, int dir){
        switch (dir){
            case 0:
                for(int k=c; k>=0; k--){
                    if(map[r][k] == 6) break;
                    visited[r][k] = 7;
                }
                break;
            case 1:
                for(int k=r; k>=0; k--){
                    if(map[k][c] == 6) break;
                    visited[k][c] = 7;
                }
                break;
            case 2:
                for(int k=c; k<C; k++){
                    if(map[r][k] == 6) break;
                    visited[r][k] = 7;
                }
                break;
            case 3:
                for(int k=r; k<R; k++){
                    if(map[k][c] == 6) break;
                    visited[k][c] = 7;
                }
                break;
        }
    }

    private static int Count(int[][] arr){
        int temp=0;
        for(int r=0; r<R; r++){
            for(int c=0; c<C; c++){
                if(arr[r][c] == 0)
                    temp++;
            }
        }
        return temp;
    }

}
