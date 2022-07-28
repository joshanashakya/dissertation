import java.util.*;

public class Test {
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		int t = Integer.parseInt(sc.next());

		while (t-- > 0) {

			solve();
		}

	}

	public static void solve() {

		int n = sc.nextInt();
		int[] a = new int[n + 1];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int[] drench = new int[n];
		int cream = 0;

		for (int i = n - 1; i >= 0; i--) {
			cream = Math.max(cream, a[i]);
			if (cream > 0) {
				cream--;
				drench[i] = 1;
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(drench[i] + " ");
		}

	}

}
