package SWExpertAcademy.D4;

import java.util.Scanner;

public class Solution_4530 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long result = b-a-1;
            for(long i=a; i<=b; i++){
                long temp = a;
                if(temp<0) temp *= (-1);
                while(temp!=0){
                    if(temp % 10 == 4){
                        result--;
                    }
                    temp /=10;
                }
            }

            System.out.println("#"+tc+" "+result);
        }
    }

}
