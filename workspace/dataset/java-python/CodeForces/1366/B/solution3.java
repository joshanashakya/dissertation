import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.*;  public class Solution {            public static void main(String[] args) {        FastScanner sc = new FastScanner();        int t=sc.nextInt();        while(t-->0){            int INF=(int)1e9;            int n=sc.nextInt(),x=sc.nextInt(),m=sc.nextInt(),mini=x,maxi=x;            while(m-->0){                int l=sc.nextInt(),r=sc.nextInt();                if((l<=maxi)&&(r>=mini))                {                    maxi=Math.max(maxi,r);                    mini=Math.min(mini,l);                }                            }            System.out.println(maxi-mini+1);                    }            }    static class FastScanner {		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		StringTokenizer st=new StringTokenizer("");		String next() {			while (!st.hasMoreTokens())				try {					st=new StringTokenizer(br.readLine());				} catch (IOException e) {					e.printStackTrace();				}			return st.nextToken();		}				int nextInt() {			return Integer.parseInt(next());		}		Long[] readArray(int n) {			Long[] a=new Long[n];			for (int i=0; i<n; i++) a[i]=nextLong();			return a;		}		long nextLong() {			return Long.parseLong(next());		}	}}