package Baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main_1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
//        범위 내 최대 감소수는 987654321
        int idx = Integer.parseInt(str);
        if(idx > 1022){
            System.out.println(-1);
            return;
        }
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<10; i++){
            getDecNum(i, 1, list);
        }

        Collections.sort(list);


        System.out.println(list.get(idx));
    }

    private static ArrayList getDecNum(long num, int temp, ArrayList list){
        if(temp > 10){
            return list;
        }

        list.add(num);

        for(int i=0; i<10; i++){
            if(num%10 > i){
                getDecNum((num*10)+i, temp+1, list);
            }
        }
        return list;
    }
}

