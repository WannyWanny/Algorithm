package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_8821 {
    static int T;
    static int Ans;

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            String str = sc.next();
            boolean[] arr = new boolean[10];
            for(int i=0; i<str.length(); i++){
                if(arr[str.charAt(i)-'0'] == false)
                    arr[str.charAt(i)-'0'] = true;
                else
                    arr[str.charAt(i)-'0'] = false;
            }

            Ans=0;
            for(int i=0; i<arr.length; i++){
                if(arr[i]) Ans++;
            }
            System.out.println("#"+tc+" "+Ans);

        }
    }
}
