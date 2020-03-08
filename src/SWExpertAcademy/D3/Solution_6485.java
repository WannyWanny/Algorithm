package SWExpertAcademy.D3;
import java.util.Arrays;
import java.util.Scanner;

public class Solution_6485 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int N = sc.nextInt();
            int[] a = new int[N];
            int[] b = new int[N];
            for(int i=0; i<N; i++){
                a[i] = sc.nextInt();
                b[i] = sc.nextInt();
            }

            int p = sc.nextInt();
            int[] c = new int[p];
            for(int i=0; i<p; i++){
                c[i] = sc.nextInt();
            }

            int[] bus = new int[5001];
            for(int i=0; i<N; i++){
                for(int j=a[i]; j<=b[i]; j++){
                    bus[j]++;
                }
            }

            System.out.print("#"+tc+" ");
            for(int i=0; i<p; i++){
                System.out.print(bus[c[i]]+" ");
            }
            System.out.println();

        }
    }
}
