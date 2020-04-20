package SWExpertAcademy.D4;

import java.lang.reflect.Array;
import java.util.*;

public class Solution_1238 {
    static class Node{
        int depth;
        int v;

        public Node(int depth, int v) {
            this.depth = depth;
            this.v = v;
        }
    }
    static int[][] adj;
    static int N, start;
    static boolean[]visited;
    public static void main(String[] args)  {
        Scanner sc =new Scanner(System.in);
        for(int tc=1; tc<=10; tc++){
            N = sc.nextInt();
            start = sc.nextInt();
            adj = new int[N+1][N+1];
            visited = new boolean[N+1];
            Queue<Node> qu = new LinkedList<Node>();
            ArrayList<Node> list = new ArrayList<>();
            int max_dpeth = Integer.MIN_VALUE;
            for(int i=0; i<N/2; i++){
                int from = sc.nextInt();
                int to = sc.nextInt();
                adj[from][to] = 1;
            }

            qu.add(new Node(1, start));
            list.add (new Node(1, start));
            visited[start] = true;

            while(!qu.isEmpty()){
                Node cur = qu.poll();
                int v = cur.v;
                int depth = cur.depth;
                for(int i=0; i<N; i++){
                    if(adj[v][i] ==1 && !visited[i]){
                        visited[i] = true;
                        list.add(new Node(depth+1, i));
                        qu.add(new Node(depth+1, i));
                    }
                }
                max_dpeth = Math.max(max_dpeth, depth);
            }
            int max=1;
            for(int i=0; i<list.size(); i++){
                if(list.get(i).depth == max_dpeth){
                    max = Math.max(max, list.get(i).v);
                }
            }
            System.out.println("#"+tc+" "+max);
        }
    }

}
