package Baekjoon.그래프;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main_1197 {
    static int[] parents;
    static int[] rank;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        int[][] edges = new int[E][3];
        parents =new int[100000];
        rank = new int[10000];

        for(int i=0; i<E; i++){
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
            edges[i][2] = sc.nextInt();
        }
        Arrays.sort(edges, new Comparator<int[]>(){
            @Override
            public int compare(int[] t1, int[] t2) {
                return Integer.compare(t1[2], t2[2]);
            }
        });

        for(int i=0; i<V; i++) makeSet(i);
        int cnt=0;
        int result=0;
        for(int i=0; i<V-1; i++){
            int a = findSet(edges[i][0]);
            int b = findSet(edges[i][1]);
            if(a == b) continue;
            union(a, b);
            result += edges[i][2];
            cnt++;
            if(cnt == V-1) break;
        }
        System.out.println(result);
    }

    static void makeSet(int x){
        parents[x] = x;
    }

    static int findSet(int x){
        if(x == parents[x])
            return x;
        else{
            return findSet(parents[x]);
        }
    }

    static void union(int a, int b){
        int pa = findSet(a);
        int pb = findSet(b);
        if(rank[pa] > rank[pb]){
            parents[pb] = pa;
        }else{
            parents[pa] = pb;
            if(rank[pa] == rank[pb]) rank[pb] ++;
        }
    }
}
