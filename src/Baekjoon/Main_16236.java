package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_16236 {
    static class Shark{
        int r;
        int c;
        int size;

        public Shark(int r, int c, int size) {
            this.r = r;
            this.c = c;
            this.size = size;
        }
    }
    static int N;
    static int[][] map;
    static int[] dr={-1, 1, 0, 0};
    static int[] dc={0, 0, -1, 1};
    static ArrayList<Shark> shark;
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        shark = new ArrayList<>();
        for(int r=0; r<N; r++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int c=0; c<N; c++){
                map[r][c] = Integer.parseInt(st.nextToken());
                if(map[r][c] == 9){
                    shark.add(new Shark(r, c, 2));
                }
            }
        }

        printMap(map);

    }

    private static boolean isIn(int r, int c){
        return (r>=0 && r<N && c>=0 && c<N);
    }

    private static void printMap(int[][] arr){
        for(int[] rows:arr){
            System.out.println(Arrays.toString(rows));
        }
    }
}
