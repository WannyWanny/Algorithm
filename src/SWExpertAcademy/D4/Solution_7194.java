package SWExpertAcademy.D4;

import java.util.Scanner;

public class Solution_7194 {
    static int s, t, a, b;
    static int min;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            min = Integer.MAX_VALUE;
            s = sc.nextInt();
            t = sc.nextInt();
            a = sc.nextInt();
            b = sc.nextInt();

            if(b==1){
                if((t-s)%a==0){
                    min = (t-s)/a;
                }else{
                    min = Integer.MAX_VALUE;
                }
            }
            else{
                DFS(t, 0);
            }

            System.out.println("#"+tc+" "+(min==Integer.MAX_VALUE?-1:min));
        }
    }

    private static void DFS(int t2, int cnt) {
        if(t2 == s){
            if(min > cnt) min=cnt;
            return;
        }
        if(t2<s)
            return;
        else if(t2%b==0){
            DFS(t2/b, cnt+1);
            DFS(t2-a, cnt+1);
        }
        else{
            DFS(t2-a, cnt+1);
        }
    }
}
