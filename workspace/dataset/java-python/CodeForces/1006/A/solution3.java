//This code is written by प्रविण शंखपाळ  import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.Arrays;import java.util.Collections;import java.util.HashMap;import java.util.HashSet;import java.util.Map;import java.util.Scanner;import java.util.Set;import java.util.StringTokenizer;import java.util.Vector; public class Pineapple { 	public static void main(String[] args) {		try {			FastReader fr = new FastReader(); 			int n = fr.nextInt(); 			int A[] = new int[n];			for (int i = 0; i < n; i++) { 				A[i] = fr.nextInt();			}			for (int i = 0; i < n; i++) { 				if (A[i] % 2 == 0) {					A[i]--;				} 			} 			for (int i = 0; i < n; i++) {				System.out.print(A[i] + " ");			} 		} catch (Exception e) {			return;		} 	} 	static class FastReader {		BufferedReader br;		StringTokenizer st; 		public FastReader() {			br = new BufferedReader(new InputStreamReader(System.in));		} 		String next() {			while (st == null || !st.hasMoreElements()) {				try {					st = new StringTokenizer(br.readLine());				} catch (IOException e) {					e.printStackTrace();				}			}			return st.nextToken();		} 		int nextInt() {			return Integer.parseInt(next());		} 		long nextLong() {			return Long.parseLong(next());		} 		double nextDouble() {			return Double.parseDouble(next());		} 		String nextLine() {			String str = "";			try {				str = br.readLine();			} catch (IOException e) {				e.printStackTrace();			}			return str;		}	}}
