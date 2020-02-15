package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_1217 {
    static int a, b;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int tc=1; tc<=10; tc++){
            sc.nextInt();

            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println("#"+tc+" "+Func(a, b));
        }
    }

    private static int Func(int x, int y){
        if(y==1)
            return x;
        else
            return x*Func(x, y-1);
    }
}
