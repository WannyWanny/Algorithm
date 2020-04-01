package Baekjoon.DFS_BFS;

import java.util.Scanner;

public class Main_2606 {
    static boolean[] visited;
    static int n, m;
    static int[][] arr;
    static int ans;

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        visited = new boolean[n+1];
        arr = new int[n+1][n+1];
        ans=0;
        for(int i=1; i<=m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        DFS(1);
        System.out.println(ans);
    }

    private static void DFS(int idx){
        if(idx != 1) ans++;
        visited[idx] = true;
        for(int i=1; i<=n; i++){
            if(arr[idx][i] == 1 && !visited[i])
                DFS(i);
        }
    }
}
