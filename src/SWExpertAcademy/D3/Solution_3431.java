package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_3431 {
    static int L, U, X;
    static int T;
    static int Ans;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            L = sc.nextInt();
            U = sc.nextInt();
            X = sc.nextInt();

            //X가 L보다 작을때
            if(X <=L){
                Ans = L-X;
            }
            //X가 L과 U사이 일때
            else if(X>=L && X<=U){
                Ans=0;
            }
            //X가 L보다 클때
            else if(X>=U){
                Ans=-1;
            }

            System.out.println("#"+tc+" "+Ans);
        }
    }
}
