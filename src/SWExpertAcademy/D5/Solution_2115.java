package SWExpertAcademy.D5;
import java.util.Scanner;

public class Solution_2115 {
    static int n, m, c;
    static int[][] map, maxMap;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int tc=1; tc<=T; tc++){
            n = sc.nextInt();
            m = sc.nextInt();
            c = sc.nextInt();
            map = new int[n][n];
            maxMap = new int[n][n];

            for(int r=0; r<n; r++){
                for(int c=0; c<n; c++){
                    map[r][c] = sc.nextInt();
                }
            }

            makeMaxMap();
//            System.out.println("#"+tc+" "+getBenefit());

        }
    }

    public static void makeMaxMap(){
        for(int r=0; r<n; r++){
            for(int c=0; c<=n-m; c++){
                makeSubset(r, c, 0, 0, 0);
            }
        }
    }

    public static void makeSubset(int r, int c, int cnt, int sum, int powSum){
        if(sum > c) return;
        if(cnt == m){
            if(maxMap[r][c-m] < powSum){
                maxMap[r][c-m] = powSum;
            }
        }

//        선택
        makeSubset(r, c+1, cnt+1, sum+map[r][c], powSum+(maxMap[r][c]*maxMap[r][c]));
//        비선택
        makeSubset(r, c+1, cnt+1, sum, powSum);

    }

    public static void printMap(int[][] temp){
        for(int r=0; r<temp.length; r++){
            for(int c=0; c<temp[0].length; c++){
                System.out.print(temp[r][c]+" ");
            }
            System.out.println();
        }
    }
}
