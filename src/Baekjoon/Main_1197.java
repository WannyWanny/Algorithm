package Baekjoon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main_1197 {
    static class Edge implements Comparable<Edge>{
        int v1;
        int v2;
        int cost;

        public Edge(int v1, int v2, int cost) {
            this.v1 = v1;
            this.v2 = v2;
            this.cost = cost;
        }
        @Override
        public int compareTo(Edge o){
            if(this.cost < o.cost)
                return -1;
            else if(this.cost == o.cost)
                return 0;
            else
                return 1;
        }
    }
    static int[] parents;
    static int[] ranks;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();

        ArrayList<Edge> edgelist = new ArrayList<Edge>();
        for(int i=0; i<E; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int cost = sc.nextInt();
            edgelist.add(new Edge(v1, v2, cost));
        }

        parents = new int[V+1];
        ranks = new int[V+1];
        for(int i=0; i<V; i++){
            makeSet(i);
        }
        Collections.sort(edgelist);
        int sum=0;
        int cnt=0;
        for(int i=0; i<V-1; i++){
            Edge node = edgelist.get(i);
            int a = node.v1;
            int b = node.v2;
            if(a==b) continue;
            sum += node.cost;
            union(a, b);
            cnt++;
            if(cnt == V-1) break;
        }
        System.out.println(sum);

    }

    private static void makeSet(int x){
        parents[x] = x;
    }

    private static int findSet(int x){
        if(x == parents[x])
            return x;
        else{
            return findSet(parents[x]);
        }
    }

    private static void union(int x, int y){
        int px = findSet(x);
        int py = findSet(y);
        if(ranks[px] > ranks[py]){
            parents[py] = px;
        }else{
            parents[px] = py;
            if(ranks[px] == ranks[py]) ranks[px]++;
        }
    }
}
