import java.io.*;import java.util.*; public class CF353B {	public static void main(String[] args) throws IOException {		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		int n = Integer.parseInt(br.readLine());		int[] kk = new int[100];		int[] pp = new int[100];		int[] qq = new int[100];		StringTokenizer st = new StringTokenizer(br.readLine());		int[] aa = new int[n + n];		for (int i = 0; i < n + n; i++) {			int a = Integer.parseInt(st.nextToken());			kk[a]++;			aa[i] = a;		}		int p = 0, q = 0;		for (int a = 10; a <= 99; a++)			if (kk[a] >= 2) {				p++;				q++;				pp[a]++;				qq[a]++;				kk[a] -= 2;			} else if (kk[a] >= 1 && p <= q) {				p++;				pp[a]++;				kk[a]--;			} else if (kk[a] >= 1 && p > q) {				q++;				qq[a]++;				kk[a]--;			}		int m = p * q;		for (int a = 10; a <= 99; a++)			while (kk[a] > 0)				if (p <= q) {					p++;					pp[a]++;					kk[a]--;				} else {					q++;					qq[a]++;					kk[a]--;				}		StringBuilder sb = new StringBuilder();		for (int i = 0; i < n + n; i++) {			int a = aa[i], g;			if (pp[a] > 0) {				g = 1;				pp[a]--;			} else {				g = 2;				qq[a]--;			}			sb.append(g + " ");		}		System.out.println(m);		System.out.println(sb);	}}
