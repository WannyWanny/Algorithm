package SWExpertAcademy.D3;


import java.util.LinkedList;
import java.util.Scanner;

public class Solution_1234 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int tc = 1; tc <= 10; tc++) {
            int N = sc.nextInt();
            LinkedList<Integer> list = new LinkedList<>();
            String str = sc.next();
            for (int i = 0; i < N; i++) {
               int num = str.charAt(i) - '0';
               list.add(num);
            }

            for(int i=0; i<N-1; i++){
                if(list.get(i) == list.get(i+1)){
                    list.remove(i);
                    list.remove(i);
                    N-=2;
                    i=-1;
                }
            }

            System.out.print("#"+tc+" ");
            for(int i=0; i<list.size(); i++){
                System.out.print(list.get(i));
            }
            System.out.println();
        }
    }
}
