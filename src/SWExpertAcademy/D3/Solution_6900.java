package SWExpertAcademy.D3;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_6900 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int sum=0;
            String[] lotto = new String[n];
            int[] money = new int[n];
            for(int i=0; i<n; i++){
                lotto[i] = sc.next();
                money[i] = sc.nextInt();
            }
            String[] _lotto = new String[m];
            for(int i=0; i<m; i++){
                _lotto[i] = sc.next();
            }

            for(int i=0; i<n; i++) {
                for (int i2 = 0; i2 < m; i2++) {
                    boolean flag = false;
                    for (int j = 0; j < lotto[i].length(); j++) {
                        char[] ch, ch2;
                        ch = lotto[i].toCharArray();
                        ch2 = _lotto[i2].toCharArray();
                        if (ch[j] == '*'){
                            flag = true;
                            continue;
                        }
                        else if (ch2[j] == ch[j]) {
                            flag = true;
                        } else {
                            flag = false;
                            break;
                        }
                    }
                    if (flag) sum += money[i];
                }
            }

            System.out.println("#"+tc+" "+sum);

        }
    }
}
