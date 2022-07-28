import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.ArrayDeque;import java.util.ArrayList;import java.util.Arrays;import java.util.Collections;import java.util.HashMap;import java.util.PriorityQueue;import java.util.Random;import java.util.StringTokenizer; public class Solution{				    public static void main(String[] args) throws IOException {         	FastScanner fs = new FastScanner();    	PrintWriter out = new PrintWriter(System.out);    	    	    		    	int tt = 1;    	while(tt-->0) {    		    		long t1 = fs.nextLong(), t2 = fs.nextLong(), x1 = fs.nextLong(), x2 = fs.nextLong(), t0 = fs.nextLong();    		    		boolean check = false;    		    		if(t1==t2) {    			out.println(x1+" "+x2);    			out.flush();    			return;    		}    		    		if(t1==t0) {    			out.println(x1+" 0");    			out.flush();    			return;    		}    		    		if(t2==t0) {    			out.println("0 "+x2);    			out.flush();    			return;    		}    		    		    		    		    		double min = Double.MAX_VALUE;    		long num1 = 0, num2 = 0;    		    		for(long y1=1;y1<=x1;y1++) {    			long y2 = (t0-t1)*y1/(t2-t0);    			y2++;    			if((y1*(t0-t1))%(t2-t0)==0) y2--;    			if(y2<1 || y2>x2) continue;    			double cal = (double)(t1*y1+t2*y2)/(y1+y2);    			cal -= t0;    			if(cal<0) continue;    			check = true;    			if(cal<min) {    				min = cal;    				num1 = y1; num2 = y2;    			}    			else if(cal==min) {    				if(y1+y2>num1+num2) {    					num1 = y1; num2 = y2;    				}    			}    			    		}    		    		if(!check) {    			out.println("0 "+x2);    			out.flush();    			return;    		}    		    		out.println(num1+" "+num2);    		    		    		    	}    	    		    		    		    	out.close();    		    }                                              static final Random random=new Random();    	    static void ruffleSort(int[] a) {    	int n=a.length;//shuffle, then sort     	for (int i=0; i<n; i++) {    		int oi=random.nextInt(n); int temp=a[oi];    		a[oi]=a[i]; a[i]=temp;    	}    	Arrays.sort(a);    }        static void ruffleSort(long[] a) {    	int n=a.length;//shuffle, then sort     	for (int i=0; i<n; i++) {    		int oi=random.nextInt(n); long temp=a[oi];    		a[oi]=a[i]; a[i]=temp;    	}    	Arrays.sort(a);    }             static void reverse(int[] arr, int l, int r) {    	for(int i=l;i<l+(r-l)/2;i++){    		int temp = arr[i]; arr[i] = arr[r-i+l-1]; arr[r-i+l-1] = temp;    	}    }        static void reverse(long[] arr, int l, int r) {    	for(int i=l;i<l+(r-l)/2;i++){    		long temp = arr[i]; arr[i] = arr[r-i+l-1]; arr[r-i+l-1] = temp;    	}    }            static <T> void reverse(T[] arr, int l, int r) {    	for(int i=l;i<l+(r-l)/2;i++) {    		T temp = arr[i]; arr[i] = arr[r-i+l-1]; arr[r-i+l-1] = temp;    	}    }    	    	    static class FastScanner{    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    	StringTokenizer st = new StringTokenizer("");         	public String next(){    		while(!st.hasMoreElements()){    			try{    				st = new StringTokenizer(br.readLine());    			} catch(IOException e){    				e.printStackTrace();    			}    		}    		return st.nextToken();    	}    		    	public String nextLine() throws IOException {    		return br.readLine();    	}    		    	public int nextInt(){    		return Integer.parseInt(next());    	}         	public int[] readArray(int n){    		int[] a = new int[n];    		for(int i=0;i<n;i++)    			a[i] = nextInt();    		return a;    	}    		    	public long nextLong() {    		return Long.parseLong(next());    	}    		    	public char nextChar() {    		return next().toCharArray()[0];    	}    }   	}