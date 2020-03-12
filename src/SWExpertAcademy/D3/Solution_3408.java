package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_3408 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            long n = sc.nextLong();
            long s1=0, s2, s3;

            if(n%2==0){
                s1 = (n+1)*(n/2);
            }
            else if(n%2==1){
                s1 = (n+1)*(n/2)+(n/2+1);
            }

            s2 = n*n;
            s3 = n*(n+1);

            System.out.println("#"+tc+" "+s1+" "+s2+" "+s3);
        }
   }
}
