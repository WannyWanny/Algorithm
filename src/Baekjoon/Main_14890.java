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
        map2 = new int[N][N];
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

        while(true){
            if(idx == N-1) break;

//            case 1: 내려가는 경사로
            if(arr[idx+1] == arr[idx]-1){
                if(idx+L >= N) return false;

                for(int i=idx+1; i<=idx+L; i++){
                    visited[i] = true;
                    if(arr[i] != arr[idx]-1)
                        return false;
                }
                idx += L;
            }
//            case 2: 올라가는 경사로
            else if(arr[idx+1] == arr[idx]+1){
                if(idx - (L-1) < 0) return false;

                for(int i=idx-(L-1); i<=idx; i++){
                    if(visited[i] || arr[i] != arr[idx])
                        return false;
                }
                idx++;
            }
//            case 3: 평지
            else if(arr[idx+1] == arr[idx]){
                idx++;
            }
//            case 4: 높이차이가 L보다 큰 경우
            else
                return false;
        }
        return true;
    }
}
