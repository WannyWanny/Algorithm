package 수학1;

import java.util.Scanner;
public class Sol_2869 {
    static long a, b, v;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextLong();
        b = sc.nextLong();
        v = sc.nextLong();

        int ans = 0;                //몇번째 날일까
        int where = 0;              //현재 위치를 나타내는 변수
        while(where < v)
        {
            ans ++;
            where += a;
            if(where >= v) break;
            where -=b;
        }

        System.out.println(ans);
        sc.close();
    }
}
