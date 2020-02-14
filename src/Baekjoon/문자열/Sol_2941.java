

import java.util.Scanner;

public class Sol_2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String[] crotia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for(int i=0; i<8; i++)
        {
            word = word.replace(crotia[i], "x");
        }

        System.out.println(word.length());
    }
}
