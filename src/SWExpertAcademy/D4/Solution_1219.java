package SWExpertAcademy.D4;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_1219 {
    static int[] arr1;
    static int[] arr2;
    static boolean[] check;
    static boolean[] visited;
    static boolean flag;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int tc=1; tc<=10; tc++){
            sc.nextInt();
            int len = sc.nextInt();
            arr1 = new int[100];
            arr2 = new int[100];
            check = new boolean[100];
            visited= new boolean[100];
            Arrays.fill(arr1, Integer.MAX_VALUE);
            Arrays.fill(arr2, Integer.MAX_VALUE);

            for(int i=0; i<len; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                //처음에 값 넣을때
                if(!check[a]){
                    check[a] = true;
                    arr1[a] = b;
                }
                //가지 추가할때
                else{
                    arr2[a] = b;
                }
            }
            flag = false;
            DFS(0);
            if(flag)
                System.out.println("#"+tc+" 1");
            else
                System.out.println("#"+tc+" 0");
        }
    }
    private static void DFS(int idx){
        //분기 조건
        if(idx == 99){
            flag = true;
            return;
        }
        if(arr1[idx] != Integer.MAX_VALUE && !visited[arr1[idx]]){
            visited[arr1[idx]] = true;
            DFS(arr1[idx]);
        }
        if(arr2[idx] != Integer.MAX_VALUE && !visited[arr2[idx]]){
            visited[arr2[idx]] = true;
            DFS(arr2[idx]);
        }
        //99도 안가고 나아갈 가지도 없으면 그대로 종료
        return;

    }

}
