
import java.util.Scanner;

public class Soltuion_1933 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int i=1; i<=T; i++) {
			if(T % i == 0)
				System.out.print(i + " ");
		}
	}
}
