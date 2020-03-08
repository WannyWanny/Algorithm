package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_5215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int test_case=1; test_case<=T; test_case++){
            int num = sc.nextInt();                 //재료의 수
            int maxCal = sc.nextInt();              //최대 칼로리
            int max =0;
            int[] yam = new int[num];           //맛점수
            int[] cal = new int[num];           //칼로리

            //우선 정보를 배열에 담자
            for(int i=0; i<num; i++){
                yam[i] = sc.nextInt();
                cal[i] = sc.nextInt();
            }

            for(int i=1; i<(1<<num); i++) {
                int sum = 0;
                int limitCal = 0;
                for (int j = 0; j < num; j++) {
                    if ((i & (1 << j)) != 0) {
                        sum += yam[j];
                        limitCal += cal[j];
                    }
                    if(limitCal > maxCal){
                        sum = 0;
                        break;
                    }
                }
                if(max < sum){
                    max = sum;
                }
            }

            System.out.println("#"+test_case+" "+max);
        }//end of test
    }
}
