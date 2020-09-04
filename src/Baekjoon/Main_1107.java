package Baekjoon;

import java.util.Scanner;

public class Main_1107 {
    static boolean[] broken;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        int N = sc.nextInt();
        broken = new boolean[10];

        for(int i=0; i<N; i++){
            broken[sc.nextInt()] = true;
        }

//        초기 채널은 100번이므로 +와 -번으로만 이동 가능한 것이 최대 이동 횟수이다.
        int ans = Math.abs(num - 100);

        for(int i=0; i<1000000; i++){
//            i까지 숫자만 눌러서 이동가능한지, 가능하다면 몇번 누르는지 횟수를 구한다.
            int len = Solution(i);
//            일단 i까지 숫자 눌러서 이동하자
            if(len != 0){
//                cnt는 숫자만 눌러서 근접한 숫자에서 몇번의 +나 -를 눌러야 하는지 나타낸다.
                int cnt = Math.abs(i - num);
                if(ans > len + cnt){
                    ans = len+cnt;
                }
            }
        }
        System.out.println(ans);
    }

    private static int Solution(int n){
        int len=0;
//        0일 경우 예외 처리
        if(n == 0){
            if(broken[0])
                len = 0;
            else{
                len = 1;
            }
            return len;
        }
//        5123 (broken: 6, 7, 8)
//        5 1 2 3 순서대로 눌러야 하지만
//        3 2 1 5 순서대로 눌러도 상관없다는 점에 유의하면 더 쉽게 풀 수 있다.
        while(n > 0){
//            고장 났다면 뒤돌아볼 필요도 없이 종료
            if(broken[n%10]){
                len = 0;
                return len;
            }
            len++;
            n /= 10;
        }
        return len;
    }
}
