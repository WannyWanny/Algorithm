package SWExpertAcademy.D5;

import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Solution_5658 {
    static int N, K, M;
    static String hex;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            N = sc.nextInt();
            K = sc.nextInt();
            M = N/4;
            hex = sc.next();
            TreeSet<Integer> set = new TreeSet<>();
            String copy = hex;
            String chk = "";

            for(int i=0; i<M; i++){
                for(int j=0; j<N; j+=M){
                    int num = Integer.parseInt(hex.substring(j, j+M), 16);
                    set.add(num);
                }
                hex = copy.substring(N-1)+copy.substring(0, N-1);
                copy = hex;
            }

            NavigableSet<Integer> desSet = set.descendingSet();

            int ans=0;
            int idx=0;
            for(int result : desSet){
                ++idx;
                if(idx == K){
                    ans = result;
                }
            }

            System.out.println("#"+tc+" "+ans);
        }
    }


}
