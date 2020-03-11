package SWExpertAcademy.D5;

import java.util.Scanner;

public class Solution_5656 {
    static int T, N, R, C;
    static int[][] map;
    static boolean[][] visited;
    static int[] dr={-1, 1, 0, 0};
    static int[] dc={0, 0, -1, 1};
    static int Ans;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            N = sc.nextInt();
            C = sc.nextInt();
            R = sc.nextInt();
            map = new int[R][C];
            visited = new boolean[R][C];
            Ans=Integer.MAX_VALUE;
            for(int r=0; r<R; r++){
                for(int c=0; c<C; c++){
                    map[r][c] =sc.nextInt();
                }
            }

            dfs(map, N);
            System.out.println("#"+tc+" "+Ans);

        }
    }

    private static void deepCopy(int[][] origin, int[][] copy){
        for(int i=0; i<origin.length; i++){
            for(int j=0; j<origin[i].length; j++){
                copy[i][j] = origin[i][j];
            }
        }
    }

    private static void dfs(int[][] map, int n){
        if(n==0){
            Ans = Math.min(Ans, getCount(map));
            return;
        }

        for(int j=0; j<map[0].length; j++){
            int[][] tmp = new int[map.length][map[0].length];
            deepCopy(map, tmp);

            for(int i=0; i<tmp.length; i++){
                if(tmp[i][j] !=0){
                    breakBrick(tmp, i, j);
                    break;
                }
            }
            gravity(tmp);
            dfs(tmp, n-1);
        }
    }

    private static void breakBrick(int[][] map, int r, int c){
        if(!isIn(r, c)) return;

        int power = map[r][c];
        map[r][c]=0;
        for(int i=1; i<power; i++){
            for(int k=0; k<4; k++){
                int nc = c+dc[k]*i;
                int nr = r+dr[k]*i;
                breakBrick(map, nr, nc);
            }
        }
    }

    private static void gravity(int[][] map){
        for(int i=map.length-1; i>=0; i--){
            for(int j=0; j<map[i].length; j++){
                if(map[i][j]==0){
                    for(int k=i; k>=0; k--){
                        if(map[k][j] !=0){
                            map[i][j] = map[k][j];
                            map[k][j]=0;
                            break;
                        }
                    }
                }
            }
        }
    }

    private static int getCount(int[][] map){
        int cnt=0;
        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[i].length; j++){
                if(map[i][j] !=0) cnt++;
            }
        }
        return cnt;
    }

    private static boolean isIn(int r, int c){
        if(r<0 || r>=R || c<0  || c>=C) return false;
        else return true;
    }
}
