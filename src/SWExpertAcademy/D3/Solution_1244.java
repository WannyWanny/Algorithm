package SWExpertAcademy.D3;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_1244 {
    static int T, K;
    static String str;
    static int[] arr;
    static int Ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            str = sc.next();
            K = sc.nextInt();
            arr = new int[str.length()];

            for(int i=0; i<arr.length; i++){
                arr[i] = str.charAt(i)-'0';
            }

            Ans=0;
            DFS(0, 0);

            System.out.println("#"+tc+" "+Ans);
        }
    }

    private static void DFS(int depth, int idx){
        //비교 횟수만큼 비교했다
        if(depth == K){
            //최댓값 비교하고 종료
            int temp=0;
            for(int x:arr) temp = temp*10+x;
            Ans = Math.max(Ans, temp);
            return;
        }

        if(idx+2 == str.length()){
            swap(idx, idx+1);
            DFS(depth+1, idx);
            swap(idx, idx+1);
        }
        for(int i=idx+1; i<arr.length; i++){
            if(arr[idx]>arr[i]){
                DFS(depth, idx+1);
                continue;
            }
            swap(idx, i);
            DFS(depth+1, idx+1);
            swap(idx,i);
        }
    }

    private static void swap(int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
