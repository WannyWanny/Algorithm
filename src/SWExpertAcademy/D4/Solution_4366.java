package SWExpertAcademy.D4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_4366 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=T; tc++){
            char[] two = br.readLine().toCharArray();
            char[] three = br.readLine().toCharArray();
            char[] revised;
            int won=0;

            for(int i=0; i<two.length; i++){
                two[i] = two[i] == '0' ? '1' : '0';

                won = convert(two);
                revised = correct(won);

                int cnt=0;
                for(int k=0; k<three.length && three.length == revised.length; k++){
                    if(three[k] != revised[k]) cnt++;
                    if(cnt>1) break;
                }

                if(cnt==1) break;
                two[i] = two[i] == '0' ? '1' : '0';
            }

            System.out.println("#"+tc+" "+won);
        }
    }

    private static int convert(char[] two){
        int temp=0;
        for(char c:two){
            temp = temp*2+c-'0';
        }
        return temp;
    }

    private static char[] correct(int n){
        StringBuilder sb = new StringBuilder();

        while(n>0){
            sb.append(n%3);
            n /= 3;
        }

        return sb.reverse().toString().toCharArray();
    }

}
