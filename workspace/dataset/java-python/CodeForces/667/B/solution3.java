import java.io.BufferedReader;import java.io.InputStream;import java.io.InputStreamReader;import java.util.ArrayList;import java.util.Arrays;import java.util.HashMap;import java.util.Scanner;import java.util.StringTokenizer; public class AntiCubism { 	public static void main(String[] args) {		// TODO Auto-generated method stub		Scanner sc = new Scanner(System.in);		int n = sc.nextInt();		long a[] = new long[n];		long res = 0;				for(int i = 0;i < n;i++) {			a[i] = sc.nextLong();		}		Arrays.sort(a);		long sum = 0;		for (int i = 0; i < n - 1; i++) {			sum += a[i];		}		res = (a[n - 1] - sum) + 1;				System.out.println(Math.max(0,res));	} //	private static class Scanner {//		public BufferedReader reader;//		public StringTokenizer st;////		public Scanner(InputStream stream) {//			reader = new BufferedReader(new InputStreamReader(stream));//			st = null;//		}////		public String next() {//			while (st == null || !st.hasMoreTokens()) {//				try {//					String line = reader.readLine();//					if (line == null)//						return null;//					st = new StringTokenizer(line);//				} catch (Exception e) {//					throw (new RuntimeException());//				}//			}//			return st.nextToken();//		}////		public int nextInt() {//			return Integer.parseInt(next());//		}////		public long nextLong() {//			return Long.parseLong(next());//		}////		public double nextDouble() {//			return Double.parseDouble(next());//		}//	} }