import java.util.*;import java.io.*;public class Main {	public static void main(String args[])	{ 		FastReader in=new FastReader();		PrintWriter so = new PrintWriter(new BufferedWriter(new   OutputStreamWriter(System.out)));		String s = in.next();		int h = Integer.parseInt(s.substring(0,2));		int m = Integer.parseInt(s.substring(3,5));		h=(h>=12)?h-12:h;		so.println((h*60*0.5)+(m*0.5)+" "+(m*60*0.1));		so.flush();	}	static class FastReader	{ 		BufferedReader br; 		StringTokenizer st;  		public FastReader() 		{ 			br = new BufferedReader(new InputStreamReader(System.in)); 		}  		String next() 		{ 			while (st == null || !st.hasMoreElements()) 			{ 				try				{ 					st = new StringTokenizer(br.readLine()); 				} 				catch (IOException  e) 				{ 					e.printStackTrace(); 				} 			} 			return st.nextToken(); 		}  		int nextInt() 		{ 			return Integer.parseInt(next()); 		}  		long nextLong() 		{ 			return Long.parseLong(next()); 		}  		double nextDouble() 		{ 			return Double.parseDouble(next()); 		}  		int[] readIntArray(int n)		{			int a[]=new int[n];			for(int i=0;i<n;i++)a[i]=nextInt();			return a;		} 		long[] readLongArray(int n)		{			long a[]=new long[n];			for(int i=0;i<n;i++)a[i]=nextLong();			return a;		} 		String nextLine() 		{ 			String str = ""; 			try			{ 				str = br.readLine(); 			} 			catch (IOException e) 			{ 				e.printStackTrace(); 			} 			return str; 		} 	} }
