package ETC;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int g = GCD(a, b);
        int l = a*b/g;
        System.out.println(g+", "+l);
    }

//    최대공약수
    private static int GCD(int x, int y){
        if(y == 0) return x;
        else return GCD(y, x%y);
    }
}
