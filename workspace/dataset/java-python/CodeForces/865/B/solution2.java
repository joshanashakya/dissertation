import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.ArrayDeque;import java.util.ArrayList;import java.util.Arrays;import java.util.Collections;import java.util.HashMap;import java.util.HashSet;import java.util.Random;import java.util.StringTokenizer;import java.util.TreeMap;import java.util.TreeSet; public class Solution{			static final int N = (int)1e5+10;			    public static void main(String[] args) throws IOException {         	FastScanner fs = new FastScanner();    	PrintWriter out = new PrintWriter(System.out);    	    	    		    	int tt = 1;    	while(tt-->0) {    		    		int n = fs.nextInt(), s = fs.nextInt();    		ArrayList<int[]> a = new ArrayList<int[]>();    		ArrayList<int[]> b = new ArrayList<int[]>();    		    		long tot = 0;    		    		long st1 = 0, st2 = 0;    		    		for(int i=0;i<n;i++) {    			int sl = fs.nextInt(), h1 = fs.nextInt(), h2 = fs.nextInt();    			if(h1>h2) {    				a.add(new int[] {sl, h1, h2});    				st1 += sl;    			}    			else {    				b.add(new int[] {sl, h1, h2});    				st2 += sl;    			}    			tot += sl;    		}    		    		    		Collections.sort(a, (x, y) -> (y[1]-y[2]) - (x[1] - x[2]));    		Collections.sort(b, (x, y) ->  (y[2]-y[1]) - (x[2]-x[1]));    		    		    		long num = (tot+s-1)/s;    		long des = (st1+s-1)/s + (st2+s-1)/s;    		    		if(des==num) {    			out.println(cal(a, st1, 1) + cal(b, st2, 2));    		}    		else {    			long ans1 = cal(a, st1/s*s, 1) + cal(b, st2, 2) + cal(a, st1, 2) - cal(a, st1/s*s, 2);    			long ans2 = cal(a, st1, 1) + cal(b, st2/s*s, 2) + cal(b, st2, 1) - cal(b, st2/s*s, 1);    			    			int x = 1;    			    			out.println(Math.max(ans1, ans2));    		}    		    		    		    		    		    		    		    		    		    		    	}    	    		    		    		    	out.close();    		    }            static long cal(ArrayList<int[]> list, long sl, int id) {    	long sum = 0;    	long cnt = 0;    	for(int[] ar: list) {    		long k = Math.min(ar[0], sl-cnt);    		sum += k*(ar[id]);    		cnt += k;    	}    	return sum;    }                                            static final Random random=new Random();    	    static void ruffleSort(int[] a) {    	int n=a.length;//shuffle, then sort     	for (int i=0; i<n; i++) {    		int oi=random.nextInt(n); int temp=a[oi];    		a[oi]=a[i]; a[i]=temp;    	}    	Arrays.sort(a);    }             	    	    static class FastScanner{    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    	StringTokenizer st = new StringTokenizer("");         	public String next(){    		while(!st.hasMoreElements()){    			try{    				st = new StringTokenizer(br.readLine());    			} catch(IOException e){    				e.printStackTrace();    			}    		}    		return st.nextToken();    	}    		    	public String nextLine() throws IOException {    		return br.readLine();    	}    		    	public int nextInt(){    		return Integer.parseInt(next());    	}         	public int[] readArray(int n){    		int[] a = new int[n];    		for(int i=0;i<n;i++)    			a[i] = nextInt();    		return a;    	}    		    	public long nextLong() {    		return Long.parseLong(next());    	}    		    	public char nextChar() {    		return next().toCharArray()[0];    	}    }   	}