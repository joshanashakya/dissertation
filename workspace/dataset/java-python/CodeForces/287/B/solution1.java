import java.io.File;import java.io.FileInputStream;import java.io.FileNotFoundException;import java.io.IOException;import java.nio.file.Paths;import java.util.InputMismatchException; public class Main { 	public Main() throws FileNotFoundException { //		File file = Paths.get("input.txt").toFile();//		if (file.exists()) {//			System.setIn(new FileInputStream(file));//		}		long t = System.currentTimeMillis(); 		InputReader reader = new InputReader(); 		long n = reader.nextLong();		long k = reader.nextLong(); 		long max = ((k + 1) * k) / 2;		if (n == 1) {			System.out.println(0);		} else if (n > max - k + 1) {			System.out.println("-1");		} else { 			long s = 1;			long e = k; 			while (s < e) { 				long mid = s + (e - s) / 2; 				long diff = k - mid;				if (diff == 1) {					diff = 0;				}				// System.out.println(s + ":" + e + ":" + mid + ":" + diff);				long val = max - mid * (mid + 1) / 2 - diff; 				if (n == val) {					if (diff == 0) {						System.out.println(1);					} else {						if (mid == 1) {							System.out.println(diff - 1);						} else {							System.out.println(diff);						}					}					return;				}				if (n > val) {					e = mid;				} else					s = mid + 1;			}			long val = max - s * (s + 1) / 2 - (k - s);			if (val == n - 1) {				System.out.println(k - s);			} else {				System.out.println(k - s + 1);			}		} 	} 	static class InputReader {		private byte[] buf = new byte[16384];		private int curChar;		private int numChars; 		public int read() {			if (numChars == -1)				throw new InputMismatchException();			if (curChar >= numChars) {				curChar = 0;				try {					numChars = System.in.read(buf);				} catch (IOException e) {					throw new InputMismatchException();				}				if (numChars <= 0)					return -1;			}			return buf[curChar++];		} 		public String nextLine() {			int c = read();			while (isSpaceChar(c))				c = read();			StringBuilder res = new StringBuilder();			do {				res.appendCodePoint(c);				c = read();			} while (!isEndOfLine(c));			return res.toString();		} 		public String nextString() {			int c = read();			while (isSpaceChar(c))				c = read();			StringBuilder res = new StringBuilder();			do {				res.appendCodePoint(c);				c = read();			} while (!isSpaceChar(c));			return res.toString();		} 		public long nextLong() {			int c = read();			while (isSpaceChar(c))				c = read();			int sgn = 1;			if (c == '-') {				sgn = -1;				c = read();			}			long res = 0;			do {				if (c < '0' || c > '9')					throw new InputMismatchException();				res *= 10;				res += c - '0';				c = read();			} while (!isSpaceChar(c));			return res * sgn;		} 		public int nextInt() {			int c = read();			while (isSpaceChar(c))				c = read();			int sgn = 1;			if (c == '-') {				sgn = -1;				c = read();			}			int res = 0;			do {				if (c < '0' || c > '9')					throw new InputMismatchException();				res *= 10;				res += c - '0';				c = read();			} while (!isSpaceChar(c));			return res * sgn;		} 		public int[] nextIntArray(int n) {			int[] arr = new int[n];			for (int i = 0; i < n; i++) {				arr[i] = nextInt();			}			return arr;		} 		public long[] nextLongArray(int n) {			long[] arr = new long[n];			for (int i = 0; i < n; i++) {				arr[i] = nextLong();			}			return arr;		} 		private boolean isSpaceChar(int c) {			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;		} 		private boolean isEndOfLine(int c) {			return c == '\n' || c == '\r' || c == -1;		} 	} 	public static void main(String[] args) throws FileNotFoundException {		new Main();	} }