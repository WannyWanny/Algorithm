package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_8741 {
    static int T;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<3; i++){
                String str = sc.next();
                sb.append(str.toUpperCase().charAt(0));
            }
            System.out.print("#"+tc+" ");
            System.out.println(sb);
        }
    }
}
