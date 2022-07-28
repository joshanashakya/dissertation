import java.util.*;
import java.io.*;

public class A1500 {
	public static int isValid(int[] x, int[] y) {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				if (x[i] == y[j]) {
					return x[i];
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int n = sc.nextInt();
		int[][][] cnt = new int[5000001][4][];
		int[] idx = new int[cnt.length];
		int[] arr = sc.nextIntArr(n);
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int sum = arr[i] + arr[j];
//				System.out.println(Arrays.deepToString(cnt));
				cnt[sum][idx[sum]++] = new int[] { i + 1, j + 1 };
				int size = idx[sum];
				int val = -1;
				for (int k = 0; k < size - 1; k++) {
					int[] cand1 = cnt[sum][size - 1];
					int[] cand2 = cnt[sum][k];
					val = isValid(cand1, cand2);
					if (val == -1) {
						pw.printf("YES%n%d %d %d %d%n", cand1[0], cand1[1], cand2[0], cand2[1]);
						pw.close();
						return;
					}
				}
				if (size == 4) {
					ArrayList<Integer> al = new ArrayList<Integer>();
					for (int k = 0; k < 4; k++) {
						al.add(val ^ cnt[sum][k][0] ^ cnt[sum][k][1]);
					}
					pw.printf("YES%n%d %d %d %d%n", al.get(0), al.get(1), al.get(2), al.get(3));
					pw.close();
					return;
				}
			}
		}
		pw.println("NO");
		pw.close();
	}

	static class Scanner {
		BufferedReader br;
		StringTokenizer st;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public Scanner(FileReader f) {
			br = new BufferedReader(f);
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public int[] nextIntArr(int n) throws IOException {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(next());
			}
			return arr;
		}

	}

}

