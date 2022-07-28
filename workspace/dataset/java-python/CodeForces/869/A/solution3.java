import java.io.*;import java.util.*;import java.math.*; public class Main {	static final Random random = new Random();	static PrintWriter out = new PrintWriter((System.out));	static Reader sc = new Reader(); 	public static void main(String args[]) throws IOException {//        int t = sc.nextInt();//        while (t-- > 0) {		int n = sc.nextInt();		Integer a[] = new Integer[n];		Integer b[] = new Integer[n];		read(a);		read(b);		HashSet<Integer> all = new HashSet<Integer>();		for (int i = 0; i < n; i++) {			all.add(a[i]);			all.add(b[i]);		}		int c=0;	for(int i =0 ; i<n ; i++)	{		for(int j =0 ; j<n ; j++)						if(all.contains(a[i]^b[j]))				c++;								}	if(isEven(c))		System.out.println("Karen");	else		System.out.println("Koyomi");								//        	CODE START FROM HERE//        }//        out.close();	} 	// Fast Input Output	static class Reader {		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		StringTokenizer st = new StringTokenizer(""); 		public String next() {			while (!st.hasMoreTokens()) {				try {					st = new StringTokenizer(br.readLine());				} catch (Exception e) {					e.printStackTrace();				}			}			return st.nextToken();		} 		public int nextInt() {			return Integer.parseInt(next());		} 		public long nextLong() {			return Long.parseLong(next());		} 		public double nextDouble() {			return Double.parseDouble(next());		} 		public String nextLine() {			try {				return br.readLine();			} catch (Exception e) {				e.printStackTrace();			}			return null;		} 		public boolean hasNext() {			String next = null;			try {				next = br.readLine();			} catch (Exception e) {			}			if (next == null) {				return false;			}			st = new StringTokenizer(next);			return true;		}	} 	// EFFICIENT SORTING Ascending	static void ruffleSortAsc(Integer[] a) {		int n = a.length; // shuffle, then sort		for (int i = 0; i < n; i++) {			int oi = random.nextInt(n), temp = a[oi];			a[oi] = a[i];			a[i] = temp;		}		Arrays.sort(a);	} //	EFFICIENT SORTING Descending	static void ruffleSortDesc(Integer[] a) {		int n = a.length; // shuffle, then sort		for (int i = 0; i < n; i++) {			int oi = random.nextInt(n), temp = a[oi];			a[oi] = a[i];			a[i] = temp;		}		Arrays.sort(a, Collections.reverseOrder());	} 	// Array Sum	static long sum(Integer[] arr) {		long sum = 0;		for (int i : arr)			sum += i;		return sum;	} 	// swap array elements	static void swap(int arr1[], int arr2[], int i, int j) {		int temp = arr1[i];		arr1[i] = arr2[j];		arr2[j] = temp;	} 	// reading array value;	static void read(Integer[] arr) {		for (int i = 0; i < arr.length; i++)			arr[i] = sc.nextInt();		return;	} //    reading arraylistValue 	// check for even odd	static boolean isEven(int n) {		return ((n & 1) != 1);	} 	// max in a array	static int max(Integer[] arr) {		int max = Integer.MIN_VALUE;		for (int i = 0; i < arr.length; i++)			if (max < arr[i])				max = arr[i];		return max;	} //  print array	static void printarr(Integer arr[]) {		for (int i : arr)			System.out.println(i);	} // ceil of two elements	static long ceil(int a, int b) {		return (long) Math.ceil(((double) a / (double) b));	} // floor of two elements	static long floor(int a, int b) {		return (long) Math.floor(((double) a / (double) b));	} }