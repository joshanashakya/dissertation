import java.io.BufferedReader; import java.util.Collections;import java.io.FileNotFoundException;import java.io.FileReader;import java.io.IOException;import java.io.InputStream;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.*;public class Main { 	public static void main(String[] args)  throws IOException{		PrintWriter pw = new PrintWriter(System.out);		Scanner sc = new Scanner (System.in);		int t = sc.nextInt();		for (int y = 0 ; y < t ; y ++ ) {			int r = sc.nextInt();			int c = sc.nextInt();						for (int i = 0 ; i < r ; i ++) {				for (int j = 0 ; j < c ; j ++ ) {					if (i == 0 && j == 0 ) {						pw.print("W");					}					else pw.print("B");					}pw.println();				}		}		pw.close ();	}	static class Scanner {		StringTokenizer st;		BufferedReader br; 		public Scanner(InputStream s) {			br = new BufferedReader(new InputStreamReader(s));		} 		public Scanner(String file) throws FileNotFoundException {			br = new BufferedReader(new FileReader(file));		} 		public String next() throws IOException {			while (st == null || !st.hasMoreTokens())				st = new StringTokenizer(br.readLine());			return st.nextToken();		} 		public int nextInt() throws IOException {			return Integer.parseInt(next());		}		public long nextLong() throws IOException {			return Long.parseLong(next());		} 		public String nextLine() throws IOException {			return br.readLine();		}		public double nextDouble() throws IOException {			return Double.parseDouble(next());		} 		public boolean ready() throws IOException {			return br.ready();		} 	}  } 	 	  			    	  			           	