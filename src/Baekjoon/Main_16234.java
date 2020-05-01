package Baekjoon.DFS_BFS;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main_16234 {
    static class Point{
        int r;
        int c;

        public Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
    static int N, L, R;
    static int[][] map;
    static boolean[][] visited;
    static int[] dr={1, -1, 0, 0};
    static int[] dc={0, 0, 1, -1};
    static int result;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        L = sc.nextInt();
        R = sc.nextInt();
        result=0;
        map = new int[N][N];
        for(int r=0; r<N; r++){
            for(int c=0; c<N; c++){
                map[r][c] = sc.nextInt();
            }
        }

        while(true){
            visited = new boolean[N][N];
            if(!movePeople()){
                result++;
            }else{
                break;
            }
        }

        System.out.println(result);
    }

    private static boolean movePeople(){
        List<Point> list;
        boolean flag = true;
        for(int r=0; r<N; r++){
            for(int c=0; c<N; c++){
                if(!visited[r][c]){
                    list = new LinkedList<>();
                    list.add(new Point(r, c));
                    int sum = DFS(r, c, list, 0);
                    if(list.size() >1){
                        getAvg(sum, list);
                        flag = false;
                    }
                }
            }
        }
        return flag;
    }

    private static void getAvg(int sum, List<Point> list){
        int avg = sum/list.size();
        for(Point p:list){
            map[p.r][p.c] = avg;
        }
    }

    private static int DFS(int r, int c, List<Point> list, int sum){
        visited[r][c] = true;
        sum = map[r][c];
        for(int d=0; d<4; d++){
            int nr = r+dr[d];
            int nc = c+dc[d];

            if(isIn(nr, nc)){
                if(!visited[nr][nc]){
                    int temp = Math.abs(map[r][c] - map[nr][nc]);
                    if(temp >=L && temp <=R){
                        list.add(new Point(nr, nc));
                        sum += DFS(nr, nc, list, sum);
                    }
                }
            }
        }
        return sum;
    }

    private static boolean isIn(int r, int c){
        return (r>=0 && r<N && c>=0 && c<N);
    }
}
