import java.io.BufferedReader;import java.io.IOException;import java.io.InputStream;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.StringTokenizer; public class ParliamentofBerland {		public static void main(String args[]) throws IOException {		FastIO io = new FastIO(System.in);		PrintWriter out = new PrintWriter(System.out);				int n = io.nextInt();		int a = io.nextInt();		int b = io.nextInt();		int val[] = new int[a*b];				if(n > a*b) {			out.println(-1);		}else {			for(int i = 0; i < n; i++) val[i] = i+1;			int[][] grid = new int[a][b];						int k = 0;						if(b%2 == 0) {				for(int i = 0; i < a; i++) {					if(i%2 == 0) {						for(int j = 0; j < b; j++, k++)							grid[i][j] = val[k];					}else {						for(int j = b-1; j >= 0; j--, k++)							grid[i][j] = val[k];					}				}			}			else {				for(int i = 0; i < a; i++) {					for(int j = 0; j < b; j++, k++) {						grid[i][j] = val[k];					}				}			}						for(int i = 0; i < a; i++) {				for(int j = 0; j < b; j++) {					io.print(grid[i][j] + " ");				}				System.out.println();			}		}		out.flush();		out.close();			}		 	static class FastIO{				BufferedReader br;		StringTokenizer st;				public FastIO(InputStream s) {			br = new BufferedReader(new InputStreamReader(s));		}					public String next() throws IOException{			while(st==null || !st.hasMoreTokens())				st = new StringTokenizer(br.readLine());			return st.nextToken();		}				public int nextInt() throws IOException {			return Integer.parseInt(next());		}				public long nextLong() throws IOException {			return Long.parseLong(next());		}				public String nextLine() throws IOException {			return br.readLine();		}				public boolean ready() throws IOException{			return br.ready();		}				public void print(String str){			System.out.print(str);		}				public void println(String str){			System.out.println(str);		}				public void print(int str){			System.out.print(str);		}				public void print(double str){			System.out.print(str);		}				public void print(char str){			System.out.print(str);		}			} }