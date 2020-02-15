package SWExpertAcademy.D2;

import java.util.Scanner;

public class Solution_1989 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T =sc.nextInt();

        for(int test_case=1;test_case<=T; test_case++){
            boolean isPalindrome=false;
            char[] ch = sc.next().toCharArray();
            for(int i=0; i<ch.length; i++){
                if(ch[i] == ch[ch.length-1-i])
                    isPalindrome = true;
                else
                    isPalindrome = false;
            }
            if(isPalindrome)
                System.out.println("#"+test_case+" "+1);
            else
                System.out.println("#"+test_case+" "+0);
        }
    }
}
