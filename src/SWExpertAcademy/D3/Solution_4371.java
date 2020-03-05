package SWExpertAcademy.D3;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution_4371 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<arr.length; i++)
                arr[i] = sc.nextInt();

            ArrayList<Integer> list = new ArrayList<>();

            for(int i=1; i<arr.length; i++){
                int gap = arr[i]-arr[0];
                boolean flag = false;
                for(int j=0; j<list.size(); j++){
                    if(gap%list.get(j)==0){
                        flag = true;
                        break;
                    }
                }
                if(!flag) list.add(gap);

            }
            System.out.println("#"+tc+" "+list.size());
        }
    }
}
