import java.io.*;import java.util.*; public class Jumps { 	public static void main(String[] args) throws IOException {		// TODO Auto-generated method stub		InputStream inputStream = System.in; 		InputReader in = new InputReader(inputStream);		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));				int t = in.nextInt();		while (t-- != 0) {						int x = in.nextInt();						int num = 0;			int jumps = 0;			while(num<x) {				jumps++;				num += jumps;			}			if(num-1==x) {				jumps++;			}			out.write(jumps+"");			out.newLine();		}		out.close();	} 	static class InputReader {		public BufferedReader reader;		public StringTokenizer tokenizer; 		public InputReader(InputStream stream) {			reader = new BufferedReader(new InputStreamReader(stream), 32768);			tokenizer = null;		} 		public String next() {			while (tokenizer == null || !tokenizer.hasMoreTokens()) {				try {					tokenizer = new StringTokenizer(reader.readLine());				} catch (IOException e) {					throw new RuntimeException(e);				}			}			return tokenizer.nextToken();		} 		public int nextInt() {			return Integer.parseInt(next());		} 		public long nextLong() {			return Long.parseLong(next());		} 		public double nextDouble() {			return Double.parseDouble(next());		} 		public int[] readArray(int n) {			int[] arr = new int[n];			for (int i = 0; i < n; i++)				arr[i] = nextInt();			return arr;		}	} }
