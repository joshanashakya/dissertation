import java.io.BufferedReader;import java.io.FileNotFoundException;import java.io.FileReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.StringTokenizer; public class Main {	public static void main(String[] args) {		FastScanner input = new FastScanner();				long a = 1;		long b = 1;				int[][] arr = new int[3][2];				for (int i = 0; i < 3; i++) {			arr[i] = new int[] {input.nextInt(), input.nextInt()};			b *= arr[i][0]; a *= arr[i][1];		}				if (a > b || (arr[0][0] == 0 && arr[0][1] > 0 && arr[1][1] > 0) || (arr[1][0] == 0 && arr[1][1] > 0))			System.out.println("Ron");		else			System.out.println("Hermione");	} 	// https://github.com/detel/Faster-InputOutput-Implementations/blob/master/FastScanner.java	// Fast I/O	static class FastScanner { 		BufferedReader br;		StringTokenizer st; 		public FastScanner(String s) {			try {				br = new BufferedReader(new FileReader(s));			} catch (FileNotFoundException e) {				// TODO Auto-generated catch block				e.printStackTrace();			}		} 		public FastScanner() {			br = new BufferedReader(new InputStreamReader(System.in));		} 		String next() {			while (st == null || !st.hasMoreElements()) {				try {					st = new StringTokenizer(br.readLine());				} catch (IOException e) {					// TODO Auto-generated catch block					e.printStackTrace();				}			}			return st.nextToken();		} 		int nextInt() {			return Integer.parseInt(next());		} 		long nextLong() {			return Long.parseLong(next());		} 		double nextDouble() {			return Double.parseDouble(next());		}	}}