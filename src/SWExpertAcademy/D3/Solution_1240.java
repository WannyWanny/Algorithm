package SWExpertAcademy.D3;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_1240 {
    static int T, r, c;
    static int[] pass;
    static int Ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            r=sc.nextInt(); c=sc.nextInt();
            pass = new int[r];
            String[] str = new String[r];
            for(int i=0; i<r; i++){
                str[i] = sc.next();
            }

            int saveX=0, saveY=0;
            out: for(int y=0; y<str.length; y++){
                for(int x=str[y].length()-1; x>=0; x--){
                    //뒤에서부터 시작해 1이 시작하는 위치를 찾는다.
                    if(str[y].charAt(x) == '1'){
                        saveX = x-55;
                        saveY = y;
                        break out;
                    }
                }
            }

            int[] arr = new int[8];
            for(int i = 0; i < 8; i++,saveX += 7) {
                String c = str[saveY].substring(saveX, saveX+7);
                switch (c) {
                    case "0001101":
                        arr[i] = 0;
                        break;
                    case "0011001":
                        arr[i] = 1;
                        break;
                    case "0010011":
                        arr[i] = 2;
                        break;
                    case "0111101":
                        arr[i] = 3;
                        break;
                    case  "0100011":
                        arr[i] = 4;
                        break;
                    case  "0110001":
                        arr[i] = 5;
                        break;
                    case "0101111":
                        arr[i] = 6;
                        break;
                    case "0111011":
                        arr[i] = 7;
                        break;
                    case "0110111":
                        arr[i] = 8;
                        break;
                    case  "0001011":
                        arr[i] = 9;
                        break;
                }
            }

            int sum = ((arr[0]+arr[2]+arr[4]+arr[6])*3+arr[1]+arr[3]+arr[5])+arr[7];
            if(sum %10==0)
                Ans=arr[0]+arr[1]+arr[2]+arr[3]+arr[4]+arr[5]+arr[6]+arr[7];
            else
                Ans=0;

            System.out.println("#"+tc+" "+Ans);
        }
    }

}
