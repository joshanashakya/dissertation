import java.util.*;import java.io.*; public class Main {	public static void main(String[] args) throws IOException {		Scanner sc = new Scanner(System.in);		PrintWriter out = new PrintWriter(System.out);		int n=sc.nextInt();		Point c = new Point(sc.nextInt(), sc.nextInt());		Point[] arr = new Point[n];		double INF = 1e16;		double minr = INF, maxr=  -INF;		for(int i=0;i<n;i++) {			arr[i]=  new Point(sc.nextInt(), sc.nextInt());			maxr = Math.max(maxr, arr[i].dist(c));		}		for(int i=0;i<n;i++)			minr = Math.min(minr, Point.distToLineSegment(c, arr[i], arr[(i+1)%n]));		out.println(Math.PI * (maxr*maxr - minr*minr));		out.close();	} 	static class Vector { 		double x, y;  		Vector(double a, double b) { x = a; y = b; } 		Vector(Point a, Point b) { this(b.x - a.x, b.y - a.y); } 		Vector scale(double s) { return new Vector(x * s, y * s); }              //s is a non-negative value 		double dot(Vector v) { return (x * v.x + y * v.y); } 		double cross(Vector v) { return x * v.y - y * v.x; } 		double norm2() { return x * x + y * y; } 		Vector reverse() { return new Vector(-x, -y); } 		Vector normalize() 		{ 			double d = Math.sqrt(norm2());			return scale(1 / d);		}			}	static class Point implements Comparable<Point>{ 		static final double EPS = 1e-9; 		double x, y;                   		Point(double a, double b) { x = a; y = b; }  				public int compareTo(Point p)		{			if(Math.abs(x - p.x) > EPS) return x > p.x ? 1 : -1;			if(Math.abs(y - p.y) > EPS) return y > p.y ? 1 : -1;			return 0;		}				public double dist(Point p) { return Math.sqrt(sq(x - p.x) + sq(y - p.y)); }				static double sq(double x) { return x * x; }				Point rotate(double angle)		{			double c = Math.cos(angle), s = Math.sin(angle);			return new Point(x * c - y * s, x * s + y * c);		}		// for integer points and rotation by 90 (counterclockwise) : swap x and y, negate x				Point rotate(double theta, Point p)			//rotate around p		{			Vector v = new Vector(p, new Point(0, 0));			return translate(v).rotate(theta).translate(v.reverse());		}				Point translate(Vector v) { return new Point(x + v.x , y + v.y); }				boolean between(Point p, Point q)		{			return x < Math.max(p.x, q.x) + EPS && x + EPS > Math.min(p.x, q.x)					&& y < Math.max(p.y, q.y) + EPS && y + EPS > Math.min(p.y, q.y);		}				//returns true if it is on the line defined by a and b		boolean onLine(Point a, Point b) 		{			if(a.compareTo(b) == 0) return compareTo(a) == 0;			return Math.abs(new Vector(a, b).cross(new Vector(a, this))) < EPS;		}				boolean onSegment(Point a, Point b)		{			if(a.compareTo(b) == 0) return compareTo(a) == 0;			return onRay(a, b) && onRay(b, a);		}				//returns true if it is on the ray whose start point is a and passes through b		boolean onRay(Point a, Point b)		{			if(a.compareTo(b) == 0) return compareTo(a) == 0;			return new Vector(a, b).normalize().equals(new Vector(a, this).normalize());	//implement equals()		}				// returns true if it is on the left side of Line pq		// add EPS to LHS if on-line points are accepted		static boolean ccw(Point p, Point q, Point r)		{			return new Vector(p, q).cross(new Vector(p, r)) > 0;		}				static boolean collinear(Point p, Point q, Point r)		{			return Math.abs(new Vector(p, q).cross(new Vector(p, r))) < EPS;		}				static double angle(Point a, Point o, Point b)  // angle AOB		{			Vector oa = new Vector(o, a), ob = new Vector(o, b);			return Math.acos(oa.dot(ob) / Math.sqrt(oa.norm2() * ob.norm2()));		}				static double distToLine(Point p, Point a, Point b) //distance between point p and a line defined by points a, b (a != b)		{			if(a.compareTo(b) == 0) return p.dist(a);			// formula: c = a + u * ab			Vector ap = new Vector(a, p), ab = new Vector(a, b);			double u = ap.dot(ab) / ab.norm2();			Point c = a.translate(ab.scale(u)); 			return p.dist(c);		}		// Another way: find closest point and calculate the distance between it and p 		static double distToLineSegment(Point p, Point a, Point b) 		{			Vector ap = new Vector(a, p), ab = new Vector(a, b);			double u = ap.dot(ab) / ab.norm2();			if (u < 0.0) return p.dist(a);			if (u > 1.0) return p.dist(b);        			return distToLine(p, a, b); 		}		// Another way: find closest point and calculate the distance between it and p	}  	static class Scanner {		StringTokenizer st;		BufferedReader br; 		public Scanner(InputStream s) {			br = new BufferedReader(new InputStreamReader(s));		} 		public Scanner(String s) throws FileNotFoundException {			br = new BufferedReader(new FileReader(s));		} 		public String next() throws IOException {			while (st == null || !st.hasMoreTokens())				st = new StringTokenizer(br.readLine());			return st.nextToken();		} 		public int nextInt() throws IOException {			return Integer.parseInt(next());		} 		public int[] nextIntArray(int n) throws IOException {			int[] ans = new int[n];			for (int i = 0; i < n; i++)				ans[i] = nextInt();			return ans;		} 		public long nextLong() throws IOException {			return Long.parseLong(next());		} 		public String nextLine() throws IOException {			return br.readLine();		} 		public double nextDouble() throws IOException {			return Double.parseDouble(next());		} 		public boolean ready() throws IOException {			return br.ready();		} 	}}