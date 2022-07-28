import java.util.Scanner;

public class FootBall {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		checkSituation(str);
		sc.close();
	}

	private static void checkSituation(String str) {
		if (str.contains("0000000") || str.contains("1111111")) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
