package SWExpertAcademy.D3;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_1244 {
    static int T;
    static int cnt;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            String str = sc.next();
            cnt = sc.nextInt();
            arr = new int[str.length()];

            for(int i=0; i<arr.length; i++){
                arr[i] = str.charAt(i)-'0';
            }


        }
    }

    private static void dfs(int cur,int cnt){

    }

    private static void swap(int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
