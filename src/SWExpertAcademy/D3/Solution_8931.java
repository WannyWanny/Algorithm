package SWExpertAcademy.D3;

import java.util.Scanner;
import java.util.Stack;

public class Solution_8931 {
    static int T, k;
    static int Ans;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            k = sc.nextInt();
            Stack<Integer> st = new Stack<>();
            for(int j=0; j<k; j++){
                int num = sc.nextInt();
                if(num == 0){
                    st.pop();
                }
                else{
                    st.push(num);
                }
            }

            Ans=0;
            while (!st.isEmpty()){
                Ans += st.pop();
            }

            System.out.println("#"+tc+" "+Ans);
        }
    }
}
