package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_8338 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int n = sc.nextInt();
            int n1=sc.nextInt();
            int sum=n1;
            for(int i=0; i<(n-1); i++){
                int num=sc.nextInt();

                if(sum*num > sum+num){
                    sum *=num;
                }else
                    sum +=num;
            }

            System.out.println("#"+tc+" "+sum);
        }
    }
}
