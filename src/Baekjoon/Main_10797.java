package Baekjoon;

import java.util.Scanner;

public class Main_10797 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int d = sc.nextInt();
        int[] arr = new int[5];
        int ans=0;
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == d) ans++;
        }
        System.out.println(ans);
    }
}
