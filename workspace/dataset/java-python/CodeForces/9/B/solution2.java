import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.math.BigInteger;import java.util.ArrayList;import java.util.Arrays;import java.util.Collections;import java.util.HashMap;import java.util.HashSet;import java.util.List;import java.util.PriorityQueue;import java.util.Random;import java.util.StringTokenizer; public class A { 	public static void main(String[] args) throws IOException { 		FastScanner sc = new FastScanner();		PrintWriter out = new PrintWriter(System.out);		int n = sc.nextInt();		double vb = sc.nextDouble(),vs = sc.nextDouble();		long arr[] = sc.readArrayLong((int) n);		long x = sc.nextLong(),y = sc.nextLong();				for(int i=1; i<n-1; i++) {			double curr = find(arr[i], 0, x, y);			double currt = curr/vs;									double currb = find(arr[i], 0, arr[i+1], 0);			double currbt = currb/vb;						double my = find(arr[i+1], 0, x, y);			double mytime = my/vs;			mytime+=currbt;			if(currt < mytime) {				System.out.println(i+1);				return;			}		}		System.out.println(n); 	} 	private static double find(long x1, long y1, long x2, long y2) {		double val = (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1);		return Math.sqrt(val);	} 	static void ruffleSort(int[] a) {		Random get = new Random();		for (int i = 0; i < a.length; i++) {			int r = get.nextInt(a.length);			int temp = a[i];			a[i] = a[r];			a[r] = temp;		}		Arrays.sort(a);	} 	static void ruffleSort(long[] a) {		Random get = new Random();		for (int i = 0; i < a.length; i++) {			int r = get.nextInt(a.length);			long temp = a[i];			a[i] = a[r];			a[r] = temp;		}		Arrays.sort(a);	} 	static class Pair implements Comparable<Pair> {		int x, y; 		Pair(int x, int y) {			this.x = x;			this.y = y;		} 		@Override		public int compareTo(Pair o) {			return Integer.compare(this.x, o.x);		} 	} 	static class FastScanner {		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		StringTokenizer st = new StringTokenizer(""); 		String next() {			while (!st.hasMoreTokens())				try {					st = new StringTokenizer(br.readLine());				} catch (IOException e) {					e.printStackTrace();				}			return st.nextToken();		} 		int nextInt() {			return Integer.parseInt(next());		} 		int[] readArray(int n) {			int[] a = new int[n];			for (int i = 0; i < n; i++)				a[i] = nextInt();			return a;		} 		long[] readArrayLong(int n) {			long[] a = new long[n];			for (int i = 0; i < n; i++)				a[i] = nextLong();			return a;		} 		double nextDouble() {			return Double.parseDouble(next());		} 		long nextLong() {			return Long.parseLong(next());		} 		String nextLine() {			String str = "";			try {				str = br.readLine();			} catch (IOException e) {				e.printStackTrace();			}			return str;		}	} 	static int ceil(int x, int y) {		return (x % y == 0 ? x / y : (x / y + 1));	} 	static long ceil(long x, long y) {		return (x % y == 0 ? x / y : (x / y + 1));	} 	static int max(int x, int y) {		return Math.max(x, y);	} 	static int min(int x, int y) {		return Math.min(x, y);	} 	static int abs(int x) {		return Math.abs(x);	} 	static long abs(long x) {		return Math.abs(x);	} 	static int log2(int N) {		int result = (int) (Math.log(N) / Math.log(2));		return result;	} 	static long max(long x, long y) {		return Math.max(x, y);	} 	static long min(long x, long y) {		return Math.min(x, y);	} 	static int min(int a[]) {		int x = 1_000_000_00_9;		for (int i = 0; i < a.length; i++)			x = min(x, a[i]);		return x;	} 	static int max(int a[]) {		int x = -1_000_000_00_9;		for (int i = 0; i < a.length; i++)			x = max(x, a[i]);		return x;	} 	static long min(long a[]) {		long x = (long) 3e18;		for (int i = 0; i < a.length; i++)			x = min(x, a[i]);		return x;	} 	static long max(long a[]) {		long x = -(long) 3e18;		for (int i = 0; i < a.length; i++)			x = max(x, a[i]);		return x;	} 	static int power(int x, int y) {		int res = 1;		while (y > 0) {			if (y % 2 == 1)				res = (res * x);			y >>= 1;			x = (x * x);		}		return res;	} 	static long power(long x, long y) {		long res = 1;		while (y > 0) {			if (y % 2 == 1)				res = (res * x);			y >>= 1;			x = (x * x);		}		return res;	} 	static void intsort(int[] a) {		List<Integer> temp = new ArrayList<Integer>();		for (int i = 0; i < a.length; i++)			temp.add(a[i]);		Collections.sort(temp);		for (int i = 0; i < a.length; i++)			a[i] = temp.get(i);	} 	static void longsort(long[] a) {		List<Long> temp = new ArrayList<Long>();		for (int i = 0; i < a.length; i++)			temp.add(a[i]);		Collections.sort(temp);		for (int i = 0; i < a.length; i++)			a[i] = temp.get(i);	} 	static void reverseintsort(int[] a) {		List<Integer> temp = new ArrayList<Integer>();		for (int i = 0; i < a.length; i++)			temp.add(a[i]);		Collections.sort(temp);		Collections.reverseOrder();		for (int i = 0; i < a.length; i++)			a[i] = temp.get(i);	} 	static void reverselongsort(long[] a) {		List<Long> temp = new ArrayList<Long>();		for (int i = 0; i < a.length; i++)			temp.add(a[i]);		Collections.sort(temp);		Collections.reverseOrder();		for (int i = 0; i < a.length; i++)			a[i] = temp.get(i);	} 	static class longpair implements Comparable<longpair> {		long x, y; 		longpair(long x, long y) {			this.x = x;			this.y = y;		} 		public int compareTo(longpair p) {			return Long.compare(this.x, p.x);		}	} 	public static int gcd(int a, int b) {		BigInteger b1 = BigInteger.valueOf(a);		BigInteger b2 = BigInteger.valueOf(b);		BigInteger gcd = b1.gcd(b2);		return gcd.intValue();	} 	public static long gcd(long a, long b) {		BigInteger b1 = BigInteger.valueOf(a);		BigInteger b2 = BigInteger.valueOf(b);		BigInteger gcd = b1.gcd(b2);		return gcd.longValue();	}}
