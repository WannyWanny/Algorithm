package SWExpertAcademy.D5;

import java.util.Scanner;

public class Solution_4012 {
    static int T, N;
    static int[][] map;
    static boolean[] visited;
    static int ans;

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            N = sc.nextInt();
            map = new int[N][N];
            ans = Integer.MAX_VALUE;
            for(int r=0; r<N; r++){
                for(int c=0; c<N; c++){
                    map[r][c] = sc.nextInt();
                }
            }
            visited = new boolean[N];

            Comb(0, 0);
            System.out.println("#"+tc+" "+ans);
        }
    }

    private static void Comb(int cnt, int idx){
        if(idx >=N)
            return;
        if(cnt==N/2){
            int sum1=0;
            int sum2=0;
            for(int i=0; i<N; i++){
                for(int j=i+1; j<N; j++){
                    if(visited[i] != visited[j]) continue;
                    if(visited[i]) sum1+=map[i][j]+map[j][i];
                    else           sum2+=map[i][j]+map[j][i];
                }
            }
            ans = Math.min(ans, Math.abs(sum1-sum2));
            return;
        }

        for(int i=idx; i<N; i++){
            visited[i]=true;
            Comb(cnt+1, i+1);
            visited[i]=false;
        }
    }

}
