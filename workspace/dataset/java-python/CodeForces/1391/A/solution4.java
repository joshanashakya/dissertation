
			import java.io.BufferedReader;
			import java.io.IOException;
			import java.io.InputStreamReader;
			import java.util.Arrays;
		import java.util.HashMap;
		import java.util.Random;
		import java.util.*;
		import java.util.StringTokenizer;
			 import java.util.Scanner;
			public class Comptetive {
				static class Pair{
					int f;
					int s;
					
					Pair(int f,int s){
						this.f=f;
						this.s=s;
								
					}
				}
			public static void main(String[] args) {
					FastScanner fs=new FastScanner();
					int t=fs.nextInt();
					while(t--!=0) {
						int n=fs.nextInt();
						for(int i=n;i>=1;i--) System.out.print(i+" ");
						System.out.println();
					}
				
					
				}
				
			static int pow(int x,int y) {
				if(y==0) return 1;
				int res=pow(x,y/2);
				if(y%2==0) {
					return res*res;
				}
				else {
					return res*res*x;
				}
			}
				
				
				static final Random random=new Random();
				
				static void ruffleSort(int[] a) {
					int n=a.length;//shuffle, then sort 
					for (int i=0; i<n; i++) {
						int oi=random.nextInt(n), temp=a[oi];
						a[oi]=a[i]; a[i]=temp;
					}
					Arrays.sort(a);
				}
				
				static class FastScanner {
					BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
					StringTokenizer st=new StringTokenizer("");
					String next() {
						while (!st.hasMoreTokens())
							try {
								st=new StringTokenizer(br.readLine());
							} catch (IOException e) {
								e.printStackTrace();
							}
						return st.nextToken();
					}
					
					int nextInt() {
						return Integer.parseInt(next());
					}
					int[] readArray(int n) {
						int[] a=new int[n];
						for (int i=0; i<n; i++) a[i]=nextInt();
						return a;
					}
					int[][] readArrayArray(int n,int m){
						int[][] a=new int[n][n];
						for(int i=0;i<n;i++) {
							for(int j=0;j<m;j++) {
								a[i][j]=nextInt();
							}
						}
						return a;
					}
					long nextLong() {
						return Long.parseLong(next());
					}
		//			long[] readLongArray(long n) {
		//				long[] a=new long[n];
		//				for (int i=0; i<n; i++) a[i]=nextLong();
		//				return a;
		//			}
				}
			 
				
			}
