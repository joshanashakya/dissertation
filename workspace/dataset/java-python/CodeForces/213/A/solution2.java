// practice with rainboyimport java.io.*;import java.util.*; public class CF213A extends PrintWriter {	CF213A() { super(System.out, true); }	Scanner sc = new Scanner(System.in);	public static void main(String[] $) {		CF213A o = new CF213A(); o.main(); o.flush();	} 	int[] next, jj; int l_ = 1;	int link(int l, int j) { next[l_] = l; jj[l_] = j; return l_++; }	int[] cc, ao, dd;	int[][] qq;	void init(int n, int m) {		cc = new int[n];		ao = new int[n];		dd = new int[n];		qq = new int[3][n];		next = new int[1 + m * 2];		jj = new int[1 + m * 2];	}	int solve(int n, int c_) {		int[] dd_ = Arrays.copyOf(dd, n);		int[] head = new int[3];		int[] cnt = new int[3];		for (int i = 0; i < n; i++)			if (dd_[i] == 0) {				int c = cc[i];				qq[c][head[c] + cnt[c]++] = i;			}		int k = 0, t = 0;		while (k < n) {			while (cnt[c_] > 0) {				int i = qq[c_][head[c_]++]; cnt[c_]--;				k++; t++;				for (int l = ao[i]; l != 0; l = next[l]) {					int j = jj[l];					if (--dd_[j] == 0) {						int c = cc[j];						qq[c][head[c] + cnt[c]++] = j;					}				}			}			c_ = (c_ + 1) % 3;			t++;		}		return t - 1;	}	void main() {		int n = sc.nextInt();		init(n, n * (n - 1) / 2);		for (int i = 0; i < n; i++)			cc[i] = sc.nextInt() - 1;		for (int i = 0; i < n; i++) {			int k = sc.nextInt();			while (k-- > 0) {				int j = sc.nextInt() - 1;				ao[j] = link(ao[j], i);				dd[i]++;			}		}		println(Math.min(solve(n, 0), Math.min(solve(n, 1), solve(n, 2))));	}}