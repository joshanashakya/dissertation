import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.StringTokenizer;import java.util.HashMap;import java.util.ArrayList;import java.util.Collections; public class Main{	public static void main(String[] args) {		new Thread(null, new Runnable() {			public void run() {                solve();            }        }, "1", 1 << 26).start();	}	static void solve () {		FastReader fr =new FastReader();	PrintWriter op =new PrintWriter(System.out);  		int n =fr.nextInt() ,m =fr.nextInt() ,p =fr.nextInt() ,a[] =new int[n] ,b[] =new int[m] ,i ,j ,k ,l ; 		ArrayList<ArrayList<Integer>> ds =new ArrayList<>() ;	HashMap<Integer,Integer> hm =new HashMap<>() ; 		ArrayList<Integer> ct =new ArrayList<>() ;	long dm ;  		for (i =0 ; i<n ; ++i)	a[i] =fr.nextInt() ;	 		for (i =0 ; i<m ; ++i)	b[i] =fr.nextInt() ; 		for (i =0 ; i<p ; ++i) {			dm =p*1l*(m-1l) + i ;			if (dm >= n)	break;	ds.add(new ArrayList<>()) ;			for (j =0 ; i+j<n ; j+=p)	ds.get(i).add(a[j+i]) ;		}		for (i =0 ; i<ds.size() ; ++i) {			for (j =0 ; j<m ; ++j) {				if (!hm.containsKey(b[j]))	hm.put(b[j],0) ; 				hm.put(b[j] , hm.get(b[j])+1) ;			}			for (j =0 ; j<m ; ++j) {				k =ds.get(i).get(j) ;				if (!hm.containsKey(k))	hm.put(k,0) ;	hm.put(k , hm.get(k)-1) ;				if (hm.get(k)==0)	hm.remove(k) ;			}			if (hm.isEmpty())	ct.add(i) ;			for (; j<ds.get(i).size() ; ++j) {				k =ds.get(i).get(j) ;	l =ds.get(i).get(j-m) ;				if (!hm.containsKey(k))	hm.put(k,0) ;	hm.put(k , hm.get(k)-1) ;				if (!hm.containsKey(l))	hm.put(l,0) ;	hm.put(l , hm.get(l)+1) ;				if (k==l) {					if (hm.get(k)==0)	hm.remove(k) ;				}				else { 					if (hm.get(k)==0)	hm.remove(k) ;					if (hm.get(l)==0)	hm.remove(l) ;				}				if (hm.isEmpty())	ct.add(i + (j-m+1)*p) ;			}			hm.clear() ;		}		op.println(ct.size()) ;	Collections.sort(ct) ;		for (i =0 ; i<ct.size() ; ++i)	op.print((ct.get(i)+1)+" ") ;		op.flush();	op.close();	}	static class FastReader {		BufferedReader br;		StringTokenizer st; 		public FastReader() {			br =new BufferedReader(new InputStreamReader(System.in));		} 		String next() {			while (st==null || (!st.hasMoreElements())) 			{				try				{					st =new StringTokenizer(br.readLine());				}				catch(IOException e)				{					e.printStackTrace();				}							}			return st.nextToken();		} 		String nextLine() {			String str =""; 			try			{				str =br.readLine();			}			catch(IOException e)			{				e.printStackTrace();			} 			return str;		} 		int nextInt() {			return Integer.parseInt(next());		} 		long nextLong() {			return Long.parseLong(next()) ;		}	}}