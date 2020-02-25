package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_5789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int n = sc.nextInt();
            int q = sc.nextInt();
            int[] box = new int[n+1];
            int[] left = new int[q];
            int[] right = new int[q];
            for(int i=0; i<q; i++){
                left[i] = sc.nextInt();
                right[i] = sc.nextInt();
            }

            for(int i=0; i<q; i++){
                for(int j=left[i]; j<=right[i]; j++){
                    box[j] = i+1;
                }
            }

            System.out.print("#"+tc+" ");
            for(int i=1; i<box.length; i++)
                System.out.print(box[i]+" ");
            System.out.println();
        }
    }
}
