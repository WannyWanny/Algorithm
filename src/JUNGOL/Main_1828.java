package JUNGOL;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main_1828 {
    static int N;
    static int Ans=1;
    static int[][] chem;
    static int start, end;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        chem = new int[N][2];
        for(int i=0; i<N; i++){
            chem[i][0]=sc.nextInt();        //최소
            chem[i][1]=sc.nextInt();        //최대
        }
        Arrays.sort(chem, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        start = chem[0][0];
        end = chem[0][1];
        for(int i=1; i<N; i++){
            if(end < chem[i][1] && end > chem[i][0]){
                start = chem[i][0];
            }
            else if(end > chem[i][1]){
                start=chem[i][0];
                end=chem[i][1];
            }else if(end < chem[i][0]){
                start = chem[i][0];
                end = chem[i][1];
                Ans++;
            }
        }

        System.out.println(Ans);
    }
}
