import java.util.*;

public class Test {

	static Scanner sc;
	static Map<Integer, Integer> dp;

	public static void main(String args[]) {
		sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0)
			solve();

	}

	public static void solve() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] nextMax = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int maxind = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] > arr[maxind])
				maxind = i;
			nextMax[i] = maxind;
		}

		ArrayList<Integer> al = new ArrayList<>();
		int i = n - 1;
		while (i >= 0) {
			maxind = nextMax[i];
			for (int j = maxind; j <= i; j++) {
				al.add(arr[j]);
			}
			i = maxind - 1;
		}

		for (i = 0; i < al.size(); i++) {
			System.out.print(al.get(i) + " ");
		}
	}

}
