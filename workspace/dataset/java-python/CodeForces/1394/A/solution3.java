
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		InputReader in = new InputReader(new BufferedInputStream(System.in));
		PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
		TaskB solver = new TaskB();
//		long t1 = System.currentTimeMillis();
		solver.solve(1, in, out);
		out.flush();
//		long t2 = System.currentTimeMillis();
//		System.err.println(t2 - t1);
		out.close();

	}
}

class Pos implements Comparable<Pos> {
	int x;
	int y;
	long val;

	public Pos(int x, int y, long val) {
		this.x = x;
		this.y = y;
		this.val = val;
	}

	public int compareTo(Pos p) {
		if (val == p.val) {
			if (x == p.x)
				return Integer.compare(y, p.y);
			return Integer.compare(x, p.x);
		}
		return Long.compare(val, p.val);
	}

}

class Pair implements Comparable<Pair> {
	int fir;
	int sec;

	Pair(int fir, int sec) {
		this.fir = fir;
		this.sec = sec;
	}

	public int compareTo(Pair p) {
		return Integer.compare(sec, p.sec);
	}
}

class TaskB {

	int INF = (int) 1e9;
	int id[];
	int sz[];
	int tree[];

	void solve(int testNumber, InputReader in, PrintWriter pw) {
		int n = in.nextInt();
		int d = in.nextInt();
		int m = in.nextInt();
		int a[] = new int[n];
		int cnt = 0;
		for (int i = 0; i < n; ++i) {
			a[i] = in.nextInt();
			if (a[i] <= m) {
				cnt++;
			}
		}
		Arrays.sort(a);
//		System.err.println(Arrays.toString(a));
		long pref[] = new long[n];
		long sum = 0;
		for (int i = 0; i < n; ++i) {
			sum += a[i];
			pref[i] = sum;
		}
		int cnt2 = n - cnt;
//		System.err.println(cnt + " " + m + " " + cnt2);
		long max = ((cnt - 1 >= 0) ? pref[cnt - 1] : 0) + ((cnt2 > 0) ? a[n - 1] : 0);
		long cur = ((cnt - 1 >= 0) ? pref[cnt - 1] : 0) + ((cnt2 > 0) ? a[n - 1] : 0);
//		System.err.println(pref[cnt - 1] + a[n - 1]);
		for (int i = 1; i < cnt2; ++i) {
//			System.err.println(a[n - 1 - i]);
			cur += a[n - 1 - i];
			int sz = (i) * d - (cnt2 - (i + 1));
			if (sz > cnt)
				break;
			else {
				long tmp = cur - ((sz - 1 >= 0) ? pref[sz - 1] : 0);
				max = Math.max(max, tmp);
//				System.err.println(tmp + " " + sz + " " + max);
			}
		}
		pw.println(max);

	}

	int find(int x) {
		int p = x;
		if (p == id.length)
			return p;
		while (id[p] != p) {
			p = id[p];
		}
		while (id[x] != x) {
			int tmp = id[x];

			id[x] = p;
			x = tmp;
		}
		return p;

	}

	void union(int x, int y) {
		int u = find(x);
		int v = find(y);
		if (u == v)
			return;
		id[v] = u;
		sz[u] += sz[v];
	}

	long gcd(long a, long b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
}

class InputReader {
	BufferedReader br;
	StringTokenizer st;

	public InputReader(InputStream in) {
		br = new BufferedReader(new InputStreamReader(in));
		st = null;
	}

	public String next() {
		while (st == null || !st.hasMoreTokens()) {
			try {
				st = new StringTokenizer(br.readLine());
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		return st.nextToken();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
