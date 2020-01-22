package D1;

import java.util.Scanner;

public class Solution_2025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T  = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=T; i++)
		{
			sum += i;
		}
		System.out.println(sum);
	}

}
