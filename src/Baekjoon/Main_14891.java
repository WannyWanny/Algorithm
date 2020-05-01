package Baekjoon.sw기출;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_14891 {
    static int[][] gear;
    static int sum;
    static int[] dir;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        gear = new int[4][8];
        dir = new int[4];
        for(int i=0; i<4; i++){
            String str = br.readLine();
            for(int j=0; j<8; j++){
                gear[i][j] = str.charAt(j)-'0';
            }
        }
        int K = Integer.parseInt(br.readLine());
        for(int i=0; i<K; i++){
            st = new StringTokenizer(br.readLine()," ");
            int n = Integer.parseInt(st.nextToken())-1;      //번호
            int d = Integer.parseInt(st.nextToken());       //방향: 1이면 시계, -1이면 반시계
            Rotate(n, d);
            dir[n]=d;
            //하나를 돌렸으면 나머지도 연쇄적으로 돌아야한다.
            for(int j=n; j<3; j++){
                //j<4가 아닌 3인 이유는 마지막 바퀴는 연쇄를 일으키지 않기 때문문
                if(gear[j][2] != gear[j+1][6]){
                    if(dir[j] == 1){
                        Rotate(j+1, -1);
                    }
                    else if(dir[j] == -1){
                        Rotate(j+1, 1);
                    }
                }else{
                    //바퀴가 돌지 않았다
                    dir[j] = 0;
                }
            }
            //방향 초기화
            Arrays.fill(dir, 0);
        }


        sum=0;
        getSum();
        System.out.println(sum);
    }

    private static void Rotate(int n, int d){
        int[] temp = new int[8];
        for(int i=0; i<8; i++){
            temp[i] = gear[n][i];
        }
        if(d==1){                   //시계방향 처리
            gear[n][0] = temp[7];
            for(int i=1; i<8; i++){
                gear[n][i] = temp[i-1];
            }
        }else{                      //반시계방향 처리
            gear[n][7] = temp[0];
            for(int i=0; i<7; i++){
                gear[n][i] = temp[i+1];
            }
        }
    }

    private static void getSum(){
        if(gear[0][0] == 1){
            sum += 1;
        }
        if(gear[1][0] == 1){
            sum += 2;
        }
        if(gear[2][0] == 1){
            sum += 4;
        }
        if(gear[3][0] == 1){
            sum += 8;
        }
    }
}
