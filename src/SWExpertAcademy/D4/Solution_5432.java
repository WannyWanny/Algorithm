package SWExpertAcademy.D4;

import java.util.Scanner;
public class Solution_5432 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int test_case=1; test_case<=T; test_case++){
           String str = sc.next();
           int result=0;
           int stick=0;
           for(int i=0; i<str.length(); i++){
               if(str.charAt(i)=='(')
                   stick++;
               else if(str.charAt(i)==')'){
                   stick--;
                   if(str.charAt(i-1)=='('){
                        result += stick;
                   }
                   else if(str.charAt(i-1)==')'){
                       result++;
                   }
               }
           }
            System.out.println("#"+test_case+" "+result);
        }//end of test
    }
}
