import java.io.*;
import java.util.*;
public class Asd {
static PrintWriter w=new PrintWriter(System.out);
static FastScanner s=new FastScanner();
static HashSet<Long> list=new HashSet<>();
	public static void main(String[] args) {
		
		int t=1;//s.nextInt();
		while(t-->0)
                {
		    solve();
		}
	       w.close();
        }
        static String swap(String str, int i, int j)
        {
        char ch;
        char[] array = str.toCharArray();
        ch = array[i];
        array[i] = array[j];
        array[j] = ch;
        return String.valueOf(array);
       }
    // Function to print all the permutations of the string
    static void permute(String str,int low,int high)
    {
        if(low == high)
            list.add(Long.parseLong(str));
 
        int i;
        for(i = low; i<=high; i++){
            str = swap(str,low,i);
            permute(str, low+1,high);
            str = swap(str,low,i);
        }
    }
        public static void solve()
        {
           int n=s.nextInt();
           String str2="47";String str4="4747";String str6="474747";String str8="47474747";
           permute(str2,0,str2.length()-1);permute(str4,0,str4.length()-1);permute(str6,0,str6.length()-1);permute(str8,0,str8.length()-1);
          list.add(Long.parseLong("4444477777"));
          Iterator value = list.iterator();
          Long arr[]=new Long[list.size()];
          int i=0;
          while (value.hasNext()) { 
              long o=Long.parseLong(String.valueOf(value.next()));
            arr[i]=o;i++;
            
        }
          Arrays.sort(arr);
          
          for(i=0;i<list.size()-1;i++ )
          {
              if(n<=arr[0])
              { w.println(arr[0]);return;}
              if(arr[i]<n&&arr[i+1]>=n)
              {
                  w.println(arr[i+1]);return;
              }
          }
           
        }
	static long factorial(int n)
        {
            long su=1;
            for(int i=1;i<=n;i++)
                su*=(long)i;
            return su;
        }
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		public String next() {
			while (!st.hasMoreElements())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		int[] readArray(int n) {
			int[] a=new int[n]; 
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		
		int nextInt () {
			return Integer.parseInt(next());
		}
                long nextLong () {
			return Long.parseLong(next());
		}
                double nextDouble () {
			return Double.parseDouble(next());
		}
	}

}

