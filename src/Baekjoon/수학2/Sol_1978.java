package 수학2;
import java.util.Scanner;
public class Sol_1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        boolean NotPrime = false;

        for(int i=0; i<n; i++)
        {
            int num = sc.nextInt();

            for(int j=2; j<num; j++) {
                if (num % j == 0)           //소수가 아닌거임
                    NotPrime = true;
            }

            if(!NotPrime && num >1)
                ans++;
            NotPrime = false;

        }
        System.out.println(ans);
    }
}
