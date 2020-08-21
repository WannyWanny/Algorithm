package Baekjoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main_1475 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int a1[] = new int[1000000]; //입력받은 숫자
        int b1[] = new int[1000000]; //입력받은 숫자를 카운터하여 배열에 저장
        int flag=0; //6과 9를 위한 변수

        String a = sc.next();
        for(int i=0; i<a.length(); i++) {
            a1[i]=a.charAt(i)-48;
            if(a1[i]==1||a1[i]==2||a1[i]==3||a1[i]==4||a1[i]==5||a1[i]==7||a1[i]==8||a1[i]==0) {
                b1[a1[i]]=b1[a1[i]]+1;

            }
            if(a1[i]==6||a1[i]==9) {
                if(flag==0) {
                    b1[6]++;
                    flag++;
                }else {
                    flag=0;
                }

            }
        }
        for(int i=0; i<10; i++) {
            list.add(b1[i]);
        }
        Collections.sort(list);
        System.out.println(list.get(9));
    }
}