package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_1216 {
    static final int SIZE=100;
    static char[][] map;
    static int cnt, max;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int tc=1; tc<=10; tc++){
            sc.nextInt();
            String str;
            int end = SIZE-1;
            map = new char[SIZE][SIZE];
            for(int r=0; r<SIZE; r++){
                str = sc.next();
                for(int c=0; c<SIZE; c++){
                    map[r][c] = str.charAt(c);
                }
            }

            max=0;
            for(int r=0; r<SIZE; r++){
                for(int c=0; c<SIZE/2; c++){
                    cnt=0;
                    if(map[r][c] == map[r][end-c]){
                        cnt++;
                        for(int j=c+1; j<SIZE/2-1; j++){
                            if(map[r][j] == map[r][end-j]){
                                cnt++;
                            }
                            else{
                                if(cnt > max) max=cnt;
                                break;
                            }
                        }
                    }
                }
            }

            System.out.println("#"+tc+" "+max);
        }
    }
}
