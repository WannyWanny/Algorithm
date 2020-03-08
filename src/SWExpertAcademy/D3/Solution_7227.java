package SWExpertAcademy.D3;


import java.util.Scanner;

public class Solution_7227 {
   static int[] xpos;
   static int[] ypos;
   static int N;
   static int[] res;
   static boolean[] visited;
   static long ans;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            N = sc.nextInt();
            xpos = new int[N];
            ypos = new int[N];
            res = new int[N/2];
            visited = new boolean[N];
            ans=-1;
            for(int i=0; i<N; i++){
                xpos[i] = sc.nextInt();
                ypos[i] = sc.nextInt();
            }
            Perm(0, 0);
            System.out.println("#"+tc+" "+ans);
        }
    }

    private static void Perm(int idx, int cnt){
        if(cnt == N/2){
            Sum();
            return;
        }

        for(int i=idx; i<N; i++){
            if(!visited[i]){
                visited[i] = true;
                res[cnt] = i;
                Perm(idx+1, cnt+1);
                visited[i] = false;
            }
        }
    }

    private static void Sum(){
        long sumY=0;
        long sumX=0;

        for(int i=0; i<N; i++){
            if(!visited[i]){
                sumX += xpos[i];
                sumY += ypos[i];
            }else{
                sumX -= xpos[i];
                sumY -= ypos[i];
            }
        }
        if(ans==-1){
            ans = (long)sumY*sumY+(long)sumX*sumX;
        }

        if(ans > (long)sumY*sumY+(long)sumX*sumX){
            ans = (long)sumY*sumY+(long)sumX*sumX;
        }
    }
}
