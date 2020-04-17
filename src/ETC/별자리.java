package ETC;

import java.util.Scanner;

public class 별자리 {
    static int[][] map;
    static boolean[][] visited;
    static final int N = 10;
    static int result;
    static int[] dr ={-1, -1, -1, 0,  1, 1, 1,  0};
    static int[] dc ={-1,  0,  1, 1, -1, 0, 1, -1};
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        sc.nextLine();
        for(int tc=1; tc<=10; tc++){
            map = new int[N][N];
            visited = new boolean[N][N];
            result=0;
            for(int r=0; r<N; r++){
                for(int c=0; c<N; c++){
                    map[r][c] = sc.nextInt();
                }
            }

            for(int r=0; r<N; r++){
                for(int c=0; c<N; c++){
                    if(!visited[r][c] && map[r][c] == 1){
                        DFS(r, c);
                        result++;
                    }
                }
            }

            System.out.println("#"+tc+" "+result);
        }
    }

    private static void DFS(int r, int c){
        visited[r][c] = true;
        map[r][c]=0;

        for(int d=0; d<8; d++){
            int nr = r+dr[d];
            int nc = c+dc[d];
            if(isIn(nr, nc)){
                if(!visited[nr][nc] && map[nr][nc] == 1){
                    DFS(nr, nc);
                }
            }
        }
    }

    private static boolean isIn(int r, int c){
        return (r>=0 && r<N && c>=0 && c<N);
    }

}
