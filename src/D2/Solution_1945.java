package D2;

import java.util.Scanner;

public class Solution_1945 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int test_case=1; test_case<=T; test_case++)
        {
            int a=0; int b=0; int c=0; int d=0; int e=0;            //2 3 5 7 11의 개수

            int num = sc.nextInt();
            while(num > 1){
                if(num % 11 == 0){
                    e++;
                    num /= 11;
                }
                if(num % 7 == 0){
                    d++;
                    num /= 7;
                }
                if(num % 5 == 0){
                    c++;
                    num /= 5;
                }
                if(num % 3 == 0){
                    b++;
                    num /= 3;
                }
                if(num % 2 == 0){
                    a++;
                    num /= 2;
                }
            }//EOW

            System.out.println("#"+test_case+" "+a+" "+b+" "+c+" "+d+" "+e);
        }
    }
}
