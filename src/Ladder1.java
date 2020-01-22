import java.util.Scanner;

public class Ladder1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
	
		for(int test_case = 1; test_case <= T; test_case++) {
			int[][] input = new int[100][100];
			int a = sc.nextInt();
			int x=0;						//출구의 위치를 받을 좌표값
			
			//초기 배열값 할당
			for(int i=0; i<100; i++)					
			{
				for(int j=0; j<100; j++) 
				{
					input[i][j] = sc.nextInt();
				}
			}
			
			//출구의 위치를 찾아보자. y좌표는 99이다.
			for(int i=0; i<100; i++)
			{
					if(input[i][99] == 2)
					{
						x = i; 
					}
			}
			
			
			
		}

	}
	static int goUp(int[][] arr, int x, int y) {
		if(arr[x][y-1] == 1)
		{
			goUp(arr, x, y-1);
		}
		return y;
	}

}
