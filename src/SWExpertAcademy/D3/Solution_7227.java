package SWExpertAcademy.D3;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_7227 {
    static int[][] point;
    static int[][] res;
    static boolean[] visited;
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            N = sc.nextInt();
            point = new int[N][2];
            res = new int[N][2];
            visited = new boolean[N];
            for(int i=0; i<N; i++){
                point[i][0] = sc.nextInt();
                point[i][1] = sc.nextInt();
            }

            Perm(0);

        }
    }

    private static void Perm(int idx){
        if(idx == N){
            for(int i=0; i<N; i++){
                for(int j=0; j<2; j++){
                    System.out.print(point[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for(int i=0; i<N; i++){
            if(!visited[i])
                visited[i] = true;
                res[idx][0] = point[i][0];
                Perm(idx+1);
                visited[i] =false;
        }
    }
}
