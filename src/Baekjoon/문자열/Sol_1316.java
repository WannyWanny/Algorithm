package 문자열;

import java.util.Scanner;

public class Sol_1316 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int[] st = new int[100];
        int tg = 0; //프래그와 같은 기능
        int cnt=0; //그룹 단어의 갯수를 찾는 변수
        for(int i =0; i<a; i++) {
            String b = sc.nextLine();

            for(int j=0; j<b.length(); j++) {
                st[j]= b.charAt(j);

            }
            for(int j=0; j<b.length(); j++) {
                for(int x=j+2; x<b.length(); x++) { //2칸 띄어져 있는 단어들을 찾기위한 변수x
                    if(st[j]==st[x-1]) { //이웃에 같은 값이 없는 것 중에서 찾아야 하기때문에 씀

                    }else {
                        if(st[j]==st[x]) { //같은 값 찾으면 tg=1
                            tg=1;
                        }
                    }
                }
            }
            if(tg==0) {
                cnt++;
            }
            tg=0;
        }
        System.out.println(cnt);
    }
}