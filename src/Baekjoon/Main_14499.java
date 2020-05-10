package Baekjoon;

import java.util.Scanner;

public class Main_14499 {
    static int[][] map = new int[20][20];
    static int[] dice = new int[7];
    static int[] dr={0, 0, -1, 1};                 //동 서 남 북
    static int[] dc={1, -1, 0, 0};

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb =new StringBuilder();
        int R = sc.nextInt();
        int C = sc.nextInt();
        int y = sc.nextInt();
        int x = sc.nextInt();
        int K = sc.nextInt();

        for(int r=0; r<R; r++){
            for(int c=0; c<C; c++){
                map[r][c] = sc.nextInt();
            }
        }

        for(int k=0; k<K; k++){
            int d= sc.nextInt();
            int nr = y+dr[d-1];
            int nc = x+dc[d-1];

            if(0<= nc && nc<C && 0<=nr && nr<R){
                changeDice(d);

                if(map[nr][nc] == 0){
                    map[nr][nc] = dice[6];
                }else{
                    dice[6] = map[nr][nc];
                    map[nr][nc]=0;
                }

                x = nc;
                y = nr;
                sb.append(dice[1]+"\n");
            }
        }
        System.out.println(sb.toString());
    }

    private static void changeDice(int d){
        int[] temp = dice.clone();

        switch (d){
            case 1:
                dice[1] = temp[4];
                dice[3] = temp[1];
                dice[4] = temp[6];
                dice[6] = temp[3];
                break;
            case 2:
                dice[1] = temp[3];
                dice[3] = temp[6];
                dice[4] = temp[1];
                dice[6] = temp[4];
                break;
            case 3:
                dice[1] = temp[5];
                dice[2] = temp[1];
                dice[5] = temp[6];
                dice[6] = temp[2];
                break;
            case 4:
                dice[1] = temp[2];
                dice[2] = temp[6];
                dice[5] = temp[1];
                dice[6] = temp[5];
                break;
        }
    }
}
