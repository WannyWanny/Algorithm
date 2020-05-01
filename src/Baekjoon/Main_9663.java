package Baekjoon.백트래킹;

import java.util.Scanner;

public class Main_9663 {
    static int[][] map;
    static int N, ans;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        N = sc.nextInt();
        map =new int[N][N];
        ans=0;

        DFS(0);
        System.out.println(ans);
    }
    private static void DFS(int idx){
        if(idx == N){
            ans++;
            return;
        }

        for(int i=0; i<map[idx].length; i++){
            if(isPossible(idx, i)){
                map[idx][i]=1;
                DFS(idx+1);
                map[idx][i]=0;
            }
        }
    }

    private static boolean isPossible(int r, int c){
        //위 확인
        for(int i=r; i>=0; i--){
            if(map[i][c] !=0)
                return false;
        }
        //오른쪽 위 확인
        for(int i=r, j=c; i>=0 && j<map[i].length; i--, j++){
            if(map[i][j] !=0)
                return false;
        }
        //왼쪽 위 확인
        for(int i=r, j=c; i>=0 && j>=0; i--, j--){
            if(map[i][j] !=0)
                return false;
        }
        return true;
    }
}
