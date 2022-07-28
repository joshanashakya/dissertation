import java.io.*;import java.util.*; public class D implements Runnable {	public static void main (String[] args) {new Thread(null, new D(), "_cf", 1 << 28).start();} 	int[][] pascals;	int MOD = (int)1e9 + 7;	int n;	long m;	int[][] dp;	long[][] pc;		public void run() {		FastScanner fs = new FastScanner();		PrintWriter out = new PrintWriter(System.out);		System.err.println("Go!"); 		pascals = new int[101][];		for(int i = 0; i < pascals.length; i++) {			pascals[i] = new int[i + 1];			pascals[i][0] = 1;			for(int j = 1; j < pascals[i].length; j++) {				pascals[i][j] += pascals[i-1][j-1]; pascals[i][j] %= MOD;				if(j < pascals[i-1].length) pascals[i][j] += pascals[i-1][j];				pascals[i][j] %= MOD;			}		}				n = fs.nextInt();		m = fs.nextLong();		pc = new long[101][101]; 		for(int i = 0; i < n; i++) {			for(int j = 0; j <= n; j++) {				long ways = pascals[n][j];				long appear = 1;				long use1 = (m-n)/n, use2 = (m-n)%n;				appear += use1; if(i < use2) appear++;								//				appear %= MOD;				ways = pow(ways, appear);				pc[i][j] = ways;			}		}				int k = fs.nextInt();		dp = new int[n][k + 1];		for(int[] d : dp) Arrays.fill(d, -1);		out.println(solve(0, k));				out.close();	}		int solve(int row, int k) {		if(row == n) {			if(k > 0) return 0;			return 1;		}		if(dp[row][k] != -1) return dp[row][k];		long res = 0;		for(int place = 0; place <= Math.min(n, k); place++) {			long add = pc[row][place] * solve(row+1, k-place) % MOD;			res = (res+add)%MOD;		}		return dp[row][k] = (int)res;	} 	long pow(long a, long b) {		if(b == 0) return 1;		if(b == 1) return a;		if(b % 2 == 1) return a * pow(a, b-1) % MOD;		long r = pow(a, b/2);		return r*r % MOD;	}		class FastScanner {		public int BS = 1<<16;		public char NC = (char)0;		byte[] buf = new byte[BS];		int bId = 0, size = 0;		char c = NC;		double num = 1;		BufferedInputStream in; 		public FastScanner() {			in = new BufferedInputStream(System.in, BS);		} 		public FastScanner(String s) throws FileNotFoundException {			in = new BufferedInputStream(new FileInputStream(new File(s)), BS);		} 		public char nextChar(){			while(bId==size) {				try {					size = in.read(buf);				}catch(Exception e) {					return NC;				}                				if(size==-1)return NC;				bId=0;			}			return (char)buf[bId++];		} 		public int nextInt() {			return (int)nextLong();		} 		public long nextLong() {			num=1;			boolean neg = false;			if(c==NC)c=nextChar();			for(;(c<'0' || c>'9'); c = nextChar()) {				if(c=='-')neg=true;			}			long res = 0;			for(; c>='0' && c <='9'; c=nextChar()) {				res = (res<<3)+(res<<1)+c-'0';				num*=10;			}			return neg?-res:res;		} 		public double nextDouble() {			double cur = nextLong();			return c!='.' ? cur:cur+nextLong()/num;		} 		public String next() {			StringBuilder res = new StringBuilder();			while(c<=32)c=nextChar();			while(c>32) {				res.append(c);				c=nextChar();			}			return res.toString();		} 		public String nextLine() {			StringBuilder res = new StringBuilder();			while(c<=32)c=nextChar();			while(c!='\n') {				res.append(c);				c=nextChar();			}			return res.toString();		} 		public boolean hasNext() {			if(c>32)return true;			while(true) {				c=nextChar();				if(c==NC)return false;				else if(c>32)return true;			}		} 		public int[] nextIntArray(int n) {			int[] res = new int[n];			for(int i = 0; i < n; i++) res[i] = nextInt();			return res;		} 	}  }