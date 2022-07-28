import java.io.*;import java.math.BigInteger;import java.util.*; public class D {	static class pair implements Comparable<pair> {		long f;		int s; 		public pair(long x, int y) {			f = x;			s = y;		} 		@Override		public int compareTo(pair o) {			if (o.f == f)				return s - o.s;			else				return (f - o.f) > 0 ? 1 : -1; 		}	} 	static class myInt implements Comparable<myInt> {		long n; 		public myInt(long x) {			n = x;		} 		@Override		public int compareTo(myInt o) {			if (o.n - n > 0)				return 1;			if (o.n == n)				return 0;			return -1; 		}	} 	public static void main(String[] args) throws IOException {		// BufferedReader br = new BufferedReader(new FileReader("name.in"));		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		StringTokenizer st;		PrintWriter out = new PrintWriter(System.out);		st = new StringTokenizer(br.readLine());		int n = Integer.parseInt(st.nextToken());		int m = Integer.parseInt(st.nextToken());		TreeSet<Integer> tr = new TreeSet<>();		int[] ans = new int[n + 1];		for (int i = 1; i <= n; i++) {			tr.add(i);		}		tr.add(n+1);		tr.add(0);		while (m-- > 0) {			st = new StringTokenizer(br.readLine());			int u = Integer.parseInt(st.nextToken());			int v = Integer.parseInt(st.nextToken());			int x = Integer.parseInt(st.nextToken());			int a = tr.lower(v + 1);			int b = tr.higher(u - 1);			while(b<=a) {//				System.out.println(b);				tr.remove(b);				ans[b]=x;				b=tr.higher(b);			}			ans[x]=0;			tr.add(x);		}		for (int i = 1; i < ans.length; i++) {			out.print(ans[i]+" ");		} 		out.flush();		out.close(); 	} } 		    		  	 	 	  			    	  	 	
