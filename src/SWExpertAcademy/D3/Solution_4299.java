package SWExpertAcademy.D3;

import java.util.Scanner;

public class Solution_4299 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int d=sc.nextInt();
            int h=sc.nextInt();
            int m=sc.nextInt();
            int sum=0;
            int _d, _h=0, _m=0;

            _d = d-11;

            if(h>=11){
                _h = h-11;
            }else{
                if(_d>0){
                    _d--;
                    _h = 24+h-11;
                }
                else{
                    System.out.println("#"+tc+" "+(-1));
                    return;
                }
            }

            if(m>=11){
                _m = m-11;
            }else{
                if(_h>0){
                    _h--;
                    _m = 60+m-11;
                }else{
                    System.out.println("#"+tc+" "+(-1));
                    return;
                }
            }

            sum = _m + (_h*60) + (_d*60*24);
            System.out.println("#"+tc+" "+sum);
        }
    }
}
