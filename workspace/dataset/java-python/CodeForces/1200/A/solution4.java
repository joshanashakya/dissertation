// 11-Feb-2021import java.util.*;import java.io.*; public class A {	static class FastReader { 		BufferedReader br;		StringTokenizer st; 		private FastReader() {			br = new BufferedReader(new InputStreamReader(System.in));		} 		String next() {			while (st == null || !st.hasMoreElements()) {				try {					st = new StringTokenizer(br.readLine());				} catch (IOException e) {					e.printStackTrace();				}			}			return st.nextToken();		} 		int nextInt() {			return Integer.parseInt(next());		} 		int[] nextIntArray(int n) {			int[] a = new int[n];			for (int i = 0; i < n; i++)				a[i] = nextInt();			return a;		} 		int[] nextIntArrayOne(int n) {			int[] a = new int[n + 1];			for (int i = 1; i < n + 1; i++)				a[i] = nextInt();			return a;		} 		long nextLong() {			return Long.parseLong(next());		} 		double nextDouble() {			return Double.parseDouble(next());		} 		String nextLine() {			String str = "";			try {				str = br.readLine();			} catch (IOException e) {				e.printStackTrace();			}			return str;		}	} 	public static void main(String[] args) {		FastReader s = new FastReader();		StringBuilder str = new StringBuilder();		int ans[] = new int[10];		int n = s.nextInt();		char arr[] = s.nextLine().toCharArray();				for(int i = 0; i < arr.length; i++) {						if(arr[i] == 'L') {								for(int j = 0; j <= 9; j++) {										if(ans[j] == 0) {						ans[j] = 1;						break;					}									}							}else if(arr[i] == 'R') {								for(int j = 9; j >=0; j--) {					if(ans[j] == 0) {						ans[j] = 1;						break;					}				}											}else {				int cur = arr[i] - '0';				ans[cur] = 0;							}		}										for(int p : ans) str.append(p);				System.out.println(str);	} }
