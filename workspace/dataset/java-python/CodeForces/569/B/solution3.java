import java.io.*;import java.math.BigDecimal;import java.math.BigInteger;import java.util.*;   public class Solution {	public static class FastReader {			BufferedReader br;			StringTokenizer root;				 			public FastReader() {				br = new BufferedReader(new InputStreamReader(System.in));			}	 			String next() {				while (root == null || !root.hasMoreTokens()) {					try {						root = new StringTokenizer(br.readLine());					} catch (Exception addd) {						addd.printStackTrace();					}				}				return root.nextToken();			}	 			int nextInt() {				return Integer.parseInt(next());			}	 			double nextDouble() {				return Double.parseDouble(next());			}	 			long nextLong() {				return Long.parseLong(next());			}	 			String nextLine() {				String str = "";				try {					str = br.readLine();				} catch (Exception addd) {					addd.printStackTrace();				}				return str;			}		}	 	public static PrintWriter out = new PrintWriter (new BufferedOutputStream(System.out));	public static FastReader sc = new FastReader(); 	static int mod = (int) (1e9+7),MAX=(int)(6e6);		public static void main(String[] args) throws IOException{				int n = sc.nextInt();		TreeSet<Integer> set = new TreeSet<>();		int[] a = new int[n];		for(int i=1;i<=n;++i) {			a[i-1] = sc.nextInt();			set.add(i);		}		for(int x : a) set.remove(x);		TreeSet<Integer> perm = new TreeSet<>();		for(int i=0;i<n;++i) {			if(a[i] <= n) {				if(perm.contains(a[i])) {					a[i] = set.first();					set.remove(a[i]);				}			}else {				a[i] = set.first();				set.remove(a[i]);			}			perm.add(a[i]);		}		for(int x : a) out.print(x+" ");		out.close(); 	}	  static <T> void add(Map<T, Integer> map, T i) {			if(map.containsKey(i)) map.put(i, map.get(i)+1);			else map.put(i, 1);					}		 static <T> void delete(Map<T, Integer> map, T i) {			if(map.containsKey(i)) {				if(map.get(i) == 1) map.remove(i);				else map.put(i, map.get(i)-1);			}					}	}  
