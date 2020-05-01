package Baekjoon;
import java.util.Scanner;
public class Main_1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String scen = sc.next().trim();
        Boolean CheckEmpty = false;
        int ans=0;

        for(int i=0; i<scen.length(); i++)
        {
            if(scen.charAt(i) == ' ' && scen.charAt(i -1) != ' ')
            ans++;
            else
                CheckEmpty = true;

        }
        if(CheckEmpty)
            System.out.println(ans + 1);
        else
            System.out.println(ans);
    }
}
