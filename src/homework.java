package ssafy_Chap02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class homework {
	static int T;
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("항공기지 건설 input.txt"));
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();		//배열의 크기
			int k = sc.nextInt();		//고도
			int maxSize =0;				//사각형의 최댓값
			int[][] map = new int[N][N];		//배열 생성
			
			//배열에 값 할당
			for(int r=0; r<N; r++) {
				for(int c=0; c<N; c++) {
					map[r][c] = sc.nextInt();
				}
			}
			
			int wCnt=1;		//직사각형의 폭
			int hCnt=1;		//직사각형의 넓이
			//일단 배열을 2중for문으로 순회해보자
			//고도값 판별은 오른쪽과 아래만 하자
			for(int r=0; r<N-1; r++) {
				for(int c=0; c<N-1; c++) {
					
				}	
			}		
			System.out.println(maxSize);
		}//end of test
		
	}
}


/*
[결과]
6
7 7 4 0 0 
3 6 6 7 1 
7 0 5 5 7 
4 8 3 2 4 
6 0 6 8 1 
 * */