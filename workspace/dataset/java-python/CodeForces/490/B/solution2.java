import java.io.*;import java.util.*; public class AA { 	static HashMap<Integer,Integer> a, b;	static int n; 	public static void main(String[] args) {        FastScanner in = new FastScanner();        PrintWriter out = new PrintWriter(System.out);        n = in.nextInt();        a = new HashMap<>();        b = new HashMap<>();        int freq[] = new int[(int)1e6+1];        for(int i=0;i<n;i++){        	int x = in.nextInt(), y = in.nextInt();        	a.put(x,y);        	b.put(y,x);        	freq[x]++; freq[y]++;        }        int ans[] = new int[n];        int first = 0, last = 0;        for(int i=0;i<=(int)1e6;i++){        	if(freq[i]==1){        		if(a.containsKey(i)) first = i;        		else last = i;        	}        	if(first!=0&&last!=0) break;        }        ans[0] = first; ans[n-1] = last;        int ind = 2, next = a.get(first);        while(ind<n){       		ans[ind] = next;       		ind += 2;       		if(ind<n) next = a.get(next);        }        ind = n-3; next = b.get(last);        while(ind>-1){        	ans[ind] = next;        	ind -= 2;        	if(ind>-1) next = b.get(next);        }                if(n%2==1){        	next = a.get(0); ind = 1;        	while(ind<n&&next!=-1){        		ans[ind] = next;        		ind += 2;        		next = a.get(next);        	}        }        for(int i : ans) out.print(i+" ");        out.println();              out.flush();    }	     static class pair{    	int a, b;    	pair(int x,int y) { a = x; b = y; }    	int first() { return a; }    	int second() { return b; }    } 	static class FastScanner {		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		StringTokenizer st = new StringTokenizer("");				String next() {			while(!st.hasMoreTokens())				try { st = new StringTokenizer(br.readLine()); }				catch(IOException e) {}			return st.nextToken();		}				String nextLine(){			try{ return br.readLine(); } 			catch(IOException e) { } return "";		}				int nextInt() {			return Integer.parseInt(next());		}				long nextLong() {			return Long.parseLong(next());		}				int[] readArray(int n) {			int a[] = new int[n];			for(int i=0;i<n;i++) a[i] = nextInt();			return a;		}	} 	static final Random random = new Random(); 	static void ruffleSort(int[] a){		int n = a.length;		for(int i=0;i<n;i++){			int j = random.nextInt(n), temp = a[j];			a[j] = a[i]; a[i] = temp;		}		Arrays.sort(a);	}}
