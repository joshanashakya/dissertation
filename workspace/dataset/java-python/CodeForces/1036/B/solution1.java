/* * akshaygupta26 */import java.io.BufferedReader; import java.io.IOException; import java.io.InputStreamReader; import java.util.Scanner; import java.util.Random;import java.util.Arrays;import java.util.StringTokenizer; import java.util.ArrayList;import java.util.HashMap;import java.util.HashSet;import java.util.Collections; public class A {     public static void main(String[] args) 	{ 		FastReader sc=new FastReader(); 		StringBuffer ans=new StringBuffer();		int test=sc.nextInt();		while(test-->0)		{			long n=sc.nextLong(),m=sc.nextLong(),k=sc.nextLong();						long curx=0;			long cury=0;			long steps=0;			boolean flag=true;			// Case 1: n == m			if(n == m) {				steps =m;				k-=steps;				if(k<0) {					flag =false;				}								if(k>0) {										if(k%2 == 0)					{						steps+=(k);						k=0;					}					else {						steps+=(k-1);						k=1;					}										if(k == 1) {						steps--;					}				}								}						// Case 2: |n-m| == 1			else if(Math.abs(n-m) == 1) {								steps = Math.min(n, m);				k-=steps;				if(k<=0l) {					flag =false;				}								if(k == 2) {					++steps;				}				else if(k>2) {					if(k%2 == 0) {						steps+=(k-2);						steps++;					}					else {						steps+=(k-1);					}				}							}						// Case 3: |n-m| >=2			else { 				steps = Math.min(n, m);								k-=steps;								if(k<0) {					flag =false;				}				long more = Math.max(n, m) -Math.min(n, m);				if(k>more) {						long temp = k-more;						long left=more;						if(temp%2 == 1) {							temp--;							++left;						}						steps+=(temp);									k=(left);				}				else if(k<more) {					flag=false;				}					if(flag) {					if(n%2l == m%2l) {						steps+=(Math.max(n,m)-Math.min(n, m));						k-=(Math.max(n,m)-Math.min(n, m));						if(k == 1) {							--steps;						}					}					else {						if(k == (Math.max(n,m)-Math.min(n, m))+1) {							steps+=(Math.max(n,m)-Math.min(n, m));						}						else {							steps+=(Math.max(n,m)-Math.min(n, m))-1;						}					}				}				}						if(!flag) {				ans.append(-1+"\n");			}			else {				ans.append(steps+"\n");			}											}			    System.out.print(ans);	}           static final Random random=new Random();    	static void ruffleSort(int[] a) {		int n=a.length;//shuffle, then sort 		for (int i=0; i<n; i++) {			int oi=random.nextInt(n), temp=a[oi];			a[oi]=a[i]; a[i]=temp;		}		Arrays.sort(a);	}		static void ruffleSort(long[] a) {		int n=a.length;//shuffle, then sort 		for (int i=0; i<n; i++) {			int oi=random.nextInt(n);			long temp=a[oi];			a[oi]=a[i]; a[i]=temp;		}		Arrays.sort(a);	}		static class FastReader 	{ 		BufferedReader br; 		StringTokenizer st;  		public FastReader() 		{ 			br = new BufferedReader(new					InputStreamReader(System.in)); 		}  		String next() 		{ 			while (st == null || !st.hasMoreElements()) 			{ 				try				{ 					st = new StringTokenizer(br.readLine()); 				} 				catch (IOException e) 				{ 					e.printStackTrace(); 				} 			} 			return st.nextToken(); 		}  		int nextInt() 		{ 			return Integer.parseInt(next()); 		}  		long nextLong() 		{ 			return Long.parseLong(next()); 		}  		double nextDouble() 		{ 			return Double.parseDouble(next()); 		}  		String nextLine() 		{ 			String str = ""; 			try			{ 				str = br.readLine(); 			} 			catch (IOException e) 			{ 				e.printStackTrace(); 			} 			return str; 		} 	}   } 
