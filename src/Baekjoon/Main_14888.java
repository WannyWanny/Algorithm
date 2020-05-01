package Baekjoon.백트래킹;

import java.util.Scanner;

public class Main_14888 {
    static int N;
    static int[] arr;
    static int[] op;
    static int max, min;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N];
        op = new int[4];
        for(int i=0; i<N; i++) arr[i]=sc.nextInt();
        for(int i=0; i<4; i++) op[i] = sc.nextInt();
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;

        DFS(1, arr[0]);
        System.out.println(max);
        System.out.println(min);
    }

    private static void DFS(int depth, int val) {
        if(depth > N-1){
            min = Math.min(min, val);
            max = Math.max(max, val);
            return;
        }

        for(int i=0; i<4; i++){
            if(op[i] !=0){
                op[i]--;
                switch(i){
                    case 0:
                        DFS(depth+1, val+arr[depth]);
                        break;
                    case 1:
                        DFS(depth+1, val-arr[depth]);
                        break;
                    case 2:
                        DFS(depth+1, val*arr[depth]);
                        break;
                    case 3:
                        DFS(depth+1, val/arr[depth]);
                        break;
                }
                op[i]+=1;
            }
        }
    }

}
