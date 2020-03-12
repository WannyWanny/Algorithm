package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_5688 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            long n = sc.nextLong();
            long Ans=-1;
            long i=1;
            while(i*i*i<=n){
                if(i*i*i==n){
                    Ans=i;
                    break;
                }
                i++;
            }

            System.out.println("#"+tc+" "+Ans);

        }
    }
}
