package D1;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_2063 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr = new int[T];
		for(int i=0; i<T; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int min = arr[arr.length/2];
		
		System.out.println(min);
	}
}
