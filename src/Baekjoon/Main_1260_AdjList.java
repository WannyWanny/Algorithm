package Baekjoon;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_1260_AdjList {
    static boolean[] visited;
    static int N;
    static int M;
    static int[][] adj;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        int V = sc.nextInt();

        visited = new boolean[N+1];
        adj = new int[N+1][N+1];
        for(int i=0; i<M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            adj[a][b] = 1;
            adj[b][a] = 1;
        }
        //DFS
        //정점별로 방문체크를 하기 위한 방문배열을 준비
        //시작정점을 매개로 DFS함수 호출
        dfs(V);

        //BFS
        //큐와 방문배열을 준비
        //처음 방문할 정점을 큐에 삽입하고 방문체크


        System.out.println();

        Queue<Integer> queue = new LinkedList<>();
        queue.add(V);
        boolean[] isVisitedQ = new boolean[N+1];
        isVisitedQ[V] = true;
        //큐가 빌때까지 반복하면서
        while(!queue.isEmpty()){
            //  큐에서 하나 꺼내서 그놈 방문
            int node = queue.poll();
            System.out.print(node+" ");
            //  꺼낸 놈으로부터 연결되어 있는 노드들 중 방문하지 않는 노드를 큐에 삽입하고 방문체크
            //  모든 노드를 돌면서, node와 연결된 노드이면서 방문하지 않은 노드
            for(int i=1; i<=N; i++){
                if(adj[node][i] == 1 && !isVisitedQ[i]){
                    queue.add(i);
                    isVisitedQ[i] = true;
                }
            }
        }
    }

    //DFS함수 작성, 현재 방문할 정점을 매개변수로 받는다
    private static void dfs(int node){
        //현재 번호를 방문(출력)
        System.out.print(node+" ");
        //현재 번호에 대해 방문 체크
        visited[node] = true;
        //현재 정점과 연결된 모든 정점에 대해서
        for(int i=1; i<=N; i++){
            //아직 방문하지 않았다면 해당 점점에 대해 DFS함수 호출
            if(adj[node][i] == 1 && !visited[i])
                dfs(i);
        }
    }
}
