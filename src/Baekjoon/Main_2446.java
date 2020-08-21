package Baekjoon;

import java.util.Scanner;

public class Main_2446 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=0; i<N; i++){
            for(int j=0; j<i; j++)
                System.out.printf(" ");

            for(int k=2*(N-i-1); k>=0; k--)
                System.out.printf("*");
            System.out.println();
        }

        for(int i=2; i<=N; i++){
            for(int j=1; j<=N-i; j++)
                System.out.printf(" ");
            for(int k=0; k<=2*(i-1); k++)
                System.out.printf("*");
            System.out.println();
        }
    }
}
