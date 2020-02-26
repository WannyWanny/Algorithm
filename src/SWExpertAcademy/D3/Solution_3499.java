package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_3499 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int n = sc.nextInt();
            String[] str = new String[n+1];
            for(int i=0; i<n; i++){
                str[i] = sc.next();
            }

            int len = n/2;
            System.out.print("#"+tc+" ");
            if(n%2==0){
                for(int i=0; i<len; i++){
                    System.out.print(str[i]+" "+str[i+len]+" ");
                }
            }else{
                for(int i=0; i<len; i++){
                    System.out.print(str[i]+" "+str[i+len+1]+" ");
                }
                System.out.print(str[len]);
            }
            System.out.println();
        }
    }
}
