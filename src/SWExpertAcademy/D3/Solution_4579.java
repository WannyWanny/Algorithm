package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_4579 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            String str = sc.next();
            boolean flag = true;
            int end = str.length()-1;
            for(int i=0; i<str.length()/2; i++){
                if(str.charAt(i) == '*' || str.charAt(end-i) == '*') break;
                if(str.charAt(i) !=str.charAt(end-i)){
                    flag=false;
                    break;
                }
            }

            if(flag)
                System.out.println("#"+tc+" Exist");
            else
                System.out.println("#"+tc+" Not exist");
        }
    }
}
