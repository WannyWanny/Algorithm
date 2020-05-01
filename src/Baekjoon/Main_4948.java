

import java.util.Scanner;

public class Main_4948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do
        {
            n = sc.nextInt();
            boolean isPrime = false;
            int cnt = 0;
            for(int i=n; i<=2*n; i++)
            {
                for(int j=2; j<i; j++)
                {
                   if(n % j != 0)
                   {
                       isPrime = true;
                   }
                }
                if(i == 1)
                {
                    cnt = 1;
                    break;
                }
                if(isPrime && i > 2)
                {
                    cnt++;
                }
            }

            System.out.println(cnt);
        }while(n !=0);
    }
}
