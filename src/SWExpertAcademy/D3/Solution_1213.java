package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_1213 {
    static char[] ch1;
    static char[] ch2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int tc=1; tc<=10; tc++){
            sc.nextInt();
            String str = sc.next();
            for(int i=0; i<str.length(); i++){
                ch1 = str.toCharArray();
            }
            str = sc.next();
            for(int i=0; i<str.length(); i++){
                ch2 = str.toCharArray();
            }

            int Ans=0;
            for(int i=0; i<(ch2.length-ch1.length+1); i++){
                int cnt=0;
                for(int j=0; j<ch1.length; j++) {
                    if(ch1[j] == ch2[i+j]) {
                        cnt++;
                        if(cnt == ch1.length){
                            Ans++;
                        }
                    }
                }
            }

            System.out.println("#"+tc+" "+Ans);
        }//end of test
    }
}
