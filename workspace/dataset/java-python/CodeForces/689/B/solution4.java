import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.OutputStreamWriter;import java.io.PrintWriter;import java.io.StreamTokenizer;import java.util.ArrayList; public class Main{	static StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));		public static int nextint()throws IOException {in.nextToken();return (int)in.nval;}	public static long nextlong()throws IOException {in.nextToken(); return (long)in.nval;}	public static String next() throws IOException {in.nextToken(); return (String)in.sval;}		public static void main(String[] args) throws IOException{			int n = nextint();			int[] a = new int[200100], p = new int[200100];			boolean[] f = new boolean[200100];			ArrayList<Integer> spfa = new ArrayList<Integer>();			for( int i = 1; i<=n; i++){				p[i] = nextint();				a[i] = i-1;				spfa.add(i);			}			int head = 0;			f[1] = true;			while(head < spfa.size()){				int d = spfa.get(head);				f[d] = false;				if(a[d]+1 <a[p[d]]){					if(!f[p[d]])						spfa.add(p[d]);					a[p[d]] = a[d] +1;					f[p[d]] = true;			}			if (d+1 <= n && a[d] +1 < a[d+1]){				if(!f[d+1])					spfa.add(d+1);				a[d+1] = a[d]+1;				f[d+1] = true;			}						if(d-1 >= 0 && a[d] + 1 < a[d-1]){				if(!f[d-1])					spfa.add(d-1);				a[d-1] = a[d] +1;				f[d-1] = true;			}			head++;				}		for (int i = 1; i<n; i++)			out.print(a[i] +" ");		out.println(a[n]);		out.flush();		out.close();			}}
