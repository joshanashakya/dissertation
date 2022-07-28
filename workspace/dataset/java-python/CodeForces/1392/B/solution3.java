import java.util.*;
import java.io.*;

public class _practise {
	  
	
		public static void main(String args[])
		{
	 
			FastReader in=new FastReader();
			PrintWriter so = new PrintWriter(new BufferedWriter(new  OutputStreamWriter(System.out)));
			int t = in.nextInt();
			while(t-->0)
			{
				int n = in.nextInt();
				long k = in.nextLong();
				long a[] = new long[n];
				long min = Long.MAX_VALUE , max = Long.MIN_VALUE ;
				for(int i=0 ; i<n ; i++) 
				{
					a[i] = in.nextLong();
					//min = Math.min(a[i], min);
					//max = Math.max(a[i] , max);
				}
			//	long temp = max-min ;
				if(k%2==0)
				{
					int x=2;
					while(x>0)
					{
						max=Arrays.stream(a).max().getAsLong(); 
					for(int i=0 ; i<n ; i++)
					{
						a[i]=max-a[i];
					}
					x--;
					}
					for(long i : a) so.print(i+" ");
				}
				else
				{
					max=Arrays.stream(a).max().getAsLong(); 
					for(int i=0 ; i<n ; i++)
					{
						a[i]=max-a[i];
					}
					for(long i : a) so.print(i+" ");
				}
				so.println();
				

			}
			so.flush();
			/*String s = in.next();
			int a[] = new int[n];
			ArrayList<Integer> al = new ArrayList<Integer>(); 
			StringBuilder sb = new StringBuilder();
			Set<Long> a = new HashSet<Long>();
			so.println("HELLO");*/
		}
	 
		static class FastReader
		{ 
			BufferedReader br; 
			StringTokenizer st; 
	 
			public FastReader() 
			{ 
				br = new BufferedReader(new InputStreamReader(System.in)); 
			} 
	 
			String next() 
			{ 
				while (st == null || !st.hasMoreElements()) 
				{ 
					try
					{ 
						st = new StringTokenizer(br.readLine()); 
					} 
					catch (IOException  e) 
					{ 
						e.printStackTrace(); 
					} 
				} 
				return st.nextToken(); 
			} 
	 
			int nextInt() 
			{ 
				return Integer.parseInt(next()); 
			} 
	 
			long nextLong() 
			{ 
				return Long.parseLong(next()); 
			} 
	 
			double nextDouble() 
			{ 
				return Double.parseDouble(next()); 
			} 
	 
			int[] readIntArray(int n)
			{
				int a[]=new int[n];
				for(int i=0;i<n;i++)a[i]=nextInt();
				return a;
			}
	 
			long[] readLongArray(int n)
			{
				long a[]=new long[n];
				for(int i=0;i<n;i++)a[i]=nextLong();
				return a;
			}
	 
			String nextLine() 
			{ 
				String str = ""; 
				try
				{ 
					str = br.readLine(); 
				} 
				catch (IOException e) 
				{ 
					e.printStackTrace(); 
				} 
				return str; 
			} 
		} 
	}
