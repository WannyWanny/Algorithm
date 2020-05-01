package Baekjoon.큐_덱;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_1966 {
    static class Node{
        int idx;
        int val;

        public Node(int idx, int val) {
            this.idx = idx;
            this.val = val;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            Queue<Node> qu = new LinkedList<Node>();
            for(int i=0; i<n; i++){
                int temp = sc.nextInt();
                qu.add(new Node(i, temp));
            }

            int ans=1;
            while(!qu.isEmpty()){
                Node cur = qu.poll();
                boolean flag = true;

                Iterator it = qu.iterator();
                while(it.hasNext()){
                    Node other = (Node)it.next();
                    if(cur.val < other.val){
                        flag = false;
                        break;
                    }
                }
                if(!flag){
                    qu.add(cur);
                }else{
                    if(cur.idx == m)
                        System.out.println(ans);
                    else
                        ans++;
                }
            }
        }
    }
}
