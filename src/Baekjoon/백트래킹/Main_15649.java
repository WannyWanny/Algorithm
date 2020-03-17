package Baekjoon.백트래킹;

import java.util.Scanner;

public class Main_15649 {
    static int[] arr;
    static int[] sel;
    static boolean[] visited;
    static int n, m;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        sel = new int[m];
        visited = new boolean[n];
        for(int i=0; i<n; i++){
            arr[i] = i+1;
        }
        DFS(0);
    }

    private static void DFS(int idx){
        if(idx == sel.length){
            for(int i=0; i<sel.length; i++){
                System.out.print(sel[i]+" ");
            }
            System.out.println();
            return;
        }
        for(int i=0; i<arr.length; i++){
            if(!visited[i]){
                visited[i]=true;
                sel[idx] = arr[i];
                DFS(idx+1);
                visited[i]=false;
            }
        }
    }
}
