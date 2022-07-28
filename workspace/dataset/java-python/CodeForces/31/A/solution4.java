import java.util.*;import java.io.*;public class A { 	static Scanner sc = new Scanner(System.in);	static PrintWriter pw = new PrintWriter(System.out);	public static void main(String[] args) throws IOException{		int n = sc.nextInt();		int[] worms = sc.nextIntArray(n);		for (int i = 0;i < n;i++)			for (int j = 0;j < n;j++)				for (int k = 0;k < n;k++) {					if (i != j && i != k && j != k && worms[i] == worms[j] + worms[k]) {						pw.println((i + 1) + " " + (j + 1) + " " + (k + 1));						pw.flush();						return;					}				}		pw.println(-1);				pw.flush();		pw.close();	}	static class Scanner {        StringTokenizer st;        BufferedReader br;         public Scanner(InputStream s) {            br = new BufferedReader(new InputStreamReader(s));        }         public String next() throws IOException {            while (st == null || !st.hasMoreTokens())                st = new StringTokenizer(br.readLine());            return st.nextToken();        }         public int nextInt() throws IOException {            return Integer.parseInt(next());        }         public long nextLong() throws IOException {            return Long.parseLong(next());        }         public String nextLine() throws IOException {            return br.readLine();        }         public double nextDouble() throws IOException {            String x = next();            StringBuilder sb = new StringBuilder("0");            double res = 0, f = 1;            boolean dec = false, neg = false;            int start = 0;            if (x.charAt(0) == '-') {                neg = true;                start++;            }            for (int i = start; i < x.length(); i++)                if (x.charAt(i) == '.') {                    res = Long.parseLong(sb.toString());                    sb = new StringBuilder("0");                    dec = true;                } else {                    sb.append(x.charAt(i));                    if (dec)                        f *= 10;                }            res += Long.parseLong(sb.toString()) / f;            return res * (neg ? -1 : 1);        }         public long[] nextLongArrayPri(int n) throws IOException {            long[] a = new long[n];            for (int i = 0; i < n; i++)                a[i] = nextLong();            return a;        }         public Long[] nextLongArray(int n) throws IOException {            Long[] a = new Long[n];            for (int i = 0; i < n; i++)                a[i] = nextLong();            return a;        }         public int[] nextIntArray(int n) throws IOException {            int[] a = new int[n];            for (int i = 0; i < n; i++)                a[i] = nextInt();            return a;        }         public Integer[] nextIntegerArray(int n) throws IOException {            Integer[] a = new Integer[n];            for (int i = 0; i < n; i++)                a[i] = nextInt();            return a;        }         public boolean ready() throws IOException {            return br.ready();        }    }}