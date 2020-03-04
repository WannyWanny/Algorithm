package SWExpertAcademy.D3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution_9280 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] money = new int[n];       //단위 무게당 요금
            int[] weight = new int[m];      //차량 무게
            int[] park = new int[n];
            Queue<Integer> st =new LinkedList<>();

            for(int i=0; i<money.length; i++)
                money[i] = sc.nextInt();
            for(int i=0; i<weight.length; i++)
                weight[i] = sc.nextInt();

            int sum=0;
            int mk=0;
            int cnt=0;
            for(int i=0; i<m*2; i++){
                int num = sc.nextInt();
                //공간 있는데 차 들어옴
                if(cnt<n && num>0){
                    for(int j=0; j<park.length; j++){
                        if(park[j]==0){
                            park[j]=num;
                            mk=j;
                            break;
                        }
                    }
                    sum += money[mk]*weight[num-1];
                    cnt++;
                }
                //공간 없는데 차 들어옴
                else if(num>0 && cnt>=n){
                    st.add(num);
                    cnt++;
                }
                //들어올 차 없는데 차 나감
                else if(num<0 && cnt<=n){
                    num *=(-1);
                    for(int j=0; j<park.length; j++){
                        if(park[j] == num){
                            park[j]=0;
                            cnt--;
                            break;
                        }
                    }
                }
                //들어올 차 있는데 차 나감
                else if(num<0 && cnt>n){
                    //차 내보내면서 대기차량 들여보내자
                    cnt--;
                    num *=(-1);
                    int a=0;
                    for(int j=0; j<park.length; j++){
                        if(park[j] == num){
                            a = st.poll();
                            park[j]=a;
                            mk=j;
                            break;
                        }
                    }
                    sum += money[mk]*weight[a-1];
                }
            }

            System.out.println("#"+tc+" "+sum);
        }//end of test
    }
}
