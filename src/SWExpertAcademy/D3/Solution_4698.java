package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_4698 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        boolean[] prime = new boolean[1000001];
        prime[0]=prime[1]=false;
        for(int i=2; i<prime.length; i++)
            prime[i] = true;

        for(int i=2; i*i<prime.length; i++){
            for(int j=i*i; j<prime.length; j+=i){
                prime[j] = false;
            }
        }

        for(int tc=1; tc<=T; tc++){
            String d = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int Ans=0;
            for(int i=a; i<=b; i++){
                if(prime[i]){
                    if(String.valueOf(i).contains(d)) Ans++;
                }
            }

            System.out.println("#"+tc+" "+Ans);

        }
    }
}
