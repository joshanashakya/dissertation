// practice with rainboyimport java.io.*;import java.util.*; public class CF187A extends PrintWriter {	CF187A() { super(System.out, true); }	Scanner sc = new Scanner(System.in);	public static void main(String[] $) {		CF187A o = new CF187A(); o.main(); o.flush();	} 	void main() {		int n = sc.nextInt();		int[] pp = new int[n];		for (int i = 0; i < n; i++)			pp[i] = sc.nextInt() - 1;		int[] ii = new int[n];		for (int i = 0; i < n; i++) {			int p = sc.nextInt() - 1;			ii[p] = i;		}		for (int i = 0; i < n; i++)			pp[i] = ii[pp[i]];		int i = 1;		while (i < n && pp[i] > pp[i - 1])			i++;		println(n - i);	}}