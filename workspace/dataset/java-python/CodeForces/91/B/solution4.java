import java.util.*;
import java.util.concurrent.ThreadLocalRandom;



import java.io.*;

public class st4 {
	static boolean or=false;
	static class pair implements Comparable{
		int v;
		int idx;
		public pair(int val,int i) {
			idx=i;
			v=val;
		}
		public int compareTo(Object o) {
			pair p=(pair)o;
			if(v==p.v) {
				return idx-p.idx;
			}
			return v-p.v;
		}
		public String toString() {
			return v+" "+"@"+idx;
		}
	}
	static class Stree {
		int N;
		int[] Stree;
		int[] ma;
		int[] lazy;

		public Stree(int[] a) {
			ma = a;
			N = a.length - 1;// 4
			Stree = new int[N << 1];// 8
			//lazy = new int[N << 1];// 8
			//build(1, 1, N);
		}

		void build(int node, int l, int r) {// 1 1 4 2 1 2
			if (l == r)
				Stree[node] = ma[l];
			else {
				int left = node << 1;
				int right = (node << 1) + 1;
				int mid = (r + l) >> 1;
				build(left, l, mid);
				build(right, mid + 1, r);
				int log=(int)Math.floor(Math.log(node)/Math.log(2));
				if(log%2==0) {
					if(or) {
						Stree[node] = Stree[left] ^ Stree[right];
					}else {
						Stree[node] = Stree[left] | Stree[right];
					}
					
				}else {
					if(or) {
						Stree[node] = Stree[left] | Stree[right];
					}else {
						Stree[node] = Stree[left] ^ Stree[right];
					}
				}
				
			}
		}

		void updateRange(int i, int j, int v) {
			updateRange(1, 1, N, i, j, v);
		}

		private void updateRange(int node, int l, int r, int i, int j, int v) {
			if (r < i || j < l)
				return;
			if (l >= i && r <= j) {
				lazy[node] |= v;
				Stree[node] |= v;
			} else {
				int left = node << 1;
				int right = (node << 1) + 1;
				int mid = (r + l) >> 1;
				propagate(node);
				updateRange(left, l, mid, i, j, v);
				updateRange(right, mid + 1, r, i, j, v);
				Stree[node] = Stree[left] & Stree[right];
			}
		}

		private void propagate(int node) {
			int left = node << 1;
			int right = (node << 1) + 1;
			lazy[left] |= lazy[node];
			lazy[right] |= lazy[node];
			lazy[node] = 0;
			Stree[left] |= lazy[left];
			Stree[right] |= lazy[right];
		}

		void update(int idx, int value) {
			int node = idx + N - 1;
			Stree[node] = value;
			while (node != 1) {
				node >>= 1;
				int left = node << 1;
				int right = (node << 1) + 1;
				Stree[node]=Math.max(Stree[left],Stree[right]);
			}
		}

		int query(int i, int j) {
			return query(1, 1, N, i, j);
		}

		private int query(int node, int l, int r, int i, int j) {
			if (r < i || j < l)
				return 0;
			if (l >= i && r <= j)
				return Stree[node];
			//propagate(node);
			int left = node << 1;
			int right = (node << 1) + 1;
			int mid = (r + l) >> 1;
			int lq = query(left, l, mid, i, j);
			int rq = query(right, mid + 1, r, i, j);
			return Math.max(lq,rq);

		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException, InterruptedException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		// System.out.println(Integer.MAX_VALUE&100);
		int n = sc.nextInt();
		int[]a=sc.nextIntArr(n);

		int l=(int)(Math.ceil((Math.log(n)/Math.log(2))));
		int na[]=new int [(1<<l)+1];
		for (int i = 1; i <a.length; i++) {
			na[i]=a[i];
		}
		Stree st = new Stree(na);
		
		PriorityQueue<pair> pq = new PriorityQueue<pair>();
		for (int i = 0; i < a.length; i++) {
			pq.add(new pair(a[i],i));
		}
//		while(pq.size()!=0) {
//			System.out.println(pq.poll());
//		}
		int []ansa=new int[n];
		while(pq.size()!=0) {
			pair p=pq.poll();
			int val=p.v;
			int idx=p.idx+1;
			int ans=0;
			if(idx==n) {
				ans=-1;
			}else {
				ans=st.query(idx+1,n);
				if(ans==0)
					ans=-1;
				else
					ans-=(idx+1);
			}
			ansa[idx-1]=ans;
			st.update(idx, idx);
		}
		for (int i = 0; i < ansa.length-1; i++) {
			pw.print(ansa[i]+" ");
		}
		pw.println(ansa[ansa.length-1]);
		pw.close();
		
	}

	static void shuffleArray(int[] ar) {
		// If running on Java 6 or older, use `new Random()` on RHS here
		Random rnd = ThreadLocalRandom.current();
		for (int i = ar.length - 1; i > 0; i--) {
			int index = rnd.nextInt(i + 1);
			// Simple swap
			int a = ar[index];
			ar[index] = ar[i];
			ar[i] = a;
		}
	}

	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public Scanner(FileReader r) {
			br = new BufferedReader(r);
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}

		public int[] nextIntArr(int n) throws IOException {
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++)
				arr[i] = nextInt();
			return arr;
		}

		public boolean ready() throws IOException {
			return br.ready();
		}
	}

}
			 	 				 	  	 	  						 	 			
