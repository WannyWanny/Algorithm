package Baekjoon.우선순위_큐;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main_1655 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> max = new PriorityQueue<>();
        PriorityQueue<Integer> min = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=1; i<=n; i++) {
            int num = sc.nextInt();
            max.add(num);
            if((max.size()+min.size())%2==1){
                min.add(max.poll());
            }
            else if(min.peek() > num){
                    max.add(min.poll());
                    min.add(max.poll());
            }
            System.out.println(min.peek());
        }
    }
}
