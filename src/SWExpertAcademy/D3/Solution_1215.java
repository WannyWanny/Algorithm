package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_1215 {
    static int n;
    static int Ans;
    static String str;
    static final int size = 8;
    static char[][] map;
    static boolean flag=false;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        for(int tc=1; tc<=10; tc++){
            Ans=0;
            n = sc.nextInt();
            map = new char[size][size];

            for(int r=0; r<size; r++){
                str = sc.next();
                for(int c=0; c<size; c++){
                    map[r][c] = str.charAt(c);
                }
            }

            for(int r=0; r<size; r++){
                for(int c=0; c<=size-n; c++){
                    for(int k=0; k<n/2; k++){
                        if(map[r][c+k] == map[r][c+(n-1-k)]){
                            flag=true;
                        }
                        else {
                            flag=false;
                            break;
                        }
                    }
                    if(flag){
                        Ans++;
                        flag=false;
                    }
                }
            }
            flag = false;
            for(int c=0; c<=size-n; c++){
                for(int r=0; r<size; r++){
                    for(int k=0; k<n/2; k++){
                        if(map[c+k][r] == map[c+(n-1-k)][r]){
                            flag=true;
                        }
                        else {
                            flag=false;
                            break;
                        }
                    }
                    if(flag){
                        Ans++;
                        flag = false;
                    }
                }
            }

            System.out.println("#"+tc+" "+Ans);
        }
    }
}
