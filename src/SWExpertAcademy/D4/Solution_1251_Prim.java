package SWExpertAcademy.D4;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_1251_Prim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int n = sc.nextInt();
            int[][] islands= new int[n][2];
            for(int i=0; i<n; i++){
                islands[i][0] = sc.nextInt();
            }
            for(int i=0; i<n; i++){
                islands[i][1] = sc.nextInt();
            }
            double e = sc.nextDouble();
            long[] dist = new long[n];
            boolean[] visited = new boolean[n];
            Arrays.fill(dist, Long.MAX_VALUE);

            int cur=0, next=0;
            dist[0]=0;
            for(int i=0; i<n-1; i++){
                long min = Long.MAX_VALUE;
                cur=next;
                visited[cur] = true;

                for(int j=0; j<n; j++){
                    if(visited[j]) continue;
                    long tmp = (long)Math.pow(islands[cur][0]-islands[j][0], 2)+
                            (long)Math.pow(islands[cur][1]-islands[j][1], 2);
                    if(tmp < dist[j]) dist[j] = tmp;
                    if(min > dist[j]){
                        min =dist[j];
                        next = j;
                    }
                }
            }

            long ans=0;
            for(int i=0; i<n; i++){
                ans+= dist[i];
            }
            System.out.println("#"+tc+" "+Math.round(ans*e));
        }
    }
}
