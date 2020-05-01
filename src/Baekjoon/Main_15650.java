package Baekjoon.백트래킹;

import java.util.Scanner;

public class Main_15650 {
    static int n, m;
    static int[] arr;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[9];
        visited = new boolean[9];

        DFS(0, 0);
    }

    private static void DFS(int idx, int cnt){
        if(cnt == m){
            for(int i=0; i<m; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        }

        for(int i=idx+1; i<=n; i++){
            if(!visited[i]){
                visited[i]=true;
                arr[cnt] = i;
                DFS(i, cnt+1);
                visited[i]=false;
            }
        }
    }
}
