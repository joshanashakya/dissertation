// practice with rainboyimport java.io.*;import java.util.*; public class CF464B extends PrintWriter {	CF464B() { super(System.out); }	Scanner sc = new Scanner(System.in);	public static void main(String[] $) {		CF464B o = new CF464B(); o.main(); o.flush();	} 	int[][] xx = new int[8][3];	int[][] pp = new int[6][3];	int[] ii = new int[8];	long[] dd = new long[28];	boolean solve() {		int n = 0;		for (int i = 0; i < 8; i++) {			int x0 = xx[i][pp[ii[i]][0]];			int x1 = xx[i][pp[ii[i]][1]];			int x2 = xx[i][pp[ii[i]][2]];			for (int j = i + 1; j < 8; j++) {				int y0 = xx[j][pp[ii[j]][0]];				int y1 = xx[j][pp[ii[j]][1]];				int y2 = xx[j][pp[ii[j]][2]];				long z0 = x0 - y0;				long z1 = x1 - y1;				long z2 = x2 - y2;				dd[n++] = z0 * z0 + z1 * z1 + z2 * z2;			}		}		Arrays.sort(dd);		return dd[0] != 0 && dd[0] == dd[11] && dd[12] == dd[23] && dd[24] == dd[27];	}	void main() {		for (int i = 0; i < 8; i++)			for (int j = 0; j < 3; j++)				xx[i][j] = sc.nextInt();		for (int u = 0; u < 3; u++) {			int j0 = u << 1, j1 = j0 | 1;			int v = (u + 1) % 3, w = (u + 2) % 3;			pp[j0][0] = u; pp[j0][1] = v; pp[j0][2] = w;			pp[j1][0] = u; pp[j1][1] = w; pp[j1][2] = v;		}		for (int i0 = 0; i0 < 6; i0++) {			ii[0] = i0;			for (int i1 = 0; i1 < 6; i1++) {				ii[1] = i1;				for (int i2 = 0; i2 < 6; i2++) {					ii[2] = i2;					for (int i3 = 0; i3 < 6; i3++) {						ii[3] = i3;						for (int i4 = 0; i4 < 6; i4++) {							ii[4] = i4;							for (int i5 = 0; i5 < 6; i5++) {								ii[5] = i5;								for (int i6 = 0; i6 < 6; i6++) {									ii[6] = i6;									if (solve()) {										println("YES");										for (int i = 0; i < 8; i++) {											for (int j = 0; j < 3; j++)												print(xx[i][pp[ii[i]][j]] + " ");											println();										}										return;									}								}							}						}					}				}			}		}		println("NO");	}}