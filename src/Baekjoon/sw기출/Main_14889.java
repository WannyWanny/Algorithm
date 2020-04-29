package Baekjoon.sw기출;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_14889 {
    static int N;
    static int[][] map;
    static boolean[] team;
    static int min;
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        StringTokenizer st;
        for(int r=0; r<N; r++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int c=0; c<N; c++){
                map[r][c] = Integer.parseInt(st.nextToken());
            }
        }
        team = new boolean[N];
        min = Integer.MAX_VALUE;

        for(int i=0; i<(1<<N); i++){
            for(int j=0; j<N; j++){
                if((i & (1<<j)) !=0){
                    team[j] = true;
                }
            }
           // System.out.println(Arrays.toString(team));
            solve();
            Arrays.fill(team, false);
        }
        System.out.println(min);
    }

    private static void solve(){
        int[] sum = new int[2];

        for(int r=0; r<N; r++){
            for(int c=0; c<N; c++){
                if(r==c || team[r] != team[c]) continue;

                if(team[c]){
                    sum[0] += map[r][c];
                }else{
                    sum[1] += map[r][c];
                }
            }
        }
        min = Math.min(min, Math.abs(sum[0]-sum[1]));
    }
}
