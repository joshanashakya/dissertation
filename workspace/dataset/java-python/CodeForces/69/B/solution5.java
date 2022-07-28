import java.io.*;import java.util.*;import java.math.*;import java.lang.*; import static java.lang.Math.*; public class Cf182 implements Runnable {	static class InputReader 	{		private InputStream stream;		private byte[] buf = new byte[1024];		private int curChar;		private int numChars;		private SpaceCharFilter filter;		private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		public InputReader(InputStream stream) 		{			this.stream = stream;		}				public int read()		{			if (numChars==-1) 				throw new InputMismatchException();            			if (curChar >= numChars) 			{				curChar = 0;				try				{					numChars = stream.read(buf);				}				catch (IOException e)				{					throw new InputMismatchException();				}                				if(numChars <= 0)               					return -1;			}			return buf[curChar++];		}     		public String nextLine()		{			String str = "";			try			{				str = br.readLine();			}			catch (IOException e)			{				e.printStackTrace();			}				return str;		}		public int nextInt() 		{			int c = read();            			while(isSpaceChar(c)) 				c = read();					int sgn = 1;        			if (c == '-') 			{				sgn = -1;				c = read();			}            			int res = 0;			do			{				if(c<'0'||c>'9') 					throw new InputMismatchException();				res *= 10;				res += c - '0';				c = read();			}			while (!isSpaceChar(c));         			return res * sgn;		}        		public long nextLong() 		{			int c = read();			while (isSpaceChar(c))				c = read();			int sgn = 1;			if (c == '-')			{				sgn = -1;				c = read();			}			long res = 0;						do 			{				if (c < '0' || c > '9')					throw new InputMismatchException();				res *= 10;				res += c - '0';				c = read();			}				while (!isSpaceChar(c));				return res * sgn;		}				public double nextDouble() 		{			int c = read();			while (isSpaceChar(c))				c = read();			int sgn = 1;			if (c == '-')			{				sgn = -1;				c = read();			}			double res = 0;			while (!isSpaceChar(c) && c != '.') 			{				if (c == 'e' || c == 'E')					return res * Math.pow(10, nextInt());				if (c < '0' || c > '9')					throw new InputMismatchException();				res *= 10;				res += c - '0';				c = read();			}			if (c == '.') 			{				c = read();				double m = 1;				while (!isSpaceChar(c))				{					if (c == 'e' || c == 'E')						return res * Math.pow(10, nextInt());					if (c < '0' || c > '9')						throw new InputMismatchException();					m /= 10;					res += (c - '0') * m;					c = read();				}			}			return res * sgn;		}    		public String readString() 		{			int c = read();			while (isSpaceChar(c))				c = read();			StringBuilder res = new StringBuilder();			do 			{				res.appendCodePoint(c);				c = read();			} 			while (!isSpaceChar(c));            			return res.toString();		}     		public boolean isSpaceChar(int c) 		{			if (filter != null)				return filter.isSpaceChar(c);			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;		}     		public String next()		{			return readString();		}        		public interface SpaceCharFilter		{			public boolean isSpaceChar(int ch);		}	}	public static void main(String args[]) throws Exception 	{		new Thread(null, new Cf182(),"Main",1<<27).start();	}				//  array sorting by colmpublic static void sortbyColumn(int arr[][], int col)     {                 Arrays.sort(arr, new Comparator<int[]>() {                       @Override          public int compare(final int[] entry1,                               final int[] entry2) {                          if (entry1[col] > entry2[col])                 return 1;             else                return -1;           }         });      } 		// gcd  	public static long findGCD(long arr[], int n) 	{ 		long result = arr[0]; 		for (int i = 1; i < n; i++) 			result = gcd(arr[i], result); 		return result; 	}	// fibonaci	static int fib(int n)     {         int a = 0, b = 1, c;         if (n == 0)             return a;         for (int i = 2; i <= n; i++)         {             c = a + b;             a = b;             b = c;         }         return b;     }     // sort a string    public static String sortString(String inputString)     {                 char tempArray[] = inputString.toCharArray();                            Arrays.sort(tempArray);                            return new String(tempArray);     }     // pair function        // list.add(new Pair<>(sc.nextInt(), i + 1));    //     Collections.sort(list, (a, b) -> Integer.compare(b.first, a.first));    // private static class Pair<F, S> {     //     private F first;     //     private S second;     //     public Pair() {}     //     public Pair(F first, S second) {    //         this.first = first;    //         this.second = second;    //     }    // }    	// SortedArrayList<Integer> test = new SortedArrayList<Integer>();    // test.insert(5);            public static class SortedArrayList<T> extends ArrayList<T> {                    @SuppressWarnings("unchecked")            public void insert(T value) {                add(value);                Comparable<T> cmp = (Comparable<T>) value;                for (int i = size()-1; i > 0 && cmp.compareTo(get(i-1)) < 0; i--)                    Collections.swap(this, i, i-1);            }        }        static long gcd(long a, long b)     {     if (a == 0)         return b;      return gcd(b % a, a);      }           static long lcm(long a, long b)     {         return (a*b)/gcd(a, b);     }        class Pair {     int x;     int y;           // Constructor     public Pair(int x, int y)         {             this.x = x;             this.y = y;         } }       class Compare {        void compare(Pair arr[], int n)     {         // Comparator to sort the pair according to second element         Arrays.sort(arr, new Comparator<Pair>() {             @Override public int compare(Pair p1, Pair p2)             {                 return p1.y - p2.y;             }         });       } } 	public void run()	{		InputReader sc = new InputReader(System.in);		PrintWriter w = new PrintWriter(System.out);		int n = sc.nextInt();		int m = sc.nextInt();		int temp[][] = new int[m][2];		int t[] = new int[m];		int c[] = new int[m];		int max = 0;		for(int i=0;i<m;i++)		{		    temp[i][0] = sc.nextInt();		    temp[i][1] = sc.nextInt();		    t[i] = sc.nextInt();		    c[i] = sc.nextInt();		    max = Math.max(max,temp[i][1]);		}		long ans = 0;		for(int i=1;i<=max;i++)		{		    int tx = Integer.MAX_VALUE;		    int cx = 0;		    for(int j=0;j<m;j++)		    {		        if(i>=temp[j][0] && i<=temp[j][1])		        {		            if(tx>t[j])		            {		                tx = t[j];		                cx = c[j];		            }		        }		    }		    ans += cx;		}		w.println(ans);        w.flush();	    w.close();	}}