package Baekjoon;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main_1977 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=n; i<=m; i++){
            for(int s=1; s<=100; s++){
                if(s*s == i){
                    pq.add(i);
                }
            }
        }
        if(pq.size() == 0){
            System.out.println("-1");
            return;
        }
        int ans = pq.peek();
        int sum=0;
        int size = pq.size();
        for(int i=0; i<size; i++){
            sum += pq.poll();
        }
        System.out.println(sum);
        System.out.println(ans);
    }
}
