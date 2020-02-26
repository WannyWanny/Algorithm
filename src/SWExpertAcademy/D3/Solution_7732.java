package SWExpertAcademy.D3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution_7732 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            String str = sc.next();
            StringTokenizer st = new StringTokenizer(str,":");
            int count = st.countTokens();

            String[] time = new String[3];      //0:H 1:M 2:S
            for(int i=0; i<count; i++){
                time[i] = st.nextToken();
            }
            String str2 = sc.next();
            StringTokenizer st2 = new StringTokenizer(str2,":");
            String[] _time = new String[3];
            int count2 = st2.countTokens();
            for(int i=0; i<count2; i++) {
                _time[i] = st2.nextToken();
            }


        }
    }
}
