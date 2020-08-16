package Baekjoon;

import java.util.Scanner;

public class Main_5543 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] burger = new int[3];
        int[] drink = new int[2];
        for(int i=0; i< burger.length; i++){
            burger[i] = sc.nextInt();
        }
        for(int i=0; i< drink.length; i++){
            drink[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;

        for(int i=0; i< burger.length; i++){
            for(int j=0; j< drink.length; j++){
                if(burger[i]+drink[j] < min) min = burger[i]+drink[j];
            }
        }

        System.out.println(min-50);
    }
}
