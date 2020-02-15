
import java.util.Scanner;
public class Sol_10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int floor = 0;      //층
        int room = 0;       //호수
        String mid = "";
        while(T != 0)
        {
            T--;
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();

            if(n > h)
            {
                floor = n % h;
                room = n/h + 1;
                if(room <10)
                    mid = "0";
            }
            else
            {
                floor = h;
                room = n/h;
                if(room <10)
                    mid="0";
            }
            System.out.print(floor);
            System.out.print(mid);
            System.out.println(room);

            floor = 0; mid = ""; room = 0;

        }
    }
}
