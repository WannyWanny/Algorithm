package Baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1260_ArrayList {
    static int nodeCnt;
    static LinkedList<Integer>[] nodeList;
    static boolean[] dfsVisited;
    static boolean[] bfsVisited;
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());

        nodeCnt = Integer.parseInt(st.nextToken());
        int lineCnt = Integer.parseInt(st.nextToken());
        int startNode = Integer.parseInt(st.nextToken());

        nodeList = new LinkedList[nodeCnt+1];
        for(int i=0; i<=nodeCnt; i++){
            nodeList[i] = new LinkedList<Integer>();
        }

        for(int i=0; i<lineCnt; i++){
            st =new StringTokenizer(br.readLine());

            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());

            nodeList[node1].add(node2);
            nodeList[node2].add(node1);

            Collections.sort(nodeList[node1]);
            Collections.sort(nodeList[node2]);
        }
        dfsVisited = new boolean[nodeCnt+1];
        bfsVisited = new boolean[nodeCnt+1];

        DFS(startNode);
        System.out.println();
        BFS(startNode);

    }

    private static void DFS(int node){
        if(dfsVisited[node]) return;

        dfsVisited[node] = true;
        System.out.print(node+" ");
        for(int nextNode:nodeList[node])
            DFS(nextNode);
    }

    private static void BFS(int node){
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.offer(node);

        while(!queue.isEmpty()){
            node = queue.poll();

            if(bfsVisited[node]) continue;
            bfsVisited[node]=true;
            System.out.print(node+" ");
            for(int nextNode:nodeList[node]){
                queue.add(nextNode);
            }
        }
    }
}
