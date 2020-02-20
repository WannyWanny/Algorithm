package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_1208 {
    static int cnt;
    static int[] arr;
    static int Ans;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int tc=1; tc<=10; tc++){
            cnt = sc.nextInt();
            arr = new int[100];

            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }
            while(cnt>=0){
                int maxPos=0;
                int minPos=0;
                for(int i=0; i<arr.length; i++){
                    if(arr[i] == getMax(arr)) maxPos=i;
                    if(arr[i] == getMin(arr)) minPos=i;
                }

                arr[maxPos]--;
                arr[minPos]++;
                cnt--;
            }

            Ans = getMax(arr) - getMin(arr);
            System.out.println("#"+tc+" "+Ans);
        }
    }

    private static int getMax(int[] input){
        int max = Integer.MIN_VALUE;

        for(int i=0; i<input.length; i++){
            if(input[i] > max) max = input[i];
        }
        return max;
    }

    private static int getMin(int[] input){
        int min = Integer.MAX_VALUE;

        for(int i=0; i<input.length; i++){
            if(input[i] < min) min = input[i];
        }
        return min;
    }
}
