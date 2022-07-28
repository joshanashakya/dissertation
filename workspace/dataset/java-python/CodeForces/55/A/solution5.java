import java.io.BufferedReader;import java.io.FileNotFoundException;import java.io.FileReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.StringTokenizer; public class Main {	public static void main(String[] args) {		FastScanner input = new FastScanner();				int N = input.nextInt();				boolean[] visited = new boolean[N];				int current = 0;		for (int i = 1; i <= N * N; i++) {			visited[current] = true;			current = (current + i) % N;		}				for (int i = 0; i < N; i++) {			if (!visited[i]) {				System.out.println("NO");				return;			}		}				System.out.println("YES");	}		// https://github.com/detel/Faster-InputOutput-Implementations/blob/master/FastScanner.java	// Fast I/O	static class FastScanner { 		BufferedReader br;		StringTokenizer st; 		public FastScanner(String s) {			try {				br = new BufferedReader(new FileReader(s));			} catch (FileNotFoundException e) {				// TODO Auto-generated catch block				e.printStackTrace();			}		} 		public FastScanner() {			br = new BufferedReader(new InputStreamReader(System.in));		} 		String next() {			while (st == null || !st.hasMoreElements()) {				try {					st = new StringTokenizer(br.readLine());				} catch (IOException e) {					// TODO Auto-generated catch block					e.printStackTrace();				}			}			return st.nextToken();		} 		int nextInt() {			return Integer.parseInt(next());		} 		long nextLong() {			return Long.parseLong(next());		} 		double nextDouble() {			return Double.parseDouble(next());		}	}}
