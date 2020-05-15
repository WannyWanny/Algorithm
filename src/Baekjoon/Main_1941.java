package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main_1941 {
    static final int N = 5;
    static int[][] map;
    static boolean[][] visited;
    static int CNT;
    static int[] dr={-1, 1, 0, 0};
    static int[] dc={0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        map = new int[N][N];
        visited = new boolean[N][N];
        CNT = 0;

        for(int r=0; r<N; r++){
            String str = sc.next();
            for(int c=0; c<N; c++){
                if(str.charAt(c) == 'S'){
                    map[r][c] = 1;
                }
            }
        }

        for(int r=0; r<N; r++){
            for(int c=0; c<N; c++){
                if(map[r][c] == 1){
                    Arrays.fill(visited, false);
                    DFS(r, c,0);
                }
            }
        }
    }

    private static void DFS(int r, int c, int cnt){
        /*
        * 십자가 모양은 DFS나 백트래킹문제로 해결할수 없다고 한다.
        * 추후에 아이디어 생각해서 다시 풀어보기로 하자
        *
        * */
    }

    private static boolean isIn(int r, int c){
        return (r>=0 && r<N && c>=0 && c<N);
    }
}
