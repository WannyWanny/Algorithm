package SWExpertAcademy.D5;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_4012 {
    static int T, N;
    static int[][] map;
    static int[] arr;
    static int[] sel;
    static int ans;

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            N = sc.nextInt();
            map = new int[N][N];
            sel = new int[N/2];
            arr = new int[N];
            ans = Integer.MAX_VALUE;
            for(int r=0; r<N; r++){
                for(int c=0; c<N; c++){
                    map[r][c] = sc.nextInt();
                }
            }
            for(int i=0; i<N; i++){
                arr[i] = i;
            }

            Comb(0, 0);

            System.out.println("#"+tc+" "+ans);
        }
    }

    private static void Comb(int idx, int s_idx){
        if(s_idx == sel.length){
            System.out.println(Arrays.toString(sel));
            getSum(sel);
            return;
        }
        if(idx == arr.length)
            return;

        sel[s_idx] = arr[idx];
        Comb(idx+1, s_idx+1);
        Comb(idx+1, s_idx);
    }

    private static void getSum(int[] input){
        int n1=0;


        int n2 = map[N-1-input[0]][N-1-input[1]]+map[N-1-input[1]][N-1-input[0]];
        int sum = Math.abs(n1-n2);
        System.out.println(sum);
        ans = Math.min(sum, ans);
    }
}
