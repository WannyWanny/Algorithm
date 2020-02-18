package SWExpertAcademy.D3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution_8673 {
    static int T, N;
    static int sum;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            N = sc.nextInt();
            Queue<Integer> q = new LinkedList<>();

            for(int i=0; i<Math.pow(2, N); i++){
                q.add(sc.nextInt());
            }
            sum=0;
            int cnt=(int)Math.pow(2, N);
            while(cnt>1){
                for(int i=0; i<cnt/2; i++){
                    int a = q.poll();
                    int b = q.poll();
                    if(a>b){
                        sum += (a-b);
                        q.add(a);
                    }
                    else{
                        sum += (b-a);
                        q.add(b);
                    }
                }
                cnt /=2;
            }

            System.out.println("#"+tc+" "+sum);
        }
    }
}
