import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.*;public class code {	public static void main(String[] args)throws IOException {		FastReader sc = new FastReader();		PrintWriter p = new PrintWriter(System.out);  		int n = sc.nextInt();		int arr[] = new int[101];		boolean flag = false;		while (n-- > 0) {			int x = sc.nextInt();			for (int i = 0; i < x; i++) {				arr[sc.nextInt()]++;			} 		}		ArrayList<Integer> ans = new ArrayList<>();		int max = -1;		for (int i = 0; i < 101; i++) {			max = Math.max(max, arr[i]);		}		for (int i = 0; i < 101; i++) {			if (arr[i] == max) {				ans.add(i);			}		}		for (int i : ans) {			System.out.print(i + " ");		}		System.out.println();     	}     }  class FastReader {	BufferedReader br;	StringTokenizer st; 	public FastReader() {		br = new BufferedReader(new		                        InputStreamReader(System.in));	} 	String next() {		while (st == null || !st.hasMoreElements()) {			try {				st = new StringTokenizer(br.readLine());			} catch (IOException  e) {				e.printStackTrace();			}		}		return st.nextToken();	} 	int nextInt() {		return Integer.parseInt(next());	} 	long nextLong() {		return Long.parseLong(next());	} 	double nextDouble() {		return Double.parseDouble(next());	} 	String nextLine() {		String str = "";		try {			str = br.readLine();		} catch (IOException e) {			e.printStackTrace();		}		return str;	}}