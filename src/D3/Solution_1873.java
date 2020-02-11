package D3;

import java.util.Scanner;

public class Solution_1873 {
    static int W, H;
    static char[][] map;
    static int orderCnt;
    static String order;
    static int[] dc={0, 0, -1, 1};             //상하좌우
    static int[] dr={-1, 1, 0, 0};
    static final int UP=0, DOWN=1, LEFT=2, RIGHT=3;
    static Tank tank;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();

        for(int tc=1; tc<=T; tc++){
             W = sc.nextInt();
             H = sc.nextInt();
             map = new char[H][W];

             for(int r=0; r<H; r++){
                 String line = sc.nextLine();
                 for(int c=0; c<W; c++){
                    map[r][c] = line.charAt(c);
                    switch(map[r][c]){
                        case '^':
                            tank = new Tank(r, c);
                            tank.dir = UP;
                            break;
                        case 'v':
                            tank = new Tank(r, c);
                            tank.dir = DOWN;
                            break;
                        case '<':
                            tank = new Tank(r, c);
                            tank.dir = LEFT;
                            break;
                        case '>':
                            tank = new Tank(r, c);
                            tank.dir = RIGHT;
                            break;

                    }
                 }
             }//맵 입력 끝

             orderCnt = sc.nextInt();
             order = sc.next();

             for(int i=0; i<orderCnt; i++){
                 char op = order.charAt(i);
                 //슛 쏘자
                 if(op=='S'){
                     for(int d=0; d<4; d++){
                         int nc = tank.c+dc[d];
                         int nr = tank.r+dr[d];

                         while(true){
                             nc += nc+dc[tank.dir];
                             nr += nr+dr[tank.dir];

                             if(nc<0 && nc>=W && nr<0 && nr>=H || (map[nr][nc] == '#')){
                                 break;
                             }
                             else if(map[nr][nc] =='*'){
                                 map[nr][nc] = '.';
                             }
                         }
                     }
                 }
                 //움직임을 처리하자
                 else{
                     switch(op){
                         case 'U':
                             tank.dir = UP;
                             break;
                         case 'D':
                             tank.dir = DOWN;
                             break;
                         case 'L':
                             tank.dir = LEFT;
                             break;
                         case 'R':
                             tank.dir = RIGHT;
                             break;
                     }
                     int nc = tank.c+dc[tank.dir];
                     int nr = tank.r+dr[tank.dir];
                     if(nc>=0 && nc<W && nr>=0 && nr<H && map[nr][nc] == '.'){
                         tank.r = nr;
                         tank.c = nc;
                     }
                 }
             }

             switch(tank.dir){
                 case UP:
                     map[tank.r][tank.c] = '^';
                     break;
                 case DOWN:
                     map[tank.r][tank.c] = 'v';
                     break;
                 case LEFT:
                     map[tank.r][tank.c] = '<';
                     break;
                 case RIGHT:
                     map[tank.r][tank.c] = '>';
                     break;
             }

            System.out.print("#"+tc+" ");
             for(int r=0; r<H; r++){
                 for(int c=0; c<W; c++){
                     System.out.print(map[r][c]);
                 }
                 System.out.println();
             }
        }//end of test
    }

    static public class Tank {
        int r, c;       //탱크의 위치와 방향
        int dir;

        Tank(int r, int c){
            this.r = r;
            this.c = c;
        }
    }
}
