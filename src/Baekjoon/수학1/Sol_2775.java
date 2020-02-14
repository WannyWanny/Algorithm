
import java.util.Scanner;
public class Sol_2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T > 0)
        {
            T--;
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(getAns(k, n));
        }
    }
    private static int getAns(int k, int n)
    {
        if(n == 0)
            return 0;
        else if(k==0)
            return n;
        else
            return getAns(k-1, n) + getAns(k, n-1);
    }
}
