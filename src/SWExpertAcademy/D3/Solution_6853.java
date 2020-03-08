package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_6853 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int N = sc.nextInt();
            int[][] pos = new int[N][2];
            int a1=0, a2=0, a3=0;

            for(int i=0; i<N; i++){
                pos[i][0] = sc.nextInt();
                pos[i][1] = sc.nextInt();
            }

            for(int i=0; i<N; i++){
                if(((pos[i][0] == x1 || pos[i][0] == x2) && pos[i][1] >= y1 && pos[i][1] <=y2) ||
                        ((pos[i][1] == y1 || pos[i][1] == y2) && pos[i][0] >= x1 && pos[i][0] <=x2)){
                    a2+=1;
                }
                else if(pos[i][0] > x1 && pos[i][0] < x2 && pos[i][1] > y1 && pos[i][1] < y2){
                    a1+=1;
                }else{
                    a3+=1;
                }
            }

            System.out.println("#"+tc+" "+a1+" "+a2+" "+a3);
        }
    }
}
