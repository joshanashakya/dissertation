import java.io.BufferedReader;import java.io.IOException;import java.io.InputStream;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.StringTokenizer;   public class Abood2B {   	public static void main(String[] args) throws IOException {		Scanner sc = new Scanner(System.in);		PrintWriter out = new PrintWriter(System.out); 		int n = sc.nextInt(); 		char[][] ans = new char[4][n]; 		char c = 0;		if(n % 2 == 0){			for (int i = 0; i < 4; i++) {				if(i == 0 || i == 3)					for (int j = 0; j < n; j+=2) {						if(i % 2 == 0)							c = (j % 4 == 0) ? 'c' : 'd';						else							c = (j % 4 == 0) ? 'e' : 'f';						ans[i][j] = c;						ans[i][j + 1] = c;					}				else					for (int j = 1; j < n - 1; j+=2) {						if(i % 2 == 0)							c = (j % 4 == 1) ? 'c' : 'd';						else							c = (j % 4 == 1) ? 'e' : 'f';						ans[i][j] = c;						ans[i][j + 1] = c;					}			}			ans[1][0] = ans[2][0] = 'a';			ans[1][n - 1] = ans[2][n - 1] = 'b';		} 		else {			for (int i = 0; i < 4; i++) {				if(i == 0 || i == 1)					for (int j = 0; j < n - 1; j+=2) {						if(i % 2 == 0)							c = (j % 4 == 0) ? 'c' : 'd';						else							c = (j % 4 == 0) ? 'e' : 'f';						ans[i][j] = c;						ans[i][j + 1] = c;					}				else					for (int j = 1; j < n; j+=2) {						if(i % 2 == 0)							c = (j % 4 == 1) ? 'c' : 'd';						else							c = (j % 4 == 1) ? 'e' : 'f';												ans[i][j] = c;						ans[i][j + 1] = c;					}			}			ans[2][0] = ans[3][0] = 'a';			ans[0][n - 1] = ans[1][n - 1] = 'b';		}  		for (int i = 0; i < 4; i++) {			for (int j = 0; j < n; j++) {				out.print(ans[i][j]);			}			out.println();		} 		out.flush();		out.close();	}      	static class Scanner    	{		StringTokenizer st;		BufferedReader br; 		public Scanner(InputStream s){	br = new BufferedReader(new InputStreamReader(s));} 		public String next() throws IOException 		{			while (st == null || !st.hasMoreTokens()) 				st = new StringTokenizer(br.readLine());			return st.nextToken();		} 		public int nextInt() throws IOException {return Integer.parseInt(next());} 		public long nextLong() throws IOException {return Long.parseLong(next());} 		public String nextLine() throws IOException {return br.readLine();}  		public double nextDouble() throws IOException		{			String x = next();			StringBuilder sb = new StringBuilder("0");			double res = 0, f = 1;			boolean dec = false, neg = false;			int start = 0;			if(x.charAt(0) == '-')			{				neg = true;				start++;			}			for(int i = start; i < x.length(); i++)				if(x.charAt(i) == '.')				{					res = Long.parseLong(sb.toString());					sb = new StringBuilder("0");					dec = true;				}				else				{					sb.append(x.charAt(i));					if(dec)						f *= 10;				}			res += Long.parseLong(sb.toString()) / f;			return res * (neg?-1:1);		} 		public boolean ready() throws IOException {return br.ready();}   	} }