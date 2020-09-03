package SWExpertAcademy.D5;

import java.util.*;

public class Solution_5653 {
    static int[] dr = {1, -1, 0, 0};
    static int[] dc = {0, 0, -1, 1};
    static int T, N, M, K;
//    세포 정보는 pq에서 관리하고 map에서는 세포 존재 유무만 확인
    static boolean[][] map;
//    살아있는 세포들을 관리하자(활성화+비활성화)
    static PriorityQueue<Cell> liveCells;
//    상태도 변수로 나타내자
    static int ABLED = 1, DEAD = -1, DISABLED = 0;
    static class Cell implements Comparable<Cell>{
        int r, c;
        int life;       //생명력
        int wait;       //활성화까지 남은 시간
        int status;       //-1: 사망,  1:활성, 0:비활성

        public Cell(int r, int c, int life) {
            this.r = r;
            this.c = c;
            this.wait = this.life = life;
        }

        @Override
//        생명력이 높은놈 부터... 내림차순
        public int compareTo(Cell o) {
            return Integer.compare(o.life, this.life);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            N = sc.nextInt();
            M = sc.nextInt();
            K = sc.nextInt();
//          map은 초기 크기 N, M 에서 K만큼 확장
            map = new boolean[N+K+2][N+K+2];
            liveCells = new PriorityQueue<>();

            for(int r=0; r<N; r++){
                for(int c=0; c<M; c++){
                    int life = sc.nextInt();

                    if(life>0){
//                        원점 이동
                        Cell cell = new Cell(r+K/2, c+K/2, life);
                        liveCells.add(cell);
                        map[cell.r][cell.c] = true;
                    }
                }
            }//입력 완료
            incubate();

            System.out.println("#"+tc+" "+liveCells.size());
        }
    }

    private static void incubate() {
//            주어진 시간동안 성장
        for(int k=0; k<K; k++){
//            새롭게 관리할 cell들이 들어갈 곳
            PriorityQueue<Cell> nextPQ = new PriorityQueue<>();
            while(!liveCells.isEmpty()){
                Cell cell = liveCells.poll();

                if(cell.status == DISABLED){
                    cell.wait--;
                    if(cell.wait == 0){
                        cell.status = ABLED;
                    }
                    nextPQ.add(cell);
                }else if(cell.status == ABLED){
                    for(int d=0; d<4; d++){
                        int nr = cell.r + dr[d];
                        int nc = cell.c + dc[d];

                        if(!map[nr][nc]){
                            map[nr][nc] = true;
                            //확정된 세포는 기존 세포의 생명력을 가져간다.
                            nextPQ.add(new Cell(nr, nc, cell.life));
                        }
                        
                    }//사방 확장 종료
                    cell.life--;
                    if(cell.life > 0){
                        nextPQ.offer(cell);
                    }
                }
            }
            liveCells = nextPQ;
        }
    }

}
