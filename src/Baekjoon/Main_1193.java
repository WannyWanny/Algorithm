package Baekjoon;
import java.util.Scanner;
public class Main_1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int a, b;               //분자와 분모
        int line =0, sum = 0;       //몇번째 라인에 위치해있는지, 어디에 위치해있는지

        while(true)             //우선 몇번째 줄에 있는지를 판별한다.
        {
            for(int i=0; i<line; i++)
                sum++;
            line++;
            if(sum >= X) break;
        }

        int temp = 0;
        for(int i=0; i<line; i++)       //그 line중에서 어디에 위치해 있는가
        {
            temp +=i;
        }

        a = X - temp;
        b = (line+1) - a;

        if(line%2==0)
            System.out.print(a+"/"+b);
        else
            System.out.print(b+"/"+a);
    }
}
