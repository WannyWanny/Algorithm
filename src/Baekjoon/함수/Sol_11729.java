

import java.util.*;

public class Sol_11729 {
    private static int ans = 0;
    private static StringBuilder sb = new StringBuilder();

    public static void moveHanoiTower(int num, int from, int by, int to){
        ++ans;
        if(num == 1)
        {
            sb.append(from+" "+to+"\n");
        }
        else {
            moveHanoiTower(num - 1, from, to, by);
            sb.append(from + " " + to + "\n");
            moveHanoiTower(num - 1, by, from, to);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        moveHanoiTower(n, 1, 2, 3);
        sb.insert(0, ans+"\n");
        System.out.println(sb);
    }
}
