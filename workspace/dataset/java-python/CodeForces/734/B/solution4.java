import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.StringTokenizer; public class FindingBorders { 	public static void main(String[] args) throws Exception { //		File file = Paths.get("input.txt").toFile();//		if (file.exists()) {//			System.setIn(new FileInputStream(file));//		}		long t = System.currentTimeMillis(); 		FastReader reader = new FastReader(); 				int i2=reader.nextInt();		int i3=reader.nextInt();		int i5=reader.nextInt();		int i6=reader.nextInt();				//256		int num256=Math.min(i2, Math.min(i5, i6));		i2-=num256;		int num32=Math.min(i2,i3);				int res=256*num256+32*num32;		System.out.println(res);					} 	static class FastReader {		BufferedReader br;		StringTokenizer st; 		public FastReader() {			br = new BufferedReader(new InputStreamReader(System.in));		} 		String next() {			while (st == null || !st.hasMoreElements()) {				try {					st = new StringTokenizer(br.readLine());				} catch (IOException e) {					e.printStackTrace();				}			}			return st.nextToken();		} 		int nextInt() {			return Integer.parseInt(next());		} 		long nextLong() {			return Long.parseLong(next());		} 		double nextDouble() {			return Double.parseDouble(next());		} 		String nextLine() {			String str = "";			try {				str = br.readLine();			} catch (IOException e) {				e.printStackTrace();			}			return str;		}	}}