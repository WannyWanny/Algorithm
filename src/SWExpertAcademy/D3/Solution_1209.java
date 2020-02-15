package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_1209 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        for(int tc=1; tc<=10; tc++){
            sc.nextInt();
            int[][] map = new int[100][100];
            int[] sumArr = new int[100*2+2];
            int max=0;
            int sum=0;

            for(int r=0; r<100; r++){
                for(int c=0; c<100; c++){
                    map[r][c] = sc.nextInt();
                }
            }
            int k=0;
            for(int r=0; r<100; r++){
                for(int c=0; c<100; c++){
                    sumArr[k] += map[r][c];
                }
                k++;
            }

            for(int r=0; r<100; r++){
                for(int c=0; c<100; c++){
                    sumArr[k] += map[c][r];
                }
                k++;
            }

            for(int i=0; i<100; i++){
                sumArr[k] += map[i][i];
            }
            k++;

            for(int i=99; i>=0; i--){
                sumArr[k] += map[i][i];
            }
            k++;

            for(int i=0; i<sumArr.length; i++){
                if(max < sumArr[i]) max = sumArr[i];
            }

            System.out.println("#"+tc+" "+max);
        }//end of test
    }
}
