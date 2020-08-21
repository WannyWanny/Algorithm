package Baekjoon;

import java.util.Scanner;

public class Main_2455 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[4];
        int[] arr2 = new int[4];
        for(int i=0; i<4; i++){
            arr1[i] = sc.nextInt();
            arr2[i] = sc.nextInt();
        }
        int ans=Integer.MIN_VALUE;
        int now = arr2[0];
        for(int i=1; i<4; i++){
            int temp = now - arr1[i] + arr2[i];
            if(now < temp) ans = temp;
            now = temp;
        }

        System.out.println(ans);
    }
}
