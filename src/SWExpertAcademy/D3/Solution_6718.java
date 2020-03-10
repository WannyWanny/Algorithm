package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_6718 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int n = sc.nextInt();
            int Ans=0;
            double dis = n/1000.0;
            if(dis<0.1) Ans=0;
            else if(dis>=0.1 && dis<1.0) Ans=1;
            else if(dis>=1.0 && dis<10.0) Ans=2;
            else if(dis>=10.0 && dis<100.0) Ans=3;
            else if(dis>=100.0 && dis<1000.0) Ans=4;
            else Ans=5;
            System.out.println("#"+tc+" "+Ans);
        }
    }
}
