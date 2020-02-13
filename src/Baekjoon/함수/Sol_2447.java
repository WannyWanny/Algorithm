package 함수;

import java.util.*;

public class Sol_2447 {
    private static char[][] starmap;

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        starmap = new char[n][n];

        for(int i=0; i<n; i++)
            Arrays.fill(starmap[i], ' ');

        solve(0 , 0, n);
        for(int i=0; i<n; i++)
        {
            System.out.println(starmap[i]);
        }
    }

    public static void solve (int x, int y, int n) {
        if (n == 1){
            starmap[x][y] = '*';
            return;
        }
        int m = n/3;
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                if (i==1 && j==1){
                    continue;
                }
                solve(x+m*i, y+m*j, m);
            }
        }
    }
}
