import java.util.*;import java.io.*; public class _practise { 	public static void main(String args[])	{ 		FastReader in=new FastReader();		PrintWriter so = new PrintWriter(new BufferedWriter(new  OutputStreamWriter(System.out)));		long t = in.nextLong();		while(t-->0)		{		int n = in.nextInt();		long a[] = new long[n];		for(int i=0 ; i<n ; i++) 		{			a[i] = in.nextLong();		}	    for(int i=0 ; i<n ; i+=2)	    {	    	if(a[i]>=0 && a[i+1]>=0)	    		so.print("-"+a[i+1]+" "+a[i]+" ");	    	else if(a[i]<0 && a[i+1]>=0)	    		so.print(a[i+1]+" "+(a[i]*-1)+" ");	    	else if(a[i]>=0 && a[i+1]<0)	    		so.print((-1*a[i+1])+" "+a[i]+" ");	    	else	    		so.print(a[i+1]+" "+(-1*a[i])+" ");	    }	    so.println();		}		so.flush();		/*String s = in.next();			int a[] = new int[n];			ArrayList<Integer> al = new ArrayList<Integer>(); 			StringBuilder sb = new StringBuilder();			Set<Long> a = new HashSet<Long>();			so.println("HELLO");*/	} 	static class FastReader	{ 		BufferedReader br; 		StringTokenizer st;  		public FastReader() 		{ 			br = new BufferedReader(new InputStreamReader(System.in)); 		}  		String next() 		{ 			while (st == null || !st.hasMoreElements()) 			{ 				try				{ 					st = new StringTokenizer(br.readLine()); 				} 				catch (IOException  e) 				{ 					e.printStackTrace(); 				} 			} 			return st.nextToken(); 		}  		int nextInt() 		{ 			return Integer.parseInt(next()); 		}  		long nextLong() 		{ 			return Long.parseLong(next()); 		}  		double nextDouble() 		{ 			return Double.parseDouble(next()); 		}  		int[] readIntArray(int n)		{			int a[]=new int[n];			for(int i=0;i<n;i++)a[i]=nextInt();			return a;		} 		long[] readLongArray(int n)		{			long a[]=new long[n];			for(int i=0;i<n;i++)a[i]=nextLong();			return a;		} 		String nextLine() 		{ 			String str = ""; 			try			{ 				str = br.readLine(); 			} 			catch (IOException e) 			{ 				e.printStackTrace(); 			} 			return str; 		} 	} }
