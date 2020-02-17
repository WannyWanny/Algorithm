package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_4751 {
    static int T;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            String s = sc.next();
            for (int i = 0; i < s.length(); i++) {
                if (i == 0) {
                    System.out.print("..#..");

                } else {
                    System.out.print(".#..");
                }
            }
            System.out.println();
            for (int i = 0; i < s.length(); i++) {
                if (i == 0) {
                    System.out.print(".#.#.");
                } else {
                    System.out.print("#.#.");
                }
            }
            System.out.println();
            for (int i = 0; i < s.length(); i++) {
                if (i == 0) {
                    System.out.print("#." + s.charAt(i) + ".#");
                } else {
                    System.out.print("." + s.charAt(i) + ".#");
                }
            }
            System.out.println();
            for (int i = 0; i < s.length(); i++) {
                if (i == 0) {
                    System.out.print(".#.#.");
                } else {
                    System.out.print("#.#.");
                }
            }
            System.out.println();
            for (int i = 0; i < s.length(); i++) {
                if (i == 0) {
                    System.out.print("..#..");
                } else {
                    System.out.print(".#..");
                }
            }
            System.out.println();
        }
    }
}
