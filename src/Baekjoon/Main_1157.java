package Baekjoon;

import java.util.*;

public class Main_1157 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String word = sc.next().toUpperCase();
        int[] cnt = new int[26];
        int max =0;
        char answer = '?';

        for(int i=0; i<word.length(); i++)
        {
            cnt[word.charAt(i) - 65]++;
            if(max < cnt[word.charAt(i) - 65])
            {
                answer = word.charAt(i);
                max = cnt[word.charAt(i) - 65];
            }
            else if(max == cnt[word.charAt(i) - 65])
                answer = '?';
        }
        System.out.println(answer);
    }
}
