package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_5601 {
    static int T, N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            N = sc.nextInt();

            System.out.print("#"+tc+" ");
            for(int i=0; i<N; i++){
                System.out.print(1+"/"+N+" ");
            }
            System.out.println();
        }
    }
}
