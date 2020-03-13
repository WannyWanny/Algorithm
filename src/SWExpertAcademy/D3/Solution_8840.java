package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_8840 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            long num = sc.nextLong();
            long temp = (num-1)/2;
            System.out.println("#"+tc+" "+temp*temp);
        }
    }
}
