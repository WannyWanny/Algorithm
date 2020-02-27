package SWExpertAcademy.D3;

import java.lang.reflect.Array;
import java.util.*;

public class Solution_5948 {
    static int[] arr;
    static int[] res;
    static boolean[] visit;
    static Set<Integer> set;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            arr = new int[7];
            res = new int[3];
            visit = new boolean[7];
            set = new HashSet<Integer>();
            for(int i=0; i<7; i++){
                arr[i] = sc.nextInt();
            }
            dfs(0);
            List list = new ArrayList(set);
            Collections.sort(list);
            System.out.println("#"+tc+" "+list.get(list.size()-5));
        }
    }

    static private void dfs(int idx){
        if(idx == res.length){
            int sum=0;
            sum += res[0]+res[1]+res[2];
            set.add(sum);
            return;
        }

        for(int i=0; i<arr.length; i++){
            if(!visit[i]){
                visit[i] = true;
                res[idx] = arr[i];
                dfs(idx+1);
                visit[i] = false;
            }
        }
    }
}
