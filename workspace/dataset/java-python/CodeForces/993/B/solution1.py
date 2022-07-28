import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.ArrayDeque;import java.util.ArrayList;import java.util.Arrays;import java.util.Collections;import java.util.HashMap;import java.util.HashSet;import java.util.Random;import java.util.StringTokenizer;import java.util.TreeMap;import java.util.TreeSet; public class Solution{		    public static void main(String[] args) throws IOException {         	FastScanner fs = new FastScanner();    	PrintWriter out = new PrintWriter(System.out);    	    	    		    	int tt = 1;    	while(tt-->0) {    		    		int n = fs.nextInt(), m = fs.nextInt();    		Pair[] a = new Pair[n];    		for(int i=0;i<n;i++) {    			a[i] = new Pair(fs.nextInt(), fs.nextInt());    		}    		    		Pair[] b = new Pair[m];    		for(int i=0;i<m;i++) {    			b[i] = new Pair(fs.nextInt(), fs.nextInt());    		}    		    		int q = 2;    		    		HashSet<Integer>[] set = new HashSet[2];    		for(int i=0;i<2;i++) set[i] = new HashSet<Integer>();    		    		while(q-->0) {        		for(int i=0;i<n;i++) {        			int pre = -1;        			for(int j=0;j<m;j++) {        				int k = a[i].matches(b[j]);        				if(k==-1) continue;        				if(pre!=-1 && pre!=k) {        					out.println(-1);        					out.flush();        					return;        				}        				pre = k;        				set[q].add(k);        			}        		}    			    			int temp = n; n = m; m = temp;    			Pair[] temp2 = a; a = b; b = temp2;    		}    		    		if(set[0].size()>1 || set[1].size()>1) {    			out.println(0);    		}    		else {    			out.println(set[0].iterator().next());    		}    		    		    	}    	    		    		    		    	out.close();    		    }             static class Pair{    	int x, y;    	    	Pair(int x, int y){    		this.x = x;    		this.y = y;    	}    	    	int matches(Pair p) {    		if(p.x==this.x || p.x==this.y) {    			if (p.y!=this.x && p.y!=this.y) return p.x;    		}    		if(p.y==this.x || p.y==this.y) {    			if (p.x!=this.x && p.x!=this.y) return p.y;    		}    		return -1;    	}    	    }                    static final Random random=new Random();    	    static void ruffleSort(int[] a) {    	int n=a.length;//shuffle, then sort     	for (int i=0; i<n; i++) {    		int oi=random.nextInt(n); int temp=a[oi];    		a[oi]=a[i]; a[i]=temp;    	}    	Arrays.sort(a);    }             	    	    static class FastScanner{    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    	StringTokenizer st = new StringTokenizer("");         	public String next(){    		while(!st.hasMoreElements()){    			try{    				st = new StringTokenizer(br.readLine());    			} catch(IOException e){    				e.printStackTrace();    			}    		}    		return st.nextToken();    	}    		    	public String nextLine() throws IOException {    		return br.readLine();    	}    		    	public int nextInt(){    		return Integer.parseInt(next());    	}         	public int[] readArray(int n){    		int[] a = new int[n];    		for(int i=0;i<n;i++)    			a[i] = nextInt();    		return a;    	}    		    	public long nextLong() {    		return Long.parseLong(next());    	}    		    	public char nextChar() {    		return next().toCharArray()[0];    	}    }   	}