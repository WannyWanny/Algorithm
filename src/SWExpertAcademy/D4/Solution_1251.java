package SWExpertAcademy.D4;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution_1251 {
    static int T, N;
    static int[][] islands;
    static double E;
    static long[][] graph;//정점들간의 거리 그래프
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
         T = sc.nextInt();
        for(int tc=1; tc<=T;  tc++){
             N = sc.nextInt();

            islands = new int[N][2];
            for(int n=0; n<N; n++){
                islands[n][0] = sc.nextInt();
            }
            for(int n=0; n<N; n++){
                islands[n][1] = sc.nextInt();
            }
            E = sc.nextDouble();
            //입력된 자료를 기반으로 섬 간의 가중치 그래프를 구해봅니다.

            graph = new long[N][N];
            int[] from, to;
            for(int r=0; r<N; r++){
                from = islands[r];
                for(int c=r+1; c<N; c++){
                    to = islands[c];
                    graph[c][r] = graph[r][c] = (from[0]-to[0])*(from[0]-to[0]) + (from[1]-to[1])*(from[1]-to[1]);
                }
            }

            double cost = prim(0) * E;
            Math.round(cost);

            System.out.println("#"+tc+" "+cost);
        }
    }

    private static long prim(int start){
        long cost=0;
        //MST에 들어가지 않은 녀석들
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        //모든 정점들을 다 관리
        Edge[] dynamicGraph = new Edge[N];

        for(int n=0; n<dynamicGraph.length; n++){
            dynamicGraph[n] = new Edge(n, Long.MAX_VALUE);
            pq.add(dynamicGraph[n]);
        }
        dynamicGraph[start].cost = 0;
        return cost;
    }

    static class Edge implements Comparable<Edge>{
        int idx;
        long cost;

        public Edge(int idx, long cost){
            super();
            this.idx=idx;
            this.cost=cost;
        }

        @Override
        public int compareTo(Edge o) {
            return Long.compare(this.cost, o.cost);
        }
    }
}


/*Spanning Tree?
* -모든 정점을 연결하고 간선의 부분들로 이루어진 집합
* -Tree이므로 모든 정점이 연결되고 cycle은 없다. root 개념, 조상, 자식개념은 없다
* */