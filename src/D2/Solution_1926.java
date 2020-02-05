package D2;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_1926 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        for(int i=1; i<=N; i++){
            String str = Integer.toString(i);
            int cnt=0;

            for(int j=0; j<str.length(); j++){
                if(str.charAt(j) == '3' || str.charAt(j) == '6' || str.charAt(j) == '9'){
                    cnt++;
                }
            }

            //case: 3
            if(cnt != 0 && cnt<str.length()){
                sb.append('-');
            }
            //case: 36
            else if(cnt == str.length()){
                for(int j=0; j<str.length(); j++){
                    sb.append('-');
                }
            }
            else
                sb.append(i);
            sb.append(' ');
        }
        System.out.println(sb);
    }
}
