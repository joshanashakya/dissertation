import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.ArrayDeque;import java.util.ArrayList;import java.util.Arrays;import java.util.Collections;import java.util.HashMap;import java.util.Objects;import java.util.Random;import java.util.StringTokenizer;import java.util.TreeMap;import java.util.TreeSet; public class Solution{		 		    public static void main(String[] args) throws IOException {         	FastScanner fs = new FastScanner();    	PrintWriter out = new PrintWriter(System.out);    	    	    		    	int tt = 1;    	while(tt-->0) {    		    		int n = fs.nextInt();    		    		    		TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>(Collections.reverseOrder());    		    		int[] a = new int[n];    		    		for(int i=0;i<n;i++) {    			a[i] = fs.nextInt();    			if(!map.containsKey(a[i])) map.put(a[i], new ArrayList<Integer>());    			map.get(a[i]).add(i);    		}    		    		int[] lb = lessBefore(a, n);    		int[] la = lessAfter(a, n);    		    		int[] ans = new int[n+1];    		int ind = 1;    		    		    		for(int k: map.keySet()) {    			int maxLen = 0;    			for(int i: map.get(k)) {    				maxLen = Math.max(maxLen, la[i]-lb[i]-1);    			}    			while(ind<=maxLen) {    				ans[ind] = k; ind++;    			}    		}    		    		for(int i=1;i<=n;i++) {    			out.print(ans[i]+" ");    		}    		    		    		    		    		    	}    	    		    		    		    	out.close();    		    }           static int[] lessBefore(int[] arr, int n) {    	int[] ans = new int[n];    	ArrayDeque<Integer> q = new ArrayDeque<>();    	for(int i=0;i<n;i++) {    		while(!q.isEmpty() && arr[q.getLast()]>=arr[i]) q.removeLast();    		ans[i] = (q.isEmpty())?-1:q.getLast();    		q.add(i);    	}    	return ans;    }               static int[] lessAfter(int[] arr, int n) {    	int[] ans = new int[n];    	ArrayDeque<Integer> q = new ArrayDeque<>();    	for(int i=n-1;i>=0;i--) {    		while(!q.isEmpty() && arr[q.getLast()]>=arr[i]) q.removeLast();    		ans[i] = (q.isEmpty())?n:q.getLast();    		q.add(i);    	}    	return ans;    }                                        static final Random random=new Random();    	    static void ruffleSort(int[] a) {    	int n=a.length;//shuffle, then sort     	for (int i=0; i<n; i++) {    		int oi=random.nextInt(n); int temp=a[oi];    		a[oi]=a[i]; a[i]=temp;    	}    	Arrays.sort(a);    }             static void reverse(int[] arr, int l, int r) {    	for(int i=l;i<l+(r-l)/2;i++){    		int temp = arr[i]; arr[i] = arr[r-i+l-1]; arr[r-i+l-1] = temp;    	}    }        	    	    static class FastScanner{    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    	StringTokenizer st = new StringTokenizer("");         	public String next(){    		while(!st.hasMoreElements()){    			try{    				st = new StringTokenizer(br.readLine());    			} catch(IOException e){    				e.printStackTrace();    			}    		}    		return st.nextToken();    	}    		    	public String nextLine() throws IOException {    		return br.readLine();    	}    		    	public int nextInt(){    		return Integer.parseInt(next());    	}         	public int[] readArray(int n){    		int[] a = new int[n];    		for(int i=0;i<n;i++)    			a[i] = nextInt();    		return a;    	}    		    	public long nextLong() {    		return Long.parseLong(next());    	}    		    	public char nextChar() {    		return next().toCharArray()[0];    	}    }   	}