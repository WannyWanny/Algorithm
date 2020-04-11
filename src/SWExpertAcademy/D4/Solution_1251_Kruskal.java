package SWExpertAcademy.D4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution_1251_Kruskal {
   static class Edge implements Comparable<Edge> {
       int v1;
       int v2;
       long cost;

       public Edge(int v1, int v2, long cost) {
           this.v1 = v1;
           this.v2 = v2;
           this.cost = cost;
       }

       @Override
       public int compareTo(Edge o){
           return this.cost < o.cost ? -1 : this.cost > o.cost ? 1:0;
       }
   }
   static int[] parents;
   static int[] ranks;


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            ArrayList<Edge> list = new ArrayList<>();
            parents = new int[1000];
            ranks = new int[1000];
            int n = sc.nextInt();
            int[][] islands = new int[n+1][2];
            for(int i=0; i<n; i++){
                islands[i][0] = sc.nextInt();
            }
            for(int i=0; i<n; i++){
                islands[i][1] = sc.nextInt();
            }
            double e = sc.nextDouble();
            for(int i=0; i<n; i++){
                for(int j=i+1; j<n; j++){
                    long tmp = (long)Math.pow(islands[i][0]-islands[j][0], 2)+
                            (long)Math.pow(islands[i][1]-islands[j][1], 2);
                    list.add(new Edge(i, j, tmp));
                }
            }
            Collections.sort(list);
            for(int i=0; i<n; i++){
                makeSet(i);
            }

            long sum=0;
            int cnt=0;
            for(int i=0; i<list.size(); i++){
                Edge node = list.get(i);
                if(findSet(node.v1) == findSet(node.v2)) continue;
                union(node.v1, node.v2);
                sum += node.cost;
                cnt++;
                if(cnt== n-1) break;
            }
            System.out.println("#"+tc+" "+Math.round(sum*e));
        }
    }
    private static void makeSet(int x){
        parents[x] = x;
    }
    private static int findSet(int x){
        if(x == parents[x])
            return x;
        else
            return findSet(parents[x]);
    }
    private static void union(int x, int y){
        int px = findSet(x);
        int py = findSet(y);
        if(ranks[px] > ranks[py])
            parents[py] = px;
        else{
            parents[px] = py;
            if(ranks[px] == ranks[py]) ranks[px]++;
        }
    }
}
