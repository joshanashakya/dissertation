import java.io.*; import java.lang.*;  import java.util.*; public class TestA {	static class FastReader {		BufferedReader br;		StringTokenizer st; 		public FastReader()		{			br = new BufferedReader(				new InputStreamReader(System.in));		} 		String next()		{			while (st == null || !st.hasMoreElements()) {				try {					st = new StringTokenizer(br.readLine());				}				catch (IOException e) {					e.printStackTrace();				}			}			return st.nextToken();		} 		int nextInt() { return Integer.parseInt(next()); } 		long nextLong() { return Long.parseLong(next()); } 		double nextDouble()		{			return Double.parseDouble(next());		} 		String nextLine()		{			String str = "";			try {				str = br.readLine();			}			catch (IOException e) {				e.printStackTrace();			}			return str;		}	} 	public static void main(String[] args)	{ 		try {			System.setIn(new FileInputStream("input.txt"));			System.setOut(new PrintStream(new FileOutputStream("output.txt")));		} catch (Exception e) {			System.err.println("Error");		} 		FastReader objScanner = new FastReader(); 		 	   int arr[][]=new int[6][6];        int x=-1;       int y=-1;	   for(int i=1; i<=5; i++)	   {	   	 for(int j=1; j<=5; j++)	   	 {	   	 	arr[i][j]=objScanner.nextInt(); 	   	 	if(arr[i][j]==1)	   	 	{	   	 		x=i;	   	 		y=j;	   	 	}	   	 }	   }        System.out.println(Math.abs(x-3)+Math.abs(y-3));        	} 								} 