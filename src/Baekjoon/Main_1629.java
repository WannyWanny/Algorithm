package Baekjoon;
import java.util.Scanner;

public class Main_1629 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(pow(a, b, c));

    }
    private static long pow(int a, int b, int c){
        if(b==0) return 1;

        long n = pow(a, b/2, c);
        long temp = n*n%c;

        if(b%2==0) return temp;
        else       return a*temp%c;
    }
}
