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
		int[] b = new int[n + 1];

		int[] extra = new int[n + 1];

		long curr_time = 0;

		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}

		for (int i = 1; i <= n; i++) {
			extra[i] = sc.nextInt();
		}

		int i = 0;
		for (i = 1; i < n; i++) {
			curr_time += (a[i] - b[i - 1] + extra[i]);

			int staying = (int) Math.ceil((b[i] - a[i]) / 2.0);

			curr_time += staying;
			if (curr_time < b[i])
				curr_time = b[i];
		}
		curr_time += (a[i] - b[i - 1] + extra[i]);

		System.out.println(curr_time);
	}

}
