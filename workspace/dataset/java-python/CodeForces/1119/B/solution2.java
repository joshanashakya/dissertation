import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.Arrays;import java.util.StringTokenizer; public class Zad1119B { 	public static void main(String[] args) {		// TODO Auto-generated method stub		FastReader sc = new FastReader();		PrintWriter out = new PrintWriter(System.out);				int n = sc.nextInt();		long h = sc.nextInt();				long[] a = new long[n];		for(int i = 0;i<n;i++) {			a[i] = sc.nextLong();		}		int k = 0;		for(int b = n/2;b>=1;b/=2) {			while(b+k<n && isAns(a, b+k, h))				k+=b;		}		if(isAns(a, k+1, h))			out.print(k+1);		else 			out.print(k);		out.close();	}	static boolean isAns(long[] a, int k, long h) {		if(k>a.length) {			return false;		}		long[] ac = new long[k];		for(int i = 0;i<k;i++) {			ac[i] = a[i];		}				Arrays.parallelSort(ac);				long currH = 0;		for(int i = k-1; i>=0;i--) {			if(k%2==0 || i!=0) {				currH = currH + Math.max(ac[i], ac[i-1]);				i--;			} else {				currH = currH + ac[i];			}			if(currH>h) {				return false;			}		}		return true;	}	static class FastReader {				StringTokenizer st;		BufferedReader br;				public FastReader() {			br = new BufferedReader(					new InputStreamReader(System.in));		}				String next() {			while(st==null || !st.hasMoreElements()) {				try {					st = new StringTokenizer(br.readLine());				} catch (IOException e) {					e.printStackTrace();				}			}			return st.nextToken();		}				int nextInt() {			return Integer.parseInt(next());		}				long nextLong() {			return Long.parseLong(next());		}				double nextDouble() { 			return Double.parseDouble(next()); 		} 				String nextLine() {			String s = "";			while(st==null || st.hasMoreElements()) {				try {					s = br.readLine();				} catch (IOException e) {					e.printStackTrace();				}			}			return s;		}	}}