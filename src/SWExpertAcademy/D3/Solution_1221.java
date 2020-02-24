package SWExpertAcademy.D3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution_1221 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("ZRO", 0);
        map.put("ONE", 1);
        map.put("TWO", 2);
        map.put("THR", 3);
        map.put("FOR", 4);
        map.put("FIV", 5);
        map.put("SIX", 6);
        map.put("SVN", 7);
        map.put("EGT", 8);
        map.put("NIN", 9);
        for(int tc=1; tc<=T; tc++){
            String aa = sc.next();
            int num = sc.nextInt();
            int N = sc.nextInt();


            int[] arr = new int[N+1];
            for (int i=0; i<arr.length; i++){
                String str = sc.next();
                arr[i] = map.get(str);
            }

            Arrays.sort(arr);
            System.out.print("#"+tc);
            for(int i=0; i<arr.length; i++){
                System.out.print(map.get(arr[i]));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
