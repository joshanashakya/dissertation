import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.StringTokenizer; public class SumOfDigits {		public static void main(String[] args) {		FastReader fs = new FastReader();		String n = fs.nextLine();		long result, counter = 0;		while(n .length() > 1) {			counter++;			result = 0;			for(int i = 0; i < n.length(); i++) {				result += Integer.parseInt(Character.toString(n.charAt(i)));			}			n = String.valueOf(result);		}		System.out.println(counter);	}	 	static class FastReader {		BufferedReader br;		StringTokenizer st; 		public FastReader() {			br = new BufferedReader(new InputStreamReader(System.in));		} 		String next() {			while (st == null || !st.hasMoreElements()) {				try {					st = new StringTokenizer(br.readLine());				} catch (IOException e) {					e.printStackTrace();				}			}			return st.nextToken();		} 		int nextInt() {			return Integer.parseInt(next());		} 		long nextLong() {			return Long.parseLong(next());		} 		double nextDouble() {			return Double.parseDouble(next());		} 		String nextLine() {			String str = "";			try {				str = br.readLine();			} catch (IOException e) {				e.printStackTrace();			}			return str;		}	} }