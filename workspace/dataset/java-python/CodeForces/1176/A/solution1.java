import java.io.*;import java.util.*; public class thirty_days_100 {	public static void main(String args[]){		FScanner in = new FScanner();		PrintWriter out = new PrintWriter(System.out);		int t = in.nextInt();		while(t-->0) {		long n=in.nextLong();        int c=0;        while(n%5==0)        {        	n=(n/5)*4;        	c++;        }         while(n%3==0)        {        	n=(n/3)*2;        	c++;        }         while(n%2==0)        {        	n=(n/2);        	c++;        }        if(n!=1)        	out.println("-1");        else        	out.println(c); }		out.close();	}     static class FScanner {		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		StringTokenizer sb = new StringTokenizer(""); 		String next(){			while(!sb.hasMoreTokens()){				try{					sb = new StringTokenizer(br.readLine());				} catch(IOException e){ }			}			return sb.nextToken();		}		String nextLine(){			try{ return br.readLine(); } 			catch(IOException e) { } return "";		} 		int nextInt(){			return Integer.parseInt(next());		} 		long nextLong() {			return Long.parseLong(next());		} 		int[] readArray(int n) {			int a[] = new int[n];			for(int i=0;i<n;i++) a[i] = nextInt();			return a;		} 		float nextFloat(){		return Float.parseFloat(next());		}				double nextDouble(){		return Double.parseDouble(next());		}	}}	