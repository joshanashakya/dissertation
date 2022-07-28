import java.io.*;import java.util.*;import javax.print.attribute.standard.Finishings; import java.math.*; public class Exam {	static final Random random = new Random();	static PrintWriter out = new PrintWriter((System.out));	static Reader sc = new Reader(); 	public static void main(String args[]) throws IOException {//		int t = sc.nextInt();//		while (t-- > 0) { //        	CODE START FROM HERE		int n = sc.nextInt();		int k = sc.nextInt();		int res = 0; 		int num[] = new int[n];		int m[] = new int[n];		read(num);		for (int i = 0; i < k; i++) {			m = num.clone();			for (int j = i; j < n; j += k) { 				m[j] = 0;			} 			res = Math.max(res, count(m));		}		System.out.println(res);	} 	static int count(int[] m) { 		int c1 = 0;		int c2 = 0;		for (int i = 0; i < m.length; i++) { 			if (m[i] == 1)				c1++; 			if (m[i] == -1)				c2++;		} 		return Math.abs(c1 - c2); 	} 	// Fast Input Output	static class Reader {		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		StringTokenizer st = new StringTokenizer(""); 		public String next() {			while (!st.hasMoreTokens()) {				try {					st = new StringTokenizer(br.readLine());				} catch (Exception e) {					e.printStackTrace();				}			}			return st.nextToken();		} 		public int nextInt() {			return Integer.parseInt(next());		} 		public long nextLong() {			return Long.parseLong(next());		} 		public double nextDouble() {			return Double.parseDouble(next());		} 		public String nextLine() {			try {				return br.readLine();			} catch (Exception e) {				e.printStackTrace();			}			return null;		} 		public boolean hasNext() {			String next = null;			try {				next = br.readLine();			} catch (Exception e) {			}			if (next == null) {				return false;			}			st = new StringTokenizer(next);			return true;		}	} 	// EFFICIENT SORTING Ascending	static void ruffleSortAsc(int[] l) {		int n = l.length; // shuffle, then sort		for (int i = 0; i < n; i++) {			int oi = random.nextInt(n), temp = l[oi];			l[oi] = l[i];			l[i] = temp;		}		Arrays.sort(l);	} 	// EFFICIENT SORTING Descending	static void ruffleSortDesc(Integer[] a) {		int n = a.length; // shuffle, then sort		for (int i = 0; i < n; i++) {			int oi = random.nextInt(n), temp = a[oi];			a[oi] = a[i];			a[i] = temp;		}		Arrays.sort(a, Collections.reverseOrder());	} 	// Array Sum	static long sum(Integer[] arr) {		long sum = 0;		for (int i : arr)			sum += i;		return sum;	} 	// swap array elements	static void swap(int arr1[], int arr2[], int i, int j) {		int temp = arr1[i];		arr1[i] = arr2[j];		arr2[j] = temp;	} 	// reading array value;	static void read(int[] num) {		for (int i = 0; i < num.length; i++)			num[i] = sc.nextInt();		return;	} //    reading arraylistValue 	// check for even odd	static boolean isEven(int n) {		return ((n & 1) != 1);	} 	// max in a array	static int max(Integer[] arr) {		int max = Integer.MIN_VALUE;		for (int i = 0; i < arr.length; i++)			if (max < arr[i])				max = arr[i];		return max;	} 	// print array	static void printarr(Integer arr[]) {		for (int i : arr)			System.out.println(i);	} 	// ceil of two elements	static long ceil(int a, int b) {		return (long) Math.ceil(((double) a / (double) b));	} 	// floor of two elements	static long floor(int a, int b) {		return (long) Math.floor(((double) a / (double) b));	} }
