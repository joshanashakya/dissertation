// practice with rainboyimport java.io.*;import java.util.*; public class CF380A extends PrintWriter {	CF380A() { super(System.out, true); }	Scanner sc = new Scanner(System.in);	public static void main(String[] $) {		CF380A o = new CF380A(); o.main(); o.flush();	} 	static final int L = 100000;	void main() {		int n = sc.nextInt();		int[] ll = new int[n];		int[] cc = new int[n];		long[] kk = new long[n];		long k = 0;		int[] aa = new int[L];		int l = 0;		for (int i = 0; i < n; i++) {			int t = sc.nextInt();			if (t == 1) {				cc[i] = sc.nextInt();				k++;				if (l < L)					aa[l++] = cc[i];			} else {				ll[i] = sc.nextInt();				cc[i] = sc.nextInt();				k += ll[i] * cc[i];				if (l < L)					out:						for (int h = 0; h < cc[i]; h++)							for (int j = 0; j < ll[i]; j++) {								aa[l++] = aa[j];								if (l == L)									break out;							}			}			kk[i] = k;		}		int q = sc.nextInt();		while (q-- > 0) {			long i_ = sc.nextLong() - 1;			int i;			if (i_ >= L) {				int lower = -1, upper = n;				while (upper - lower > 1) {					i = (lower + upper) / 2;					if (i_ < kk[i])						upper = i;					else						lower = i;				}				i = upper;				if (ll[i] == 0)					print(cc[i] + " ");				else {					i = (int) ((i_ - kk[i - 1]) % ll[i]);					print(aa[i] + " ");				}			} else {				i = (int) i_;				print(aa[i] + " ");			}		}		println();	}}