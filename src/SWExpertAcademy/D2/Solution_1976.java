package SWExpertAcademy.D2;

import java.util.Scanner;

public class Solution_1976 {
    static int H;
    static int M;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            H=0;
            M=0;
            int h1 = sc.nextInt();
            int m1 = sc.nextInt();
            int h2 = sc.nextInt();
            int m2 = sc.nextInt();

            if(m1+m2>=60){
                M = (m1+m2)%60;
                H++;
            }else
                M = m1+m2;

            H += (h1+h2);
            if(H > 12) H = H%12;
            if(H == 0) H = 12;
            System.out.println("#"+tc+" "+H+" "+M);
        }//end of test
    }
}
