import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.StringTokenizer;import java.util.Collections;  public class Main { 	public static void main(String[] args) {		FastScanner fs=new FastScanner();		int T=1;//fs.nextInt();		for (int tt=0; tt<T; tt++) {			            int n=fs.nextInt(), k=fs.nextInt();            int ans=0;            int[] arr=new int[n];            for(int i=0;i<n;++i)            {                arr[i]=fs.nextInt();                if(arr[i]%k==0)                    ans+=arr[i]/k;                else                    ans+=(arr[i]/k)+1;            }             if((ans&1)==1)                System.out.println((ans+1)/2);            else                System.out.println((ans)/2);		}	}	 	static class FastScanner {		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		StringTokenizer st=new StringTokenizer("");		String next() {			while (!st.hasMoreTokens())				try {					st=new StringTokenizer(br.readLine());				} catch (IOException e) {					e.printStackTrace();				}			return st.nextToken();		}				int nextInt() {			return Integer.parseInt(next());		}		int[] readArray(int n) {			int[] a=new int[n];			for (int i=0; i<n; i++) a[i]=nextInt();			return a;		}		long nextLong() {			return Long.parseLong(next());		}	} 	}
