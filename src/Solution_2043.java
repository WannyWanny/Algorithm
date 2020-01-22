import java.util.Scanner;

public class Solution_2043 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int k = sc.nextInt();
		int ans = 0;
		
		if(p >= k )
			ans = p-k+1;
		System.out.println(ans);
	}

}
