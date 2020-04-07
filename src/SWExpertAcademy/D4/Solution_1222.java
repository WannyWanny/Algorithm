package SWExpertAcademy.D4;

import java.util.Scanner;

public class Solution_1222 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        for(int tc=1; tc<=10; tc++){
            int len = sc.nextInt();
            String[] temp = sc.next().split("");
            int sum = Integer.parseInt(temp[0]);
            System.out.println(temp[1]+", "+temp[2]);

            for(int i=0; i<temp.length-1; i++){
                if(temp[i].equals("+")){
                    sum += Integer.parseInt(temp[i+1]);
                }
            }

            System.out.println("#"+tc+" "+sum);
        }
    }
}
