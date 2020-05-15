package SWExpertAcademy.D4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution_4013 {
    static class Order{
        int index;
        int dir;

        public Order(int index, int dir) {
            this.index = index;
            this.dir = dir;
        }
    }
    static int[][] gear;
    static ArrayList<Order> list = new ArrayList<>();              //회전 시키는 정보를 담을 배열
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            gear = new int[5][8];                       //바퀴는 0~3이 아닌 1~4로 지정함에 유의
            int K = sc.nextInt();
            for(int i=1; i<=4; i++){
                for(int j=0; j<8; j++){
                    gear[i][j] = sc.nextInt();
                }
            }

            for(int i=0; i<K; i++){
                int idx = sc.nextInt();
                int dir = sc.nextInt();
                list.add(new Order(idx, dir));
            }

            for(int i=0; i<list.size(); i++){
                RotateAll(list.get(i).index, list.get(i).dir);
            }

            System.out.println("#"+tc+" "+getResult());
        }
    }

//                                 바퀴 번호, 돌릴 방향
    private static void RotateAll(int idx,int dir){
//        일단 자기만 돌자
        gear[idx] = Rotate(gear[idx], dir);
        int[] flag = new int[5];
        switch(idx){
            case 1:
                Arrays.fill(flag , 0);
                if(gear[1][2] != gear[2][6]){
                    flag[2] = dir*(-1);
                    Rotate(gear[2], flag[2]);
                }
                if(flag[2] != 0 && gear[2][2] != gear[3][6]){
                    flag[3] = flag[2]*(-1);
                    Rotate(gear[3], flag[3]);
                }
                if(flag[3] != 0 && gear[3][2] != gear[4][6]){
                    Rotate(gear[4], flag[3]*(-1));
                }
                break;
            case 2:
                int temp = 0;
                if(gear[2][2] != gear[3][6]){
                    temp = dir*(-1);
                    Rotate(gear[3], temp);
                }
                if(gear[2][6] != gear[1][2]){
                    Rotate(gear[1], dir*(-1));
                }
                if(temp != 0 && gear[3][2] != gear[4][6]){
                    Rotate(gear[4], temp*(-1));
                }
                break;
            case 3:
                temp = 0;
                if(gear[3][2] != gear[4][6]){
                    Rotate(gear[4], dir*(-1));
                }
                if(gear[3][6] != gear[2][2]){
                    temp = dir*(-1);
                    Rotate(gear[2], temp);
                }
                if(temp != 0 && gear[2][6] != gear[1][2]){
                    Rotate(gear[1], temp*(-1));
                }
                break;
            case 4:
                Arrays.fill(flag, 0);
                if(gear[4][6] != gear[3][2]){
                    flag[3] = dir*(-1);
                    Rotate(gear[3], flag[3]);
                }
                if(flag[3] !=0 && gear[3][6] != gear[2][2]){
                    flag[2] = flag[3]*(-1);
                    Rotate(gear[2], flag[2]);
                }
                if(flag[2] !=0 && gear[2][6] != gear[1][2]){
                    Rotate(gear[1], flag[2]*(-1));
                }
                break;
        }

    }


//    dir이 1이면 시계방향, -1이면 반시계방향향
    private static int[] Rotate(int[] arr, int dir){
        int[] temp = Arrays.copyOf(arr, arr.length);

        if(dir == 1){
            arr[0] = temp[7];
            arr[1] = temp[0];
            arr[2] = temp[1];
            arr[3] = temp[2];
            arr[4] = temp[3];
            arr[5] = temp[4];
            arr[6] = temp[5];
            arr[7] = temp[6];
        }

        else if(dir == -1){
            arr[0] = temp[1];
            arr[1] = temp[2];
            arr[2] = temp[3];
            arr[3] = temp[4];
            arr[4] = temp[5];
            arr[5] = temp[6];
            arr[6] = temp[7];
            arr[7] = temp[0];
        }
        return arr;
    }

    private static int getResult(){
        int sum=0;
        if(gear[1][0] == 1) sum += 1;
        if(gear[2][0] == 1) sum += 2;
        if(gear[3][0] == 1) sum += 4;
        if(gear[4][0] == 1) sum += 8;

        return sum;
    }
}
