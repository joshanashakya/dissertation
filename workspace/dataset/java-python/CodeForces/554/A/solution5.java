import java.io.*;import java.util.*; public class Main {    static int x,y;    public static int euclid(int a,int b)    {        if(b==0)        return a;        return euclid(b,a%b);    }    public static int extendedEuclid(int a ,int b)    {        if(b==0)        {x=1;y=0;return a;}        int f= extendedEuclid(b,a%b);        int t=x;        x=y;        y=t-(a/b)*y;        return f;            }    public static int binarySearch(int a[],int n)    {        int i=0,j=a.length-1;        int k;        while(true)        {            k=(i+j)/2;                        if(k<n-1&&n<a[k+1]&&n>a[k])            {                return k;            }            if(k>0&&a[k-1]>n)            j=k-1;            if(a[k]<n)            i=k+1;        }    }	public static void main(String[] args) 	{		FastScanner fs=new FastScanner();// 		int T=fs.nextInt();        int T=1;		int n,m,i,j,k,l,b,c,q;		long ans,sum,max;		for (int tt=0; tt<T; tt++) 		{// 			n=fs.nextInt();// 			q=fs.nextInt();// 			ans=0;// 			int[] a=fs.readArray(n);// 			Arrays.sort(a);//             int a[][]=new int [n][n];// 			for(i=0;i<n;i++)// 			{// 			    for(j=0;j<n;j++)// 			    {// 			        a[i][j]=fs.nextInt();// 			    }// 			}   //             b=fs.nextInt();//             c=fs.nextInt();// 			int lu=extendedEuclid(b,c); // 			System.out.println(b+"*"+x+" +"+c+"*"+y+" ="+lu);            String s=fs.next();            System.out.println((s.length()+1)*26-s.length());		}	} 	static final Random random=new Random();		static void ruffleSort(int[] a) {		int n=a.length;//shuffle, then sort 		for (int i=0; i<n; i++) {			int oi=random.nextInt(n), temp=a[oi];			a[oi]=a[i]; a[i]=temp;		}		Arrays.sort(a);	}		static class FastScanner {		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		StringTokenizer st=new StringTokenizer("");		String next() {			while (!st.hasMoreTokens())				try {					st=new StringTokenizer(br.readLine());				} catch (IOException e) {					e.printStackTrace();				}			return st.nextToken();		}				int nextInt() {			return Integer.parseInt(next());		}		int[] readArray(int n) {			int[] a=new int[n];			for (int i=0; i<n; i++) a[i]=nextInt();			return a;		}		long nextLong() {			return Long.parseLong(next());		}	} 	}