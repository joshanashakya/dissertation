// practice with rainboyimport java.io.*;import java.util.*; public class CF590A extends PrintWriter {	CF590A() { super(System.out, true); }	Scanner sc = new Scanner(System.in);	public static void main(String[] $) {		CF590A o = new CF590A(); o.main(); o.flush();	} 	void main() {		int n = sc.nextInt();		int[] aa = new int[n];		for (int i = 0; i < n; i++)			aa[i] = sc.nextInt();		boolean[] fixed = new boolean[n];		fixed[0] = fixed[n - 1] = true;		for (int i = 1; i < n - 1; i++)			if (aa[i - 1] == aa[i] || aa[i] == aa[i + 1])				fixed[i] = true;		int k = 0;		for (int i = 0, j; i < n; i = j) {			while (i < n && fixed[i])				i++;			if (i == n)				break;			j = i + 1;			while (j < n && !fixed[j])				j++;			k = Math.max(k, j - i);			if ((j - i) % 2 == 0) {				int l = (j - i) / 2;				for (int h = i; h < i + l; h++)					aa[h] = aa[i - 1];				for (int h = i + l; h < j; h++)					aa[h] = aa[j];			} else				for (int h = i; h < j; h++)					aa[h] = aa[j];		}		println((k + 1) / 2);		for (int i = 0; i < n; i++)			print(aa[i] + " ");		println();	}}