package D2;

import java.util.Scanner;

public class Solution_1948 {
    static int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static int answer=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int m1 = sc.nextInt();
            int d1 = sc.nextInt();
            int m2 = sc.nextInt();
            int d2 = sc.nextInt();
            answer = (d2 - d1 +1);      //일단 일수 먼저
            while(m1 <m2){
                answer += day[m1];
                m1++;
            }

            System.out.println("#"+tc+" "+answer);
        }//end of test
    }
}
