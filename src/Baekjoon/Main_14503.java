package Baekjoon;

import java.util.Scanner;

public class Main_14503 {
    static int R, C;
    static int[][] map;
    static int[] dc={0, 1, 0, -1};
    static int[] dr={-1, 0, 1, 0};              //북 동 남 서
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        C = sc.nextInt();
        map = new int[R][C];
        int sR = sc.nextInt();
        int sC = sc.nextInt();
        int dir = sc.nextInt();

        for(int r=0; r<R; r++){
            for(int c=0; c<C; c++){
                map[r][c] = sc.nextInt();
            }
        }

        System.out.println(DFS(sR, sC, dir));
    }

    private static int DFS(int r, int c,int dir){
        int rotateCnt=0;
        int nr, nc;
        int ans=0;
        boolean flag = true;

        while(flag){
            if(map[r][c] == 0){
                map[r][c] = 2;
                ans++;
            }

            while(true){
                if(rotateCnt == 4){
                    nr = r - dr[dir];
                    nc = c - dc[dir];

                    if(map[nr][nc] == 1){
                        flag = false;
                        break;
                    }else{
                        r = nr;
                        c = nc;
                        rotateCnt = 0;
                    }
                }

                dir = (dir+3)%4;
                nr = r+dr[dir];
                nc = c+dc[dir];

                if(map[nr][nc] == 0){
                    rotateCnt=0;
                    r = nr;
                    c = nc;
                    break;
                }
                else{
                    rotateCnt++;
                    continue;
                }
            }
        }
        return ans;
    }
}
