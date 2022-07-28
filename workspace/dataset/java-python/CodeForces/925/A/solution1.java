import java.io.*;import java.util.*;import java.util.concurrent.TimeUnit; public class b implements Runnable{	    public static void main(String[] args) {    	try{            new Thread(null, new b(), "process", 1<<26).start();        }        catch(Exception e){            System.out.println(e);        }    }	public void run() {		FastReader scan = new FastReader();        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));		//PrintWriter out = new PrintWriter("file.out");		Task solver = new Task();		//int t = scan.nextInt();		int t = 1;		for(int i = 1; i <= t; i++) solver.solve(i, scan, out);		out.close();	} 	static class Task {		static final int inf = Integer.MAX_VALUE; 		public void solve(int testNumber, FastReader sc, PrintWriter out) {			int N = sc.nextInt();			int M = sc.nextInt();			int C1 = sc.nextInt();			int CE = sc.nextInt();			int V = sc.nextInt();						TreeSet<Integer> stairs = new TreeSet<>();			TreeSet<Integer> elevator = new TreeSet<>();						while(C1 --> 0) {				stairs.add(sc.nextInt());			}			while(CE --> 0) {				elevator.add(sc.nextInt());			}						int Q = sc.nextInt();			while(Q --> 0) {				int x1 = sc.nextInt();				int y1 = sc.nextInt();				int x2 = sc.nextInt();				int y2 = sc.nextInt();								if(x1 == x2) {					out.println(Math.abs(y2 - y1));					continue;				}				int time = Integer.MAX_VALUE;				// Case one: use elevator on the left				if(elevator.lower(y1) != null) {					int X = elevator.lower(y1);					time = Math.min(time, Math.abs(y1 - X) + Math.abs(y2 - X) + ((Math.abs(x2-x1) + (V-1)) / V));				}								// Case two: use elevator on the right				if(elevator.higher(y1) != null) {					int X = elevator.higher(y1);					//System.out.println("X: " + X);					time = Math.min(time, Math.abs(y1 - X) + Math.abs(y2 - X) + ((Math.abs(x2-x1) + (V-1)) / V));					//System.out.println(Math.abs(y1 - X));				}								// Case three: use stairs on the left				if(stairs.lower(y1) != null) {					int X = stairs.lower(y1);					time = Math.min(time, Math.abs(y1 - X) + Math.abs(y2 - X) + (Math.abs(x2-x1)));				}								// Case four: use stairs on the right				if(stairs.higher(y1) != null) {					int X = stairs.higher(y1);					time = Math.min(time, Math.abs(y1 - X) + Math.abs(y2 - X) + (Math.abs(x2-x1)));				}								out.println(time);			}					}	}	static long binpow(long a, long b, long m) {		a %= m;		long res = 1;		while (b > 0) {			if ((b & 1) == 1)				res = res * a % m;			a = a * a % m;			b >>= 1;		}		return res;	}	static void sort(int[] x){		shuffle(x);		Arrays.sort(x);	}	static void sort(long[] x){		shuffle(x);		Arrays.sort(x);	}	static class tup implements Comparable<tup>, Comparator<tup>{		int a, b;		tup(int a,int b){			this.a=a;			this.b=b;		}		public tup() {		}		@Override		public int compareTo(tup o){			return Integer.compare(b,o.b);		}		@Override		public int compare(tup o1, tup o2) {			return Integer.compare(o1.b, o2.b);		}				@Override	    public int hashCode() {			return Objects.hash(a, b);	    } 	    @Override	    public boolean equals(Object obj) {	    	if (this == obj)                return true;	    	if (obj == null)                return false;	    	if (getClass() != obj.getClass())                return false;	    	tup other = (tup) obj;	    	return a==other.a && b==other.b;	    }	    	    @Override	    public String toString() {	    	return a + " " + b;	    }	}		static void shuffle(int[] a) {		Random get = new Random();		for (int i = 0; i < a.length; i++) {			int r = get.nextInt(a.length);			int temp = a[i];			a[i] = a[r];			a[r] = temp;		}	} 	static void shuffle(long[] a) {		Random get = new Random();		for (int i = 0; i < a.length; i++) {			int r = get.nextInt(a.length);			long temp = a[i];			a[i] = a[r];			a[r] = temp;		}	} 	static class FastReader {		BufferedReader br;		StringTokenizer st; 		public FastReader() {			br = new BufferedReader(new InputStreamReader(System.in));		} 		public FastReader(String s) throws FileNotFoundException {			br = new BufferedReader(new FileReader(new File(s)));		} 		String next() {			while (st == null || !st.hasMoreElements()) {				try {					st = new StringTokenizer(br.readLine());				} catch (IOException e) {					e.printStackTrace();				}			}			return st.nextToken();		} 		int nextInt() {			return Integer.parseInt(next());		} 		long nextLong() {			return Long.parseLong(next());		} 		double nextDouble() {			return Double.parseDouble(next());		} 		String nextLine() {			String str = "";			try {				str = br.readLine();			} catch (IOException e) {				e.printStackTrace();			}			return str;		}	} }