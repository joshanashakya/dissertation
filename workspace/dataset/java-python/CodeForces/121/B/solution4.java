import java.io.BufferedReader;import java.io.FileNotFoundException;import java.io.FileReader;import java.io.IOException;import java.io.InputStream;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.StringTokenizer; public class Main {	public static void main(String[] args) throws Exception {		Scanner sc = new Scanner(System.in);		PrintWriter out = new PrintWriter(System.out);				int n = sc.nextInt(), k = sc.nextInt();		char[] a = sc.next().toCharArray();		for (int i = 0; i < n - 1 && k > 0; i++) {			if (a[i] == '4' && a[i + 1] == '7') {				if (i % 2 == 1 && i > 0 && a[i - 1] == '4') {					if (k % 2 == 1) a[i] = '7';					break;				} else if (i % 2 == 0 && i + 2 < n && a[i + 2] == '7') {					if (k % 2 == 1) a[i + 1] = '4';					break;				} else if (i % 2 == 0) {					a[i + 1] = '4';					k--;				}				else {					a[i] = '7';					k--;				}			}		}		StringBuilder sb = new StringBuilder();		for (int i = 0; i < n; i++)			sb.append(a[i]);		out.println(sb);		out.flush();		out.close();	}		static class Scanner {        StringTokenizer st;        BufferedReader br;         public Scanner(InputStream s) {            br = new BufferedReader(new InputStreamReader(s));        }         public Scanner(String s) throws FileNotFoundException {            br = new BufferedReader(new FileReader(s));        }         public String next() throws IOException {            while (st == null || !st.hasMoreTokens())                st = new StringTokenizer(br.readLine());            return st.nextToken();        }         public int nextInt() throws IOException {            return Integer.parseInt(next());        }         public long nextLong() throws IOException {            return Long.parseLong(next());        }         public String nextLine() throws IOException {            return br.readLine();        }         public double nextDouble() throws IOException {            return Double.parseDouble(next());        }         public boolean ready() throws IOException {            return br.ready();        }    }}
