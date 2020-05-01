package Baekjoon.DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_1697  {
    static final int limit = 100000;
    static int n, k;
    static int[] dx = {-1, 1, 0};
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        visited =new boolean[limit+1];
        System.out.println(BFS());
    }

    private static int BFS(){
        Queue<Node> qu = new LinkedList<>();
        visited[n] = true;

        qu.add(new Node(0, n));

        while(!qu.isEmpty()){
            Node node = qu.poll();
            int cnt = node.count;
            int pos = node.value;

            if(pos == k){
                return cnt;
            }

            for(int i=0; i<3; i++){
                int next;
                if(dx[i] != 0){
                    next = pos + dx[i];
                }else{
                    next = pos*2;
                }

                if(next>=0 && next<=limit){
                    if(!visited[next]){
                        qu.add(new Node(cnt+1, next));
                        visited[next] = true;
                    }
                }
            }
        }
        return 0;
    }

    public static class Node{
        int count;
        int value;

        public Node(int count, int value) {
            this.count = count;
            this.value = value;
        }
    }
}
