import java.io.File;import java.util.Scanner;import java.util.StringTokenizer;import java.util.TreeSet; public class p024 {	public static void main(String args[]) throws Exception {		StringTokenizer stok = new StringTokenizer(new Scanner(System.in).useDelimiter("\\A").next());		StringBuilder sb = new StringBuilder();		int n = Integer.parseInt(stok.nextToken());		long[] t=new long[n],v = new long[n];		for(int i=0;i<n;i++) v[i] = Long.parseLong(stok.nextToken());		for(int i=0;i<n;i++) t[i] = Long.parseLong(stok.nextToken());		long pt = 0;		TreeSet<long[]> st = new TreeSet<long[]>(				(x,y)->x[0]==y[0]?Long.compare(x[1], y[1]):Long.compare(x[0], y[0]));		for(int i=0;i<n;i++) {			st.add(new long[] {pt+v[i],i});			long[] ct = new long[] {pt+t[i],n+5};			long pv = 0;			while(st.floor(ct)!=null) {				long[] vl = st.floor(ct);				st.remove(vl);				pv+=vl[0]-pt;			}			pv+=st.size()*t[i];			pt=ct[0];			sb.append(pv+" ");		}		System.out.println(sb);	}}