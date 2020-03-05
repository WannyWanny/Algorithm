package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_4789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            String str = sc.next();
            int[] arr = new int[str.length()];
            for(int i=0; i<str.length(); i++){
                arr[i] = str.charAt(i)-'0';
            }

            int Ans=0;
            int clap=arr[0];         //박수치는 사람
            for(int i=1; i<arr.length; i++){
                if(arr[i] != 0){
                    if(clap>=i) clap += arr[i];
                    else{
                        Ans+=i-clap;
                        clap = i+arr[i];
                    }
                }
            }

            System.out.println("#"+tc+" "+Ans);
        }
    }
}
