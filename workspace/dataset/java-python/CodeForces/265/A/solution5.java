import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.Arrays;import java.util.Comparator;import java.util.HashSet;import java.util.StringTokenizer; public class Main {		public static void main(String[] args) {		FastScanner f=new FastScanner();		String s = f.next();		String t = f.next();		int i =0;		int j =0;		int count =0;		while(i<s.length()&& j< t.length()) {			if(s.charAt(i)==t.charAt(j)) {				i++;				j++;				count++;			}else {				j++;			}		}				System.out.println(count+1);	} 			static int[] rsort(int[] input) {		return Arrays.stream(input)        .boxed()        .sorted(Comparator.reverseOrder())         .mapToInt(Integer::intValue)        .toArray();	}		static int[] sort(int[] input) {		return Arrays.stream(input)        .boxed()        .mapToInt(Integer::intValue)        .toArray();	} 			static class FastScanner {		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		StringTokenizer st=new StringTokenizer("");		String next() {			while (!st.hasMoreTokens())				try {					st=new StringTokenizer(br.readLine());				} catch (IOException e) {					e.printStackTrace();				}			return st.nextToken();		}				int nint() {			return Integer.parseInt(next());		}				int[] readArray(int n) {			int[] a=new int[n];			for (int i=0; i<n; i++) a[i]=nint();			return a;		}		int[][] readArray(int n, int k) {			int[][] a=new int[n][k];			for (int i=0; i<n; i++)				for(int j=0;j<k;j++)a[i][j]=nint();			return a;		}				long nLong() {			return Long.parseLong(next());		}	} 	}