package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_3456 {
    static int T;
    static int[] cnt;
    static int Ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            cnt = new int[101];
            for(int i=0; i<3; i++){
                cnt[sc.nextInt()]++;
            }

            for(int i=0; i<cnt.length; i++){
                if(cnt[i] == 1 || cnt[i] ==3)
                    Ans=i;
            }

            System.out.println("#"+tc+" "+Ans);
        }
    }
}
