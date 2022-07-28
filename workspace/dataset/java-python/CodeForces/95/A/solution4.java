import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;


public class A {

	static boolean isLower(char c) {
		return c >= 'a' && c <= 'z';
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		int n = sc.nextInt();
		String[] S = new String[n];
		for (int i = 0; i < n; i++)
			S[i] = sc.next().toLowerCase();

		String Orig = sc.next();
		String l = Orig.toLowerCase();

		int r = sc.nextChar() - 'a';
		char[] ans = new char[Orig.length()];
		for (int i = 0; i < ans.length; i++) {
			if(isLower(Orig.charAt(i)))
				ans[i] = 'a';
			else
				ans[i] = 'A';
		}
		boolean[] rep = new boolean[Orig.length()];


		for (int i = 0; i < Orig.length(); i++) 
			for (int j = 0; j < n; j++) 
				if(Orig.length() - i >= S[j].length() && l.substring(i, i + S[j].length()).endsWith(S[j])) 
					for (int j2 = 0; j2 < S[j].length(); j2++)
						rep[i + j2] = true;

		for (int i = 0; i < rep.length; i++) {
			if(!rep[i])
				ans[i] = Orig.charAt(i);
			else {
				if(l.charAt(i) - 'a' == r) {
					if(r == 0)
						ans[i]++;
				}else 
					ans[i] += r;
			}
		}

		for (int i = 0; i < rep.length; i++) 
			out.print(ans[i]);
		out.println();




		out.flush();
		out.close();
	}





	static class Scanner 
	{
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream System){br = new BufferedReader(new InputStreamReader(System));}
		public String next() throws IOException 
		{
			while (st == null || !st.hasMoreTokens()) 
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		public String nextLine()throws IOException{return br.readLine();}
		public int nextInt() throws IOException {return Integer.parseInt(next());}
		public double nextDouble() throws IOException {return Double.parseDouble(next());}
		public char nextChar()throws IOException{return next().charAt(0);}
		public Long nextLong()throws IOException{return Long.parseLong(next());}
		public boolean ready() throws IOException{return br.ready();}
		public void waitForInput(){for(long i = 0; i < 3e9; i++);}
	}


}
