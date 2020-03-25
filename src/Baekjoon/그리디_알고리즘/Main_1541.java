package Baekjoon.그리디_알고리즘;
import java.util.Scanner;

public class Main_1541 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String exp = sc.next();
        String[] str = exp.split("-");
        String[] tmp = str[0].split("\\+");
        int first=0;
        for(String t:tmp) first += Integer.parseInt(t);
        int sum=0;
        for(int i=1; i<str.length; i++){
            String[] temp = str[i].split("\\+");
            for(String t:temp) sum += Integer.parseInt(t);
        }
        System.out.println(first-sum);
    }
}
