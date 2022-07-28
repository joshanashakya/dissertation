import java.util.*; 
import java.io.*;
public class Solution {
	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int n = sc.nextInt();
		int[] in = sc.nextIntArr(n);
		int N = 1;
		while (N < n) {
			N *= 2;
		}
		int[] arr = new int[N + 1];
		arr[0]=(int)(1e9);
		for (int i = 1; i <= n; i++) {
			arr[i] = in[i - 1];
		}
		for (int i = n + 1; i < arr.length; i++) {
			arr[i] = (int)(1e9);
		}
		SegmentTree sg = new SegmentTree(arr);
		for(int i = 1 ; i<=n;i++) {
			System.out.print(Math.max(sg.Query2(1, 1, N, arr[i])-i-1,-1) +" ");
		}
	 
		}
	
	static class SegmentTree {
		int[] sTree, array, lazy;
		int N;
		public SegmentTree(int[] array) {
			this.array = array;
			N = array.length - 1; // 8
			// size of array must be a power of 2 + 1 (one-based)
			sTree = new int[2 * N]; // 16
			lazy = new int[N << 1];
			build(1, 1, N);
		}
		public void build(int node, int l, int r) {
			if (l == r) {
				sTree[node] = array[l];
				return;
			}
			int mid = l + r >> 1;
			int leftChild = 2 * node;
			int rightChild = 2 * node + 1;
			// build left child
			build(leftChild, l, mid);
			// build right child
			build(rightChild, mid + 1, r);
			// use left and right to get the value of my current node
			sTree[node] = Math.min(sTree[leftChild], sTree[rightChild]); 
		}
		public int Query2(int node ,int l , int r, int val) {
			if(l==r)return l ; 
			int mid = l+r>>1; 
			if(sTree[node<<1|1]<val) {
				return Query2(node<<1|1, mid+1, r, val); 
			}
			else 
				return Query2(node<<1, l, mid, val); 

				
			
		}
		public int query(int i, int j) {
			return query(1, 1, N, i, j);
		}
		public int query(int node, int l, int r, int i, int j) {
			if (i <= l && r <= j) { // if I take the whole node
				return sTree[node];
			}
			if (r < i || j < l) { // if I throw this node away
				return 1;
			}
			propagate(node, l, r);
			int mid = l + r >> 1;
			int leftChild = 2 * node; // node << 1
			int rightChild = 2 * node + 1; // node << 1 | 1
			int left = query(leftChild, l, mid, i, j);
			int right = query(rightChild, mid + 1, r, i, j);
			return left * right;
		}
		public void updatePoint(int idx, int val) {
			int cur = idx + N - 1;
			array[idx] = val;
			sTree[cur] = val;
			while (cur != 1) {
				cur = cur / 2; // move the current to the parent
				int leftChild = 2 * cur;
				int rightChild = 2 * cur + 1;
				sTree[cur] = sTree[leftChild] * sTree[rightChild];
			}
		}
		public void propagate(int node, int l, int r) {
			int leftChild = node << 1;
			int rightChild = node << 1 | 1;
			int mid = l + r >> 1;
			lazy[leftChild] += lazy[node];
			lazy[rightChild] += lazy[node];
			sTree[leftChild] += (mid - l + 1) * lazy[node];
			sTree[rightChild] += (r - mid) * lazy[node];
			lazy[node] = 0;
		}
		public void updateRange(int i, int j, int val) {
			updateRange(1, 1, N, i, j, val);
		}
		public void updateRange(int node, int l, int r, int i, int j, int val) {
			if (i <= l && r <= j) { // if I take the whole node
				lazy[node] += val;
				sTree[node] += val * (r - l + 1);
				return;
			}
			if (r < i || j < l) { // if I throw this node away
				return;
			}
			int leftChild = node << 1;
			int rightChild = node << 1 | 1;
			int mid = l + r >> 1;
			propagate(node, l, r);
			updateRange(leftChild, l, mid, i, j, val);
			updateRange(rightChild, mid + 1, r, i, j, val);
			sTree[node] = sTree[leftChild] + sTree[rightChild];
		}
	}
	
	static class Scanner {
		BufferedReader br;
		StringTokenizer st;
		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}
		public Scanner(FileReader f) {
			br = new BufferedReader(f);
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
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
		public int[] nextIntArr(int n) throws IOException {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(next());
			}
			return arr;
		}
		 public boolean ready() throws IOException, IOException {
	            return br.ready();
	        }
	}
}
 	  		         							 	    			
