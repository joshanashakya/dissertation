import java.util.*;import java.io.*;import java.math.*;public class Euler {			public static int gcd(int a, int b) {		if (b == 0) return a;		else return gcd(b, a % b);	}		static class turple{		int x;		int y; 		int z;		turple (int x, int y, int z) {			this.x = x;			this.y = y;			this.z = z;		}	}		public static void main(String[] args){				FastReader in = new FastReader();		PrintWriter o = new PrintWriter(System.out);				int n = in.nextInt();		int[] ans1 = new int[n];		int[] ans2 = new int[n];		ArrayList<turple> list = new ArrayList<>();				for (int i = 0; i < n; i++) {			int a = in.nextInt();			int b = in.nextInt();			list.add(new turple(a, 0, i));			list.add(new turple(b, 1, i));			if (i < n / 2) {				ans1[i] = 1;				ans2[i] = 1;			}		}		Collections.sort(list, (t1, t2)->t1.x - t2.x);				for (int i = 0; i < n; i++) {						if (list.get(i).y == 0) {				ans1[list.get(i).z] = 1;			} else ans2[list.get(i).z] = 1;					}				for (int i = 0; i < n; i++) {			o.print(ans1[i]);		}		o.println();		for (int i = 0; i < n; i++) o.print(ans2[i]);		o.println();						o.flush();		o.close();		return;																	}		static class FastReader {		BufferedReader br;		StringTokenizer st; 		public FastReader() {			br = new BufferedReader(new InputStreamReader(System.in));		} 		String next() {			while (st == null || !st.hasMoreElements()) {				try {					st = new StringTokenizer(br.readLine());				} catch (IOException e) {					e.printStackTrace();				}			}			return st.nextToken();		} 		int nextInt() {			return Integer.parseInt(next());		} 		long nextLong() {			return Long.parseLong(next());		} 		double nextDouble() {			return Double.parseDouble(next());		} 		String nextLine() {			String str = "";			try {				str = br.readLine();			} catch (IOException e) {				e.printStackTrace();			}			return str;		}	} }
