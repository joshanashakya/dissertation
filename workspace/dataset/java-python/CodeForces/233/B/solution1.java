import java.io.BufferedReader;import java.io.FileNotFoundException;import java.io.FileReader;import java.io.IOException;import java.io.InputStream;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.*;public class Main { 	public static boolean gsd(long x , int y) {		for(int i = 2 ; i <= Math.min(y, x) ; i ++ ) {			if (x%i == 0 && y%i == 0 ) return true;		}		return false;	}	public static int s(long x) {		int sum = 0 ; 		do {			sum += x%10 ; 			x /= 10;		}while(x >0 );		return sum;	}	public static void main(String[] args)  throws IOException, InterruptedException{		PrintWriter pw = new PrintWriter(System.out);		Scanner sc = new Scanner (System.in);		long n = sc.nextLong();		int x =(int) Math.sqrt(n);int i = 0; boolean flag = false;//		System.out.println(x);//		pw.println((double)Math.ceil(Math.sqrt(77*77+4*n))== (double)Math.floor(Math.sqrt(77*77+4*n)));		for (i = 1 ; i <= 90 ; i ++ ) {//			pw.print(flag);			double c1 = Math.ceil(Math.sqrt(i*i+4*n)) ; double c2 =  Math.floor(Math.sqrt(i*i+4*n));			if ( c1!=c2) {				continue;			}			long z  =(long) ((-i + c2) /2) ;//			 pw.println(z);//			long z2 =(long) ((-i - Math.sqrt(i*i+4*n)) /2) ; 			if (z*z + s(z)*z == n ) {				pw.print(z  );								flag = true;break;			}		}		if (!flag ) pw.println(-1);//		pw.print(s(x) + " " + x);		pw.close ();	}	static class Scanner {		StringTokenizer st;		BufferedReader br; 		public Scanner(InputStream s) {			br = new BufferedReader(new InputStreamReader(s));		} 		public Scanner(String file) throws FileNotFoundException {			br = new BufferedReader(new FileReader(file));		} 		public String next() throws IOException {			while (st == null || !st.hasMoreTokens())				st = new StringTokenizer(br.readLine());			return st.nextToken();		} 		public int nextInt() throws IOException {			return Integer.parseInt(next());		}		public long nextLong() throws IOException {			return Long.parseLong(next());		} 		public String nextLine() throws IOException {			return br.readLine();		}		public double nextDouble() throws IOException {			return Double.parseDouble(next());		} 		public boolean ready() throws IOException {			return br.ready();		} 	}  }	  			  	 			 					    			  	 	
