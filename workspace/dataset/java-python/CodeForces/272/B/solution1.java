import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.StringTokenizer; public class Zad272B { 	public static void main(String[] args) {		// TODO Auto-generated method stub		FastReader sc = new FastReader();		PrintWriter out = new PrintWriter(System.out);				int n = sc.nextInt();				int a[] = new int[33];				for(int i = 0;i<n;i++){			a[rec(sc.nextInt())]++;		}				double answer = 0;		for(int i = 0;i<a.length;i++) {			double summ = (1+a[i]-1)/2.0*(a[i]-1);			answer+=summ;		}		out.println((long)answer);		out.close();	}	 static int rec(long x) {		int answer = 0;		for(int k = 31;k>=0;k--){		    if((x&(1<<k))!=0)answer++;		}				return answer;	}	static class FastReader 	{ 		BufferedReader br; 		StringTokenizer st;  		public FastReader() 		{ 			br = new BufferedReader(new					InputStreamReader(System.in)); 		}  		String next() 		{ 			while (st == null || !st.hasMoreElements()) 			{ 				try				{ 					st = new StringTokenizer(br.readLine()); 				} 				catch (IOException e) 				{ 					e.printStackTrace(); 				} 			} 			return st.nextToken(); 		}  		int nextInt() 		{ 			return Integer.parseInt(next()); 		}  		long nextLong() 		{ 			return Long.parseLong(next()); 		}  		double nextDouble() 		{ 			return Double.parseDouble(next()); 		}  		String nextLine() 		{ 			String str = ""; 			try			{ 				str = br.readLine(); 			} 			catch (IOException e) 			{ 				e.printStackTrace(); 			} 			return str; 		} 	}}