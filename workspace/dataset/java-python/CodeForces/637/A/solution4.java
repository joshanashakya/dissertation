import java.io.*;import java.util.*; public class voting {	public static void main(String args[]){		FScanner in = new FScanner();		PrintWriter out = new PrintWriter(System.out);		int n= in.nextInt();		int ans=0,max=0;		int a[]=new int[1000001];		for(int i=0;i<n;i++)		{			int b=in.nextInt();			a[b]++;			if(a[b]>max)				{max=a[b];			ans=b;} 		}		out.print(ans); 		out.close();	}     static class FScanner {		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		StringTokenizer sb = new StringTokenizer(""); 		String next(){			while(!sb.hasMoreTokens()){				try{					sb = new StringTokenizer(br.readLine());				} catch(IOException e){ }			}			return sb.nextToken();		} 		int nextInt(){			return Integer.parseInt(next());		} 		long nextLong() {			return Long.parseLong(next());		}	}}	
