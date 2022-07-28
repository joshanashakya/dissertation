import java.io.BufferedReader;import java.io.FileNotFoundException;import java.io.FileReader;import java.io.IOException;import java.io.InputStream;import java.io.InputStreamReader;import java.io.PrintWriter;import java.util.*;public class J{	static class pair implements Comparable<pair> {		 		 int x ; int y ;		public pair(int x , int y )  {			this.x  = x ; this.y = y ;		}				public int compareTo(pair other) {			if (this.y == other.y) return this.x - other.x ;			else return other.y - this.y ;					}		public String toString () {			return  (this.y+1)+ " " + this.x ;		} 			}		public static void main(String[] args)  throws IOException, InterruptedException{		PrintWriter pw = new PrintWriter(System.out);		Scanner sc = new Scanner (System.in);		 		PriorityQueue<Integer> pq = new PriorityQueue<>((x,y) -> Integer.compare(y,x));		int t = sc.nextInt();		for (int o = 0 ; o < t ; o ++  ) {			int l = sc.nextInt();			int [] arr1 = new int [l] ;  			int arr2 []  = new int [l] ; 			for (int i = 0 ; i <l  ; i ++ ) {				arr1[i]= sc.nextInt();			}						for (int i = 0 ; i <l  ; i ++ ) {				arr2[i]= sc.nextInt();				if (arr2[i] == 0 ) {					pq.add(arr1[i]);				}			}			for (int i = 0 ; i < l ; i ++) {				if (arr2[i] == 0) pw.print(pq.poll() + " " ) ;				else pw.print(arr1[i]+ " ") ;			}			pw.println();		}	 				pw.close ();	}	static class Scanner {		StringTokenizer st;		BufferedReader br; 		public Scanner(InputStream s) {			br = new BufferedReader(new InputStreamReader(s));		} 		public Scanner(String file) throws FileNotFoundException {			br = new BufferedReader(new FileReader(file));		} 		public String next() throws IOException {			while (st == null || !st.hasMoreTokens())				st = new StringTokenizer(br.readLine());			return st.nextToken();		} 		public int nextInt() throws IOException {			return Integer.parseInt(next());		}		public long nextLong() throws IOException {			return Long.parseLong(next());		} 		public String nextLine() throws IOException {			return br.readLine();		}		public double nextDouble() throws IOException {			return Double.parseDouble(next());		} 		public boolean ready() throws IOException {			return br.ready();		} 	}  }