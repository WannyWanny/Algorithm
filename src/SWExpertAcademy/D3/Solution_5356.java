package SWExpertAcademy.D3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution_5356 {
    static int T;
    static char[][] ch;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            ch = new char[5][15];
            for(int r=0; r<5; r++){
                StringTokenizer st = new StringTokenizer(sc.next());
                String str = st.nextToken();
                for(int c=0; c<15; c++){
                    if(c>=str.length())
                        break;
                    else {
                        ch[r][c] = str.charAt(c);
                    }
                }
            }
            System.out.print("#"+tc+" ");
            printArr(ch);
            System.out.println();
        }
    }
    private static void printArr(char[][] ch){
        for(int c=0; c<15; c++){
            for(int r=0; r<5; r++){
                if(ch[r][c] != '\0')
                    System.out.print(ch[r][c]);
            }
        }
    }
}
