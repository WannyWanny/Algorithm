package SWExpertAcademy.D4;

import java.util.*;

public class Solution_7701 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int n = sc.nextInt();
            TreeSet<String> name = new TreeSet<String >(new Comparator<String>() {
                @Override
                public int compare(String pre, String next) {
                    if(pre.length() != next.length()){
                        return pre.length()-next.length();
                    }
                    else
                        return pre.compareTo(next);
                }
            });
            for(int i=0; i<n; i++){
                name.add(sc.next());
            }

            System.out.println("#"+tc);
            for(String s:name){
                System.out.println(s);
            }


        }
    }
}
