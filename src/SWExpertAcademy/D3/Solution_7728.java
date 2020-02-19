package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_7728 {
    static int T;
    static int x;
    static boolean[] num;
    static int cnt;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1; tc<=T;tc++){
            x = sc.nextInt();
            cnt=0;
            num = new boolean[10];
            while(x>0){
                int a = x%10;
                num[a] = true;
                x /=10;
            }

            for(int i=0; i<num.length; i++){
                if(num[i]) cnt++;
            }

            System.out.println("#"+tc+" "+cnt);
        }
    }
}
