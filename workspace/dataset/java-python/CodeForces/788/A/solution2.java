//189301019.akshayimport java.io.BufferedReader; import java.io.IOException; import java.io.InputStreamReader; import java.util.Scanner; import java.util.Random;import java.util.Arrays;import java.util.StringTokenizer; import java.util.ArrayList;import java.util.HashMap;import java.util.HashSet;import java.util.LinkedList;import java.util.Queue;import java.util.Collections; public class C {     public static void main(String[] args) 	{     	FastReader sc=new FastReader();		StringBuffer ans=new StringBuffer();		int test=1;		while(test-->0)		{						int n=sc.nextInt();									long brr[]=new long[n+1];			for(int i=0;i<n;i++) brr[i+1]=sc.nextLong();												long [] arr=new long[n+1];			for(int i=0;i<n-1;i++) arr[i+1]=Math.abs(brr[i+1]-brr[i+2]);						long dp[][]=new long[n+1][2];						/*			 * 0: +ve			 * 1: -ve			 */			long maxm =Long.MIN_VALUE;			for(int i=1;i<=n;i++) {				dp[i][0] = Math.max(dp[i][0], dp[i-1][1])+arr[i];				dp[i][1] = Math.max(dp[i][1], dp[i-1][0])-arr[i];				maxm= Math.max(Math.max(dp[i][0], dp[i][1]), maxm);//				System.out.println(dp[i][0]+" "+dp[i][1]);			}			ans.append(maxm+"\n");		}			    System.out.print(ans);	}          static final Random random=new Random();    	static void ruffleSort(int[] a) {		int n=a.length;//shuffle, then sort 		for (int i=0; i<n; i++) {			int oi=random.nextInt(n), temp=a[oi];			a[oi]=a[i]; a[i]=temp;		}		Arrays.sort(a);	}		static void ruffleSort(long[] a) {		int n=a.length;//shuffle, then sort 		for (int i=0; i<n; i++) {			int oi=random.nextInt(n);			long temp=a[oi];			a[oi]=a[i]; a[i]=temp;		}		Arrays.sort(a);	}		static class FastReader 	{ 		BufferedReader br; 		StringTokenizer st;  		public FastReader() 		{ 			br = new BufferedReader(new					InputStreamReader(System.in)); 		}  		String next() 		{ 			while (st == null || !st.hasMoreElements()) 			{ 				try				{ 					st = new StringTokenizer(br.readLine()); 				} 				catch (IOException e) 				{ 					e.printStackTrace(); 				} 			} 			return st.nextToken(); 		}  		int nextInt() 		{ 			return Integer.parseInt(next()); 		}  		long nextLong() 		{ 			return Long.parseLong(next()); 		}  		double nextDouble() 		{ 			return Double.parseDouble(next()); 		}  		String nextLine() 		{ 			String str = ""; 			try			{ 				str = br.readLine(); 			} 			catch (IOException e) 			{ 				e.printStackTrace(); 			} 			return str; 		} 	}   } 