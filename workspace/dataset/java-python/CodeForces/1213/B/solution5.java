import java.io.*;import java.util.*;public class B {	static PrintWriter out=new PrintWriter(System.out);			public static void main(String args[]) throws IOException{		Scanner sc=new Scanner(System.in);		int tc=sc.nextInt();		while(tc-->0) {			int n=sc.nextInt();			PriorityQueue<Integer> pq=new PriorityQueue<>();			int c=0;			int arr[]=sc.nextIntArr(n);			for(int i=n-1;i>-1;i--) {				int a=arr[i];				if(i<n-1) {					if(pq.peek()<a)c++;				}				pq.add(a);			}			out.println(c);		}		out.close();	}		static class Scanner {		StringTokenizer st;		BufferedReader br;		public Scanner(InputStream s) {			br = new BufferedReader(new InputStreamReader(s));		}		public Scanner(String file) throws FileNotFoundException {			br = new BufferedReader(new FileReader(file));		}		public String next() throws IOException {			while (st == null || !st.hasMoreTokens())				st = new StringTokenizer(br.readLine());			return st.nextToken();		}		public int nextInt() throws IOException {			return Integer.parseInt(next());		}		public long nextLong() throws IOException {			return Long.parseLong(next());		}		public String nextLine() throws IOException {			return br.readLine();		}		public double nextDouble() throws IOException {			return Double.parseDouble(next());		}		public boolean ready() throws IOException {			return br.ready();		}		public int[] nextIntArr(int n) throws IOException{			int arr[]=new int[n];			for(int i=0;i<n;i++)arr[i]=nextInt();			return arr;		}			}}
