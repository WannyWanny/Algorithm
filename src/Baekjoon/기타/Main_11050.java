package Baekjoon.기타;

import java.util.Scanner;

public class Main_11050 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(Factorial(n)/(Factorial(k)*Factorial(n-k)));
    }

    private static int Factorial(int n){
        int result=1;
        while(n>1){
            result *= n--;
        }
        return result;
    }
}
