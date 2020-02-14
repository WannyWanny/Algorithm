

import java.util.*;
public class Sol_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test>0)
        {
            test--;
            int num = sc.nextInt();
            String str = sc.next();
            for(int i=0; i<num; i++)
            {
                for(int j=0; j<num; j++)
                {
                    System.out.printf(String.valueOf(str.charAt(i)));
                }
            }
            System.out.println();
        }
    }
}
