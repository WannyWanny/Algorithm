package SWExpertAcademy.D2;

import java.util.Scanner;

public class Solution_1986 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int tset_case=1; tset_case<=T; tset_case++)
        {
            int num = sc.nextInt();
            int buho;               //양수일지 음수일지 판단

            if(num % 2 == 0)        //짝수일 경우에는 음수를, 홀수일 때는 양수
            {
                buho = -1;
                System.out.println("#"+tset_case+" "+(num/2*buho));
            }
            else {
                buho = 1;
                System.out.println("#"+tset_case+" "+((num/2+1)*buho));
            }

        }
    }
}
