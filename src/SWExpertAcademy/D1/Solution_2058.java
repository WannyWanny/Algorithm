package SWExpertAcademy.D1;

import java.util.Scanner;

public class Solution_2058 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum =  0;
		int num = sc.nextInt();
		while(num >= 10)
		{
			sum += num % 10;
			num /= 10;
		} //EOW
		sum += num;
		System.out.println(sum);
	}
}
