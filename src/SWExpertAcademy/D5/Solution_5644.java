package SWExpertAcademy.D5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Solution_5644 {
    static class BC{
        int x;
        int y;
        int c;
        int p;
        int idx;

        public BC(int x, int y, int c, int p, int idx) {
            this.x = x;
            this.y = y;
            this.c = c;
            this.p = p;
            this.idx = idx;
        }
    }
    static int max, M, A;
    static int[] aPath, bPath;
    static int ax, ay, bx, by;
    static BC[] list;
    static LinkedList<BC> containA = new LinkedList<>();
    static LinkedList<BC> containB = new LinkedList<>();
    static int[] dr={0, -1, 0, 1, 0};
    static int[] dc={0, 0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int tc=1; tc<=T; tc++){
            StringTokenizer st =new StringTokenizer(br.readLine(), " ");
            M = Integer.parseInt(st.nextToken());
            A = Integer.parseInt(st.nextToken());
            aPath = new int[M];
            bPath = new int[M];
            list = new BC[A];

            st = new StringTokenizer(br.readLine(), " ");
            for(int i=0; i<M; i++){
                aPath[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine(), " ");
            for(int i=0; i<M; i++){
                bPath[i] = Integer.parseInt(st.nextToken());
            }

            for(int i=0; i<A; i++){
                st = new StringTokenizer(br.readLine(), " ");
                list[i] = new BC(Integer.parseInt(st.nextToken()),
                                 Integer.parseInt(st.nextToken()),
                                 Integer.parseInt(st.nextToken()),
                                 Integer.parseInt(st.nextToken()),
                                    i);
            }

            max=0;
            ax = ay = 1;
            bx = by = 10;

            for(int i=0; i<M; i++){
                max += calc();
                ax += dc[aPath[i]];
                ay += dr[aPath[i]];
                bx += dc[bPath[i]];
                by += dr[bPath[i]];
            }
            max += calc();
            System.out.println("#"+tc+" "+max);
        }
    }

    private static int calc(){
        for(BC bc:list){
            if(isRange(ax, ay, bc)){
                containA.add(bc);
            }
            if(isRange(bx, by, bc)){
                containB.add(bc);
            }
        }

        int temp = 0;
        int sizeA = containA.size();
        int sizeB = containB.size();
        if(sizeB==0){
            for(BC bc:containA){
                temp = Math.max(temp, bc.p);
            }
        }else if(sizeA ==0){
            for(BC bc:containB){
                temp = Math.max(temp, bc.p);
            }
        }else if(sizeA > 0 && sizeB > 0){
            for(BC bcA : containA){
                for(BC bcB: containB){
                    if(bcA.idx == bcB.idx){
                        temp = Math.max(temp, bcA.p);
                    }else {
                        temp = Math.max(temp, bcA.p+bcB.p);
                    }
                }
            }
        }

        containA.clear();
        containB.clear();
        return temp;
    }

    private static boolean isRange(int x, int y, BC bc){
        int d = Math.abs(x-bc.x)+Math.abs(y-bc.y);
        return d<=bc.c ? true:false;
    }
}
