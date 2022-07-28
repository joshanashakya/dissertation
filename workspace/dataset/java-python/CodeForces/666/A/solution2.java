import java.io.BufferedReader;import java.io.File;import java.io.FileNotFoundException;import java.io.FileReader;import java.io.IOException;import java.io.InputStream;import java.io.InputStreamReader;import java.io.OutputStream;import java.io.PrintWriter;import java.util.StringTokenizer;import java.util.TreeSet;  public class Main { 	static class Task {				int NN = 200005;		int MOD = 1000000007;;		int INF = 2000000000;		long INFINITY = 2000000000000000000L;				String s;int n ;				public void solve(InputReader in, PrintWriter out) {			s = in.next();			n = s.length();			dp = new int[n + 5][5];			for(int i=0;i<n+5;++i) {				for(int j=0;j<5;++j)					dp[i][j] = -1;			}			for(int i=5;i<n;++i)				rec(i, -1);			TreeSet<String> Q = new TreeSet<>();			for(int i=5;i<n;++i) {				if(i + 2 <= n && dp[i+2][2] == 1) {					String temp = "";					temp += s.charAt(i);					temp += s.charAt(i + 1);					Q.add(temp);				}				if(i + 3 <= n && dp[i+3][3] == 1) {					String temp = "";					temp += s.charAt(i);					temp += s.charAt(i + 1);					temp += s.charAt(i + 2);					Q.add(temp);				}			}			out.println(Q.size());			for(String str: Q) {				out.println(str);			}		}				int [][] dp;				int rec(int it, int prev) {			if(prev == -1) {				int val = rec(it + 2, 2) + rec(it + 3, 3);				return val > 0 ? 1 : 0;			}			if(dp[it][prev] != -1)				return dp[it][prev];			if(it == n)				return dp[it][prev] = 1;			if(it >= n - 1)				return dp[it][prev] = 0;			boolean matched = true;			if(it + prev <= n) {				for(int i=it;i<it+prev;++i) {					if(s.charAt(i) == s.charAt(i - prev))						continue;					matched = false;break;				}			}			int [] moves = new int[] {2, 3};			int val = 0;			for(int mv: moves) {				if(matched && mv == prev) {					continue;				}				val += rec(it + mv, mv);			}			return dp[it][prev] = (val > 0 ? 1 : 0);		}			}		static void prepareIO(boolean isFileIO) {		//long t1 = System.currentTimeMillis();		Task solver = new Task();		// Standard IO		if(!isFileIO) {			InputStream inputStream = System.in;	        OutputStream outputStream = System.out;	        InputReader in = new InputReader(inputStream);	        PrintWriter out = new PrintWriter(outputStream);	        solver.solve(in, out);	        //out.println("time(s): " + (1.0*(System.currentTimeMillis()-t1))/1000.0);	        out.close();		}        // File IO		else {			String IPfilePath = System.getProperty("user.home") + "/Downloads/ip.in";	        String OPfilePath = System.getProperty("user.home") + "/Downloads/op.out";	        InputReader fin = new InputReader(IPfilePath);	        PrintWriter fout = null;	        try {				fout = new PrintWriter(new File(OPfilePath));			} catch (FileNotFoundException e) {				e.printStackTrace();			}	        solver.solve(fin, fout);	        //fout.println("time(s): " + (1.0*(System.currentTimeMillis()-t1))/1000.0);	        fout.close();		}	}		public static void main(String[] args) {        prepareIO(false);	}		static class InputReader {        public BufferedReader reader;        public StringTokenizer tokenizer;         public InputReader(InputStream stream) {            reader = new BufferedReader(new InputStreamReader(stream), 32768);            tokenizer = null;        }                public InputReader(String filePath) {        	File file = new File(filePath);            try {				reader = new BufferedReader(new FileReader(file));			} catch (FileNotFoundException e) {				// TODO Auto-generated catch block				e.printStackTrace();			}            tokenizer = null;        }                public String nextLine() {        	String str = "";        	try {				str = reader.readLine();			} catch (IOException e) {				// TODO Auto-generated catch block				e.printStackTrace();			}        	return str;        }                public String next() {            while (tokenizer == null || !tokenizer.hasMoreTokens()) {                try {                    tokenizer = new StringTokenizer(reader.readLine());                } catch (IOException e) {                    throw new RuntimeException(e);                }            }            return tokenizer.nextToken();        }         public int nextInt() {            return Integer.parseInt(next());        }         public long nextLong() {            return Long.parseLong(next());        }         public double nextDouble() {        	return Double.parseDouble(next());        }            } }