import java.io.BufferedReader;import java.io.FileInputStream;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintStream;import java.io.PrintWriter;import java.text.DecimalFormat;import java.util.ArrayDeque;import java.util.ArrayList;import java.util.Arrays;import java.util.Collections;import java.util.Comparator;import java.util.HashMap;import java.util.HashSet;import java.util.PriorityQueue;import java.util.Random;import java.util.StringTokenizer; public class Solution{		    public static void main(String[] args) throws IOException {    			    	FastScanner fs = new FastScanner();    	PrintWriter out = new PrintWriter(System.out);    	    	    		    	int tt = 1;    	while(tt-->0) {    		    		int n = fs.nextInt();    		    		long num1 = 0, num2 = 0;    		    		for(int i=0;i<n;i++) {    			int a = fs.nextInt();    			int b = (i&1);    			num1 += (a+1-b)/2;    			num2 += (a+b)/2;    		}    		    		out.println(Math.min(num1, num2));    		    		    		    	}    	    		    		    	out.close();    		    }                                      static final Random random=new Random();        static <T> void shuffle(T[] arr) {    	int n = arr.length;    	for(int i=0;i<n;i++	) {    		int k = random.nextInt(n);    		T temp = arr[k]; arr[k] = arr[i]; arr[i] = temp;    	}    }        	    static void ruffleSort(int[] a) {    	int n=a.length;//shuffle, then sort     	for (int i=0; i<n; i++) {    		int oi=random.nextInt(n); int temp=a[oi];    		a[oi]=a[i]; a[i]=temp;    	}    	Arrays.sort(a);    }        static void ruffleSort(long[] a) {    	int n=a.length;//shuffle, then sort     	for (int i=0; i<n; i++) {    		int oi=random.nextInt(n); long temp=a[oi];    		a[oi]=a[i]; a[i]=temp;    	}    	Arrays.sort(a);    }             static void reverse(int[] arr, int l, int r) {    	for(int i=l;i<l+(r-l)/2;i++){    		int temp = arr[i]; arr[i] = arr[r-i+l-1]; arr[r-i+l-1] = temp;    	}    }        static void reverse(long[] arr, int l, int r) {    	for(int i=l;i<l+(r-l)/2;i++){    		long temp = arr[i]; arr[i] = arr[r-i+l-1]; arr[r-i+l-1] = temp;    	}    }            static <T> void reverse(T[] arr, int l, int r) {    	for(int i=l;i<l+(r-l)/2;i++) {    		T temp = arr[i]; arr[i] = arr[r-i+l-1]; arr[r-i+l-1] = temp;    	}    }    	    	    static class FastScanner{    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    	StringTokenizer st = new StringTokenizer("");         	public String next(){    		while(!st.hasMoreElements()){    			try{    				st = new StringTokenizer(br.readLine());    			} catch(IOException e){    				e.printStackTrace();    			}    		}    		return st.nextToken();    	}    		    	public String nextLine() throws IOException {    		return br.readLine();    	}    		    	public int nextInt(){    		return Integer.parseInt(next());    	}         	public int[] readArray(int n){    		int[] a = new int[n];    		for(int i=0;i<n;i++)    			a[i] = nextInt();    		return a;    	}    		    	public long nextLong() {    		return Long.parseLong(next());    	}    		    	public char nextChar() {    		return next().toCharArray()[0];    	}    }   	}