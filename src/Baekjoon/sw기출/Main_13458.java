package Baekjoon.sw기출;

import java.util.Scanner;

public class Main_13458 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        int c = sc.nextInt();
        long res=0;

        for(int i=0; i<arr.length; i++){
            int temp = arr[i]-b;
            res++;
            if(temp<=0)continue;
            if(temp % c ==0){
                res += temp/c;
            }else{
                res += temp/c+1;
            }
        }

        System.out.println(res);
    }
}
