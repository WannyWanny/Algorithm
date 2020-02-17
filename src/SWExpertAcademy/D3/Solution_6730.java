package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_6730 {
    static int T, N;
    static int[] arr;
    static int maxUp, maxDown;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            N = sc.nextInt();
            arr = new int[N];

            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }

            maxUp=0; maxDown=0;
            for(int i=0; i<arr.length-1; i++){
                if(arr[i] < arr[i+1]){
                    if(arr[i+1]-arr[i] > maxUp) maxUp = arr[i+1]-arr[i];
                }
                else if(arr[i] > arr[i+1]){
                    if(arr[i]-arr[i+1] > maxDown) maxDown = arr[i]-arr[i+1];
                }
                else
                    continue;
            }

            System.out.println("#"+tc+" "+maxUp+" "+maxDown);
        }
    }
}
