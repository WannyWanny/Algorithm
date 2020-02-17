package Baekjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main_1931 {
    static int N;
    static int[][] arr;
    static int start, end;
    static int Ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N][2];

        for(int i=0; i<N; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        /*Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });*/

        Arrays.sort(arr, (o1, o2)->{
           if(o1[1] == o2[1]){
               return Integer.compare(o1[0], o2[0]);
           }else{
               return Integer.compare(o1[1], o2[1]);
           }
        });
        start = arr[0][0];
        end = arr[0][1];
        Ans=1;
        for(int i=1; i<N; i++){
            if(arr[i][0] >= end){
                Ans++;
                start = arr[i][0];
                end = arr[i][1];
            }
            else if(arr[i][0] == end && arr[i][1] == end){
                Ans++;
                start = arr[i][0];
                end = arr[i][1];
            }
        }

        System.out.println(Ans);
    }
}
