import static java.lang.Math.*;import static java.util.Arrays.*;import java.util.*;import java.io.*; public class Main {		Scanner in = new Scanner(new BufferedInputStream(System.in));	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));		void run(){		int a = in.nextInt();		int b = in.nextInt();		int c = in.nextInt();		int d = in.nextInt();		int e = in.nextInt();		int f = in.nextInt();		int ans1 = 0, ans2 = 0;		if(a > d){			ans1 += d * e;		} else {			ans1 += a * e;			ans1 += min(min(b, c), d-a) * f;		}		if(min(b, c) > d){			ans2 += d * f;		} else {			ans2 += min(b, c) * f;			ans2 += min(a, (d - min(b, c))) * e;		}		out.println(max(ans1, ans2));	}		void debug(Object... os){		out.flush();		System.err.println(deepToString(os));	}		public static void main(String[] args) {		new Main().run();		out.close();	} }
