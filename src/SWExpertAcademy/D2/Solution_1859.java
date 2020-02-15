package SWExpertAcademy.D2;

import java.util.Scanner;

public class Solution_1859 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int N = sc.nextInt();
            int[] arr = new int[N];
            long sum=0;
            int max=arr[0];
            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }

            int s_Idx=0;      //시작지점
            int m_Idx=0;      //최댓값지점

            //1 1 3 1 2
            while(s_Idx < arr.length){
                //max인덱스 찾자
               for(int i=s_Idx; i<arr.length; i++) {
                   if (max < arr[i]) {
                       max = arr[i];
                       m_Idx = i;
                   }
               }
               for(int j=s_Idx; j<m_Idx; j++){
                   sum += max - arr[j];
               }
               s_Idx = m_Idx+1;
               max=-1;
            }//EOW

            System.out.println("#"+tc+" "+sum);
        }//end of test
    }
}
