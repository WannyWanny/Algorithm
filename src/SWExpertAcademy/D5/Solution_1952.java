package SWExpertAcademy.D5;

import java.util.Scanner;

public class Solution_1952 {
    static int[] price;                 //요금
    static int[] month;                 //이용 횟수
    static int ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            price = new int[4];
            month = new int[12];
            ans=Integer.MAX_VALUE;
            for(int i=0; i<price.length; i++){
                price[i] = sc.nextInt();
            }

            for(int i=0; i<month.length; i++){
                month[i] = sc.nextInt();
            }

            DFS(0, 0);
            System.out.println("#"+tc+" "+ans);
        }
    }

    private static void DFS(int pay, int m){
//        종료 조건
        if(m >= 12){
            ans = Math.min(ans, pay);
            return;
        }

//        1일
        DFS(pay+price[0]*month[m], m+1);
//        1달
        DFS(pay+price[1], m+1);
//        3달
        DFS(pay+price[2], m+3);
//        1년
        DFS(pay+price[3], m+12);


    }
}
