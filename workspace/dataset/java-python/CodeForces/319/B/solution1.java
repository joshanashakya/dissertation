import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.ArrayDeque;import java.util.ArrayList;import java.util.Arrays;import java.util.Collections;import java.util.HashMap;import java.util.HashSet;import java.util.Iterator;import java.util.PriorityQueue;import java.util.Random;import java.util.StringTokenizer;import java.util.TreeMap; public class Solution{		static final int inf = (int)1e8;			    public static void main(String[] args) throws IOException {         	FastScanner fs = new FastScanner();    	PrintWriter out = new PrintWriter(System.out);    	    	    		    	int tt = 1;    	while(tt-->0) {    		    		int n = fs.nextInt();    		int[] a = new int[n+1];    		    		for(int i=1;i<=n;i++) a[i] = fs.nextInt();    		    		//num[i] --- no. of steps in which the ith psycho is murdered    		//the physcho which is not murdered has inf stesp    		    		int[] num = new int[n+1];    		num[0] = inf;    		    		ArrayDeque<Integer> q = new ArrayDeque<>();    		q.add(0);    		    		for(int i=1;i<=n;i++) {    			num[i] = 1;    			while(!q.isEmpty() && a[i]>a[q.getLast()]) {    				num[i] = Math.max(num[i], num[q.pollLast()]+1);    			}    			q.add(i);    		}    		    		int ans = 0;    		for(int i=1;i<=n;i++) {    			if(num[i]<inf) ans = Math.max(ans, num[i]);     		}    		    		out.println(ans);    		    		    		    		    		    		    	}    	    		    		    		    	out.close();    		    }                            static final Random random=new Random();    	    static void ruffleSort(int[] a) {    	int n=a.length;//shuffle, then sort     	for (int i=0; i<n; i++) {    		int oi=random.nextInt(n); int temp=a[oi];    		a[oi]=a[i]; a[i]=temp;    	}    	Arrays.sort(a);    }             static void reverse(int[] arr, int l, int r) {    	for(int i=l;i<l+(r-l)/2;i++){    		int temp = arr[i]; arr[i] = arr[r-i+l-1]; arr[r-i+l-1] = temp;    	}    }        static void reverse(long[] arr, int l, int r) {    	for(int i=l;i<l+(r-l)/2;i++){    		long temp = arr[i]; arr[i] = arr[r-i+l-1]; arr[r-i+l-1] = temp;    	}    }            static <T> void reverse(T[] arr, int l, int r) {    	for(int i=l;i<l+(r-l)/2;i++) {    		T temp = arr[i]; arr[i] = arr[r-i+l-1]; arr[r-i+l-1] = temp;    	}    }    	    	    static class FastScanner{    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    	StringTokenizer st = new StringTokenizer("");         	public String next(){    		while(!st.hasMoreElements()){    			try{    				st = new StringTokenizer(br.readLine());    			} catch(IOException e){    				e.printStackTrace();    			}    		}    		return st.nextToken();    	}    		    	public String nextLine() throws IOException {    		return br.readLine();    	}    		    	public int nextInt(){    		return Integer.parseInt(next());    	}         	public int[] readArray(int n){    		int[] a = new int[n];    		for(int i=0;i<n;i++)    			a[i] = nextInt();    		return a;    	}    		    	public long nextLong() {    		return Long.parseLong(next());    	}    		    	public char nextChar() {    		return next().toCharArray()[0];    	}    }   	}