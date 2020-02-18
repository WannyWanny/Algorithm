package SWExpertAcademy.D4;

import java.util.Scanner;

public class Solution_7965 {
    static int T,n;
    static long Ans;
    static final int X = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            n = sc.nextInt();
            Ans=0;
            for(int i=1; i<=n; i++)
                Ans += recur(i, i)%X;
            System.out.println("#"+tc+" "+Ans%X);
        }
    }

    private static long recur(int n, int m){
        if(m==1)
            return n%X;
        long tmp = recur(n, m/2);
        if(m%2==0){
            return tmp*tmp%X;
        }
        else{
            return tmp*tmp%X*n%X;
        }
    }
}
