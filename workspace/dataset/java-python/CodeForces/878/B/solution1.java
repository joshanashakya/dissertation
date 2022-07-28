import java.io.OutputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintWriter;import java.util.Arrays;import java.util.StringTokenizer;import java.io.IOException;import java.io.BufferedReader;import java.io.InputStreamReader;import java.io.InputStream; /** * Built using CHelper plug-in * Actual solution is at the top */public class Main {	public static void main(String[] args) {		InputStream inputStream = System.in;		OutputStream outputStream = System.out;		FastScanner in = new FastScanner(inputStream);		PrintWriter out = new PrintWriter(outputStream);		TaskB solver = new TaskB();		solver.solve(1, in, out);		out.close();	} 	static class TaskB {		public void solve(int testNumber, FastScanner in, PrintWriter out) {			int n = in.nextInt();			int k = in.nextInt();			int m = in.nextInt();			int[] stackVal = new int[n];			int[] stackLen = new int[n];			int ptr = 0;			for (int i = 0; i < n; i++) {				int x = in.nextInt();				if (ptr > 0 && x == stackVal[ptr - 1]) {					++stackLen[ptr - 1];				} else {					stackVal[ptr] = x;					stackLen[ptr] = 1;					++ptr;				}				while (ptr > 0 && stackLen[ptr - 1] >= k) {					stackLen[ptr - 1] %= k;					if (stackLen[ptr - 1] == 0) {						--ptr;					}				}			} 			stackVal = Arrays.copyOf(stackVal, ptr);			stackLen = Arrays.copyOf(stackLen, ptr);			n = 0;			for (int i = 0; i < ptr; i++) {				n += stackLen[i];			}			if (n == 0) {				out.println(0);				return;			} 			int j = -1;			int sumLeft = 0;			int sumRight = 0;			for (int i = 0; i < ptr / 2; i++) {				if (stackVal[i] == stackVal[ptr - i - 1] && stackLen[i] + stackLen[ptr - i - 1] == k) {					j = i;					sumLeft += stackLen[i];					sumRight += stackLen[ptr - i - 1];				} else {					break;				}			} 			long ans;			if (ptr % 2 == 1 && j + 1 == ptr / 2) {				long mid = (long) stackLen[j + 1] * m;				if (mid % k == 0) {					ans = (sumLeft + sumRight) % k;				} else {					ans = sumLeft + sumRight + (mid % k);				}				out.println(ans);				return;			} 			if (ptr % 2 == 0 && j == ptr / 2) {				ans = m % 2 == 0 ? 0 : n;				out.println(ans);				return;			} 			ans = (long) n * m;			ans -= (long) (sumLeft + sumRight) * (m - 1);			long last = stackLen[j + 1] + stackLen[ptr - 1 - (j + 1)];			if (stackVal[j + 1] == stackVal[ptr - 1 - (j + 1)]) {				ans += ((last % k) - last) * (m - 1);			}			out.println(ans);		} 	} 	static class FastScanner {		private BufferedReader in;		private StringTokenizer st; 		public FastScanner(InputStream stream) {			in = new BufferedReader(new InputStreamReader(stream));		} 		public String next() {			while (st == null || !st.hasMoreTokens()) {				try {					String rl = in.readLine();					if (rl == null) {						return null;					}					st = new StringTokenizer(rl);				} catch (IOException e) {					throw new RuntimeException(e);				}			}			return st.nextToken();		} 		public int nextInt() {			return Integer.parseInt(next());		} 	}} 