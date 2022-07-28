// package CodeForces;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.LinkedList;

public class FlexingOP3D {

	public static HashSet<Integer>[] adj;
	
	public static void solve() {
		int m = s.nextInt();
		adj = new HashSet[5];
		for(int i = 0; i < 5; i++) {
			adj[i] = new HashSet<Integer>();
		}
		for(int i = 0; i < m; i++) {
			int u = s.nextInt() - 1;
			int v = s.nextInt() - 1;
			adj[u].add(v);
			adj[v].add(u);
		}
		int[] arr = new int[5];
		for(int i = 0; i < 5; i++) arr[i] = i;
		if(Recur(0, arr, new LinkedList<Integer>())) {
			out.println("WIN");
		}else {
			out.println("FAIL");
		}
	}
	
	public static boolean Recur(int curr, int[] arr, LinkedList<Integer> selected) {
		if(selected.size() == 3) {
			int[] nodes = new int[3];
			int i = 0;
			for(Integer x : selected) {
				nodes[i++] = x;
			}
//			if(nodes[0] == 1 && nodes[1] == 3 && nodes[2] == 4) {
//				System.out.println("YUP");
//			}
//			boolean check = checkIndependence(nodes);
			if(checkClique(nodes) || checkIndependence(nodes)) {
				return true;
			}
			return false;
		}
		if(curr == arr.length) {
			return false;
		}
		boolean ok = false;
		selected.addLast(arr[curr]);
		ok |= Recur(curr + 1, arr, selected);
		selected.removeLast();
		ok |= Recur(curr + 1, arr, selected);
		return ok;
	}

	public static boolean checkClique(int[] selected_nodes) {
		boolean ok = true;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(i == j) continue;
				ok &= adj[selected_nodes[i]].contains(selected_nodes[j]);
			}
		}
		return ok;
	}
	
	public static boolean checkIndependence(int[] selected_nodes) {
		boolean ok = true;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(i == j) continue;
				ok &= !adj[selected_nodes[i]].contains(selected_nodes[j]);
			}
		}
		return ok;
	}
	
	public static void main(String[] args) {
		new Thread(null, null, "Thread", 1 << 27) {
			public void run() {
				try {
					out = new PrintWriter(new BufferedOutputStream(System.out));
					s = new FastReader(System.in);
					solve();
					out.close();
				} catch (Exception e) {
					e.printStackTrace();
					System.exit(1);
				}
			}
		}.start();
	}

	public static PrintWriter out;
	public static FastReader s;

	public static class FastReader {

		private InputStream stream;
		private byte[] buf = new byte[4096];
		private int curChar, snumChars;

		public FastReader(InputStream stream) {
			this.stream = stream;
		}

		public int read() {
			if (snumChars == -1) {
				throw new InputMismatchException();
			}
			if (curChar >= snumChars) {
				curChar = 0;
				try {
					snumChars = stream.read(buf);
				} catch (IOException E) {
					throw new InputMismatchException();
				}
			}
			if (snumChars <= 0) {
				return -1;
			}
			return buf[curChar++];
		}

		public int nextInt() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			int sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			int number = 0;
			do {
				number *= 10;
				number += c - '0';
				c = read();
			} while (!isSpaceChar(c));
			return number * sgn;
		}

		public long nextLong() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			long sgn = 1;
			if (c == '-') {
				sgn = -1;
				c = read();
			}
			long number = 0;
			do {
				number *= 10L;
				number += (long) (c - '0');
				c = read();
			} while (!isSpaceChar(c));
			return number * sgn;
		}

		public int[] nextIntArray(int n) {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = this.nextInt();
			}
			return arr;
		}

		public long[] nextLongArray(int n) {
			long[] arr = new long[n];
			for (int i = 0; i < n; i++) {
				arr[i] = this.nextLong();
			}
			return arr;
		}

		public String next() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isSpaceChar(c));
			return res.toString();
		}

		public String nextLine() {
			int c = read();
			while (isSpaceChar(c)) {
				c = read();
			}
			StringBuilder res = new StringBuilder();
			do {
				res.appendCodePoint(c);
				c = read();
			} while (!isEndofLine(c));
			return res.toString();
		}

		public boolean isSpaceChar(int c) {
			return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
		}

		public boolean isEndofLine(int c) {
			return c == '\n' || c == '\r' || c == -1;
		}

	}

	
}

