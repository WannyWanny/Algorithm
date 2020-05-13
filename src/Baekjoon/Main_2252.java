package Baekjoon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_2252 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] indegree = new int[N+1];
        ArrayList<Integer>[] list = new ArrayList[N+1];
        for(int i=1; i<=N; i++){
            list[i] = new ArrayList<Integer>();
        }

        for(int i=0; i<M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            list[a].add(b);
            indegree[b]++;
        }

        Queue<Integer> qu = new LinkedList<>();
        for(int i=1; i<=N; i++){
            if(indegree[i]==0){
                qu.add(i);
            }
        }

        while(!qu.isEmpty()){
            System.out.println(qu.peek());
            int cur = qu.poll();

            for(int i=0; i<list[cur].size(); i++){
                int next = list[cur].get(i);
                indegree[next]--;
                if(indegree[next]==0){
                    qu.add(next);
                }
            }
        }
    }
}
