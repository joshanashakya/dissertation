// Submitted by Subhash Yadavimport java.io.*;import java.util.*; public class A {		static int m=(int) 1e9 +7;	public static void main(String[] args) {		FastScanner sc = new FastScanner();		char s[]=sc.next().toCharArray(),t[]=sc.next().toCharArray();		long dp[][]=new long[5005][5005];		int j = 0;		for(int i=0;i<s.length;i++) {			for( j=0;j<t.length;j++) {				dp[i+1][j+1]=dp[i+1][j]+((s[i]==t[j])?(dp[i][j]+1):0)%m;			}		}				long ans=0;		for(int i=0;i<s.length;i++) {			ans=(ans+dp[i+1][j])%m;		}		System.out.println(ans);	}		static class FastScanner {		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		StringTokenizer st = new StringTokenizer(""); 		String next() {			while (!st.hasMoreTokens())				try {					st = new StringTokenizer(br.readLine());				} catch (IOException e) {					e.printStackTrace();				}			return st.nextToken();		} 		int nextInt() {			return Integer.parseInt(next());		} 		int[] readArray(int n) {			int[] a = new int[n];			for (int i = 0; i < n; i++)				a[i] = nextInt();			return a;		} 		long nextLong() {			return Long.parseLong(next());		}	} }