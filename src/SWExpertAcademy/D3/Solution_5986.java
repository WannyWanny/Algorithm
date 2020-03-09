package SWExpertAcademy.D3;


import java.util.Scanner;

public class Solution_5986 {
    static boolean[] prime;
    static int[] result = new int[1000];
    public static void main(String[] args) {
        prime = new boolean[1000];
        for(int i=2; i<500; i++){
            if(!prime[i]){
                for(int j=i+i; j<1000; j+=i){
                    prime[j] = true;
                }
            }
        }
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Func(0, 0, 2);
        for(int tc=1; tc<=T; tc++) {
            int n = sc.nextInt();



            System.out.println("#"+tc+" "+result[n]);
        }
    }

    private static void Func(int sum, int cnt, int idx){
        if(sum > 999)
            return;
        if(cnt == 3){
            result[sum]++;
            return;
        }
        for(int i=idx; i<996; i++){
            if(!prime[i])
                Func(sum+i, cnt+1, i);
        }
    }
}
