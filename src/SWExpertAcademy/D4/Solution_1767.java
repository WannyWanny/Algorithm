package SWExpertAcademy.D4;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution_1767 {
    static class Point{
        int r;
        int c;

        public Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
    static int N, max,min, totalCnt;
    static int[][] map;
    static int[] dr={1, 0, -1, 0};
    static int[] dc={0, 1, 0, -1};
    static ArrayList<Point> list;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T;tc++){
            N = sc.nextInt();
            map = new int[N][N];
            list = new ArrayList<>();
            max = Integer.MIN_VALUE;
            min = Integer.MAX_VALUE;
            totalCnt=0;
            for(int r=0; r<N; r++){
                for(int c=0; c<N; c++){
                    map[r][c] = sc.nextInt();
                    if((r==0 || r==N-1 || c==0 || c==N-1) && map[r][c]==1) continue;
                    if(map[r][c]==1) {
                        list.add(new Point(r, c));
                        totalCnt++;
                    }
                }
            }
            go(0, 0);
            System.out.println("#"+tc+" "+min);
        }
    }

    private static void go(int index, int cCnt){
        if(index == totalCnt){
            int res = getLength();
            if(max<cCnt){
                max = cCnt;
                min = res;
            }else if(max == cCnt){
                if(min > res){
                    min = res;
                }
            }
            return;
        }
        Point cur = list.get(index);
        int r = cur.r;
        int c = cur.c;
//        포함
        for(int d=0; d<4; d++){
//           현 방향으로 전선을 놓는것이 가능한지 체크
            if(isAvailable(r, c, d)) {
//              가능하다면 현 방향으로 전선 놓기(2)
                setStatus(r, c, d, 2);
//              다음 코어로 넘어가기
                go(index+1, cCnt+1);
//              현 방향으로 전선 놓았던거 되돌리기(0)
                setStatus(r, c, d, 0);
            }
        }
//        비포함
        go(index+1, cCnt);
    }

    private static boolean isAvailable(int r, int c, int d){
        int nr=r, nc=c;
        while(true){
            nr += dr[d];
            nc += dc[d];

            if(!isIn(nr, nc)) break;
            if(map[nr][nc] !=0) return false;
        }
        return true;
    }

    private static void setStatus(int r, int c, int d, int s){
        int nr=r, nc=c;
        while(true){
            nr += dr[d];
            nc += dc[d];
            if(!isIn(nr, nc)) break;
            map[nr][nc] = s;
        }
    }

    private static int getLength(){
        int lCnt=0;
        for(int r=0; r<N; r++){
            for(int c=0; c<N; c++){
                if(map[r][c] == 2) ++lCnt;
            }
        }
        return lCnt;
    }

    private static boolean isIn(int r, int c){
        return (r>=0 && r<N && c>=0 && c<N);
    }
}
