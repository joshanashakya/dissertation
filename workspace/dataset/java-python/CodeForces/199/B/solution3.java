import java.io.*;import java.util.*; public class Main {	static Scanner sc = new Scanner(System.in);	static PrintWriter out = new PrintWriter(System.out); 	public static void main(String[] args) throws Exception {		int x = sc.nextInt(), y = sc.nextInt(), ans = 0;		Circle a = new Circle(x,y, sc.nextInt()), b = new Circle(x,y, sc.nextInt());		Circle c = new Circle(x = sc.nextInt(), y = sc.nextInt(),sc.nextInt());		Circle d = new Circle(x,y,sc.nextInt());		ans += (!a.intersect(c) && !a.intersect(d) && !a.between(c,d)) ? 1 : 0;		ans += (!b.intersect(c) && !b.intersect(d) && !b.between(c,d)) ? 1 : 0;		ans += (!c.intersect(a) && !c.intersect(b) && !c.between(a,b)) ? 1 : 0;		ans += (!d.intersect(a) && !d.intersect(b) && !d.between(a,b)) ? 1 : 0;				out.println(ans);		out.close();	} 	static class Circle {		int x, y, r; 		Circle(int a, int b, int c) {			x = a;			y = b;			r = c;		} 		int sq(int x) {			return x * x;		} 		int dist(Circle c) {			return sq(c.x - x) + sq(c.y - y);		} 		boolean intersect(Circle c) {			int d = dist(c);			return sq(r - c.r) < d && d < sq(r + c.r);		} 		boolean between(Circle c1, Circle c2) {			double d = Math.sqrt(dist(c1));			return (r + d <= c2.r && r + d > c1.r);		} 		@Override		public String toString() {			return x + " " + y + " " + r;		}	}} class Scanner {	StringTokenizer st;	BufferedReader br; 	public Scanner(InputStream system) {		br = new BufferedReader(new InputStreamReader(system));	} 	public Scanner(String file) throws Exception {		br = new BufferedReader(new FileReader(file));	} 	public String next() throws IOException {		while (st == null || !st.hasMoreTokens())			st = new StringTokenizer(br.readLine());		return st.nextToken();	} 	public String nextLine() throws IOException {		return br.readLine();	} 	public int nextInt() throws IOException {		return Integer.parseInt(next());	} 	public double nextDouble() throws IOException {		return Double.parseDouble(next());	} 	public Long nextLong() throws IOException {		return Long.parseLong(next());	}}
