package SWExpertAcademy.D3;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution_2948 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            PriorityQueue<String> pq1 = new PriorityQueue<>();
            PriorityQueue<String> pq2 = new PriorityQueue<>();
            for(int i=0; i<n; i++) pq1.add(sc.next());
            for(int i=0; i<m; i++) pq2.add(sc.next());
            int cnt=0;
            while(true){
                if(pq1.isEmpty() || pq2.isEmpty()) break;
                String str1 = pq1.peek();
                String str2 = pq2.peek();
                int num = str1.compareTo(str2);
                if(num<0){
                    pq1.poll();
                    continue;
                }
                else if(num>0){
                    pq2.poll();
                    continue;
                }
                cnt++;
                pq1.poll();
                pq2.poll();
            }
            System.out.println("#"+tc+" "+cnt);
        }
    }
}
