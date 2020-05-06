package Baekjoon;

import java.util.Scanner;

public class Main_6987 {
    static int[] game1 = {0,0,0,0,0,1,1,1,1,2,2,2,3,3,4};
    static int[] game2 = {1,2,3,4,5,2,3,4,5,3,4,5,4,5,5};       //게임할수 있는 모든 경우의 수
    static int[] win;
    static int[] draw;
    static int[] lose;
    static boolean flag;
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        StringBuilder sb =new StringBuilder();
        for(int tc=1; tc<=4; tc++){
            win = new int[6];
            draw = new int[6];
            lose = new int[6];
            flag = false;
            int sw=0;
            int sd=0;
            int sl=0;
            for(int i=0; i<6; i++){
                sw += win[i] = sc.nextInt();
                sd += draw[i] = sc.nextInt();
                sl += lose[i] = sc.nextInt();
            }

            //경기 횟수가 30이 되지않으면 무조건 불가능
            if(sw+sd+sl != 30)
                flag = false;
            else{
                Solution(0);
            }
            sb.append((flag?1:0)+" ");
        }
        System.out.println(sb.toString());
    }

    private static void Solution(int idx){
        if(flag) return;

        if(idx == 15){
            flag = true;
            return;
        }

        int team1 = game1[idx];
        int team2 = game2[idx];

        if(win[team1] > 0 && lose[team2] >0){
            win[team1]--;
            lose[team2]--;
            Solution(idx+1);
            win[team1]++;
            lose[team2]++;
        }

        if(lose[team1] > 0 && win[team2] >0){
            lose[team1]--;
            win[team2]--;
            Solution(idx+1);
            lose[team1]++;
            win[team2]++;
        }

        if(draw[team1] > 0 && draw[team2] >0){
            draw[team1]--;
            draw[team2]--;
            Solution(idx+1);
            draw[team1]++;
            draw[team2]++;
        }
    }
}
