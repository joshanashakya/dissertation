import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.StringTokenizer; public class Main {	static class FastReader {		BufferedReader br;		StringTokenizer st; 		public FastReader() {			br = new BufferedReader(new InputStreamReader(System.in));		} 		String next() {			while (st == null || !st.hasMoreElements()) {				try {					st = new StringTokenizer(br.readLine());				} catch (IOException e) {					e.printStackTrace();				}			}			return st.nextToken();		} 		int nextInt() {			return Integer.parseInt(next());		} 	} 	public static void main(String[] args)	        	    {	 		//Scanner s = new Scanner(System.in);	       FastReader s = new FastReader();	       int n = s.nextInt();	       int m = s.nextInt();	       	       	       int N = 100007;	       int[] arr= new int[N];	       	       int[] num= new int[N];	       boolean[] valid = new boolean[N]; 	       for (int i = 1; i <= n; i++)	          arr[i] = s.nextInt(); 	       for (int i = n; i >= 1; i--)	       {	           if (!valid[arr[i]])	             num[i]++;	           valid[arr[i]] = true;	       } 	       for (int i = n; i >= 1; i--)	           num[i] += num[i + 1]; 	       for (int i = 0; i < m; i++)	       {	          int t = s.nextInt();	          System.out.println(num[t]);	       } 	       	       	     	}}		    		    		  	 			 	 		  	 	