package SWExpertAcademy.D3;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_1206 {
    static int N;
    static int[] arr;
    static int Ans;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int tc = 1; tc <= 10; tc++) {
            N = sc.nextInt();
            arr = new int[N + 1];

            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            Ans = 0;
            for (int i = 2; i < N - 2; i++) {
                int a = arr[i - 2];
                int b = arr[i - 1];
                int c = arr[i + 1];
                int d = arr[i + 2];

                if(a >= arr[i] || b>=arr[i] || c>=arr[i] || d>=arr[i]) continue;
                int[] tmp = {a, b, c, d};
                Arrays.sort(tmp);
                Ans += arr[i] - tmp[3];
            }

            System.out.println("#" + tc + " " + Ans);
        }
    }

}
