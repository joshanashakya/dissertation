import java.io.File;import java.util.Scanner;import java.util.StringTokenizer; public class p007 {	public static void main(String args[]) throws Exception {		StringTokenizer stok = new StringTokenizer(new Scanner(System.in).useDelimiter("\\A").next());		StringBuilder sb = new StringBuilder();		char[] s = new char[(int)1e7];		long mod = (long)1e9+7;		int T = Integer.parseInt(stok.nextToken());		while(T-->0) {			int x = Integer.parseInt(stok.nextToken());			char[] ss = stok.nextToken().toCharArray();			for(int i=0;i<ss.length;i++) s[i]=ss[i];			long n = ss.length;			boolean fl = true;			for(int i=0;i<x;i++) {				int v = s[i]-49,cnt=0;				long d=(n-i-1);				long nn = (n+v*d)%mod;				while(++cnt<=v) {					if(n<=x&&fl) {						for(int j=i+1;j<=n;j++) s[j+(int)(cnt*d)] = s[j];					}					else fl=false;				}				n=nn;			}			sb.append((n+mod)%mod+"\n");		}		System.out.println(sb);	}}