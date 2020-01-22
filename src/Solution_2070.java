import java.util.Scanner;

public class Solution_2070 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case=1; test_case<=T; test_case++) {
			char ch;
			int x = sc.nextInt(); int y = sc.nextInt();
			
			if(x < y)
				ch = '<';
			else if(x == y)
				ch = '=';
			else
				ch = '>';
			
			System.out.println("#"+test_case+" "+ch);
		}

	}

}
