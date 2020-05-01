package Baekjoon.DP1;

import java.util.Scanner;

public class Main_2579 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<arr.length; i++) arr[i] = sc.nextInt();
        int[] dp = new int[N];

        //1칸 간 경우
        dp[0] = arr[0];
        if(N>=1) dp[1] = dp[0]+arr[1];

        for(int i=3; i<N; i++){
            //현재 칸 까지 올 수 있는 방법
            //1. 전전칸+현재칸
            //2. 전전전칸+전칸+현재칸
            dp[i] = Math.max(arr[i]+dp[i-2], arr[i]+arr[i-1]+dp[i-3]);
        }
        System.out.println(dp[N-1]);
    }
}
