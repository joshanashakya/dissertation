import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.StringTokenizer;  public class Main {	public static int[][] ans = new int[10][1000005];	public static int check(int x, int y) {		while (true) {			if (y < 10) {				if (y == x)					return 1;				else					return 0;			} else {				int temp = 1;				while (y > 0) {					int rem = y % 10;					y /= 10;					if (rem > 0)						temp *= rem;				}				y = temp;			}		}	} 	public static void init() {		for (int i = 1; i < 10; i++)			for (int j = 1; j < 1000002; j++)				ans[i][j] = ans[i][j - 1] + check(i, j);	} 	public static void main(String args[]) throws IOException {		init();		BufferedReader BR=new BufferedReader(new InputStreamReader(System.in));		StringTokenizer ST;		PrintWriter out = new PrintWriter(System.out);		int q, l, r, k;		q = Integer.parseInt(BR.readLine());		while (q-- > 0) {			ST=new StringTokenizer(BR.readLine());			l=Integer.parseInt(ST.nextToken());			r=Integer.parseInt(ST.nextToken());			k=Integer.parseInt(ST.nextToken());			out.println(ans[k][r] - ans[k][l - 1]);		}		out.close();	}}