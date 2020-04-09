package SWExpertAcademy.D4;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution_1251_Prim {
    static class Edges implements Comparable<Edges>{
        int idx;
        long cost;

        public Edges(int idx, long cost) {
            this.idx = idx;
            this.cost = cost;
        }

        @Override
        public int compareTo(Edges o){
            return Long.compare(this.cost, o.cost);
        }
    }
    static int N;
    static int[][] islands;
    static double E;
    static long[][] dist;

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            N = sc.nextInt();

            islands = new int[N][2];
            for(int i=0; i<N; i++) islands[i][0] = sc.nextInt();
            for(int i=0; i<N; i++) islands[i][1] = sc.nextInt();
            E = sc.nextDouble();

            dist = new long[N][N];
            int[] from;
            int[] to;
            for(int i=0; i<N; i++){
                from = islands[i];
                for(int j=i+1; j<N; j++){
                    to = islands[j];
                    dist[j][i] = dist[i][j] = (from[0]-to[0])*(from[0]-to[0])+(from[1]-to[1])*(from[1]-to[1]);
                }
            }
            double cost = prim(0)*E;
            System.out.println("#"+tc+" "+Math.round(cost));
        }
    }

    private static long prim(int start){
        long cost=0;
        PriorityQueue<Edges> pq = new PriorityQueue<>();
        Edges[] graph = new Edges[N];

        for(int i=0; i<graph.length; i++){
            graph[i] = new Edges(i, Long.MAX_VALUE);
            pq.add(graph[i]);
        }

        graph[start].cost = 0;
        return cost;
    }
}
