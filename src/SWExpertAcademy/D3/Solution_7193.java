package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_7193 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            long n = sc.nextLong();
            String str = sc.next();
            long sum=0;

            for(int i=0; i<str.length(); i++){
                sum += (str.charAt(i)-'0');
            }
            long Ans = sum%(n-1);
            System.out.println("#"+tc+" "+Ans);
        }
    }
}
