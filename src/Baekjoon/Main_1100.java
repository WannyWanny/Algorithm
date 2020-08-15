package Baekjoon;

import java.util.Scanner;

public class Main_1100 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char[][] map = new char[8][8];
        int ans=0;
        for(int r=0; r<map.length; r++){
            String str = sc.next();
            for(int c=0; c<map[0].length; c++){
                map[r][c] = str.charAt(c);
            }
        }

        for(int r=0; r<map.length; r++){
            for(int c=0; c<map[0].length; c++){
                if((r+c)%2==0 && map[r][c] == 'F') ans++;
            }
        }
        System.out.println(ans);
    }
}
