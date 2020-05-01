

import java.util.Scanner;

public class Main_4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        while(true)
        {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if(a==0 && b==0 && c==0)
                break;
            if(a*a + b*b == c*c)
                System.out.println("right");
            else
                System.out.println("wrong");
        }
    }
}
