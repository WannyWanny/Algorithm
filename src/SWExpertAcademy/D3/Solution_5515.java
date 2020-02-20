package SWExpertAcademy.D3;

import java.util.Scanner;

//월0 화1 수2 목3 금4 토5 일6
public class Solution_5515 {
    static int T, m, d;
    static int Ans;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            m = sc.nextInt();
            d = sc.nextInt();
            int today = 4;
            int day=0;
            switch(m){
                case 12:day+=30;
                case 11:day+=31;
                case 10:day+=30;
                case 9:day+=31;
                case 8:day+=31;
                case 7:day+=30;
                case 6:day+=31;
                case 5:day+=30;
                case 4:day+=31;
                case 3:day+=29;
                case 2:day+=31;
                default:break;
            }
            day += today+d-1;
            day %=7;
            System.out.println("#"+tc+" "+day);
        }
    }
}
