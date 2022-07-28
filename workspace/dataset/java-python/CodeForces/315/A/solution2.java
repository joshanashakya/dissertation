import java.util.*;import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.util.StringTokenizer;import java.util.*;public class pcarp{	static int  max_value;	public static void main(String[] args) {		FastScanner fs = new FastScanner();		int n = fs.nextInt();		int[] a = new int[n];		int[] b = new int[n];		for(int i=0;i<n;i++){			a[i]=fs.nextInt();			b[i]=fs.nextInt();		}		int ans=n;		for(int i=0;i<n;i++){			for(int j=0;j<n;j++){				if(a[i]==b[j] && i!=j){					ans--;					break;				}			}		}		System.out.println(ans);			}	public static String function(String s){ 		if(check(s)){			return s;		}		if(s.length()==2 && s.charAt(0)==s.charAt(1)){			return "";		}		if(s.charAt(0)==s.charAt(1)){			return function(s.substring(2,s.length()));		}		else{			return function(s.charAt(0)+function(s.substring(1,s.length())));		} 	}	static boolean isPerfectSquare(double x)    {        if (x >= 0) {            double sr = Math.sqrt(x);            return ((sr * sr) == x);        }        return false;    }	public static boolean isPerfect(int n){		int a = (int)Math.sqrt(n);		if(a*a==n){			return true;		}		return false;	}	public static boolean check(String s){		if(s.length()==1){			return true;		}		for(int i=1;i<s.length();i++){			if(s.charAt(i)==s.charAt(i-1)){				return false;			}		}		return true;	}	public static boolean isPrime(int n){		boolean flag=true;		while(n%2==0){			n=n/2;			flag=false;		}		for(int i=3;i<=Math.sqrt(n);i+=2){			if(n%i==0){				flag=false;				while(n%i==0){					n=n/i;				}			}		}		return flag;	}	public static void dfst(ArrayList<ArrayList<Integer>> graph,int src, int deg,boolean ef, boolean of, boolean[] vis, boolean[] flip, int[] init, int[] goal){		if(vis[src]){			return;		}		vis[src]=true;		if((deg%2==0 && ef) || (deg%2==1 && of)){			init[src]=1-init[src];		}		if(init[src]!=goal[src]){			flip[src]=true;			if(deg%2==0){				ef=!ef;			}			else{				of=!of;			}		}		for(int i=0;i<graph.get(src).size();i++){			if(!vis[graph.get(src).get(i)]){				dfst(graph,graph.get(src).get(i),deg+1,ef,of,vis,flip,init,goal);			}		}	}	public static void dfs(ArrayList<ArrayList<Integer>> graph, int src, int val, boolean[] vis){		vis[src]=true;		int cur_val =0;		for(int i=0;i<graph.get(src).size();i++){			if(!vis[graph.get(src).get(i)]){				cur_val=val+1;				dfs(graph,graph.get(src).get(i),cur_val,vis);			}			if(max_value<cur_val){				max_value=cur_val;			}			cur_val=0;		}	}	public static ArrayList<Integer> pf(int n){		ArrayList<Integer> arr = new ArrayList<>();		boolean flag=false;		while(n%2==0){			flag=true;			n/=2;		}		if(flag){			arr.add(2);		}		for(int i=3;i<=Math.sqrt(n);i++){			if(n%i==0){				arr.add(i);				while(n%i==0){					n/=i;				}			}		}		if(n>1){			arr.add(n);		}		return arr;	}	static int gcd(int a, int b){		if(b==0){			return a;		}		else{			return gcd(b,a%b);		}	}	static boolean function(int n, int i, int[] arr, int sum){		if(sum==0){			return true;		}		if(i==n && sum!=0){			return false;		}		if(sum<arr[i]){			return function(n,i+1,arr,sum);		}		else{			return function(n,i+1,arr,sum-arr[i]) || function(n,i+1,arr,sum);		}	}	public static long fact( long n, long mod){		long res =1;		for(int i=1;i<=n;i++){			res%=mod;			i%=mod;			res=(res*i)%mod;		}		return res;	} 	public static long nCk(long n,long k, long mod){		return (fact(n,mod)%mod*modular(fact(k,mod),mod-2,mod)%mod*modular(fact(n-k,mod),mod-2,mod)%mod)%mod;	} 	public static long modular(long n, long e, long mod){		long res = 1;		n%=mod;		if (n == 0) return 0;		while(e>0){			if((e&1)==1){				res=(res*n)%mod;			}			e=e>>1;			n=(n*n)%mod;		}		return res;	} 	static class FastScanner {        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        StringTokenizer st = new StringTokenizer("");         String next() {            while (!st.hasMoreTokens())                try {                    st = new StringTokenizer(br.readLine());                } catch (IOException e) {                    e.printStackTrace();                }            return st.nextToken();        }         int nextInt() {            return Integer.parseInt(next());        }         int[] readArray(int n) {            int[] a = new int[n];            for (int i = 0; i < n; i++)                a[i] = nextInt();            return a;        }         long nextLong() {            return Long.parseLong(next());        }    }}
