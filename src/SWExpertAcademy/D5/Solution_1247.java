package SWExpertAcademy.D5;

import java.util.Scanner;

public class Solution_1247 {
    static int T, N;
    static class Point{
        int r;
        int c;
        Point(int r, int c){
            this.r = r;
            this.c = c;
        }
    }
    static Point company;
    static Point home;
    static Point[] customers;
    static int[] res;
    static boolean[] visited;
    static int Ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            N = sc.nextInt();
            customers = new Point[N];
            res = new int[N];
            visited = new boolean[N];

            company = new Point(sc.nextInt(), sc.nextInt());
            home = new Point(sc.nextInt(), sc.nextInt());
            for(int i=0; i<N; i++){
                customers[i] = new Point(sc.nextInt(), sc.nextInt());
            }
            Ans=Integer.MAX_VALUE;
            Perm(0);
            System.out.println("#"+tc+" "+Ans);
        }
    }

    private static void Perm(int idx){
        if(idx == res.length){
            int dist=0;
            Point lasPoint=company;
            for(int i=0; i<N; i++){
                dist += (Math.abs(lasPoint.r - customers[res[i]].r)+(Math.abs(lasPoint.c - customers[res[i]].c)));
                lasPoint = customers[res[i]];
            }
            dist += (Math.abs(lasPoint.r - home.r)+(Math.abs(lasPoint.c-home.c)));
            Ans = Math.min(Ans, dist);
            return;
        }

        for(int i=0; i<res.length; i++){
            if(!visited[i]){
                res[idx]=i;
                visited[i] = true;
                Perm(idx+1);
                visited[i] = false;
            }
        }
    }
}
