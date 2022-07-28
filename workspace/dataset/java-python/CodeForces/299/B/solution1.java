  import java.io.BufferedReader;import java.io.IOException;import java.io.InputStream;import java.io.InputStreamReader;import java.io.OutputStream;import java.io.PrintWriter;import java.util.StringTokenizer;  public class Main {		public static void main(String[] args) {		InputStream inputStream = System.in;		OutputStream outputStream = System.out;		InputReader in = new InputReader(inputStream);		PrintWriter out = new PrintWriter(outputStream);		TaskB solver = new TaskB();		solver.solve(in, out);		out.close();	}		static class TaskB{		public void solve(InputReader in, PrintWriter out) {			int n = in.nextInt();			int k = in.nextInt();			String s = in.next();			int max = 0, sum = 0;			for(int i=0;i<s.length()&&max<k;i++) {				if(s.charAt(i)=='#') sum++;				else sum = 0;				if(sum>max) max = sum;			}			if(max>=k) out.println("NO");			else out.println("YES");		}	}		static class InputReader{		public BufferedReader reader;		public StringTokenizer tokenizer;		public InputReader(InputStream stream){			reader = new BufferedReader(new InputStreamReader(stream));			tokenizer = null;		}		public String next() {			while(tokenizer==null|| !tokenizer.hasMoreElements()) {				try {					tokenizer = new StringTokenizer(reader.readLine());				}catch (IOException e) {					throw new RuntimeException(e);				}			}			return tokenizer.nextToken();		}		public int nextInt() {			return Integer.parseInt(next());		}	}}
