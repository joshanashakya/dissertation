//189301019.akshayimport java.io.BufferedReader; import java.io.IOException; import java.io.InputStreamReader; import java.util.Scanner; import java.util.Random;import java.util.Arrays;import java.util.StringTokenizer; import java.util.ArrayList;import java.util.HashMap;import java.util.HashSet;import java.util.Collections; public class A {     public static void main(String[] args) 	{ 		FastReader sc=new FastReader(); 		StringBuffer ans=new StringBuffer();		int test=1;		while(test-->0)		{			int x=sc.nextInt();			int hh=sc.nextInt();			int mm=sc.nextInt();						int cnt=0;			while(!isLucky(hh,mm)) {				++cnt;				if(mm>=x) {					mm-=x;					continue;				}				else {					int toMinus=x-mm;					int newH = (hh == 0?23:hh-1);					int newM = (60-toMinus);					hh =newH;					mm =newM;				}			}			ans.append(cnt);						ans.append("\n");		}			    System.out.print(ans);	}         static boolean isLucky(int hh,int mm) {    	while(hh>0) {    		if(hh%10 == 7) return true;    		hh/=10;    	}    	while(mm>0) {    		if(mm%10 == 7) return true;    		mm/=10;    	}    	return false;    }    static final Random random=new Random();    	static void ruffleSort(int[] a) {		int n=a.length;//shuffle, then sort 		for (int i=0; i<n; i++) {			int oi=random.nextInt(n), temp=a[oi];			a[oi]=a[i]; a[i]=temp;		}		Arrays.sort(a);	}		static void ruffleSort(long[] a) {		int n=a.length;//shuffle, then sort 		for (int i=0; i<n; i++) {			int oi=random.nextInt(n);			long temp=a[oi];			a[oi]=a[i]; a[i]=temp;		}		Arrays.sort(a);	}		static class FastReader 	{ 		BufferedReader br; 		StringTokenizer st;  		public FastReader() 		{ 			br = new BufferedReader(new					InputStreamReader(System.in)); 		}  		String next() 		{ 			while (st == null || !st.hasMoreElements()) 			{ 				try				{ 					st = new StringTokenizer(br.readLine()); 				} 				catch (IOException e) 				{ 					e.printStackTrace(); 				} 			} 			return st.nextToken(); 		}  		int nextInt() 		{ 			return Integer.parseInt(next()); 		}  		long nextLong() 		{ 			return Long.parseLong(next()); 		}  		double nextDouble() 		{ 			return Double.parseDouble(next()); 		}  		String nextLine() 		{ 			String str = ""; 			try			{ 				str = br.readLine(); 			} 			catch (IOException e) 			{ 				e.printStackTrace(); 			} 			return str; 		} 	}   } 