import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		while (t --> 0) {
			int n = in.nextInt();
			int k = in.nextInt();
			
			System.out.println(n - k + k / 2);
			
			for (int q = (k + 1) / 2; q < k; q++) System.out.printf("%d ", q);
			for (int q = k + 1; q <= n; q++) System.out.printf("%d ", q);
			System.out.println();
		}
		
		in.close();
	}
}

