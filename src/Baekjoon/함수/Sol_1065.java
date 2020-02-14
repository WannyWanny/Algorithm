
import java.util.Scanner;

public class Sol_1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hanChk = 0;

        if(n < 100)
            System.out.println(n);
        else
        {
            hanChk = 99;
            for(int i=100; i<=n; i++)
            {
                if(Hansu(i) == true)
                    hanChk++;
            }
            if(n == 1000)
                hanChk--;
            System.out.println(hanChk);
        }
    }

    private static boolean Hansu(int n){
        int n1 = n / 100 % 10;      //100의 자리수
        int n2 = n / 10 % 10;       //10의 자리수
        int n3 = n % 10;            //1의 자리수

        if(n2 * 2 == n1 + n3)
            return true;
        else
            return false;
    }
}
