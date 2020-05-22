package SWExpertAcademy.D4;

import java.util.Scanner;

public class Solution_7208 {
    static int[][] map;
    static int[] color;
    static int ans, N;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            N = sc.nextInt();
            color = new int[N];
            map = new int[N][N];
            ans=Integer.MAX_VALUE;

            for(int i=0; i<color.length; i++){
                color[i] = sc.nextInt();
            }

            for(int r=0; r<N; r++){
                for(int c=0; c<N; c++){
                    map[r][c] = sc.nextInt();
                }
            }

//            순열 생성 후,
            DFS(0, 0);

            System.out.println("#"+tc+" "+ans);

        }
    }

    private static void DFS(int cnt, int change){
        if(cnt == N){
//            인접된 국가가 다른 color로 칠할 수 있는 순열인 경우
            if(check()){
//                순열이 생성된 경우 기존의 color와 생성된 순열이 다른지 카운트
                ans = Math.min(ans, change);
            }
            return;
        }

//        중복 순열
        for (int i=1; i<=4; i++){
            if(color[cnt] == i){
                DFS(cnt+1, change);
            }else{
                int temp = color[cnt];
                color[cnt] = i;
                DFS(cnt+1, change+1);
                color[cnt] = temp;
            }
        }
    }

    private static boolean check(){
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(map[i][j] == 1 && color[i] == color[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
