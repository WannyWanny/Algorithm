package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_4552 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            boolean flag = false;
            String str = sc.next();

            for(int i=0; i<str.length()/2; i++){
                if(str.charAt(i) != str.charAt(str.length()-1-i) &&
                        str.charAt(str.length()-1-i) !='?' && str.charAt(i) !='?'){
                    flag = true;
                    break;
                }
            }

            if(flag)
                System.out.println("#"+tc+" Not exist");
            else
                System.out.println("#"+tc+" Exist");
        }
    }
}
