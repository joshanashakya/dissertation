import java.util.*;import java.io.*; public class _practise {			public static void main(String args[])		{	 			FastReader in=new FastReader();			PrintWriter so = new PrintWriter(new BufferedWriter(new  OutputStreamWriter(System.out)));			int t = 1;			while(t-->0)			{			int n = in.nextInt();			int a[] = new int[n];			int min=101 , s=0;			for(int i=0 ; i<n ; i++)			{				a[i] = in.nextInt();				min = Math.min(a[i] , min);				if(i>0 && a[i]==a[i-1]) s++;			}			if(n!=2)			{			boolean flag=true;			int c=0;			int ans=-1;			for(int i=0 ; i<n ; i++)			{				if(a[i]%min==0) c++;			}			if(c==n) { ans=min; flag=false; }									if(flag)           for(int i=2 ; i<=min ; i++) 			{        	    c=0 ; 				for(int j=0 ; j<n ; j++)				{					if(a[j]%i==0) c++;				}				if(c==n)				{					ans=i ;					flag=false;					break;				}			}         //  so.println(ans);           if(s==n-1) so.println(a[0]*n);           else if(flag) so.println(n);           else so.println(ans*n);			}						else			{				while(a[1]!=a[0])					if(a[1]>a[0]) a[1]=a[1]-a[0];					else if(a[0]>a[1]) a[0]=a[0]-a[1];				so.println(a[0]*2);			}					}			so.flush();			/*String s = in.next();			int a[] = new int[n];			ArrayList<Integer> al = new ArrayList<Integer>(); 			StringBuilder sb = new StringBuilder();			Set<Long> a = new HashSet<Long>();			so.println("HELLO");*/		}	 		static class FastReader		{ 			BufferedReader br; 			StringTokenizer st; 	 			public FastReader() 			{ 				br = new BufferedReader(new InputStreamReader(System.in)); 			} 	 			String next() 			{ 				while (st == null || !st.hasMoreElements()) 				{ 					try					{ 						st = new StringTokenizer(br.readLine()); 					} 					catch (IOException  e) 					{ 						e.printStackTrace(); 					} 				} 				return st.nextToken(); 			} 	 			int nextInt() 			{ 				return Integer.parseInt(next()); 			} 	 			long nextLong() 			{ 				return Long.parseLong(next()); 			} 	 			double nextDouble() 			{ 				return Double.parseDouble(next()); 			} 	 			int[] readIntArray(int n)			{				int a[]=new int[n];				for(int i=0;i<n;i++)a[i]=nextInt();				return a;			}	 			long[] readLongArray(int n)			{				long a[]=new long[n];				for(int i=0;i<n;i++)a[i]=nextLong();				return a;			}	 			String nextLine() 			{ 				String str = ""; 				try				{ 					str = br.readLine(); 				} 				catch (IOException e) 				{ 					e.printStackTrace(); 				} 				return str; 			} 		} 	}
