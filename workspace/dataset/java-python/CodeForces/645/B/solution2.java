import java.util.*;import java.math.*;import java.io.*;import java.lang.*;public class reorder {	static class FastReader {		BufferedReader br;		StringTokenizer st; 		public FastReader() {			br = new BufferedReader(new InputStreamReader(System.in));		} 		String next() {			while (st == null || !st.hasMoreElements()) {				try {					st = new StringTokenizer(br.readLine());				} catch (IOException e) {					e.printStackTrace();				}			}			return st.nextToken();		} 		int nextInt() {			return Integer.parseInt(next());		} 		long nextLong() {			return Long.parseLong(next());		} 		double nextDouble() {			return Double.parseDouble(next());		} 		String nextLine() {			String str = "";			try {				str = br.readLine();			} catch (IOException e) {				e.printStackTrace();			}			return str;		} 		int[] nextIntArray(int n) {			int a[] = new int[n];			for (int i = 0; i < n; i++) {				a[i] = Integer.parseInt(next());			}			return a;		} 	}		private static long startTime = System.currentTimeMillis();	public static void main(String[] args) {		FastReader sc =new FastReader();        long n=sc.nextInt();		long k=sc.nextInt();		long temp=Math.max(n-2*k, 0);		System.out.println((n*(n-1)/2) -(temp*(temp-1)/2));  	}}