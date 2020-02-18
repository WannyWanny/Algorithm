package SWExpertAcademy.D5;

import java.util.Scanner;

public class Solution_1247 {
    static Point[] customers;
    static Point home;
    static Point company;
    static int Ans = Integer.MAX_VALUE;;
    static class Point{
        int r, c;
        Point(int r, int c){
            this.r = r;
            this.c = c;
        }
    }
    static int T, N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            N = sc.nextInt();
            company =new Point(sc.nextInt(), sc.nextInt());
            home = new Point(sc.nextInt(), sc.nextInt());
            customers = new Point[N];
            for(int i=0; i<N; i++){
                customers[i] = new Point(sc.nextInt(), sc.nextInt());
            }
            sel = new int[N];
            visited = new boolean[N];

            perm(0);
            System.out.println("#"+tc+" "+Ans);
        }
    }

    static int[] sel;
    static boolean[] visited;

    static void backtrack(int idx, Point lastPoint, int dist){
        if(idx == N){
            dist+=(Math.abs(lastPoint.r - home.r) + Math.abs(lastPoint.c-home.c));
            Ans = Math.min(Ans, dist);
            return;
        }

        for(int i=0; i<N; i++){
            if(!visited[i]){
                visited[i] = true;
                backtrack(idx++, customers[i], dist+(Math.abs(lastPoint.r - customers[sel[i]].r)+Math.abs(lastPoint.c - customers[sel[i]].c)));
                visited[i] = false;
            }
        }
    }
    static void perm(int idx){
        if(idx == sel.length){
            //정해진 순서대로 다 방문하기
            Point lastPoint = company;
            int dist=0;
            for(int i=0; i<N; i++){
                dist += (Math.abs(lastPoint.r - customers[sel[i]].r)+Math.abs(lastPoint.c - customers[sel[i]].c));
                lastPoint = customers[sel[i]];
            }
            dist += (Math.abs(lastPoint.r - home.r)+Math.abs(lastPoint.c - home.c));
            Ans = Math.min(Ans, dist);
            return;
        }

        for(int i=0; i<N; i++){
            if(!visited[i]){
                sel[idx]=i;
                visited[i] = true;
                perm(idx+1);
                visited[i] = false;
            }
        }
    }
}
