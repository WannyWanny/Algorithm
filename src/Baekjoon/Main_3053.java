

import java.util.Scanner;

public class Main_3053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        double ans1, ans2;

        ans1 = r*r*Math.PI;
        ans2 = r*r*2;

        System.out.println(ans1);
        System.out.println(ans2);
    }
}
