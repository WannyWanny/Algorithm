package Baekjoon;

import java.util.Scanner;

public class Main_2953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] sum = new int[5];
        for(int r=0; r<5; r++){
            for(int c=0; c<4; c++){
                int num = sc.nextInt();
                sum[r] += num;
            }
        }
        int idx=0; int max=sum[0];
        for(int i=1; i<sum.length; i++){
            if(max < sum[i]){
                idx = i;
                max = sum[i];
            }
        }
        System.out.println((idx+1)+" "+max);
    }
}
