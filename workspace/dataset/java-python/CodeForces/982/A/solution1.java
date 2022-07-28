import java.io.*;import java.util.*;import javax.print.attribute.standard.Finishings; import java.math.*; public class SnackTower {	static final Random random = new Random();	static PrintWriter out = new PrintWriter((System.out));	static Reader sc = new Reader(); 	public static void main(String args[]) {		Scanner sc = new Scanner(System.in); 		int n = sc.nextInt(); 		int c1 = 0;		int c0 = 0;		String s = sc.next();		boolean f = false;		if (s.contains("11") || s.contains("000")) {			System.out.println("NO");			f = true;		} 		else {			for (int i = 0; i < s.length(); i++) 				if (s.charAt(i) == '1')					c1++;			if (c1 < (int) Math.ceil((double) n / 3.00)) {				System.out.println("No");			} else {				if ((s.charAt(n - 1) == '0' && s.charAt(n - 2) == '0') || (s.charAt(0) == '0' && s.charAt(1) == '0'))					System.out.println("No");				else					System.out.println("Yes");			} 		} // //		if (s.charAt(0) == '1') {//			for (int i = 0; i < n; i++) {//				if (s.charAt(i) == '1')//					c1++;//				else//					c0++;//			}//			if (c1 >= c0 && s.charAt(0) == s.charAt(n-1))//				System.out.println("Yes");//			else//				System.out.println("No");//		}////		else if (s.charAt(0) == '0') {//			for (int i = 0; i < n; i++) {////				if (s.charAt(i) == '1')//					c1++;//				else//					c0++;//			}//			if (c1 <= c0 && s.charAt(0) == s.charAt(n-1))//				System.out.println("Yes");//			else//				System.out.println("No");////		}	} // Fast Input Output	static class Reader {		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		StringTokenizer st = new StringTokenizer(""); 		public String next() {			while (!st.hasMoreTokens()) {				try {					st = new StringTokenizer(br.readLine());				} catch (Exception e) {					e.printStackTrace();				}			}			return st.nextToken();		} 		public int nextInt() {			return Integer.parseInt(next());		} 		public long nextLong() {			return Long.parseLong(next());		} 		public double nextDouble() {			return Double.parseDouble(next());		} 		public String nextLine() {			try {				return br.readLine();			} catch (Exception e) {				e.printStackTrace();			}			return null;		} 		public boolean hasNext() {			String next = null;			try {				next = br.readLine();			} catch (Exception e) {			}			if (next == null) {				return false;			}			st = new StringTokenizer(next);			return true;		} 	} 	// EFFICIENT SORTING Ascending	static void ruffleSortAsc(Integer[] a) {		int n = a.length; // shuffle, then sort		for (int i = 0; i < n; i++) {			int oi = random.nextInt(n), temp = a[oi];			a[oi] = a[i];			a[i] = temp;		}		Arrays.sort(a);	} 	// EFFICIENT SORTING Descending	static void ruffleSortDesc(Integer[] a) {		int n = a.length; // shuffle, then sort		for (int i = 0; i < n; i++) {			int oi = random.nextInt(n), temp = a[oi];			a[oi] = a[i];			a[i] = temp;		}		Arrays.sort(a, Collections.reverseOrder());	} 	// Array Sum	static long sum(Integer[] arr) {		long sum = 0;		for (int i : arr)			sum += i;		return sum;	} 	// swap array elements	static void swap(int arr1[], int arr2[], int i, int j) {		int temp = arr1[i];		arr1[i] = arr2[j];		arr2[j] = temp;	} 	// reading array value;	static void read(int[] a) {		for (int i = 0; i < a.length; i++)			a[i] = sc.nextInt();		return;	} //    reading arraylistValue 	// check for even odd	static boolean isEven(int n) {		return ((n & 1) != 1);	} 	// max in a array	static int max(Integer[] arr) {		int max = Integer.MIN_VALUE;		for (int i = 0; i < arr.length; i++)			if (max < arr[i])				max = arr[i];		return max;	} 	// print array	static void printarr(Integer arr[]) {		for (int i : arr)			System.out.println(i);	} 	// ceil of two elements	static long ceil(int a, int b) {		return (long) Math.ceil(((double) a / (double) b));	} 	// floor of two elements	static long floor(int a, int b) {		return (long) Math.floor(((double) a / (double) b));	} 	static boolean checkPrimeFactor(int n) {		for (int i = 2; i < n; i++) {			while (n % i == 0) {				return true;			}		}		return false;	} }