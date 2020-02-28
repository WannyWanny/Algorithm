package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_7087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=1; tc<=T;tc++){
            int Ans=0;
            int n = sc.nextInt();
            String[] str = new String[n];
            int[] arr = new int[26];
            for(int i=0; i<n; i++){
                str[i] = sc.next();
            }

            for(int i=0; i<n; i++){
                arr[str[i].charAt(0)-'A']++;
            }

            for(int i=0; i<arr.length; i++){
                if(arr[i] !=0)Ans++;
                else
                    break;
            }

            System.out.println("#"+tc+" "+Ans);

        }
    }
}
