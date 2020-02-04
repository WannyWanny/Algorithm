package D2;

import java.util.Scanner;

public class Solution_1940 {
    static int answer;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            answer = 0;
            int n = sc.nextInt();
            for(int j=0; j<n; j++){
                int[] sel = new int[n];
                int speed=0;

                sel[j] = sc.nextInt();
                if(sel[j] == 0){
                    answer += speed;
                }
                else if(sel[j] == 1){
                    int speed_tmp = sc.nextInt();
                    speed += speed_tmp;
                    answer += speed;
                }
                else if(sel[j] == 2){
                    int speed_temp = sc.nextInt();
                    speed -= speed_temp;
                    if(speed < 0)
                        speed = 0;
                    answer += speed;
                }

            }
            System.out.println("#"+tc+" "+answer);
        }
    }
}
