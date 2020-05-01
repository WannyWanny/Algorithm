package Baekjoon.우선순위_큐;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main_11286 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> rpq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            if(x<0) rpq.add(x);
            else if(x>0) pq.add(x);
            else{
                if(pq.isEmpty() && rpq.isEmpty())
                    System.out.println(0);
                else if(pq.isEmpty() && !rpq.isEmpty())
                    System.out.println(rpq.poll());
                else if(!pq.isEmpty() && rpq.isEmpty())
                    System.out.println(pq.poll());
                else{
                    int n1 = Math.abs(pq.peek());
                    int n2 = Math.abs(rpq.peek());
                    if(n1 < n2)
                        System.out.println(pq.poll());
                    else
                        System.out.println(rpq.poll());
                }
            }
        }
    }
}
