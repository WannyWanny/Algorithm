package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_5162 {
    static int T;
    static int a, b, c;
    static int Ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            int d=0;
            Ans=0;
            if(a<b){
                Ans += c/a;
                d = c - Ans*a;
                Ans += d/b;
            }
            else{
                Ans += c/b;
                d = c - Ans*b;
                Ans += d/a;
            }

            System.out.println("#"+tc+" "+Ans);
        }
    }
}
