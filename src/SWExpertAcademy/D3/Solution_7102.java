package SWExpertAcademy.D3;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_7102 {
    static int T, n, m;
    static int[][]arr;
    static int[]res;
    static int[]sol;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            n=sc.nextInt();
            m=sc.nextInt();
            arr = new int[m+1][n+1];
            res = new int[m+n+1];
            for(int r=1; r<=m; r++){
                for(int c=1; c<=n; c++){
                    arr[r][c] = r+c;
                }
            }

            for(int r=1; r<=m; r++){
                for(int c=1; c<=n; c++){
                    res[arr[r][c]]++;
                }
            }

            int maxCnt=0;
            int max=0;

            for(int i=0; i<res.length; i++){
                if(max < res[i]) max = res[i];
            }

            for(int i=0; i<res.length; i++){
                if(max == res[i]){
                    maxCnt++;
                }
            }
            sol = new int[maxCnt];
            int pos=0;
            for(int i=0; i<res.length; i++){
                if(max == res[i]){
                    sol[pos] = i;
                    pos++;
                }
            }

            Arrays.sort(sol);

            System.out.print("#"+tc+" ");
            for(int i=0; i<sol.length; i++){
                System.out.print(sol[i]+" ");
            }
            System.out.println();

        }
    }
}
