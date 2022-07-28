import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.ArrayList;import java.util.Arrays;import java.util.PriorityQueue;import java.util.Random;import java.util.StringTokenizer; public class Solution{		static int n, m;	static long maxCost;	static Bug[] bg;	static Student[] st;	static int[] ans;	    public static void main(String[] args) throws IOException {         	FastScanner fs = new FastScanner();    	PrintWriter out = new PrintWriter(System.out);    	    	    		    	int tt = 1;    	while(tt-->0) {    		    		n = fs.nextInt(); m = fs.nextInt(); maxCost = fs.nextLong();    		ans = new int[m];    		    		bg = new Bug[m];    		for(int i=0;i<m;i++) {    			bg[i] = new Bug(fs.nextLong(), i);    		}    		    		    		int[] b = fs.readArray(n), c = fs.readArray(n);    		st = new Student[n];    		for(int i=0;i<n;i++) st[i] = new Student(b[i], c[i], i+1);    		    		Arrays.sort(bg, (bg1, bg2) -> -Long.compare(bg1.complexity, bg2.complexity));     		Arrays.sort(st, (st1, st2) -> -Long.compare(st1.ability, st2.ability));     		    		int l = 1, r = (int)1e5+1;    		    		    		while(l<r) {    			int mid = (l+r)/2;    			if(cal(mid)) {    				r = mid;    			}    			else {    				l = mid + 1;    			}    		}    		    		if(r==(int)1e5+1) {    			out.println("NO");    		}    		else {    			cal(r);    			out.println("YES");    			for(int i=0;i<m;i++) {    				out.print(ans[i]+" ");    			}    			out.println();    		}    		    		    		    		    		    		    	}    	    		    		    		    	out.close();    		    }            static boolean cal(int t) {    	PriorityQueue<Student> pq = new PriorityQueue<>((s1, s2) -> Long.compare(s1.cost, s2.cost));    	    	int j = 0;    	long cost = 0;    	    	for(int i=0;i<m;) {    		while(j<n && bg[i].complexity<=st[j].ability) {    			pq.add(st[j]); j++;    		}    		if(pq.isEmpty()) return false;    		Student s = pq.poll();    		cost += s.cost;    		if(cost>maxCost) return false;    		int cnt = 0;    		while(i<m && cnt<t) {    			ans[bg[i].ind] = s.ind;    			i++;  cnt++;    		}    		int f = 1;    	}    	    	return true;    	    	    	    }            static class Bug{    	long complexity;    	int ind;    	Bug(long c, int ind){    		this.complexity = c; this.ind = ind;    	}    }            static class Student{    	long ability, cost;    	int ind;    	Student(long a, long b, int ind){    		ability = a; cost = b; this.ind = ind;    	}    }                                   static final Random random=new Random();    	    static void ruffleSort(int[] a) {    	int n=a.length;//shuffle, then sort     	for (int i=0; i<n; i++) {    		int oi=random.nextInt(n); int temp=a[oi];    		a[oi]=a[i]; a[i]=temp;    	}    	Arrays.sort(a);    }             static void reverse(int[] arr, int l, int r) {    	for(int i=l;i<l+(r-l)/2;i++){    		int temp = arr[i]; arr[i] = arr[r-i+l-1]; arr[r-i+l-1] = temp;    	}    }        static void reverse(long[] arr, int l, int r) {    	for(int i=l;i<l+(r-l)/2;i++){    		long temp = arr[i]; arr[i] = arr[r-i+l-1]; arr[r-i+l-1] = temp;    	}    }            static <T> void reverse(T[] arr, int l, int r) {    	for(int i=l;i<l+(r-l)/2;i++) {    		T temp = arr[i]; arr[i] = arr[r-i+l-1]; arr[r-i+l-1] = temp;    	}    }    	    	    static class FastScanner{    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    	StringTokenizer st = new StringTokenizer("");         	public String next(){    		while(!st.hasMoreElements()){    			try{    				st = new StringTokenizer(br.readLine());    			} catch(IOException e){    				e.printStackTrace();    			}    		}    		return st.nextToken();    	}    		    	public String nextLine() throws IOException {    		return br.readLine();    	}    		    	public int nextInt(){    		return Integer.parseInt(next());    	}         	public int[] readArray(int n){    		int[] a = new int[n];    		for(int i=0;i<n;i++)    			a[i] = nextInt();    		return a;    	}    		    	public long nextLong() {    		return Long.parseLong(next());    	}    		    	public char nextChar() {    		return next().toCharArray()[0];    	}    }   	}
