//189301019.akshayimport java.io.BufferedReader; import java.io.IOException; import java.io.InputStreamReader; import java.util.Scanner;import java.util.Set;import java.util.Random;import java.util.Arrays;import java.util.StringTokenizer;import java.util.ArrayList;import java.util.HashMap;import java.util.HashSet;import java.util.List;import java.util.Collections;import java.util.Comparator; public class A { 		static class Pair {		int i;		int topic;		Pair(){}		Pair(int i,int topic){			this.i=i;			this.topic=topic;		}	}		static class customSort implements Comparator<Pair>{		public int compare(Pair a,Pair b) {			return a.topic-b.topic;		}			}	    public static void main(String[] args) 	{ 		FastReader sc=new FastReader(); 		StringBuffer ans=new StringBuffer();		int test=1;		while(test-->0)		{			int n=sc.nextInt(),m=sc.nextInt();			ArrayList<Integer> arr[]=new ArrayList[n+1];			for(int i=0;i<=n;i++) arr[i]=new ArrayList<>();						for(int i=0;i<m;i++) {				int a=sc.nextInt()-1;				int b=sc.nextInt()-1;								arr[a].add(b);				arr[b].add(a);			}						int topics[]=new int[n];			for(int i=0;i<n;i++) topics[i]=sc.nextInt()-1;			ArrayList<Pair> li=new ArrayList<>();			for(int i=0;i<n;i++) {				Set<Integer> set=new HashSet<>();				for(int adj:arr[i]) {					if(topics[adj]<topics[i]) {						set.add(topics[adj]);					}					if(topics[adj] == topics[i]) {						System.out.println(-1);						System.exit(0);					}				}								if(set.size() != topics[i]) {					System.out.println(-1);					System.exit(0);				}				li.add(new Pair(i,topics[i]));			}			Collections.sort(li,new customSort());									for(Pair x:li) {				ans.append((x.i)+1+" ");			}				}			    System.out.print(ans);	}         static final Random random=new Random();    	static void ruffleSort(int[] a) {		int n=a.length;//shuffle, then sort 		for (int i=0; i<n; i++) {			int oi=random.nextInt(n), temp=a[oi];			a[oi]=a[i]; a[i]=temp;		}		Arrays.sort(a);	}		static void ruffleSort(long[] a) {		int n=a.length;//shuffle, then sort 		for (int i=0; i<n; i++) {			int oi=random.nextInt(n);			long temp=a[oi];			a[oi]=a[i]; a[i]=temp;		}		Arrays.sort(a);	}		static class FastReader 	{ 		BufferedReader br; 		StringTokenizer st;  		public FastReader() 		{ 			br = new BufferedReader(new					InputStreamReader(System.in)); 		}  		String next() 		{ 			while (st == null || !st.hasMoreElements()) 			{ 				try				{ 					st = new StringTokenizer(br.readLine()); 				} 				catch (IOException e) 				{ 					e.printStackTrace(); 				} 			} 			return st.nextToken(); 		}  		int nextInt() 		{ 			return Integer.parseInt(next()); 		}  		long nextLong() 		{ 			return Long.parseLong(next()); 		}  		double nextDouble() 		{ 			return Double.parseDouble(next()); 		}  		String nextLine() 		{ 			String str = ""; 			try			{ 				str = br.readLine(); 			} 			catch (IOException e) 			{ 				e.printStackTrace(); 			} 			return str; 		} 	}   } 