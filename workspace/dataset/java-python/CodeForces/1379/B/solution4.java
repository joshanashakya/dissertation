import java.util.*;import java.lang.*;import java.io.*;  public class Main {/*    HashMap<> map=new HashMap<>();    TreeMap<> map=new TreeMap<>();    map.put(p,map.getOrDefault(p,0)+1);    for(Map.Entry<> mx:map.entrySet()){          int v=mx.getValue(),k=mx.getKey();    }    ArrayList<Pair<Character,Integer>> l=new ArrayList<>();    ArrayList<> l=new ArrayList<>();    HashSet<> has=new HashSet<>();*/    PrintWriter out;    FastReader sc;    int mod=(int)(1e9+7);    public void sol(){          int t=ni();          while(t-->0){                long l=nl(),r=nl(),m=nl();                long max=m+r-l,min=m+l-r;                for(long i=l;i<=r;i++){                      long p=max/i;                      if(p>=1&&p*i>=min){                            long x=i*p;                            if(x>=m){                                  long a=i,b=l,c=x-m+l;                                  pl(a+" "+b+" "+c);                                  break;                            }else{                                  long a=i,c=l,b=m+l-x;                                  pl(a+" "+b+" "+c);                                  break;                            }                      }                }          }    }    public static void main(String[] args) 	{ 	      Main g=new Main();		g.out=new PrintWriter(System.out);		g.sc=new FastReader();		g.sol();		g.out.flush();	}	static class FastReader 	{ 		BufferedReader br; 		StringTokenizer st;  		public FastReader() 		{ 			br = new BufferedReader(new					InputStreamReader(System.in)); 		}  		String next() 		{ 			while (st == null || !st.hasMoreElements()) 			{ 				try				{ 					st = new StringTokenizer(br.readLine()); 				} 				catch (IOException e) 				{ 					e.printStackTrace(); 				} 			} 			return st.nextToken(); 		}  		int nextInt() 		{ 			return Integer.parseInt(next()); 		}  		long nextLong() 		{ 			return Long.parseLong(next()); 		}  		double nextDouble() 		{ 			return Double.parseDouble(next()); 		}  		String nextLine() 		{ 			String str = ""; 			try			{ 				str = br.readLine(); 			} 			catch (IOException e) 			{ 				e.printStackTrace(); 			} 			return str; 		} 	} public int ni(){	      return sc.nextInt();	}public long nl(){	      return sc.nextLong();	}public double nd(){	      return sc.nextDouble();	}public char[] rl(){	      return sc.nextLine().toCharArray();	}public String rl1(){	      return sc.nextLine();	}	public void pl(Object s){	      out.println(s);	}public void ex(){	      out.println();	}	public void pr(Object s){	      out.print(s);	}public String next(){	      return sc.next();	}public long abs(long x){	      return Math.abs(x);	}	public int abs(int x){	      return Math.abs(x);	}	public double abs(double x){	      return Math.abs(x);	}      public long pow(long x,long y){            return (long)Math.pow(x,y);      }      public int pow(int x,int y){            return (int)Math.pow(x,y);      }      public double pow(double x,double y){            return Math.pow(x,y);      }public long min(long x,long y){            return (long)Math.min(x,y);      }      public int min(int x,int y){            return (int)Math.min(x,y);      }      public double min(double x,double y){            return Math.min(x,y);      }public static int gcd(int a, int b) {		if (a == 0)			return b;		return gcd(b % a, a);	}static void sort(int[] a) {		ArrayList<Integer> l = new ArrayList<>();		for (int i : a) {			l.add(i);		}		Collections.sort(l);		for (int i = 0; i < a.length; i++) {			a[i] = l.get(i);		}	}void sort(long[] a) {		ArrayList<Long> l = new ArrayList<>();		for (long i : a) {			l.add(i);		}		Collections.sort(l);		for (int i = 0; i < a.length; i++) {			a[i] = l.get(i);		}	}void sort(double[] a) {		ArrayList<Double> l = new ArrayList<>();		for (double i : a) {			l.add(i);		}		Collections.sort(l);		for (int i = 0; i < a.length; i++) {			a[i] = l.get(i);		}	}int  swap(int a,int b){	      return a;	}long  swap(long a,long b){	      return a;	}double  swap(double a,double b){	      return a;	}	boolean isPowerOfTwo (int x)       {             return x!=0 && ((x&(x-1)) == 0);           }boolean isPowerOfTwo (long x)       {             return x!=0 && ((x&(x-1)) == 0);           }public long max(long x,long y){            return (long)Math.max(x,y);      }      public int max(int x,int y){            return (int)Math.max(x,y);      }      public double max(double x,double y){            return Math.max(x,y);      }long sqrt(long x){            return (long)Math.sqrt(x);      }int sqrt(int x){            return (int)Math.sqrt(x);      }void input(int[] ar,int n){            for(int i=0;i<n;i++)ar[i]=ni();      }void input(long[] ar,int n){            for(int i=0;i<n;i++)ar[i]=nl();      }int maxint(){            return Integer.MAX_VALUE;      }int minint(){            return Integer.MIN_VALUE;      }long maxlong(){            return Long.MAX_VALUE;      }long minlong(){            return Long.MIN_VALUE;      }void fill(int[] ar,int k){            Arrays.fill(ar,k);      }void yes(){            pl("YES");      }void no(){            pl("NO");      }    int[] sieve(int n)     {         boolean prime[] = new boolean[n+1];         int[] k=new int[n+1];        for(int i=0;i<=n;i++) {            prime[i] = true;             k[i]=i;        }                  for(int p = 2; p <=n; p++)         {             if(prime[p] == true)             {                // sieve[p]=p;                for(int i = p*2; i <= n; i += p) {                    prime[i] = false;                   //  sieve[i]=p;                    while(k[i]%(p*p)==0){                          k[i]/=(p*p);                    }                }            }         }return k;    }int strSmall(int start,int end,int[] arr, int target)      {        //   int start = 0, end = arr.length-1;          int ans = -1;          while (start <= end) {              int mid = (start + end) / 2;               if (arr[mid] > target) {                  end = mid - 1;              }               else {                  ans = mid;                  start = mid + 1;              }          }          return ans;      }       public static class pair implements Comparable<pair> {		int x;		int y; 		public pair(int x, int y) {			this.x = x;			this.y = y;		} 		public String toString() {			return x + "," + y;		} 		public boolean equals(Object o) {			if (o instanceof pair) {				pair p = (pair) o;				return p.x == x && p.y == y;			}			return false;		} 		public int hashCode() {			return new Double(x).hashCode() * 31 + new Double(y).hashCode();		} 		public int compareTo(pair other) {			if (this.x == other.x) {				return Long.compare(this.y, other.y);			}			return Long.compare(this.x, other.x);		}      }	 } 
