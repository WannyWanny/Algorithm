package SWExpertAcademy.D4;

import java.util.Scanner;

public class Solution_4008 {
    static int N, max, min;
    static int[] opCnt;
    static int[] nums;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            N = sc.nextInt();
            opCnt = new int[4];
            nums = new int[12];
            for(int i=0; i<4; i++){
                opCnt[i] = sc.nextInt();
            }
            for(int i=0; i<N; i++){
                nums[i] = sc.nextInt();
            }

            max = Integer.MIN_VALUE;
            min = Integer.MAX_VALUE;

            Solution(nums[0] , 1);
            System.out.println("#"+tc+" "+(max-min));
        }
    }

    private static void Solution(int num, int idx){
        if(idx == N){
            max = Math.max(num, max);
            min = Math.min(num, min);
            return;
        }
//        더하기
        if(opCnt[0] > 0){
            opCnt[0]--;
            Solution(num+nums[idx], idx+1);
            opCnt[0]++;
        }
//       빼기
        if(opCnt[1] > 0){
            opCnt[1]--;
            Solution(num-nums[idx], idx+1);
            opCnt[1]++;
        }
//        곱하기
        if(opCnt[2] > 0){
            opCnt[2]--;
            Solution(num*nums[idx], idx+1);
            opCnt[2]++;
        }
//          나누기
        if(opCnt[3] > 0){
            opCnt[3]--;
            Solution(num/nums[idx], idx+1);
            opCnt[3]++;
        }
    }
}
