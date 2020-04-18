package SWExpertAcademy.D4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1494 {
    static int N;
    static int[] arr;
    static long[][] input;
    static long min;
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=T; tc++){
            N = Integer.parseInt(br.readLine());
            input = new long[N][2];
            StringTokenizer st;
            for(int i=0; i<N; i++){
                st = new StringTokenizer(br.readLine());
                input[i][0] = Integer.parseInt(st.nextToken());
                input[i][1] = Integer.parseInt(st.nextToken());
            }
            arr = new int[N];
            min = Long.MAX_VALUE;

            Perm(0, 0);
            System.out.println("#"+tc+" "+min);
        }
    }

    private static void Perm(int cur, int start){
        if(cur == N/2){
            long vx=0, vy=0, res;
            for(int i=0; i<N; i++){
                if(arr[i]>0){
                    vx += input[i][0];
                    vy += input[i][1];
                }else{
                    vx -= input[i][0];
                    vy -= input[i][1];
                }
            }
            res = vx*vx+vy*vy;
            if(min > res)
                min = res;
            return;
        }
        for(int i=start; i<N; i++){
            arr[i]++;
            Perm(cur+1, start+1);
            arr[i]--;
        }
    }

}
