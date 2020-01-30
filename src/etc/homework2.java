package etc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class homework2 {
    static int[] dr={0, 0, -1, 1};      //우좌상하
    static int[] dc={1, -1, 0, 0};
    static int ans;
  public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("Solution31.txt"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++){
            int N = sc.nextInt();
            char[][] map = new char[N][N];
            ans=0;
            for(int r=0; r<N; r++){
                for(int c=0; c<N; c++){
                    map[r][c] = sc.next().charAt(0);
                }
            }

            for(int r=0; r<N; r++){
                for(int c=0; c<N; c++){

                    //A는 우로만 이동
                    if(map[r][c]=='A'){
                        int nr = r+dr[0];
                        int nc = c+dc[0];
                        if(nc>=0 && nc<N && nr >=0 && nr<N){
                            for(;nc<N; nc++) {
                                if (map[nr][nc] == 'S') {
                                    ans++;
                                }
                                else
                                    break;
                            }
                        }
                    }

                    //B는 좌우이동
                    else if(map[r][c]=='B'){
                        for(int k=0; k<2; k++){
                            int nc = c+dc[k];
                            int nr = r+dr[k];
                            if(nc>=0 && nc<N && nr >=0 && nr<N){
                                if(k==0) {
                                    for (; nc < N; nc++) {
                                        if (map[nr][nc] == 'S') {
                                            ans++;
                                        } else {
                                            nc = c;
                                            nr = r;
                                            break;
                                        }
                                    }
                                }
                                else if(k==1){
                                    for (; nc >= 0; nc--) {
                                        if (map[nr][nc] == 'S') {
                                            ans++;
                                        } else {
                                            nc = c;
                                            nr = r;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }

                    //C는 상하좌우 전부 이동한다.
                    else if(map[r][c]=='C'){
                        for(int k=0; k<4; k++){
                            int nc = c+dc[k];
                            int nr = r+dr[k];
                            if(nc>=0 && nc<N && nr >=0 && nr<N){
                                if(k==0){
                                    for(;nc<N; nc++) {
                                        if (map[nr][nc] == 'S') {
                                            ans++;
                                        }
                                        else {
                                            nc = c;
                                            nr = r;
                                            break;
                                        }
                                    }
                                }
                                else if(k==1){
                                    for(;nc>=0; nc--) {
                                        if (map[nr][nc] == 'S') {
                                            ans++;
                                        }
                                        else {
                                            nc = c;
                                            nr = r;
                                            break;
                                        }
                                    }
                                }
                                else if(k==2){
                                    for(;nr>=0; nr--) {
                                        if (map[nr][nc] == 'S') {
                                            ans++;
                                        }
                                        else {
                                            nc = c;
                                            nr = r;
                                            break;
                                        }
                                    }
                                }
                                else if(k==3){
                                    for(;nr<N; nr++) {
                                        if (map[nr][nc] == 'S') {
                                            ans++;
                                        }
                                        else {
                                            nc = c;
                                            nr = r;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }

                }
            }

           System.out.println("#"+tc+" "+ans);
        }//end of test
    }
}
