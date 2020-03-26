package Baekjoon.큐_덱;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_11866 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i=1; i<=n; i++) queue.add(i);
        System.out.print("<");
        while(!queue.isEmpty()){
            for(int j=0; j<k-1; j++){
                queue.add(queue.poll());
            }
            System.out.print(queue.poll());
            if(!queue.isEmpty())
                System.out.print(", ");
        }

        System.out.print(">");
    }
}
