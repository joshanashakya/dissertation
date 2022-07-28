import java.util.*; import java.io.*; public class Main {		public static int mod = 1000000007;		public static void solve(InputReader in) {		int n = in.readInt();		int k = in.readInt();		char s[] = in.readString().toCharArray();		int lps[] = new int[n]; 		for(int i = 1; i<n; i++) {			int j = lps[i-1]; 			while(j > 0 && s[i] != s[j]) {				j = lps[j-1];			}			if(s[i] == s[j]) {				lps[i] = ++j;			}		}		int sub = n - lps[n-1];		for(int i = 0; i<k-1; i++) {			for(int j = 0; j<sub; j++) {				System.out.print(s[j]);			}		}		System.out.print(new String(s));	}	 	public static void main(String[] args) {		// jai shree krishna		InputReader in = new InputReader(System.in); 		int t = 1;		while (t-- > 0)			solve(in);	}}  class InputReader{	private InputStream stream;	private byte[] buf = new byte[1024];	private int curChar;	private int numChars;	private SpaceCharFilter filter; 	public InputReader(InputStream stream) {		this.stream = stream;	} 	public int read() {		if (numChars == -1)			throw new InputMismatchException();		if (curChar >= numChars) {			curChar = 0;			try {				numChars = stream.read(buf);			} catch (IOException e) {				throw new InputMismatchException();			}			if (numChars <= 0)				return -1;		}		return buf[curChar++];	} 	public int readInt() {		int c = read();		while (isSpaceChar(c))			c = read();		int sgn = 1;		if (c == '-') {			sgn = -1;			c = read();		}		int res = 0;		do {			if (c < '0' || c > '9')				throw new InputMismatchException();			res *= 10;			res += c - '0';			c = read();		} while (!isSpaceChar(c));		return res * sgn;	} 	public String readString() {		int c = read();		while (isSpaceChar(c))			c = read();		StringBuilder res = new StringBuilder();		do {			res.appendCodePoint(c);			c = read();		} while (!isSpaceChar(c));		return res.toString();	} 	public long readLong() {		int c = read();		while (isSpaceChar(c)) {			c = read();		}		int sgn = 1;		if (c == '-') {			sgn = -1;			c = read();		}		long res = 0;		do {			if (c < '0' || c > '9') {				throw new InputMismatchException();			}			res *= 10;			res += c - '0';			c = read();		} while (!isSpaceChar(c));		return res * sgn;	}		public boolean isSpaceChar(int c) {		if (filter != null)			return filter.isSpaceChar(c);		return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;	}     	public String next() {		return readString();	}        public interface SpaceCharFilter {		public boolean isSpaceChar(int ch);	}}   class pair implements Comparable<pair> {	long first;	long second; 	pair(long a, long b) {		this.first = a;		this.second = b;	} 	public long getFirst() {		return first;	} 	public long getSecond() {		return second;	} 	public String toString() {		return first + " " + second;	} 	public boolean equals(Object o) {		return o instanceof pair && ((pair) o).first == first && ((pair) o).second == second;	} 	public int compareTo(pair a) {		return Long.compare(first, a.first);	} 	public int hashCode() {		return (31 * (int) first + (int) second);	}}
