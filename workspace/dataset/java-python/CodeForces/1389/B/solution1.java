
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.InputMismatchException;

public class Main {

	public Main() throws FileNotFoundException {

		File file = Paths.get("input.txt").toFile();
		if (file.exists()) {
			System.setIn(new FileInputStream(file));
		}
		long t = System.currentTimeMillis();

		InputReader reader = new InputReader();

		int ttt = reader.nextInt();

		for (int tt = 0; tt < ttt; tt++) {

			int n = reader.nextInt();
			int k = reader.nextInt();
			int z = reader.nextInt();

			long[] a = new long[n];

			for (int i = 0; i < n; i++) {
				a[i] = reader.nextLong();
			}

			long max = 0;
			long sum = 0;

			long[] ss = new long[n + 1];
			ss[n-1] = a[n - 1];
			for (int i = n - 2; i >= 0; i--) {
				ss[i] = ss[i+1] + a[i];
			}

			k++;
			if (z == 0) {

				for (int i = 0; i < Math.min(k, n); i++) {
					sum += a[i];
				}
				max = Math.max(max, sum);
			} else {
				sum = a[0];
				int kk = k - 1;
				for (int i = 1; i < n; i++) {

					if(kk==0) {
						break;
					}
					sum += a[i];
					
					kk--;

					int kkk = kk;
					long sumsum = sum;
					for (int j = 0; j < z; j++) {
						if (kkk > 0) {
							sumsum += a[i - 1];
						} else {
							break;
						}
						kkk--;
						if (kkk > 0) {
							sumsum += a[i];
						} else {
							break;
						}
						kkk--;
					}
					if (kkk > 0) {
						sumsum += (ss[i + 1] - ss[i + 1 + kkk]);
					}

					//System.out.println(i+":"+sumsum);
					max = Math.max(max, sumsum);

				}
				max = Math.max(max, sum);
			}

			System.out.println(max);

		}

	}

	static class InputReader {
		private byte[] buf = new byte[16384];
		private int curChar;
		private int numChars;

		public int read() {
			if (numChars == -1)
				throw new InputMismatchException();
			if (curChar >= numChars) {
				curChar = 0;
				try {
					numChars = System.in.read(buf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (numChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}

		public String nextLine() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndOfLine(c));
			return res.toString();
		}

		public String nextString() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		public long nextLong() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}

		public int nextInt() {
			int c = read();
			while (isSpaceChar(c))
				c = read();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return res * sgn;
		}

		public int[] nextIntArray(int n) {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = nextInt();
			}
			return arr;
		}

		public long[] nextLongArray(int n) {
			long[] arr = new long[n];
			for (int i = 0; i < n; i++) {
				arr[i] = nextLong();
			}
			return arr;
		}

		private boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		private boolean isEndOfLine(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}

	}

	public static void main(String[] args) throws FileNotFoundException {
		new Main();
	}

}

