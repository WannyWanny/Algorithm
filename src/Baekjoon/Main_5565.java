package Baekjoon;

import java.util.Scanner;

public class Main_5565 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        for(int i=1; i<=9; i++){
            total -= sc.nextInt();
        }
        System.out.println(total);
    }
}
