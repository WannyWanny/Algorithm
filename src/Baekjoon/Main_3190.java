package Baekjoon;

import java.util.*;

public class Main_3190 {
    static class Point{
        int r;
        int c;

        public Point(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
    static int N, K, L;
    static int[][] map;
    static int[] dr={1, 0, -1, 0};         //상 우 하 좌
    static int[] dc={0, 1, -1, 0};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        map = new int[N+2][N+2];
        for(int i=0; i<N+2; i++){
            map[0][i] = map[N+1][i] = map[i][0] = map[i][N+1] = 1;
        }
        Map<Integer, Character> dirSet = new HashMap<>();
        for(int k=0; k<K; k++){
            int c = sc.nextInt();
            int r = sc.nextInt();
            map[r][c] = 2;
        }
        L = sc.nextInt();
        for(int l=0; l<L; l++){
            int n = sc.nextInt();
            char c = sc.next().charAt(0);
            dirSet.put(n, c);
        }
        int dir=1;
        int time=0;
        Deque<Point> snake = new ArrayDeque<>();
        snake.add(new Point(1, 1));

        for(int[] rows:map)
            System.out.println(Arrays.toString(rows));
        while(true){
            time++;
            Point head = snake.peekLast();
            int nr = head.r+dr[dir];
            int nc = head.c+dc[dir];

            //벽에 부딪히면 종료
            if(map[nr][nc] == 1) break;

            if(map[nr][nc] ==0){
                Point tail = snake.poll();
                map[tail.r][tail.c] = 0;
            }
            map[nr][nc] = 1;
            snake.addLast(new Point(nr, nc));

            if(dirSet.containsKey(time)){
                dir = (dirSet.get(time).equals("D")) ? (dir+1)%4:(dir+3)%4;
            }
        }

        System.out.println(time);

    }
}


