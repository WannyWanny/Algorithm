package 브루트_포스;

import java.util.Scanner;
public class Sol_1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num=666;

        while(n > 0){
            num++;
            String str = Integer.toString(num);
            if(str.contains("666"))
                n--;
        }
        System.out.println(num);
    }
}
