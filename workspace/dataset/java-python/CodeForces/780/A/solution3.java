import java.util.*;import java.io.*;public class AndryushaAndSocks {	public static void main(String[]args) throws IOException{		Scanner sc = new Scanner(System.in);		PrintWriter pw = new PrintWriter(System.out);		int n=sc.nextInt();		int max=0;		int c=0;		int[] in = new int[n*2];		for (int i = 0; i < in.length; i++) {			in[i]=sc.nextInt();		}		int[]freq =new int[n];		for (int i = 0; i < in.length; i++) {			freq[in[i]-1]++;			if(freq[in[i]-1]!=2) {				c++;			}			else {				c--;			}			max =Math.max(max, c);		}		pw.print(max);		pw.close();		pw.flush();			}}class Scanner {	StringTokenizer st;	BufferedReader br; 	public Scanner(InputStream s){	br = new BufferedReader(new InputStreamReader(s));} 	public String next() throws IOException 	{		while (st == null || !st.hasMoreTokens()) 			st = new StringTokenizer(br.readLine());		return st.nextToken();	} 	public int nextInt() throws IOException {return Integer.parseInt(next());}		public long nextLong() throws IOException {return Long.parseLong(next());} 	public String nextLine() throws IOException {return br.readLine();}		public double nextDouble() throws IOException	{		String x = next();		StringBuilder sb = new StringBuilder("0");		double res = 0, f = 1;		boolean dec = false, neg = false;		int start = 0;		if(x.charAt(0) == '-')		{			neg = true;			start++;		}		for(int i = start; i < x.length(); i++)			if(x.charAt(i) == '.')			{				res = Long.parseLong(sb.toString());				sb = new StringBuilder("0");				dec = true;			}			else			{				sb.append(x.charAt(i));				if(dec)					f *= 10;			}		res += Long.parseLong(sb.toString()) / f;		return res * (neg?-1:1);	}		public boolean ready() throws IOException {return br.ready();}}
