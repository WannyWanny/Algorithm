

import java.util.Scanner;
public class Main_7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dungchi = new int[n][2];
        int rank[] = new int[n];

        for(int i=0; i<n; i++)
        {
            rank[i] = 1;
            dungchi[i][0] = sc.nextInt();
            dungchi[i][1] = sc.nextInt();
        }

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(dungchi[i][0] > dungchi[j][0] && dungchi[i][1] > dungchi[j][1])
                    rank[j]++;
            }
        }

        for(int i=0; i<n; i++)
            System.out.println(rank[i]+" ");
    }
}
