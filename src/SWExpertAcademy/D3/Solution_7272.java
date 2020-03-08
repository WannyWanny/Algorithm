package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_7272 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            String str1 = sc.next();
            String str2 = sc.next();
            int sum=0;
            if(str1.length() != str2.length()){
                System.out.println("#"+tc+" DIFF");
                continue;
            }
            for(int i=0; i< str1.length(); i++){
                if(getHole(str1.charAt(i)) == getHole(str2.charAt(i))){
                    sum++;
                }
            }
            if(sum == str1.length())
                System.out.println("#"+tc+" SAME");
            else
                System.out.println("#"+tc+" DIFF");
        }
    }
    private static int getHole(char ch){
        if(ch =='B')
            return 2;
        else if(ch=='A' || ch=='D' || ch=='O' || ch=='P' || ch=='Q' || ch=='R')
            return 1;
        else
            return 0;
    }
}
