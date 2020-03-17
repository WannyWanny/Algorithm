package Baekjoon.백트래킹;

import java.io.*;
import java.util.StringTokenizer;

public class Main_15651 {
    static int n, m;
    static int[] arr;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[9];

        DFS(0);

        br.close();
        bw.flush();
        bw.close();
    }

    private static void DFS(int idx) throws IOException {
        if(idx == m){
            for(int i=0; i<m; i++){
                bw.write(String.valueOf(arr[i])+" ");
            }
            bw.newLine();
            return;
        }
        for(int i=1; i<=n; i++){
            arr[idx] = i;
            DFS(idx+1);
        }
    }
}
