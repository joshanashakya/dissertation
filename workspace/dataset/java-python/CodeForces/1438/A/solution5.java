import java.io.*;import java.util.*; public class div_2_682_a {	public static void main(String args[]){		FScanner in = new FScanner();		PrintWriter out = new PrintWriter(System.out);		int t = in.nextInt();		while(t-->0) {         int n=in.nextInt();        int a[]=new int[n];        int sum=0;        for(int i=0;i<n;i++)        {        	a[i]=1;         }        for(int i=0;i<n;i++)                	out.print(a[i]+" ");        		}		out.close();	}     static class FScanner {		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		StringTokenizer sb = new StringTokenizer(""); 		String next(){			while(!sb.hasMoreTokens()){				try{					sb = new StringTokenizer(br.readLine());				} catch(IOException e){ }			}			return sb.nextToken();		}		String nextLine(){			try{ return br.readLine(); } 			catch(IOException e) { } return "";		} 		int nextInt(){			return Integer.parseInt(next());		} 		long nextLong() {			return Long.parseLong(next());		} 		int[] readArray(int n) {			int a[] = new int[n];			for(int i=0;i<n;i++) a[i] = nextInt();			return a;		} 		float nextFloat(){		return Float.parseFloat(next());		}				double nextDouble(){		return Double.parseDouble(next());		}	}}	