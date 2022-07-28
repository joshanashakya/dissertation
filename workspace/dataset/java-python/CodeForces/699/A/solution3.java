import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.StringTokenizer;import java.io.PrintWriter;    public class A {  	public static void main(String[]args)throws IOException {		FastReader sc = new FastReader();		PrintWriter out = new PrintWriter(System.out);		int n = sc.nextInt();		String str = sc.next();		char[] dir = str.toCharArray();		int [] pos = sc.nextIntArray(n); 		if (str.replaceAll("RL", "").length() == n)			out.println(-1); 		else { 			int min = Integer.MAX_VALUE;			for (int i = 0; i < n - 1; i++) {				if (dir[i] == 'R' && dir[i + 1] == 'L')					min = Math.min(min, pos[i + 1] - pos[i]);			}			out.println(min / 2);		} 		out.close();	}     // public static euclidTriplet euclidExtended(int a, int b) {// 	if (b == 0)// 		return new euclidTriplet(1, 0, a); // 	euclidTriplet ans = euclidExtended(b, a % b); // 	return new euclidTriplet(ans.y, ans.x - (a / b) * ans.y, ans.gcd);// }  // public static int  gcd(int a, int b) {// 	if (a == 0)// 		return b; // 	return gcd(b % a, a);// } } // class euclidTriplet {// 	int x, y, gcd;// 	euclidTriplet(int x, int y, int gcd) {// 		this.x = x;// 		this.y = y;// 		this.gcd = gcd;// 	}// }  // class comp implements Comparator<long []> {// 	public int compare(long [] arr1, long[] arr2) {// 		if ((2 * arr2[0] + arr2[1]) > (2 * arr1[0] + arr1[1]))// 			return 1; // 		else// 			return -1;// 	}// }  class FastReader { 	BufferedReader br;	StringTokenizer st; 	public FastReader() {		br = new BufferedReader(new InputStreamReader(System.in));	} 	String next() {		while (st == null || !st.hasMoreElements()) {			try {				st = new StringTokenizer(br.readLine());			} catch (IOException  e) {				e.printStackTrace();			}		}		return st.nextToken();	} 	int nextInt() {		return Integer.parseInt(next());	} 	int [] nextIntArray(int n) {		int [] arr = new int[n];		for (int i = 0; i < n; i++)			arr[i] = nextInt(); 		return arr; 	}  	long nextLong() {		return Long.parseLong(next());	} 	long [] nextLongArray(int n) {		long [] arr = new long[n];		for (int i = 0; i < n; i++)			arr[i] = nextLong(); 		return arr; 	} 	double nextDouble() {		return Double.parseDouble(next());	} 	String nextLine() {		String str = "";		try {			str = br.readLine();		} catch (IOException e) {			e.printStackTrace();		}		return str;	} }