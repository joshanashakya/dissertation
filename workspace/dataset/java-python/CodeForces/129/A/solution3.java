import java.util.Scanner;import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.StringTokenizer; public class Cv {//==========================Solution============================//	public static void main(String[] args) {				FastScanner in = new FastScanner();		Scanner input = new Scanner(System.in);		PrintWriter out = new PrintWriter(System.out); 		int n = input.nextInt();		int sum = 0;		int v = 0;		int[] arr = new int[n]; 		for (int i = 0; i < n; i++) {			arr[i] = input.nextInt();		} 		for (int u = 0; u < n; u++) {			sum = sum + arr[u];		} 		for (int c = 0; c < n; c++) {			if ((sum - arr[c]) % 2 == 0) {				v++;			}		}		out.println(v);		out.close();	} //==============================================================//	static class FastScanner {				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		StringTokenizer st = new StringTokenizer("");				public String next() {			while (!st.hasMoreElements()) {				try {					st = new StringTokenizer(br.readLine());				} catch (IOException e) {					e.printStackTrace();				}			}			return st.nextToken();		}				public String nextLine() {			String str = "";			try {				str = br.readLine();			} catch (IOException e) {				e.printStackTrace();			}			return str;		}				byte nextByte() {			return Byte.parseByte(next());		} 		short nextShort() {			return Short.parseShort(next());		} 		int nextInt() {			return Integer.parseInt(next());		}				long nextLong() {			return java.lang.Long.parseLong(next());		}				double nextDouble() {			return Double.parseDouble(next());		}	}}