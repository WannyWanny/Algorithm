package Baekjoon;

import java.util.Scanner;

public class Main_14890 {
    static int[][] map, map2;
    static int N, L, ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        L = sc.nextInt();
        map = new int[N][N];
        for(int r=0; r<N; r++){
            for(int c=0; c<N; c++){
                map[r][c] = map2[c][r] = sc.nextInt();
            }
        }
        ans=0;
        for(int i=0; i<N; i++){
            if(Solve(map[i])) ans++;
            if(Solve(map2[i])) ans++;
        }

        System.out.println(ans);
    }

    private static boolean Solve(int[] arr){
        int idx=0;
        boolean[] visited = new boolean[N];
        return true;
    }
}
