import java.util.Scanner;
public class Sol_2851 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum =0, min = 0;
        boolean isPrime = true;

        for(int i=m; i<=n; i++)
        {
            for(int j=2; j<i; j++) {
                if (m % j == 0)
                    isPrime = false;
            }

            if(!isPrime && m >2)
            {
                sum += m;
                if(min == 0)
                    min = i;
            }
            isPrime = true;
        }

        if(sum != 0)
        {
            System.out.println(sum);
            System.out.println(min);
        }
        else
            System.out.println(-1);
    }
}