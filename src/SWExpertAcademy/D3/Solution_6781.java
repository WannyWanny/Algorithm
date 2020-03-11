package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_6781 {
    static int[] nums=new int[9];
    static int[] tmpNums = new int[9];
    static char[] colors = new char[9];
    static char[] tmpCol = new char[9];
    static int[] res = new int[9];
    static boolean isDone;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T =sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            String str1 = sc.next();
            String str2 = sc.next();
            isDone = false;
            visited = new boolean[9];
            for(int i=0; i<9; i++){
                nums[i] = str1.charAt(i)-'0';
                colors[i] = str2.charAt(i);
            }

            Perm(0);

            if(isDone)
                System.out.println("#"+tc+" Win");
            else
                System.out.println("#"+tc+" Continue");
        }
    }

    private static void Perm(int idx){
        if(isDone) return;
        if(idx==nums.length){
            playGame();
            return;
        }

        for(int i=0; i<nums.length; i++){
            if(!visited[i]){
                res[idx] = i;
                visited[i] = true;
                Perm(idx+1);
                visited[i] = false;
            }
        }
    }

    private static void playGame(){
        for(int i=0; i<nums.length; i++){
            tmpNums[i] = nums[res[i]];
            tmpCol[i] = colors[res[i]];
        }
        int setCnt=0;
        for(int i=0; i<=6; i+=3){
            //색 판별
            if(tmpCol[i] == tmpCol[i+1] && tmpCol[i+1] == tmpCol[i+2]
                    && tmpCol[i] == tmpCol[i+2]){
                //숫자가 같으면 세트
                if(tmpNums[i] == tmpNums[i+1] && tmpNums[i+1] == tmpNums[i+2]
                    && tmpNums[i] == tmpNums[i+2]){
                    setCnt++;
                }
                //숫자가 연속되면 세트
                else if(tmpNums[i+1]*2 == (tmpNums[i]+tmpNums[i+2])){
                    setCnt++;
                }
            }
            else{
                break;
            }
        }

        if(setCnt==3){
            isDone = true;
        }
    }
}
