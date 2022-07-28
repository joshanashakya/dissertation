import java.util.*;
import java.lang.*;
import java.io.*;

	public class FastIO{
			
		BufferedReader br;
		StringTokenizer st;
		
		public FastIO(){ // constructor
			
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		String next(){
			
			while (st == null || !st.hasMoreElements()){
				try{
					st = new StringTokenizer(br.readLine());
				}
				
				catch (IOException e){
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		
		int nextInt(){
			
			return Integer.parseInt(next());
		}
		
		long nextLong(){
			
			return Long.parseLong(next());
		}
		
		double nextDouble(){
			return Double.parseDouble(next());
		}

		String nextLine(){
			
			String str = "";
			try{
				
				str = br.readLine();
			}
			catch (IOException e){
				
				e.printStackTrace();
			}
			return str;
		}
		
	public static void main(String[] args) throws IOException {
		
		FastIO io = new FastIO();
		
		// int n = io.nextInt(); -> for int
		// double d = io.nextDouble(); -> for double
		// String ch = io.next(); -> for one word
		// String str = io.nextLine(); -> for the entire line
		
		long n = io.nextInt();
		
		System.out.println(findSuperLucky(n, 0, 0, 0));
	}
	
	static long findSuperLucky(long n, int f, int s, long formed) {
		
		if(formed >= n && f == s) {
			return formed;
		}
		
		if(formed > n * 100) {
			return Long.MAX_VALUE;
		}
		
		return Math.min(findSuperLucky(n, f + 1, s, formed * 10 + 4), findSuperLucky(n, f, s + 1, formed * 10 + 7));
	}
}
