package D1;

import java.util.Scanner;

public class Solution_2068 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; ++test_case) {
			int max = 0;
			int[] arr = new int[10];

			for (int i = 0; i < 10; i++) {
				arr[i] = sc.nextInt();
			}

			for (int i = 0; i < 10; i++) {
				if (max < arr[i]) max = arr[i];
			}

			System.out.println("#" + test_case + " " + max);
		}
	}
}
