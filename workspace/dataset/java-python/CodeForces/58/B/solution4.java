import java.io.*;import java.util.*;public class Asd {static PrintWriter w=new PrintWriter(System.out);static FastScanner s=new FastScanner();static HashSet<Long> list=new HashSet<>();	public static void main(String[] args) {				//int t=s.nextInt();                int t=1;		while(t-->0)                {		    solve();		}	       w.close();        }        /* Function to print all the permutations of the string        static String swap(String str, int i, int j)        {        char ch;        char[] array = str.toCharArray();        ch = array[i];        array[i] = array[j];        array[j] = ch;        return String.valueOf(array);       }          static void permute(String str,int low,int high)    {        if(low == high)            list.add(Long.parseLong(str));         int i;        for(i = low; i<=high; i++){            str = swap(str,low,i);            permute(str, low+1,high);            str = swap(str,low,i);        }    }        use  permute(str2,0,str2.length()-1); to perform combinations        */           public static void solve()        {            int n=s.nextInt();            w.print(n+" ");            while(n>1)            {                int y=highestdiv(n);                n=y;                w.print(y+" ");            }        }        static void noofdivisors(int n)        {            //it counts no of divisors of every number upto number n                        int arr[]=new int[n+1];              for(int i=1;i<=(n);i++)			for(int j=i;j<=(n);j=j+i)				arr[j]++;        }            static int highestdiv(int n)            {                for(int i=2;i<=(int)Math.sqrt(n);i++)                {                                        if(n%i==0)                        return n/i;                }                return 1;            }                       static char[] reverse(char arr[])        {            char[] b = new char[arr.length];         int j = arr.length;         for (int i = 0; i < arr.length; i++) {             b[j - 1] = arr[i];             j = j - 1;         }        return b;        }                	static long factorial(int n)        {            long su=1;            for(int i=1;i<=n;i++)                su*=(long)i;            return su;        }	static class FastScanner {		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		StringTokenizer st=new StringTokenizer("");		public String next() {			while (!st.hasMoreElements())				try {					st=new StringTokenizer(br.readLine());				} catch (IOException e) {					e.printStackTrace();				}			return st.nextToken();		}		int[] readArray(int n) {			int[] a=new int[n]; 			for (int i=0; i<n; i++) a[i]=nextInt();			return a;		}				int nextInt () {			return Integer.parseInt(next());		}                long nextLong () {			return Long.parseLong(next());		}                double nextDouble () {			return Double.parseDouble(next());		}	} }
