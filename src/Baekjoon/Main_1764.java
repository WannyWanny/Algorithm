package Baekjoon;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main_1764 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] arr1 = new String[n];
        String[] arr2 = new String[m];
        for(int i=0; i< arr1.length; i++) arr1[i] = sc.next();
        for(int j=0; j<arr2.length; j++) arr2[j] = sc.next();
        PriorityQueue<String> pq = new PriorityQueue<String>();

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i].equals(arr2[j])) pq.add(arr1[i]);
            }
        }
        int size = pq.size();
        System.out.println(size);
        for(int i=0; i<size; i++){
            System.out.println(pq.poll());
        }
    }
}
