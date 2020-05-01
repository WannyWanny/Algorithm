package Baekjoon;
import java.util.Scanner;

public class Main_1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); int y = sc.nextInt(); int w = sc.nextInt(); int h = sc.nextInt();

        int a = (x < w - x) ? x : w - x;
        int b = (y < h - y) ? y : h - y;
        int ans = (a < b) ? a: b;

        System.out.println(ans);
    }
}
