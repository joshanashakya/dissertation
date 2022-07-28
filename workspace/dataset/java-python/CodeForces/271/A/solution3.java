import java.io.*; import java.lang.*;  import java.util.*; public class TestA {	static class FastReader {		BufferedReader br;		StringTokenizer st; 		public FastReader()		{			br = new BufferedReader(				new InputStreamReader(System.in));		} 		String next()		{			while (st == null || !st.hasMoreElements()) {				try {					st = new StringTokenizer(br.readLine());				}				catch (IOException e) {					e.printStackTrace();				}			}			return st.nextToken();		} 		int nextInt() { return Integer.parseInt(next()); } 		long nextLong() { return Long.parseLong(next()); } 		double nextDouble()		{			return Double.parseDouble(next());		} 		String nextLine()		{			String str = "";			try {				str = br.readLine();			}			catch (IOException e) {				e.printStackTrace();			}			return str;		}	} 	public static void main(String[] args)	{ 		try {			System.setIn(new FileInputStream("input.txt"));			System.setOut(new PrintStream(new FileOutputStream("output.txt")));		} catch (Exception e) {			System.err.println("Error");		} 		FastReader objScanner = new FastReader(); 		int n=objScanner.nextInt(); 		int i=n+1; 		while(true)		{            if(distinct(i))            {            	System.out.println(i);            	break;            }           i++;		}         	  	  }   	  static boolean distinct(int n)	  {         String str=Integer.toString(n);          HashSet<Character> objSet=new HashSet<Character>();                  int l=str.length();          for(int i=0;i<l;i++)         {         	objSet.add(str.charAt(i));         }          if(objSet.size()==l)         {         	return true;         }         else         {         	return false;         }	  }}