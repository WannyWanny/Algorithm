package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_6808 {
    static final int MAX = 362880;
    static int[] Acards;
    static int[] Bcards;

    static int cnt;
    static int[] result = new int[9];
    static boolean[] visited = new boolean[9];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Acards = new int[9];
        Bcards = new int[9];
        for(int tc=1; tc<=T; tc++){

            boolean[] visitedCard = new boolean[18];
            for(int i=0; i<9; i++){
                Acards[i] = sc.nextInt();
                visitedCard[Acards[i]-1] = true;
            }
            cnt=0;

            for(int i=0; i<18;i++){
                if(visitedCard[i] == true) continue;
                Bcards[cnt]=i+1;
                cnt++;
            }

            cnt=0;
            perm(0);
            System.out.println("#"+tc+" "+cnt+" "+(MAX-cnt));
        }//end of test
    }

    private static void perm(int idx){
        if(idx >= 9){
            Calc();
            return;
        }

        for(int i=0; i<Acards.length; i++){
            if(!visited[i]){
                visited[i] = true;
                result[idx] = Bcards[i];
                perm(idx+1);
                visited[i] = false;
            }
        }

    }
    private static void Calc(){
        int aSum=0;
        int bSum=0;

        for(int i=0; i< Acards.length; i++){
            if(Acards[i] > result[i])
                aSum += Acards[i] + result[i];
            else
                bSum += Acards[i] + result[i];
        }

        if(aSum > bSum)
            ++cnt;
    }
}