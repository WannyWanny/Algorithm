package SWExpertAcademy.D4;

import java.util.Scanner;

public class Solution_3289 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int N = sc.nextInt();
            int M = sc.nextInt();
            int cnt=0;
            int[] arr1 = new int[M];
            int[] arr2 = new int[M];
            int[] ansArr = new int[M];
            int size=0;
            for(int i=0; i<M; i++){
                int sel=sc.nextInt();
                int a=sc.nextInt();
                int b=sc.nextInt();

                if(a>N || b>N)
                    break;

                if(sel == 0){
                    arr1[size]=a;
                    arr2[size]=b;
                    size++;
                }
                else if(sel==1){
                    cnt++;
                    for(int j=0; j<size; j++){
                        if(arr1[j] == a && arr2[j] == b){
                            ansArr[j]=1;
                        }
                    }
                    arr1 = new int[N];
                    arr2 = new int[N];
                    size=0;
                }
            }

            System.out.print("#"+tc+" ");
            for(int i=0; i<cnt; i++){
                System.out.print(ansArr[i]);
            }
        }
    }
}
