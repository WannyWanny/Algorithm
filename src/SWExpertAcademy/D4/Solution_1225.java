package SWExpertAcademy.D4;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution_1225 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        for(int tc=1; tc<=10; tc++){
            sc.nextInt();
            Queue<Integer> queue = new LinkedList<>();

            //큐에 8개의 숫자를 넣어두고
            for(int i=0; i<8; i++){
                queue.offer(sc.nextInt());
            }

            int i=1;
            while(true){
                //dequeue해서 나온값을 i 빼고
                int n = queue.poll();
                n = (n - i);

                //위의 값이 0보다 작이지면 0으로 enqueue
                if(n <=0){
                    queue.offer(0);
                    break;
                }
                //아니면 그냥 enqueue(반복)
                queue.offer(n);
                i++;
                if(i == 6)
                    i = 1;
            }
            System.out.print("#"+tc+" ");
            while(!queue.isEmpty())
                System.out.print(queue.poll()+" ");
            System.out.println();
        }//end of test
    }
}
