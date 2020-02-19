package SWExpertAcademy.D3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Solution_1229 {

    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for (int tc = 1; tc <= 10; tc++) {
            int len = Integer.parseInt(in.readLine());
            LinkedList<Integer> q = new LinkedList<Integer>();
            StringTokenizer st = new StringTokenizer(in.readLine(), " ");

            for (int i = 0; i < len; i++) {
                q.add(Integer.parseInt(st.nextToken()));
            }

            int num = Integer.parseInt(in.readLine());
            st = new StringTokenizer(in.readLine(), " ");
            int x,y;
            for (int i = 0; i < num; i++) {
                char order = st.nextToken().charAt(0);
                switch(order) {
                    case 'I':
                        x = Integer.parseInt(st.nextToken());
                        y = Integer.parseInt(st.nextToken());
                        for (int j = 0; j < y; j++) {
                            q.add(x+j,Integer.parseInt(st.nextToken()));
                        }
                        break;
                    case 'D':
                        x = Integer.parseInt(st.nextToken());
                        y = Integer.parseInt(st.nextToken());
                        for (int j = 1; j <= y; j++) {
                            q.remove(x);
                        }
                        break;
                    case 'A':
                        y = Integer.parseInt(st.nextToken());
                        for (int j = 0; j < y; j++) {
                            q.add(Integer.parseInt(st.nextToken()));
                        }
                        break;
                }
            }
            System.out.print("#" + tc);
            for (int i = 0; i < 10; i++) {
                System.out.print(" " + q.get(i));
            }
            System.out.println();
        }
    }
}