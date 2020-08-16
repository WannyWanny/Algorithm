package Baekjoon;

import java.util.Scanner;

public class Main_10039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrs = new int[5];

        for(int i=0; i< arrs.length; i++){
            int num = sc.nextInt();
            if(num <= 40) num = 40;
            arrs[i] = num;
        }
        System.out.println((arrs[0]+arrs[1]+arrs[2]+arrs[3]+arrs[4])/5);
    }
}
