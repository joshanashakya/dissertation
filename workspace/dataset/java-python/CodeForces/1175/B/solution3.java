import java.util.*;import java.io.*; public class Main { 	public static void main(String[] args) throws IOException {		Scanner sc = new Scanner(System.in);		PrintWriter out = new PrintWriter(System.out);		int l = sc.nextInt();		Stack<Integer> st = new Stack<Integer>();		long factor = 1, ans = 0;		boolean overflow = false;		int mxn = 102;		int[] cnt = new int[mxn];		Long mx = (1l << 32) - 1;		while (l-- > 0) {			String s = sc.next(); 			if (s.equals("add")) {				if (overflow)					continue;				Long cur = 1l;				for (int i = 2; i < mxn; i++)					for (int j = 0; j < cnt[i]; j++) {						cur *= i;						if (cur > mx)							overflow = true;					}				ans += cur;				if (ans > mx)					overflow = true;			} else if (s.equals("for")) {				int n = sc.nextInt();				st.add(n);				factor *= n;				cnt[n]++;			} else {				int n = st.pop();				factor /= n;				cnt[n]--;			}		}		out.println(overflow ? "OVERFLOW!!!" : ans);		out.close();	} 	static class Scanner {		StringTokenizer st;		BufferedReader br; 		public Scanner(InputStream s) {			br = new BufferedReader(new InputStreamReader(s));		} 		public Scanner(String s) throws FileNotFoundException {			br = new BufferedReader(new FileReader(s));		} 		public String next() throws IOException {			while (st == null || !st.hasMoreTokens())				st = new StringTokenizer(br.readLine());			return st.nextToken();		} 		public int nextInt() throws IOException {			return Integer.parseInt(next());		} 		public int[] nextIntArray(int n) throws IOException {			int[] ans = new int[n];			for (int i = 0; i < n; i++)				ans[i] = nextInt();			return ans;		} 		public long nextLong() throws IOException {			return Long.parseLong(next());		} 		public String nextLine() throws IOException {			return br.readLine();		} 		public double nextDouble() throws IOException {			return Double.parseDouble(next());		} 		public boolean ready() throws IOException {			return br.ready();		} 	}}