package Baekjoon;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main_2576 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int sum=0;
        for(int i=1; i<=7; i++){
            int num = sc.nextInt();
            if(num%2 == 1){
                sum += num;
                pq.add(num);
            }
        }

        if(pq.isEmpty()){
            System.out.println(-1);
            return;
        }
        System.out.println(sum);
        System.out.println(pq.peek());

    }
}
