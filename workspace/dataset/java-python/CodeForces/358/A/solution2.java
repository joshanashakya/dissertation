import java.io.*;import java.util.*; public class Test { 	static FastScanner sc;	static boolean[] visited;	static int four = 0, seven = 0; 	public static void main(String args[]) {		sc = new FastScanner(System.in);		solve();	} 	public static void solve() {		int n = sc.nextInt();		int[] arr = new int[n];		for (int i = 0; i < n; i++) {			arr[i] = sc.nextInt();		} 		int a = 0, b = 0, c = 0, d = 0;		for (int i = 1; i < arr.length; i++) {			a = Math.min(arr[i - 1], arr[i]);			b = Math.max(arr[i - 1], arr[i]); 			for (int j = i + 1; j < arr.length; j++) {				c = Math.min(arr[j - 1], arr[j]);				d = Math.max(arr[j - 1], arr[j]); 				// System.err.println(a + " " + b + " - " + c + " " + d); 				if ((b > c && d > b && c > a) || (a > c && d > a && b > d)) {					System.out.println("yes");					return;				}			}		}		System.out.println("no");	} } class FastScanner {	BufferedReader reader;	StringTokenizer tokenizer; 	FastScanner(InputStream inputStream) {		reader = new BufferedReader(new InputStreamReader(inputStream));	} 	String nextToken() {		while (tokenizer == null || !tokenizer.hasMoreTokens()) {			try {				tokenizer = new StringTokenizer(reader.readLine());			} catch (Exception e) {				e.printStackTrace();			}		}		return tokenizer.nextToken();	} 	int nextInt() {		return Integer.parseInt(nextToken());	}}