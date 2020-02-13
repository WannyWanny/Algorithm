package SWExpertAcademy.D2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution_1288 {
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int N = sc.nextInt();
            int i=0;
            Set<Integer> set = new HashSet<>();
            while(set.size()!=10) {
                int num = N*++i;
                while(num!=0) {
                    set.add(num%10);
                    num/=10;
                }
            }
            System.out.println("#"+test_case+" "+N*i);
        }
    }
}

