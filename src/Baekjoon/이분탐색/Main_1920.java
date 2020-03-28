package Baekjoon.이분탐색;

import java.util.HashSet;
import java.util.Scanner;

public class Main_1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0; i<n; i++) hs.add(sc.nextInt());

        int m = sc.nextInt();
        int[] arr = new int[m];
        for(int i=0; i<m; i++) arr[i] = sc.nextInt();

        for(int i=0; i<m; i++){
            if(hs.contains(arr[i]))
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
