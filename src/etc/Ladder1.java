import java.util.Scanner;

public class Ladder1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] ladder = new int[102][102];
		int y=0, x=0;

		for (int test_case = 1; test_case <= 10; test_case++) {
			sc.nextInt();
			for (int i = 1; i <= 100; i++) {
				for (int j = 1; j <= 100; j++) {
					ladder[i][j] = sc.nextInt();
					if (ladder[i][j] == 2) { y = i; x = j; }
				}
			}

			while (y > 0) {
				if (ladder[y][x+1] == 1) {
					for (; x < 101; x++) {
						if (ladder[y][x+1] == 0) { y--; break; }
					}
				}
				else if (ladder[y][x-1] == 1) {
					for (; x >= 0; x--) {
						if (ladder[y][x-1] == 0) { y--; break; }
					}
				}
				else {
					for (; y >= 0; y--) {
						if (ladder[y][x+1] == 1) break;
						if (ladder[y][x-1] == 1) break;
					}
				}
			}

			System.out.println("#"+test_case+" "+(x-1));
		}
	}

}


