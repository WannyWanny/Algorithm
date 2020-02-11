package D3;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_1860 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();
            int[] persons = new int[N];

            for(int i=0; i<N; i++){
                persons[i] = sc.nextInt();
            }
            Arrays.sort(persons);

            int idx=0;
            int bread=0;
            boolean flag = true;
            for(int i=0; i<=persons[N-1]; i++){
                if(i>0 && i%M == 0)
                    bread +=K;
                while(idx<persons.length && i == persons[idx]){
                    bread--;
                    idx++;
                    while(bread<0){
                        flag = false;
                        break;
                    }
                }
            }
            System.out.println("#"+tc+" "+(flag?"Possible":"Impossible"));
        }// end of test
    }
}
