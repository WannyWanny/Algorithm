package Baekjoon.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main_7569 {
    static int X, Y, Z;
    static int[] dz = {0, 0, 0, 0, 1, -1};
    static int[] dy = {0, 0, -1, 1, 0, 0};
    static int[] dx = {-1, 1, 0, 0, 0, 0};
    static int[][][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split("");

        X = Integer.parseInt(str[0]);
        Y = Integer.parseInt(str[1]);
        Z = Integer.parseInt(str[2]);

        map = new int[Z][X][Y];

        for(int z=0; z<Z; z++){
            for(int x=0; x<X; x++){
                str = br.readLine().split("");
                for(int y=0; y<Y; y++){
                    map[z][x][y] = Integer.parseInt(str[y]);
                }
            }
        }
        BFS();
    }

    private static void BFS(){
        Queue<Point> qu =new LinkedList<>();
        for(int z=0; z<Z; z++){
            for(int x=0; x<X; x++){
                for(int y=0; y<Y; y++){
                    if(map[z][x][y] == 1){
                        qu.add(new Point(x, y, z));
                    }
                }
            }
        }

        while(!qu.isEmpty()){
            Point front = qu.poll();

            for(int k=0; k<6; k++){
                int nx = front.x+dx[k];
                int ny = front.y+dy[k];
                int nz = front.z+dz[k];

                if(isIn(nx, ny, nz)){
                    if(map[nz][nx][ny]==0){
                        map[nz][nx][ny] = map[front.z][front.x][front.y]+1;
                        qu.add(new Point(nx, ny, nz));
                    }
                }
            }
        }

        int max=0;
        for(int z=0; z<Z; z++){
            for(int x=0; x<X; x++){
                for(int y=0; y<Y; y++){
                    if(map[z][x][y] == 0){
                        System.out.println(-1);
                        return;
                    }
                    max = Math.max(max, map[z][x][y]);
                }
            }
        }
        System.out.println(max-1);
        return;
    }

    private static boolean isIn(int x, int y, int z){
        return (x>=0 && y>=0 && z>=0 && x<X && y<Y && z<Z);
    }
    static class Point{
        int x;
        int y;
        int z;

        public Point(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
}
