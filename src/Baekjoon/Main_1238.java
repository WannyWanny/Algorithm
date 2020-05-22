package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main_1238 {
    static int N, M, X;
    static int[][] dis;
    static final int INF = 100000;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        X = sc.nextInt();

        dis = new int[N+1][N+1];

        for(int r=1; r<=N; r++){
            for(int c=1; c<=N; c++){
                if(r==c) continue;
                dis[r][c] = INF;
            }
        }

        for(int i=0; i<M; i++){
            int from = sc.nextInt();
            int to = sc.nextInt();
            int time = sc.nextInt();
            dis[from][to] = time;
        }

        floydWarshall();
        int max = 0;
        for(int i=1; i<=N; i++){
            max = Math.max(max, dis[i][X] + dis[X][i]);
        }
        System.out.println(max);
    }

    private static void floydWarshall(){
//        기준점 K
        for(int k=1; k<=N; k++){
//            출발점 i
            for(int i=1; i<=N; i++){
//                도착점 j
                for(int j=1; j<=N; j++){
                    dis[i][j] = Math.min(dis[i][j], dis[i][k]+dis[k][j]);
                }
            }
        }
    }
}
