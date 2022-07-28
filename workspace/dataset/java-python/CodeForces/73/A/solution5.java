import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.Arrays;import java.util.StringTokenizer; public class A { 	public static void main(String[] args){		FastScanner scan = new FastScanner();		PrintWriter out = new PrintWriter(System.out);		long a[] = scan.nextLongArray(3), k = scan.nextLong();		Arrays.sort(a);		long x = Math.min(k/3, a[0]-1);		k -= x;		long y = Math.min(k/2, a[1]-1);		k -= y;		long z = Math.min(k, a[2]-1);		x++; y++; z++;		out.println(x*y*z);		out.close();	} 	static class FastScanner {		BufferedReader br;		StringTokenizer st; 		public FastScanner() {			try	{				br = new BufferedReader(new InputStreamReader(System.in));				st = new StringTokenizer(br.readLine());			} catch (Exception e){e.printStackTrace();}		} 		public String next() {			if (st.hasMoreTokens())	return st.nextToken();			try {st = new StringTokenizer(br.readLine());}			catch (Exception e) {e.printStackTrace();}			return st.nextToken();		} 		public int nextInt() {return Integer.parseInt(next());} 		public long nextLong() {return Long.parseLong(next());} 		public double nextDouble() {return Double.parseDouble(next());} 		public String nextLine() {			String line = "";			if(st.hasMoreTokens()) line = st.nextToken();			else try {return br.readLine();}catch(IOException e){e.printStackTrace();}			while(st.hasMoreTokens()) line += " "+st.nextToken();			return line;		} 		public int[] nextIntArray(int n) {			int[] a = new int[n];			for(int i = 0; i < n; i++) a[i] = nextInt();			return a;		} 		public long[] nextLongArray(int n){			long[] a = new long[n];			for(int i = 0; i < n; i++) a[i] = nextLong();			return a;		} 		public double[] nextDoubleArray(int n){			double[] a = new double[n];			for(int i = 0; i < n; i++) a[i] = nextDouble();			return a;		} 		public char[][] nextGrid(int n, int m){			char[][] grid = new char[n][m];			for(int i = 0; i < n; i++) grid[i] = next().toCharArray();			return grid;		}	} 	}