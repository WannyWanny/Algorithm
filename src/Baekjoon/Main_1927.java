package Baekjoon.우선순위_큐;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main_1927 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int x=sc.nextInt();

            if(x==0){
                if(pq.isEmpty()){
                    System.out.println(0);
                }
                else{
                    System.out.println(pq.poll());
                }
            }
            else{
                pq.add(x);
            }
        }
    }
}
