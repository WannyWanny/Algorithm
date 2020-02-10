package D3;
import java.util.Arrays;
import java.util.Scanner;

public class Solution_6808 {
    static int[] Acards;
    static int[] Bcards;
    static boolean[] visitedCard = new boolean[19];

    static int[] result = new int[9];
    static boolean[] visited = new boolean[9];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Acards = new int[9];
        Bcards = new int[9];
        for(int tc=1; tc<=T; tc++){

            for(int i=0; i<9; i++){
                Acards[i] = sc.nextInt();
                visitedCard[Acards[i]] = true;
            }
            System.out.println(Arrays.toString(visitedCard));

            for(int i=0; i<9;i++){
                if(visitedCard[Acards[i]] == true) continue;

            }
            System.out.println(Arrays.toString(Bcards));

            //perm(0);

        }//end of test
    }

    private static void perm(int idx){
        if(idx == result.length){
            return;
        }

        for(int i=0; i<Acards.length; i++){
            if(!visited[i]){
                visited[i] = true;
                result[idx] = i;
                perm(idx+1);
                visited[i] = false;
            }
        }

    }
}
