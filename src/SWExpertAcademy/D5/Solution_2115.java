package SWExpertAcademy.D5;

import java.util.Scanner;

public class Solution_2115 {
    static int T, n, m, c;
    static int[][] map, maxMap;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
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
            System.out.println("#"+tc+" "+getBenefit());

        }
    }

    private static void makeMaxMap(){
        for(int r=0; r<n; r++){
            for(int c=0; c<=n-m; c++){
                makeMaxSubset(r, c, 0, 0, 0);
            }
        }
    }

    //                                  행위치 열위치 고려한원소수 원소들의합 sum의 제곱
    private static void makeMaxSubset(int r, int c, int cnt, int sum, int powSum){

        if(sum > c) return;
        if(cnt == m){
            if(maxMap[r][c-m]<powSum){
                 maxMap[r][c-m] = powSum;
            }
            return;
        }

        //선택
        makeMaxSubset(r, c+1, cnt+1,
                sum+map[r][c], powSum+map[r][c]*map[r][c]);
        //비선택
        makeMaxSubset(r, c+1, cnt+1, sum, powSum);
    }

    private static int getBenefit(){
        int max = 0, temp = 0;
        //1. 일꾼A 기준선택
        for(int r=0; r<n; r++){
            for(int c=0; c<=n-m; c++){
                //2. 일꾼B 선택
                //같은 행기준 선택
                for(int c2=c+m; c<=n-m; c2++){
                    temp = maxMap[r][c]+maxMap[r][c2];
                    if(max<temp) max = temp;
                }
                //다음행부터 마지막행까지 선택
                for(int r2=r+1; c<n; r2++){
                    for(int c2 =0; c2<=n-m; c2++){
                        temp = maxMap[r][c]+maxMap[r2][c2];
                        if(max<temp) max = temp;
                    }
                }
            }
        }
        return max;
    }
}
