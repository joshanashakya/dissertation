// practice with rainboyimport java.io.*;import java.util.*; public class CF115B extends PrintWriter {	CF115B() { super(System.out, true); }	Scanner sc = new Scanner(System.in);	public static void main(String[] $) {		CF115B o = new CF115B(); o.main(); o.flush();	} 	void main() {		int n = sc.nextInt();		int m = sc.nextInt();		int[] ll = new int[n];		int[] rr = new int[n];		for (int i = 0; i < n; i++) {			byte[] cc = sc.next().getBytes();			int l = m, r = -1;			for (int j = 0; j < m; j++)				if (cc[j] == 'W') {					l = Math.min(l, j);					r = Math.max(r, j);				}			ll[i] = l;			rr[i] = r;		}		while (n > 0 && ll[n - 1] > rr[n - 1])			n--;		if (n == 0) {			println(0);			return;		}		int ans = n - 1;		int j = 0;		for (int i = 0; i < n - 1; i++) {			int j_ = i % 2 == 0 ? Math.max(j, Math.max(rr[i], rr[i + 1]))				: Math.min(j, Math.min(ll[i], ll[i + 1]));			ans += Math.abs(j - j_);			j = j_;		}		if (n % 2 == 0)			ans += j - ll[n - 1];		else			ans += rr[n - 1] - j;		println(ans);	}}