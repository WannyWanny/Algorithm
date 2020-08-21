package Baekjoon;

import java.util.Scanner;

public class Main_1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c=0;
            int ans = 1;

            if(a%10 == 0 || a%10 == 1 || a%10 == 5 || a%10 == 6)
                ans = a%10;
            else if(a%10 == 4 || a%10 == 9){
                c = b%2;
                if(c==0) c=2;
            }
            else{
                c = b%4;
                if(c==0) c= 4;
            }

            for(int i=0; i<c; i++)
                ans = (ans*a)%10;
            System.out.println(ans);
        }
    }
}
