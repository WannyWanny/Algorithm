package SWExpertAcademy.D4;

import java.util.Scanner;
import java.util.Stack;

public class Solution_1218 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int tc=1; tc<=10; tc++){
            int len = sc.nextInt();
            int flag = 1;
            String[] bracket = sc.next().split("");

            Stack st = new Stack();

            for(int i=0; i<len; i++){
                if(bracket[i].equals("(") || bracket[i].equals("{") || bracket[i].equals("<") || bracket[i].equals("["))
                    st.add(bracket[i]);
                else if(st.peek().equals("(") && bracket[i].equals(")")){
                    st.pop();
                }
                else if(st.peek().equals("{") && bracket[i].equals("}")){
                    st.pop();
                }
                else if(st.peek().equals("<") && bracket[i].equals(">")){
                    st.pop();
                }
                else if(st.peek().equals("[") && bracket[i].equals("]")){
                    st.pop();
                }
                else{
                    System.out.println("#"+tc+" "+flag);
                    break;
                }
            }

            if(st.isEmpty()){
                System.out.println("#"+tc+" "+flag);
            }
        }
    }
}
