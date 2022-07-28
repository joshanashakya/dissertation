import java.io.*;import java.util.*; public class CodeForces { 	public static void main(String[] args) throws FileNotFoundException {		FastScanner sc = new FastScanner();		StringBuilder sb = new StringBuilder(); 		int t = sc.nextInt();		while (t-- > 0) {			solve(sc, sb);		}		System.out.print(sb);	} 	static int mod = 1000000007; 	private static void flip(char[][] ch, int i, int j, int req) {		if (ch[i][j] - '0' != req) {			int[] flip = new int[2];			flip[0] = i;			flip[1] = j;			ans.add(flip); 		}	}	static ArrayList<int[]> ans = new ArrayList<int[]>();		private static void solve(FastScanner sc, StringBuilder sb) {		int n = sc.nextInt();		char[][] ch = new char[n][n];		for (int i = 0; i < n; i++) {			String str = sc.next();			for (int j = 0; j < n; j++) {				ch[i][j] = str.charAt(j);			}		}				ans.clear();		if (ch[1][0] == ch[0][1]) {			int req = ch[1][0] - '0';			req = 1 - req;			flip(ch,n-2,n-1,req);			flip(ch,n-1,n-2,req);			 		} else if (ch[n - 1][n - 2] == ch[n - 2][n - 1]) {			int req = ch[n - 1][n - 2] - '0';			req = 1 - req;			flip(ch,0,1,req);			flip(ch,1,0,req); 		} else {			flip(ch,0,1,0);			flip(ch,1,0,0);			flip(ch,n-2,n-1,1);			flip(ch,n-1,n-2,1);		}		sb.append(ans.size() + "\n");		for (int[] i : ans) {			sb.append(i[0] + 1 + " " + (i[1] + 1) + "\n");		} 	} 	private static boolean traversal(char[][] ch,char x) {		Stack<Integer> stk=new Stack<Integer>();		int n=ch.length;		stk.push(0);		while(!stk.isEmpty()) {			int curr=stk.pop();			int i=curr/n,j=curr%n;			if(ch[i][j]=='F') {				return true;			}			if(i+1<n&&ch[i+1][j]==x) {				stk.push((i+1)*n+j);			}			if(j+1<n&&ch[i][j+1]==x) {				stk.push((i)*n+j+1);			}					}		return false;	} } class Pair implements Comparable<Pair> {	int r, c; 	public Pair(int i, int j) {		r = i;		c = j;// TODO Auto-generated constructor stub 	} 	@Override	public int compareTo(Pair o) { 		return o.c == c ? r - o.r : c - o.c;	}} class FastScanner {	BufferedReader br;	StringTokenizer st; 	public FastScanner() throws FileNotFoundException {		try {			File file = new File("src\\input.txt");			br = new BufferedReader(new FileReader(file));		} catch (Exception e) {			br = new BufferedReader(new InputStreamReader(System.in));		} 	} 	String next() {		while (st == null || !st.hasMoreElements()) {			try {				st = new StringTokenizer(br.readLine());			} catch (IOException e) {				e.printStackTrace();			}		}		return st.nextToken();	} 	int nextInt() {		return Integer.parseInt(next());	} 	long nextLong() {		return Long.parseLong(next());	} 	double nextDouble() {		return Double.parseDouble(next());	} 	int[] nextInts(int N) {		int[] res = new int[N];		for (int i = 0; i < N; i++) {			res[i] = (int) nextLong();		}		return res;	} 	long[] nextLongs(int N) {		long[] res = new long[N];		for (int i = 0; i < N; i++) {			res[i] = nextLong();		}		return res;	} 	public double[] nextDoubles(int N) {		double[] res = new double[N];		for (int i = 0; i < N; i++) {			res[i] = nextDouble();		}		return res;	} 	String nextLine() {		String str = "";		try {			str = br.readLine();		} catch (IOException e) {			e.printStackTrace();		}		return str;	}}