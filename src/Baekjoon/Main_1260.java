package Baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_1260 {
    static int N, M, V;
    static int[][] graph;
    static boolean[] visit;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        V = sc.nextInt();
        graph = new int[1001][1001];
        visit = new boolean[10001];

        int a, b;
        for(int i=1; i<=N; i++){
            a = sc.nextInt();
            b = sc.nextInt();

            graph[a][b] = graph[b][a] = 1;
        }
    }

    private static void dfs(int s){
        visit[s] = true;
        System.out.print(s+" ");

        for(int j=1; j<=N; j++){
            if(graph[s][j] == 1 && visit[j] == false){
                dfs(j);
            }
        }
    }

    private static void bfs(int s){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        visit[s] = true;
        System.out.print(s+" ");

        int temp;
    }
}
