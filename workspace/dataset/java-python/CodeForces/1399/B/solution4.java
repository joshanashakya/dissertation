import java.util.*;
import java.io.*;

public class _practise {

	public static void main(String args[])
	{

		FastReader in=new FastReader();
		PrintWriter so = new PrintWriter(new BufferedWriter(new  OutputStreamWriter(System.out)));
		long t = in.nextLong();
		while(t-->0)
		{
		int n = in.nextInt();
		long a[] = new long[n];
		long b[] = new long[n];
		long ma = Long.MAX_VALUE , mb = Long.MAX_VALUE;
		for(int i=0 ; i<n ; i++) { a[i] = in.nextLong(); ma = Math.min(ma , a[i]); }
		for(int i=0 ; i<n ; i++) { b[i] = in.nextLong(); mb = Math.min(mb , b[i]); }
		long ans=0;
		 for(int i=0 ; i<n ; i++)
		 {
			 //so.println(a[i]+" "+ma+" "+b[i]+" "+mb);
			 if(a[i]>ma && b[i]>mb)
			 {
				 if((a[i]-ma)<(b[i]-mb)) ans=ans+((a[i]-ma) + ((b[i]-(a[i]-ma))-mb));
				 else ans=ans+(b[i]-mb) + ((a[i]-(b[i]-mb))-ma);
				 
			 }
			 else if(a[i]>ma)
				 ans+=a[i]-ma;
			 else ans+=b[i]-mb;
			// so.println(ans+" "); 
		 }
		 //so.println();
		 so.println(ans);
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
