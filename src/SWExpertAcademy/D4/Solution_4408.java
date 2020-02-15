package SWExpertAcademy.D4;

import java.util.Scanner;

public class Solution_4408 {
    static int Ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int[] room = new int[401];
            Ans=0;
            int N = sc.nextInt();
            for(int i=0; i<N; i++){
                int from = sc.nextInt();
                int to = sc.nextInt();
                if(from > to){
                    int temp = from;
                    from = to;
                    to = temp;
                }
                if(from%2==1) from++;
                if(to%2==1) to++;

                for(int j=from; j<=to; j++){
                    room[j]++;
                }
            }
            for(int i=0; i<room.length; i++)
                Ans = Math.max(Ans, room[i]);
            System.out.println("#"+tc+" "+Ans);
        }
    }
}
