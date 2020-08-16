package Baekjoon;

import java.util.Scanner;

public class Main_1924 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();

        int sum=0;
        int[] months ={0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for(int i=1; i<=12; i++){
            if(i == m) break;
            sum += months[i];
        }

        sum += d;

        int result = sum %7;
        String ans = null;
        switch(result){
            case 0:
                ans = "SUN";
                break;
            case 1:
                ans = "MON";
                break;
            case 2:
                ans = "TUE";
                break;
            case 3:
                ans = "WED";
                break;
            case 4:
                ans = "THU";
                break;
            case 5:
                ans = "FRI";
                break;
            case 6:
                ans = "SAT";
                break;
        }
        System.out.println(ans);
    }
}
