import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.Arrays;import java.util.Random;import java.util.StringTokenizer; public class Solution{			    public static void main(String[] args) throws IOException {         	FastScanner fs = new FastScanner();    	PrintWriter out = new PrintWriter(System.out);    	    	    		    	int tt = 1;    	while(tt-->0) {    		    		    		char[] s = fs.next().toCharArray();    		int n = s.length;    		    		char[] t = fs.next().toCharArray();    		int m = t.length;    		    		int[] left = new int[n+1];    		left[0] = 0;    		    		int cLeft = 0;    		    		for(int i=0;i<n;i++) {    			if(cLeft<m && s[i]==t[cLeft]) cLeft++;    			left[i+1] = cLeft;    		}    		    		int[] right = new int[n+1];    		right[n] = 0;    		    		int cRight = 0;    		    		for(int i=n-1;i>=0;i--) {    			if(cRight<m && s[i]==t[m-1-cRight]) cRight++;    			right[i] = cRight;    		}    		    		int[] count = new int[m+1];    		boolean[] bool = new boolean[n];    		    		for(char ch='a'; ch<='z'; ch++) {    			count[0] = 0;    			    			for(int i=0;i<m;i++) {    				count[i+1] = count[i] + ((t[i]==ch)?1:0);    			}    			    			for(int i=0;i<n;i++) {    				if(s[i]==ch) {    					    					int maxPos = Math.min(m-1, left[i]);    					int minPos = Math.max(0, m-1-right[i+1]);    					if(minPos<=maxPos) {    						if(count[maxPos+1]>count[minPos]) bool[i] = true;    					}    					    					    				}    			}    			    		}    		    		for(boolean b: bool) {    			if(!b) {    				out.println("No");    				out.flush();    				return;    			}    		}    		    		out.println("Yes");    		    		    		    		    		    	}    	    		    		    		    	out.close();    		    }                                             static final Random random=new Random();    	    static void ruffleSort(int[] a) {    	int n=a.length;//shuffle, then sort     	for (int i=0; i<n; i++) {    		int oi=random.nextInt(n); int temp=a[oi];    		a[oi]=a[i]; a[i]=temp;    	}    	Arrays.sort(a);    }        static void ruffleSort(long[] a) {    	int n=a.length;//shuffle, then sort     	for (int i=0; i<n; i++) {    		int oi=random.nextInt(n); long temp=a[oi];    		a[oi]=a[i]; a[i]=temp;    	}    	Arrays.sort(a);    }             static void reverse(int[] arr, int l, int r) {    	for(int i=l;i<l+(r-l)/2;i++){    		int temp = arr[i]; arr[i] = arr[r-i+l-1]; arr[r-i+l-1] = temp;    	}    }        static void reverse(long[] arr, int l, int r) {    	for(int i=l;i<l+(r-l)/2;i++){    		long temp = arr[i]; arr[i] = arr[r-i+l-1]; arr[r-i+l-1] = temp;    	}    }            static <T> void reverse(T[] arr, int l, int r) {    	for(int i=l;i<l+(r-l)/2;i++) {    		T temp = arr[i]; arr[i] = arr[r-i+l-1]; arr[r-i+l-1] = temp;    	}    }    	    	    static class FastScanner{    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    	StringTokenizer st = new StringTokenizer("");         	public String next(){    		while(!st.hasMoreElements()){    			try{    				st = new StringTokenizer(br.readLine());    			} catch(IOException e){    				e.printStackTrace();    			}    		}    		return st.nextToken();    	}    		    	public String nextLine() throws IOException {    		return br.readLine();    	}    		    	public int nextInt(){    		return Integer.parseInt(next());    	}         	public int[] readArray(int n){    		int[] a = new int[n];    		for(int i=0;i<n;i++)    			a[i] = nextInt();    		return a;    	}    		    	public long nextLong() {    		return Long.parseLong(next());    	}    		    	public char nextChar() {    		return next().toCharArray()[0];    	}    }   	}
