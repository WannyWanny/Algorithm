package D2;

import java.util.Scanner;

public class Solution_2007 {
    static int ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=1; tc<=T; tc++){

            char[] ch = sc.next().toCharArray();
            ans=1;
            while(true){
                boolean flag = true;
                for(int i=0; i<ans; i++){
                    if(ch[i] != ch[i+ans]){
                        flag = false;
                        ans++;
                        break;
                    }
                }
                if(flag == true) break;
            }

            System.out.print("#"+tc+" "+ans);
        }//end of test
    }
}
