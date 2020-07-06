package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_17140 {
    static int[][] arr;
    static int r2, c2, k2, ans;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr = new int[3][3];
        boolean flag = false;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        r2 = Integer.parseInt(st.nextToken());
        c2 = Integer.parseInt(st.nextToken());
        k2 = Integer.parseInt(st.nextToken());
        r2--; c2--;
        ans=0;
        for(int r=0; r<3; r++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int c=0; c<3; c++){
                arr[r][c] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<100; i++){
            if(getAns(arr)) {
                flag = true;
                ans = i;
                break;
            }
        }

        if(flag)
            System.out.println(ans);
        else
            System.out.println(-1);

    }


    private static void printArr(int[][] temp){
        for(int r=0; r<temp.length; r++){
            for(int c=0; c<temp[0].length; c++){
                System.out.print(temp[r][c]+" ");
            }
            System.out.println();
        }
    }
    private static boolean getAns(int[][] temp){
        if(temp[r2][c2] == k2){
            return true;
        }
        else
            return false;
    }
}
