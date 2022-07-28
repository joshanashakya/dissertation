import java.io.File;import java.io.FileInputStream;import java.io.IOException;import java.io.InputStream;import java.io.PrintStream;import java.io.BufferedOutputStream;import java.io.PrintWriter;import java.util.InputMismatchException; public class Main { 	public static void main(String[] args) {		if (args.length > 0 && args[0].toLowerCase().equals("local")) {			try {				System.setIn(new FileInputStream("input.txt"));				System.setOut(new PrintStream(new File("output.txt")));			} catch (IOException exc) {			}		}		Task task = new Task();		task.solve();	} 	public static class Task {		static final long MOD = (long) 1e9 + 7;		static final PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out)); 		public void solve() {			try {				Scan sc = new Scan();				long n = sc.scanLong();				long mx_a = n / 1234567;				long mx_b = n / 123456;				for (long i = 0; i <= mx_a; ++i) {					if (i * 1234567 > n) {						break;					}					for (long j = 0; j <= mx_b; ++j) {						if (j * 123456 > n)							break;						long rest = n - (i * 1234567 + j * 123456);						if (rest < 0)							break;						if (rest >= 0 && rest % 1234 == 0) {							out.println("YES");							return;						}					}				}				out.println("NO");			} finally {				out.close();			}		} 		private void debug(Object... x) {			StringBuilder sb = new StringBuilder();			for (Object o : x)				sb.append(String.valueOf(o)).append(" ");			out.println(sb);		}	} 	public static class Scan {		private byte[] buf = new byte[1024];		private int index;		private InputStream in;		private int total; 		public Scan() {			in = System.in;		} 		public int scan() {			if (total < 0)				throw new InputMismatchException();			if (index >= total) {				index = 0;				try {					total = in.read(buf);				} catch (IOException e) {					throw new RuntimeException(e);				}				if (total <= 0)					return -1;			}			return buf[index++];		} 		public long scanLong() {			long integer = 0;			int n = scan();			while (isWhiteSpace(n))				n = scan();			int neg = 1;			if (n == '-') {				neg = -1;				n = scan();			}			while (!isWhiteSpace(n)) {				if (n >= '0' && n <= '9') {					integer *= 10;					integer += n - '0';					n = scan();				} else					throw new InputMismatchException();			}			return neg * integer;		} 		public double scanDouble() {			double doub = 0;			int n = scan();			while (isWhiteSpace(n))				n = scan();			int neg = 1;			if (n == '-') {				neg = -1;				n = scan();			}			while (!isWhiteSpace(n) && n != '.') {				if (n >= '0' && n <= '9') {					doub *= 10;					doub += n - '0';					n = scan();				} else					throw new InputMismatchException();			}			if (n == '.') {				n = scan();				double temp = 1;				while (!isWhiteSpace(n)) {					if (n >= '0' && n <= '9') {						temp /= 10;						doub += (n - '0') * temp;						n = scan();					} else						throw new InputMismatchException();				}			}			return doub * neg;		} 		public String scanString() {			StringBuilder sb = new StringBuilder();			int n = scan();			while (isWhiteSpace(n))				n = scan();			while (!isWhiteSpace(n)) {				sb.append((char) n);				n = scan();			}			return sb.toString();		} 		public char scanChar() {			int n = scan();			while (isWhiteSpace(n))				n = scan();			return (char) n;		} 		private boolean isWhiteSpace(int n) {			if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1)				return true;			return false;		}	}}
