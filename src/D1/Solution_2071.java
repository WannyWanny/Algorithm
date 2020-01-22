package D1;

import java.util.Scanner;

public class Solution_2071 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case=1; test_case<=T; ++test_case)
		{
			double avg = 0;
			int sum = 0;
			int[] arr = new int[10];
			for(int i=0; i<10; i++)
			{
				arr[i] = sc.nextInt();
			}
			
			for(int i=0; i<10; i++)
			{
				sum += arr[i];
				avg = sum/10.0;
			}
			
			System.out.println("#"+test_case+" "+Math.round(avg));
		} // end of test
	}
}
