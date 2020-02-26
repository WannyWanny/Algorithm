package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_1493 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int p = sc.nextInt();
            int q = sc.nextInt();

            int[][] arr = new int[1001][1001];
            int cnt=1;
            for (int i = 1; cnt <= 100000; i++) {
                for (int j = 1, k=i; j <= i; j++, k--) {
                    arr[k][j] = cnt++;
                }
            }
            int[][] pos = new int[2][2];
            for(int r=1; r<150; r++){
                for(int c=1; c<150; c++){
                    if(arr[r][c] == p){
                        pos[0][0] = r;
                        pos[1][0] = c;
                    }

                    if(arr[r][c] == q){
                        pos[0][1] = r;
                        pos[1][1] = c;
                    }
                }
            }

            int xPos = pos[1][0]+pos[1][1];
            int yPos = pos[0][0]+pos[0][1];

            System.out.println("#"+tc+" "+arr[yPos][xPos]);
        }
    }
}
