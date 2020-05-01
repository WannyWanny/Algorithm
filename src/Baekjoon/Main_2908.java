
import java.util.*;

public class Main_2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = Reverse(a);
        b = Reverse(b);
        System.out.println((a > b) ? a : b);
    }

    private static int Reverse(int input)
    {
        int h, o;            //백의자리와 일의 자리수
        h = input/100;
        o = input%10;
        input -= (100*h+o);
        input += (100*o+h);
        return input;
    }
}
