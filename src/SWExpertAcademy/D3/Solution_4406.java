package SWExpertAcademy.D3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution_4406 {
    static int T;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            char[] ch = sc.next().toCharArray();

            Queue<Character> queue = new LinkedList<>();

            for(int i=0; i<ch.length; i++){
                if(ch[i] =='a' || ch[i] =='i' || ch[i]=='e' || ch[i]=='o'|| ch[i]=='u')
                    continue;
                else
                    queue.add(ch[i]);
            }

            System.out.print("#"+tc+" ");
            while(!queue.isEmpty()){
                System.out.print(queue.poll());
            }
            System.out.println();
        }

    }
}
