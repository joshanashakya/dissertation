// Working program with FastReaderimport java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.math.BigInteger;import java.util.StringTokenizer;     public class Main {	static class FastReader {		BufferedReader br;		StringTokenizer st; 		public FastReader()		{			br = new BufferedReader(				new InputStreamReader(System.in));		} 		String next()		{			while (st == null || !st.hasMoreElements()) {				try {					st = new StringTokenizer(br.readLine());				}				catch (IOException e) {				}			}			return st.nextToken();		} 		int nextInt() { return Integer.parseInt(next()); } 		long nextLong() { return Long.parseLong(next()); } 		double nextDouble()		{			return Double.parseDouble(next());		} 		String nextLine()		{			String str = "";			try {				str = br.readLine();			}			catch (IOException e) {			}			return str;		}	}         public static void main(String[] args){            FastReader sc = new FastReader();             BigInteger input = new BigInteger(sc.nextLine());             BigInteger even = input.divide(BigInteger.valueOf(2));             BigInteger odd = even.add(BigInteger.valueOf(1))                    .multiply(BigInteger.valueOf(-1));                         if (input.mod(BigInteger.valueOf(2)) == BigInteger.valueOf(0)){                System.out.println(even);            }            else                System.out.println(odd);                                                           }       }            