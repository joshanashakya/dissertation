import java.util.*;import java.io.*;public class Main {	public static void main(String args[])	{ 		FastReader in=new FastReader();		PrintWriter so = new PrintWriter(new BufferedWriter(new   OutputStreamWriter(System.out)));				int n = in.nextInt();		int flag=0;		StringBuffer sb = new StringBuffer();		for(int i=1 ; i<=4 ; i++)		{		    int a = in.nextInt();		    int b = in.nextInt();		    int c = in.nextInt();		    int d = in.nextInt();		    if(flag==0)		    {		      if(a+c<=n) 		      {		        flag=1;		        sb.append(i+" ");		        if(a>c)		        {		            sb.append(a+" ");		            int temp=n-a;		            sb.append(temp+" ");		        }		        else		        {		             int temp=n-c;		            sb.append(temp+" ");		            sb.append(c+" ");		        }		      }		     else if(a+d<=n) 		      {		        flag=1;		        sb.append(i+" ");		        if(a>d)		        {		            sb.append(a+" ");		            int temp=n-a;		            sb.append(temp+" ");		        }		        else		        {		             int temp=n-d;		            sb.append(temp+" ");		            sb.append(d+" ");		        }		      }		      else if(b+c<=n) 		      {		        flag=1;		        sb.append(i+" ");		        if(b>c)		        {		            sb.append(b+" ");		            int temp=n-b;		            sb.append(temp+" ");		        }		        else		        {		             int temp=n-c;		            sb.append(temp+" ");		            sb.append(c+" ");		        }		      }		     else  if(b+d<=n) 		      {		        flag=1;		        sb.append(i+" ");		        if(b>d)		        {		            sb.append(b+" ");		            int temp=n-b;		            sb.append(temp+" ");		        }		        else		        {		             int temp=n-d;		            sb.append(temp+" ");		            sb.append(d+" ");		        }		      }		    }		}		if(flag==0) so.println("-1");		else so.println(sb);		so.flush();	}	static class FastReader	{ 		BufferedReader br; 		StringTokenizer st;  		public FastReader() 		{ 			br = new BufferedReader(new InputStreamReader(System.in)); 		}  		String next() 		{ 			while (st == null || !st.hasMoreElements()) 			{ 				try				{ 					st = new StringTokenizer(br.readLine()); 				} 				catch (IOException  e) 				{ 					e.printStackTrace(); 				} 			} 			return st.nextToken(); 		}  		int nextInt() 		{ 			return Integer.parseInt(next()); 		}  		long nextLong() 		{ 			return Long.parseLong(next()); 		}  		double nextDouble() 		{ 			return Double.parseDouble(next()); 		}  		int[] readIntArray(int n)		{			int a[]=new int[n];			for(int i=0;i<n;i++)a[i]=nextInt();			return a;		} 		long[] readLongArray(int n)		{			long a[]=new long[n];			for(int i=0;i<n;i++)a[i]=nextLong();			return a;		} 		String nextLine() 		{ 			String str = ""; 			try			{ 				str = br.readLine(); 			} 			catch (IOException e) 			{ 				e.printStackTrace(); 			} 			return str; 		} 	} }
