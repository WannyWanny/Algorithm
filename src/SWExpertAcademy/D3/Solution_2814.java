package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_2814 {
    static int N, M;
    static boolean[] visited;
    static boolean[][] graph;
    static int ans;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            N = sc.nextInt();
            M = sc.nextInt();
            graph = new boolean[N+1][N+1];
            ans=0;
            for(int m=0; m<M; m++){
                int u = sc.nextInt();
                int v = sc.nextInt();
                graph[u][v] = graph[v][u] = true;
            }

            visited = new boolean[N+1];
            for(int i=1; i<=N; i++){
                DFS(i, 1);
            }
            System.out.println("#"+tc+" "+ans);
        }
    }

    private static void DFS(int idx, int depth){
        if(ans < depth) ans = depth;

        for(int i=1; i<=N; i++){
            if(graph[idx][i] && !visited[i]){
                visited[idx] = true;
                DFS(i, depth+1);
                visited[idx] = false;
            }
        }
    }
}
