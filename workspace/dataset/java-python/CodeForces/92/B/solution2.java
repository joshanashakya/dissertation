import java.io.*;
import java.util.*;
import java.math.BigInteger;
public class Main {
	static PrintWriter out=new PrintWriter(System.out);
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[]arr=sc.next().toCharArray();
		long ans=0;
		boolean flag=false;
		for(int i=arr.length-1;i>0;i--) {
			if(arr[i]=='0') ans++;
			else if(arr[i]=='1') {
				ans+=2;
				arr[i-1]+=1;
				flag=true;
			}else {
				ans++;
				arr[i-1]+=1;
				flag=true;
			}
		}
		if(flag)out.println(ans+1);
		else out.println(ans);
		out.close();
	}
	
	static class Pair implements Comparable<Pair>{
		int x;
		int y;
		public Pair(int x,int y) {
			this.x=x;
			this.y=y;
		}
		public int compareTo(Pair o) {
			return (this.x!=o.x)?this.x-o.x:this.y-o.y;
		}
		public String toString() {
			return "("+this.x+","+this.y+")";
		}
		
	}
	static class Scanner {
		StringTokenizer st;
		BufferedReader br;
		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}
		public Scanner(String file) throws FileNotFoundException {
			br = new BufferedReader(new FileReader(file));
		}
		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
		public String nextLine() throws IOException {
			return br.readLine();
		}
		public double nextDouble() throws IOException {
			return Double.parseDouble(next());
		}
		public boolean ready() throws IOException {
			return br.ready();
		}
		public int[] nextIntArr(int n) throws IOException{
			int arr[]=new int[n];
			for(int i=0;i<n;i++)arr[i]=nextInt();
			return arr;
		}
		public BigInteger BigInteger(String s) throws IOException{
			BigInteger a=new BigInteger(s);
			return a;
		}
	}
}

