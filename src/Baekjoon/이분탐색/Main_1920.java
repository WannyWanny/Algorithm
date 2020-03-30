package Baekjoon.이분탐색;

import java.util.Arrays;
import java.util.Scanner;

public class Main_1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);

        int m = sc.nextInt();
        for(int i=0; i<m; i++){
            int num = sc.nextInt();
            System.out.println(binarySearch(arr, num));
        }
    }

    private static int binarySearch(int[] A, int n){
        int first = 0;
        int last = A.length-1;
        int mid = 0;

        while(first<=last){
            mid = (first+last)/2;

            if(n == A[mid])
                return 1;
            else{
                if(n < A[mid])
                    last = mid-1;
                else
                    first = mid+1;
            }
        }
        return 0;
    }
}
