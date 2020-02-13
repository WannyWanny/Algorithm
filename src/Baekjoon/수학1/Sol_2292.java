package 수학1;
import java.util.Scanner;
public class Sol_2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = 1;        //정답의 개수. 최소 방 1개는 거친다
        int room = 1;       //최초로 시작하는 룸 넘버
        int addNum = 6;     //공차가 6인 등차수열

        while(true)
        {
            if(num <= room)
                break;
            room += addNum;
            addNum += 6;
            ans++;
        }
        System.out.println(ans);
    }
}
