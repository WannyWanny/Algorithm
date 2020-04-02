package SWExpertAcademy.D4;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution_6719 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for(int i=0; i<n; i++) pq.add(sc.nextInt());
            for(int i=0; i<n-k; i++) pq.poll();
            double ans=0;
            while(!pq.isEmpty()){
                ans += pq.poll();
                ans /=2;
            }
            System.out.println("#"+tc+" "+String.format("%.6f", ans));
        }
    }
}
