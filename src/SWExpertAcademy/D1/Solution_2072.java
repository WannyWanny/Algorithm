package SWExpertAcademy.D1;

import java.util.Scanner;

public class Solution_2072 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case=1; test_case<=T; ++test_case)
		{
			int[] arr = new int[10];
			int sum  =  0;
			
			//10���� �� �Է¹ޱ�
			for(int i=0; i<10; i++)		
			{
				arr[i] = sc.nextInt();
			}
			
			//Ȧ���� �Ǻ��ؼ� ������
			for(int i=0; i<10; i++)
			{
				if(arr[i] % 2 != 0)
					sum += arr[i];
			}
			
			System.out.println("#"+test_case+" "+sum);
		} // end of test
	}
}
