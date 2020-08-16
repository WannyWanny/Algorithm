package Baekjoon;

import java.util.Scanner;

public class Main_2490 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        for(int tc=1; tc<=3; tc++){
            int sum=0;
            for(int i=0; i<4; i++){
                sum += sc.nextInt();
            }

            switch(sum){
                case 0:
                    System.out.println("D");
                    break;
                case 1:
                    System.out.println("C");
                    break;
                case 2:
                    System.out.println("B");
                    break;
                case 3:
                    System.out.println("A");
                    break;
                case 4:
                    System.out.println("E");
                    break;
            }
        }
    }
}
