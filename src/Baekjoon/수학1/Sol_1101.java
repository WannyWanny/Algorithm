
import java.util.Scanner;
public class Sol_1101 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        int x, y;

        while(T>0)
        {
            int cnt = 0;
            x = sc.nextInt();
            y = sc.nextInt();
            int dis = y-x;          //출발점과 도착점 사이의 거리
            if(x >= y) break;       //입력 오류

            double doubleUnder = Math.sqrt(dis);
            int intUnder = (int)Math.floor(doubleUnder);

            if(intUnder == doubleUnder)
                cnt = intUnder*2 -1;
            else
            {
                int k = intUnder + 1;
                int secondUnder = k * k - k;

                if(dis <=secondUnder)
                    cnt = intUnder * 2;
                else
                    cnt = intUnder * 2 + 1;
            }

            System.out.println(cnt);
            T--;
        }
    }
}
