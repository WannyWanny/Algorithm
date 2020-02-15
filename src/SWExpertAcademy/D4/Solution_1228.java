<<<<<<< HEAD:src/D4/Solution_1228.java
package D4;
=======
>>>>>>> 6fb9bba7aedc3f96fcf68890ec38d55e3bafb3e9:src/SWExpertAcademy/D4/Solution_1228.java

package SWExpertAcademy.D4;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution_1228 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int tc=1; tc<=10; tc++){
            int N = sc.nextInt();
            Queue<Integer>passQ= new LinkedList<>();
            Queue<Integer>newPassQ = new LinkedList<>();
            Queue<Integer>tmpPassQ = new LinkedList<>();
            int[] passArr = new int[N];

            //패스워드값을 큐에 삽입
            for(int i=0; i<N; i++){
                passArr[i] = sc.nextInt();
            }
            for(int i=0; i<N; i++){
                passQ.offer(passArr[i]);
            }

            //암호 명령문을 받자
            int K = sc.nextInt();
            for(int k=0; k<K; k++){
                sc.next();
                int pos = sc.nextInt();
                int cnt = sc.nextInt();
                int[] updatePass = new int[cnt];
                for(int i=0; i<cnt; i++){
                    updatePass[i] = sc.nextInt();
                }
                //입력 받는건 여기서 완료

                //패스워드 수정
                /*while(pos!=0){
                    if(!passQ.isEmpty())
                        newPassQ.offer(passQ.poll());
                    for(int i=0; i<cnt; i++){
                        newPassQ.offer((updatePass[i]));
                    }

                    if(!passQ.isEmpty()) {
                        for (int i = 0; i < N; i++) {
                            newPassQ.offer(passQ.poll());
                        }
                    }


                    pos--;
                }//end of while*/
                if(!passQ.isEmpty()) {
                    for (int i = 0; i < pos; i++) {
                        newPassQ.offer(passQ.poll());
                    }
                }
                for(int i=0; i<cnt; i++){
                    newPassQ.offer((updatePass[i]));
                }
                while(!passQ.isEmpty()){
                    newPassQ.offer(passQ.poll());
                }



            }

            //출력
            System.out.print("#"+tc+" ");
            for(int i=0; i<10; i++){
                System.out.print(newPassQ.peek()+" ");
                newPassQ.poll();
            }
            System.out.println();
        }//end of test

    }
}
