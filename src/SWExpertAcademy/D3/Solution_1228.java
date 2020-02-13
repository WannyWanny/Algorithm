package SWExpertAcademy.D3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution_1228 {
    static int pos;
    static int cnt;
    static int[] updatePass;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer>passQ= new LinkedList<>();
        for(int tc=1; tc<=10; tc++){
            int N = sc.nextInt();
            Queue<Integer>tmpPassQ = new LinkedList<>();

            //패스워드값을 큐에 삽입
            for(int i=0; i<N; i++){
                passQ.add(sc.nextInt());
            }

            //암호 명령문을 받자
            int n = 0;
            int K = sc.nextInt();
            while(n < K){
                if(n == K)break;
                sc.next();
                pos = sc.nextInt();
                cnt = sc.nextInt();

                for(int i=0; i<pos; i++)
                    tmpPassQ.add(passQ.poll());
                for(int i=0; i<cnt; i++)
                    tmpPassQ.add(sc.nextInt());
                while(!passQ.isEmpty())
                    tmpPassQ.add(passQ.poll());
                while(!tmpPassQ.isEmpty())
                    passQ.add(tmpPassQ.poll());
                n++;
            }

            //출력
            System.out.print("#"+tc+" ");
            for(int i=0; i<10; i++)
                System.out.print(passQ.poll()+" ");
            passQ.clear();
            System.out.println();
        }//end of test

    }
}
