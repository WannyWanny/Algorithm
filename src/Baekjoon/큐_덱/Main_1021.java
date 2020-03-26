package Baekjoon.큐_덱;

import java.util.*;

public class Main_1021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        boolean flag = false;
        int num, answer=0;
        for(int i=1; i<=n; i++){
            list.add(i);
        }
        for(int i=0; i<m; i++){
            num = sc.nextInt();
            flag = false;
            while(!flag){
                if(list.get(0) == num){
                    list.remove(0);
                    flag = true;
                }else{
                    if(list.indexOf(num) <= list.size()/2)
                        list.add(list.size()-1, list.remove(0));
                    else
                        list.add(0, list.remove(list.size()-1));
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
