package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_7532 {
    static int T;
    static int s, e, m;
    static int Ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int[] arr = {1, 1, 1};
            Ans=0;
            s = sc.nextInt();
            e = sc.nextInt();
            m = sc.nextInt();
            while(true) {
                Ans++;
                if (arr[0] == s && arr[1] == e && arr[2] == m) {
                    break;
                }
                arr[0]++;
                arr[1]++;
                arr[2]++;

                if (arr[0] > 365)
                    arr[0] = 1;
                if (arr[1] > 24)
                    arr[1] = 1;
                if (arr[2] > 29)
                    arr[2] = 1;
            }
            System.out.println("#"+tc+" "+Ans);
        }

    }
}
