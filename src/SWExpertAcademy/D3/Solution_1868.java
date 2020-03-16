package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_1868 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            long k = sc.nextLong()-1;
            int Ans=0;
            while(k>=0){
                if(k%2==1)
                    k = (k-1)/2;
                if(k%4==0){
                    Ans=0;
                    break;
                }
                else if(k%2==0){
                    Ans=1;
                    break;
                }
            }

            System.out.println("#"+tc+" "+Ans);
        }
    }

}
