package SWExpertAcademy.D3;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_9229 {
    static int T, n, m;
    static int[] arr;
    static int[] sel;
    static int Ans;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            n = sc.nextInt();
            m = sc.nextInt();

            arr = new int[n];
            for(int i=0; i<arr.length; i++)
                arr[i] = sc.nextInt();

            sel = new int[2];
            Ans = Integer.MIN_VALUE;

            Comb(0, 0);
            if(Ans >=0)
                System.out.println("#"+tc+" "+Ans);
            else
                System.out.println("#"+tc+" "+(-1));
        }
    }

    private static void Comb(int idx, int s_idx){
        if(s_idx==sel.length){
            int sum = sel[0]+sel[1];
            if(sum > m) return;
            Ans = Math.max(Ans, sum);
            return;
        }
        if(idx == arr.length)
            return;

        sel[s_idx] = arr[idx];
        Comb(idx+1, s_idx+1);
        Comb(idx+1, s_idx);
    }
}
