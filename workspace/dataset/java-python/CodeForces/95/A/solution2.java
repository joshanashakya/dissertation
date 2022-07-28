
import java.io.*;
import java.math.*;
import java.util.*;

import static java.util.Arrays.fill;
import static java.lang.Math.*;
import static java.util.Arrays.sort;
import static java.util.Collections.sort;


public class A95 
{

	public static int mod = 1000000007;
	public static long INF = (1L << 60);
	static FastScanner2 in = new FastScanner2();
	static OutputWriter out = new OutputWriter(System.out);
	static int n;
	static String s;
	static String[] arr;
	static char c1;
	static char c2;
	public static boolean isequal(String s1,String s2)
	{
		if(s1.length()!=s2.length())
			return false;
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
				return false;
		}
		return true;
	}
	public static void main(String[] args) 
	{

		n=in.nextInt();
		arr=new String[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextLine();
		}
		s=in.nextLine();
		c1=in.nextLine().charAt(0);
		String tmp=c1+"";
		tmp=tmp.toLowerCase();
		c1=tmp.toLowerCase().charAt(0);
		c2=tmp.toUpperCase().charAt(0);
		boolean[] visited=new boolean[s.length()];
		char[] answer=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<n;j++)
			{
				if(((i+arr[j].length())<=s.length()) && isequal(s.substring(i, i+arr[j].length()), arr[j]))
				{
					//tr(s.substring(i, i+arr[j].length()));
					for(int k=i;k<i+arr[j].length();k++)
					{
						if(visited[k])
							continue;
						if(answer[k]==c1 || answer[k]==c2)
						{
							if(answer[k]>='a' && answer[k]<='z')
							{
								for(int kk='a';kk<='z';kk++)
								{
									if(kk==answer[k])
										continue;
									else
									{
										answer[k]=(char)kk;
										visited[k]=true;
										break;
									}
								}
							}
							else
							{
								for(int kk='A';kk<='Z';kk++)
								{
									if(kk==answer[k])
										continue;
									else
									{
										answer[k]=(char)kk;
										visited[k]=true;
										break;
									}
								}
							}
						}
						else
						{
							if(!visited[k] && answer[k]>='a' && answer[k]<='z')
							{
								answer[k]=c1;
								visited[k]=true;
							}
							else 
								if(!visited[k])
							{
								answer[k]=c2;
								visited[k]=true;
							}
						}
					}
				}
			}
		}
		for(int i=0;i<answer.length;i++)
			out.print(answer[i]);
		out.close();

	}
	
	public static long pow(long x, long n) 
	{
		long res = 1;
		for (long p = x; n > 0; n >>= 1, p = (p * p)) 
		{
			if ((n & 1) != 0) 
			{
				res = (res * p);
			}
		}
		return res;
	}
	
	public static long pow(long x, long n, long mod) 
	{
		long res = 1;
		for (long p = x; n > 0; n >>= 1, p = (p * p) % mod) 
		{
			if ((n & 1) != 0) 
			{
				res = (res * p % mod);
			}
		}
		return res;
	}

	public static long gcd(long n1, long n2)
	{
		long r;
		while (n2 != 0) 
		{
			r = n1 % n2;
			n1 = n2;
			n2 = r;
		}
		return n1;
	}

	public static long lcm(long n1, long n2) 
	{
		long answer = (n1 * n2) / (gcd(n1, n2));
		return answer;
	}
	
	static class FastScanner2 
	{
		private byte[] buf = new byte[1024];
		private int curChar;
		private int snumChars;

		public int read() 
		{
			if (snumChars == -1)
				throw new InputMismatchException();
			if (curChar >= snumChars) 
			{
				curChar = 0;
				try 
				{
					snumChars = System.in.read(buf);
				} catch (IOException e) 
				{
					throw new InputMismatchException();
				}
				if (snumChars <= 0)
					return -1;
			}
			return buf[curChar++];
		}

		public String nextLine() 
		{
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do 
			{
				res.appendCodePoint(c);
				c = read();
			} 
			while (!isEndOfLine(c));
			return res.toString();
		}

		public String nextString() 
		{
			int c = read();
			while (isSpaceChar(c))
				c = read();
			StringBuilder res = new StringBuilder();
			do 
			{
				res.appendCodePoint(c);
				c = read();
			} 
			while (!isSpaceChar(c));
			return res.toString();
		}

		public long nextLong()
		{
			int c = read();
			while (isSpaceChar(c))
				c = read();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			long res = 0;
			do 
			{
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			} 
			while (!isSpaceChar(c));
			return res * sgn;
		}

		public int nextInt() 
		{
			int c = read();
			while (isSpaceChar(c))
				c = read();
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			int res = 0;
			do 
			{
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res *= 10;
				res += c - '0';
				c = read();
			} 
			while (!isSpaceChar(c));
			return res * sgn;
		}

		public int[] nextIntArray(int n)
		{
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) 
			{
				arr[i] = nextInt();
			}
			return arr;
		}

		public long[] nextLongArray(int n)
		{
			long[] arr = new long[n];
			for (int i = 0; i < n; i++) 
			{
				arr[i] = nextLong();
			}
			return arr;
		}

		private boolean isSpaceChar(int c)
		{
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		private boolean isEndOfLine(int c) 
		{
			return c == '\n' || c == '\r' || c == -1;
		}
	}

	static class InputReader 
	{
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(InputStream inputstream) 
		{
			reader = new BufferedReader(new InputStreamReader(inputstream));
			tokenizer = null;
		}

		public String nextLine() 
		{
			String fullLine = null;
			while (tokenizer == null || !tokenizer.hasMoreTokens())
			{
				try 
				{
					fullLine = reader.readLine();
				} catch (IOException e)
				{
					throw new RuntimeException(e);
				}
				return fullLine;
			}
			return fullLine;
		}

		public String next()
		{
			while (tokenizer == null || !tokenizer.hasMoreTokens()) 
			{
				try 
				{
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) 
				{
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public long nextLong() 
		{
			return Long.parseLong(next());
		}

		public int[] nextIntArray(int n) 
		{
			int a[] = new int[n];
			for (int i = 0; i < n; i++) 
			{
				a[i] = nextInt();
			}
			return a;
		}

		public long[] nextLongArray(int n)
		{
			long a[] = new long[n];
			for (int i = 0; i < n; i++) 
			{
				a[i] = nextLong();
			}
			return a;
		}

		public int nextInt() 
		{
			return Integer.parseInt(next());
		}
	}

	static class OutputWriter 
	{
		private final PrintWriter writer;

		public OutputWriter(OutputStream outputStream) 
		{
			writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
		}

		public OutputWriter(Writer writer)
		{
			this.writer = new PrintWriter(writer);
		}

		public void print(Object... objects)
		{
			for (int i = 0; i < objects.length; i++) 
			{
				if (i != 0)
					writer.print(' ');
				writer.print(objects[i]);
			}
		}

		public void println(Object... objects)
		{
			print(objects);
			writer.println();
		}

		public void close() 
		{
			writer.close();
		}

		public void flush() 
		{
			writer.flush();
		}
	}
private static boolean oj = System.getProperty("ONLINE_JUDGE") != null;
	
	private static void tr(Object... o) 
	{
		if (!oj)
			System.out.println(Arrays.deepToString(o));
	}
}
