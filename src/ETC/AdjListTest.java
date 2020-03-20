package ETC;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AdjListTest {
    static class Node{
        int to;
        Node link;

        public Node(int to, Node link) {
            this.to = to;
            this.link = link;
        }

        public Node(int to){
            super();
            this.to=to;
        }
    }
    private static Node[] adjList;
    private static int N;
    private static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();           //정점수
        int M = sc.nextInt();       //간선수
        adjList =new Node[N+1];
        visited = new boolean[N+1];

        for(int i=0; i<M; i++){
            int from = sc.nextInt();
            int to = sc.nextInt();
            adjList[from] = new Node(to, adjList[from]);
            adjList[to] = new Node(from, adjList[to]);
        }
        //DFS(1);
        BFS(1);

    }

    private static void DFS(int cur){
        visited[cur]=true;
        System.out.print((char)(cur+64)+" ");
        for(Node temp=adjList[cur]; temp != null; temp = temp.link){
            if(!visited[temp.to]) {
                DFS(temp.to);
            }
        }
    }

    private static void BFS(int cur){
        Queue<Integer> queue = new LinkedList<>();
        visited[cur] = true;
        queue.offer(cur);
        while(!queue.isEmpty()){
            int current = queue.poll();
            System.out.print((char)(current+64)+" ");

            for(Node temp=adjList[current]; temp != null; temp = temp.link){
                if(!visited[temp.to]) {
                    visited[temp.to] = true;
                    queue.offer(temp.to);
                }
            }
        }
        System.out.println();
    }
}
