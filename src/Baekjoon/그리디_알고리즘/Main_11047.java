package Baekjoon.그리디_알고리즘;

import java.util.Scanner;

public class Main_11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] money = new int[n];
        for(int i=0; i<money.length; i++) money[i] = sc.nextInt();

        int cnt=0;
        for(int i=n-1; i>=0; i--){
            if(k>=money[i]){
                cnt += k/money[i];
                k = k%money[i];
            }
            if(k==0) break;
        }

        System.out.println(cnt);
    }
}
