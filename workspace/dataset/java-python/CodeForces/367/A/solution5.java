/* * Remember a 7.0 student can know more than a 10.0 student. * Grades don't determine intelligence, they test obedience.  * I Never Give Up. */import java.util.*;import java.util.Map.Entry;import java.io.*;import java.text.*; import static java.lang.System.out;import static java.util.Arrays.*;import static java.lang.Math.*;public class ContestMain {	private static Reader in=new Reader();	private static StringBuilder ans=new StringBuilder();	private static long MOD=1000000007;//10^9+7 //	private static final int N=100000; //10^5//	private static final int LIM=26;//	private static final double PI=3.1415;//	private static ArrayList<Integer> v[]=new ArrayList[N];//	private static int color[]=new int[N]; //For Graph Coloring//	private static boolean mark[]=new boolean[N];//	private static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//	private static void dfs(int node){mark[node]=true;for(int x:v[node]){if(!mark[x]){dfs(x,v);}}}//	private static long powmod(long x,long n,long m){//		if(n==0)return 1;//		else if(n%2==0)return(powmod((x*x)%m,n/2,m));//		else return (x*(powmod((x*x)%m,(n-1)/2,m)))%m;//	}//	private static void shuffle(long [] arr) {//		for (int i = arr.length - 1; i >= 2; i--) {//			int x = new Random().nextInt(i - 1);//	        long temp = arr[x];//	        arr[x] = arr[i];//	        arr[i] = temp;//	    }//	 }//	private static void swap(int i,int j,int ar[]){//		int temp=ar[i];//		ar[i]=ar[j];//		ar[j]=temp;//	}//	private static long gcd(long a, long b){//		if(b==0)return a;//		return gcd(b,a%b);//	}//	private static boolean check(int x,int y){//		if((x>=0&&x<n)&&(y>=0&&y<m)&&mat[x][y]!='X'&&!visited[x][y])return true;//		return false;//	}	public static void main(String[] args) throws IOException{		String s=in.next();		int X[]=new int[s.length()];		int Y[]=new int[s.length()];		int Z[]=new int[s.length()];		for(int i=0;i<s.length();i++){			if(i==0){				if(s.charAt(i)=='x')X[i]=1;				else if(s.charAt(i)=='y')Y[i]=1;				else Z[i]=1;			}			else{				if(s.charAt(i)=='x'){					X[i]=X[i-1]+1;				}				else X[i]=X[i-1];				if(s.charAt(i)=='y')Y[i]=Y[i-1]+1;				else Y[i]=Y[i-1];				if(s.charAt(i)=='z')Z[i]=Z[i-1]+1;				else Z[i]=Z[i-1];			}		}		int q=in.nextInt();		int i,j;		int x,y,z;		while(q-->0){			i=in.nextInt()-1;			j=in.nextInt()-1;			if(i==j||j-i<=1){ans.append("YES\n");continue;}			if(i-1<0){				x=X[j];y=Y[j];z=Z[j];			}			else {				x=X[j]-X[i-1];				y=Y[j]-Y[i-1];				z=Z[j]-Z[i-1];			}			if(abs(x-y)<2&&abs(x-z)<2&&abs(y-z)<2)ans.append("YES\n");			else ans.append("NO\n");		}		out.println(ans);	}	static class Pair<T> implements Comparable<Pair>{		int l;		int r;		int c;		Pair(){			l=0;			r=0;		}		Pair(int k,int v,int p){			l=k;			r=v;			c=p;		}		@Override		public int compareTo(Pair o) {			if(o.l!=l)return (int) (l-o.l);			else return (r-o.r);		}			}	static class Reader{        BufferedReader br;        StringTokenizer st;        public Reader()        {            br = new BufferedReader(new                     InputStreamReader(System.in));        }         String next()        {            while (st == null || !st.hasMoreElements())            {                try                {                     	st = new StringTokenizer(br.readLine());                }                catch (IOException  e)                {                    e.printStackTrace();                }            }            return st.nextToken();        }         int nextInt()        {            return Integer.parseInt(next());        }         long nextLong()        {            return Long.parseLong(next());        }         double nextDouble()        {            return Double.parseDouble(next());        }         String nextLine()        {            String str = "";            try            {                str = br.readLine();            }            catch (IOException e)            {                e.printStackTrace();            }            return str;        }    }}
