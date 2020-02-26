package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_4676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            String str = sc.next();
            int n = sc.nextInt();
            int[] hyp = new int[str.length()+1];
            for(int i=0; i<n; i++){
                hyp[sc.nextInt()]++;
            }

            System.out.print("#"+tc+" ");
            for(int i=0; i<str.length(); i++){
                if(hyp[i] > 0){
                    for(int j=0; j<hyp[i]; j++){
                        System.out.print("-");
                    }
                }
                System.out.print(str.charAt(i));
            }

            for(int i=0; i<hyp[hyp.length-1]; i++)
                System.out.print("-");
            System.out.println();
        }
    }
}
