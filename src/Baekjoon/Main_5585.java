package Baekjoon;

import java.util.Scanner;

public class Main_5585 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int money = 1000-num;
        int[] arr = {500, 100, 50, 10, 5, 1};             //거스롬돈 갯수
        int[] cnt = new int[6];

        for(int i=0; i<arr.length; i++){
            cnt[i] = money / arr[i];
            money -= cnt[i]*arr[i];
        }
        int ans=0;
        for(int i=0; i<cnt.length; i++) ans += cnt[i];

        System.out.println(ans);
    }
}
