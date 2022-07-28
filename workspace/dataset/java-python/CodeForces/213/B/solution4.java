import java.io.*;import java.math.BigInteger;import java.util.*;     public class Main {	 	public static class FastReader {		BufferedReader br;		StringTokenizer root;		 		public FastReader() {			br = new BufferedReader(new InputStreamReader(System.in));		} 		String next() {			while (root == null || !root.hasMoreTokens()) {				try {					root = new StringTokenizer(br.readLine());				} catch (Exception addd) {					addd.printStackTrace();				}			}			return root.nextToken();		} 		int nextInt() {			return Integer.parseInt(next());		} 		double nextDouble() {			return Double.parseDouble(next());		} 		long nextLong() {			return Long.parseLong(next());		} 		String nextLine() {			String str = "";			try {				str = br.readLine();			} catch (Exception addd) {				addd.printStackTrace();			}			return str;		}	}		public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));		public static FastReader sc = new FastReader(); 	static int mod = (int) (1e9+7),MAX=(int) (2e5);    static List<Integer>[] edges;    static int[] a;    static int n;    static long[][] dp;    static long[] fac,inv;		public static void main(String[] args){		int n = sc.nextInt();		a = new int[10];		for(int i=0;i<=9;++i) a[i] = sc.nextInt();	    dp = new long[10][n+1];	    for(int i=0;i<dp.length;++i)	    Arrays.fill(dp[i],-1);	    	    precompute(n);	    long ans = 0;	    for(int i=1;i<=n;++i) {	    	ans = (ans + f(0,i))%mod;	    }	    out.print(ans);	    out.close();	} 	private static long f(int dig, int len) {		if(dig == 10) {			if(len == 0) return 1;			else return 0;		}		if(dp[dig][len] != -1) return dp[dig][len];		long ans = 0;		for(int i=a[dig];i<=len;++i) {			if(dig == 0) {				ans = (ans + ncr(len-1,i)*f(dig+1,len-i)%mod)%mod;			}else {				ans = (ans + ncr(len,i)*f(dig+1,len-i)%mod)%mod;			}		}		return dp[dig][len] = ans;	} 	static void precompute(int n)	{ 		 fac = new long[n+1];	     inv = new long[n+1];		fac[0]=fac[1]=1;		for(int i=2;i<fac.length;i++)		{			fac[i]=fac[i-1]*i;			fac[i]%=mod;		}				inv[n]=pow(fac[n],(int) (mod-2));		for(int i=n-1;i>=0;i--)		{			inv[i]=inv[i+1]*(i+1);			inv[i]%=mod;		}	}	 private static long pow(long a, int b) {		return BigInteger.valueOf(a).modPow(BigInteger.valueOf(b), BigInteger.valueOf(mod)).longValue();	}	 	private static long ncr(int n , int r) {		if(n < 0 || r < 0 || r > n) return 0;		return ((fac[n]*inv[r]%mod)*(inv[n-r]%mod))%mod;	} }   
