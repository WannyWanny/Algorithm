package ETC;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Prim2 {
    static class Edge implements Comparable<Edge>{
        int dest;
        int cost;
        Edge(int d, int c){
            dest = d;
            cost = c;
        }


        public int compareTo(Edge o){
            return Integer.compare(this.cost, o.cost);
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        ArrayList<Edge>[] list = new ArrayList[V];
        for(int i=0; i<V; i++){
            list[i] = new ArrayList<>();
        }

        for(int i=0; i<E; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            list[a].add(new Edge(b, c));
            list[b].add(new Edge(a, c));
        }

        //dist를 pq와 동기화
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        Edge[] dist = new Edge[V];

        //dist안의 각 거리들은 무한대
        for(int i=1; i<V; i++){
            dist[i] = new Edge(i, Integer.MAX_VALUE);
            pq.add(dist[i]);
        }
        boolean[] mst = new boolean[V+1];
        //시작점은 0
        dist[0] = new Edge(0, 0);
        pq.add(dist[0]);
        int result=0;
        while(!pq.isEmpty()){
            //현재 dist가 가장 작은 친구를 데려와서
            Edge e = pq.poll();
            if(mst[e.dest]){
                continue;
            }
            mst[e.dest] = true;
            result += e.cost;
            // 그 친구로부터 출발하는 모든 간선에 대해서
            for(Edge next: list[e.dest]){
                //그 간선의 목적지가 아직 pq에 들어있는 정점이라면
                //그리고 더 빨리 도착할 수 있다면
                if(!mst[next.dest] && dist[next.dest].cost > next.cost){
                    //dist갱신
                    dist[next.dest].cost = next.cost;
                    //decrease key연산
                    pq.remove(dist[next.dest]);
                    pq.add(dist[next.dest]);
                }
            }
        }
        System.out.println(result);
    }
}
