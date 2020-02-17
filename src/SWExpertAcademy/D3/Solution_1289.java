package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_1289 {
    static int T, Ans;
    static char[] bit;
    static char[] sol;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T=sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            Ans=0;
            bit = sc.next().toCharArray();
            sol = new char[bit.length];

            for(int i=0; i<sol.length; i++){
                sol[i] = '0';
            }

            for(int i=0; i<sol.length; i++){
                if(sol[i] != bit[i]){
                    Ans++;
                    if(i != sol.length-1) {
                        for (int j = i + 1; j < sol.length; j++) {
                            if(bit[j]=='1')
                                bit[j]='0';
                            else
                                bit[j]='1';
                        }
                    }
                }
            }

            System.out.println("#"+tc+" "+Ans);
        }
    }
}
