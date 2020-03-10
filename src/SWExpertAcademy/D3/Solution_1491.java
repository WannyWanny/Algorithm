package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_1491 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            long n =sc.nextInt();
            long a = sc.nextInt();
            long b = sc.nextInt();
            long min = -1;
            for(int r=1; r<=n; r++){
                int c=1;
                while(true){
                    if(r*c>n) break;
                    long temp = a * Math.abs(r - c) + b * (n - r * c);
                    if(min == -1) min = temp;
                    else
                        min = Math.min(min, temp);
                    c++;
                }
            }

            System.out.println("#"+tc+" "+min);
        }
    }
}
