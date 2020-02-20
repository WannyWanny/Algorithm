package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_7985 {
    static int T, k;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            k = sc.nextInt();
            int cnt = (int)Math.pow(2, k)-1;        //k레벨에 들어갈 개수
            arr = new int[cnt+1];
            for(int i=1; i<=cnt; i++){
                arr[i] = sc.nextInt();
            }

            arr[0] = 0;
            int p = (cnt+1)/2;      //간격 범위
            System.out.print("#"+tc+" ");
            while(p!=0){
                for(int i=0; i<=cnt; i+=p){
                    if(arr[i]!=0){
                        System.out.print(arr[i]+" ");
                        arr[i]=0;
                    }

                }
                System.out.println();
                p /=2;
            }
            System.out.println();
        }
    }
}
