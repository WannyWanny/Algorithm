package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_7510 {
    static int T, N;

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            N = sc.nextInt();
            int cnt=0;

            for(int i=0; i<N; i++){
                int a=i;
                int sum=0;
                while(sum++<N){
                    sum+=a;
                    a++;
                    if(sum == N){
                        cnt++;
                        break;
                    }
                    else if(sum > N){
                        break;
                    }
                }
            }

            System.out.println("#"+tc+" "+cnt);
        }
    }


}
