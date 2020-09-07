package SWExpertAcademy.D5;

import java.util.Scanner;

public class Solution_2112 {
    static int D, W, K, min;
    static int[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            D = sc.nextInt();
            W = sc.nextInt();
            K = sc.nextInt();
            arr = new int[D][W];

            for(int r=0; r<D; r++){
                for(int c=0; c<W; c++){
                    arr[r][c] = sc.nextInt();
                }
            }
            min = Integer.MAX_VALUE;
            DFS(0, 0);
            System.out.println("#"+tc+" "+min);
        }
    }

//    A는 0, B는 1
    private static void DFS(int idx, int val){
//        최솟값보다 크면 애초에 진행할 필요가 없다(가지치기)
        if(val >= min) return;

//        종료 조건식
        if(idx >= D){
//            통과 된다면 값 갱신
            if(check()) min = Math.min(val, min);
            return;
        }

//        A나 B 안바꾸고 일단 해보자
        DFS(idx+1, val);

//        복사본 저장
        int[] tempArr = new int[W];
        for(int i=0; i<W; i++){
            tempArr[i] = arr[idx][i];
        }

//        A로 바꿔보자
        for(int i=0; i<W; i++){
            arr[idx][i] = 0;
        }
        DFS(idx+1, val+1);

//        B로 바꿔보자
        for(int i=0; i<W; i++){
            arr[idx][i] = 1;
        }
        DFS(idx+1, val+1);

//        원본 돌려놓기
        for(int i=0; i<W; i++){
            arr[idx][i] = tempArr[i];
        }
    }

    private static boolean check(){
        for(int c=0; c<W; c++){
            boolean flag = false;
            int temp = arr[0][c];
            int cnt=0;

//            연속된 k개의 갯수를 찾자
            for(int r=0; r<D; r++){
                if(temp == arr[r][c]) cnt++;
                else{
                    cnt=1;
                    temp = arr[r][c];
                }

//                K개가 연속된다면 더 이상 진행할 필요가 없겠지
                if(cnt == K){
                    flag = true;
                    break;
                }
            }
//            한줄이라도 검증되지 못한다면 유효성 검사 실패
            if(!flag) return false;
        }
        return true;
    }
}
