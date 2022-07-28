import java.io.*;import java.util.*;import java.text.*;import java.lang.*;import java.math.*; public class Main{		static ArrayList a[]=new ArrayList[200001];		public void solve () {		InputReader in = new InputReader(System.in);	    PrintWriter pw = new PrintWriter(System.out); 	   char s[]=in.nextLine().toCharArray();	   char t[]=in.nextLine().toCharArray();	   int n=s.length;	   int pre[]=new int [n+5];	   int suf[]=new int [n+5];	   int maxi=-1;	   int idx[]=new int [26];	   Arrays.fill(idx, -1000000);	   for(int i=0;i<s.length;i++) {		   if(maxi+1<t.length && s[i]==t[maxi+1]) {			   maxi++;			   pre[i]=(maxi+1);			   idx[t[maxi]-'a']=(maxi+1);		   }		   else {			   pre[i]=idx[s[i]-'a'];		   }		   	   }	   maxi=0;	   boolean chk=true;	   for(int i=s.length-1;i>=0;i--) {		   		   chk&=(maxi+pre[i]>=t.length);		   if(maxi<t.length && s[i]==t[t.length-1-maxi]) {			   maxi++;		   }	   }	   if(chk) {		   pw.println("Yes");	   }	   else {		   pw.println("No");	   }		pw.flush();		pw.close();	}	public static void main(String[] args) throws Exception {                        new Thread(null,new Runnable() {        	public void run() {        		new Main().solve();        	}        },"1",1<<26).start();                    }    static void debug(Object... o) {    	System.out.println(Arrays.deepToString(o));        }                static class InputReader         {        private final InputStream stream;        private final byte[] buf = new byte[8192];        private int curChar, snumChars;        private SpaceCharFilter filter;         public InputReader(InputStream stream)         {            this.stream = stream;        }        public int snext()         {            if (snumChars == -1)                throw new InputMismatchException();            if (curChar >= snumChars)             {                curChar = 0;                try                 {                    snumChars = stream.read(buf);                }                 catch (IOException e)                 {                    throw new InputMismatchException();                }                if (snumChars <= 0)                    return -1;            }            return buf[curChar++];        }         public int nextInt()         {            int c = snext();            while (isSpaceChar(c))             {                c = snext();            }            int sgn = 1;            if (c == '-')            {                sgn = -1;                c = snext();            }            int res = 0;            do             {                if (c < '0' || c > '9')                    throw new InputMismatchException();                res *= 10;                res += c - '0';                c = snext();            } while (!isSpaceChar(c));            return res * sgn;        }         public long nextLong()        {            int c = snext();            while (isSpaceChar(c))             {                c = snext();            }            int sgn = 1;            if (c == '-')             {                sgn = -1;                c = snext();            }            long res = 0;            do             {                if (c < '0' || c > '9')                    throw new InputMismatchException();                res *= 10;                res += c - '0';                c = snext();            } while (!isSpaceChar(c));            return res * sgn;        }         public int[] nextIntArray(int n)         {            int a[] = new int[n];            for (int i = 0; i < n; i++)             {                a[i] = nextInt();            }            return a;        }         public String readString()        {            int c = snext();            while (isSpaceChar(c))             {                c = snext();            }            StringBuilder res = new StringBuilder();            do             {                res.appendCodePoint(c);                c = snext();            } while (!isSpaceChar(c));            return res.toString();        }         public String nextLine()         {            int c = snext();            while (isSpaceChar(c))                c = snext();            StringBuilder res = new StringBuilder();            do             {                res.appendCodePoint(c);                c = snext();            } while (!isEndOfLine(c));            return res.toString();        }         public boolean isSpaceChar(int c)         {            if (filter != null)                return filter.isSpaceChar(c);            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;        }         private boolean isEndOfLine(int c)         {            return c == '\n' || c == '\r' || c == -1;        }         public interface SpaceCharFilter        {            public boolean isSpaceChar(int ch);        }    }        public static long mod = 1000000007;        public static int d;        public static int p;        public static int q;        public void extended(int a,int b) {        	if(b==0) {        		d=a;        		p=1;        		q=0;        	}        	else        	{        		extended(b,a%b);        		int temp=p;        		p=q;        		q=temp-(a/b)*q;        	}        }        public static int binaryExponentiation(int x,int n)        {            int result=1;            while(n>0)            {                if(n % 2 ==1)                    result=result * x;                x=x*x;                n=n/2;            }            return result;        }                public static long binaryExponentiation(long x,long n)        {            long result=1;            while(n>0)            {                if(n % 2 ==1)                    result=result * x;                x=x*x;                n=n/2;            }            return result;        }                public static int modularExponentiation(int x,int n,int M)        {            int result=1;            while(n>0)            {                if(n % 2 ==1)                    result=(result * x)%M;                x=(x%M*x)%M;                n=n/2;            }            return result;        }                public static long modularExponentiation(long x,long n,long M)        {            long result=1;            while(n>0)            {                if(n % 2 ==1)                    result=(result%M * x%M)%M;                x=(x%M * x%M)%M;                n=n/2;            }            return result;        }                public static long modInverse(int A,int M)        {            return modularExponentiation(A,M-2,M);        }                public static long modInverse(long A,long M)        {            return modularExponentiation(A,M-2,M);        }        public static long[] shuffle(long[] a,Random gen)        {            int n = a.length;            for(int i=0;i<n;i++)            {                int ind = gen.nextInt(n-i)+i;                long temp = a[ind];                a[ind] = a[i];                a[i] = temp;            }            return a;        }                public static void swap(int a, int b){            int temp = a;            a = b;            b = temp;        }                public static HashSet<Integer> primeFactorization(int n)        {            HashSet<Integer> a =new HashSet<Integer>();            for(int i=2;i*i<=n;i++)            {                while(n%i==0)                {                    a.add(i);                    n/=i;                }            }            if(n!=1)                a.add(n);            return a;        }                public static void sieve(boolean[] isPrime,int n)        {            for(int i=1;i<n;i++)                isPrime[i] = true;                        isPrime[0] = false;            isPrime[1] = false;                        for(int i=2;i*i<n;i++)            {                if(isPrime[i] == true)                {                    for(int j=(2*i);j<n;j+=i)                        isPrime[j] = false;                }            }        }                public static int GCD(int a,int b)        {            if(b==0)                return a;            else                return GCD(b,a%b);        }                static class pair implements Comparable<pair>        {            Integer x,id;            Long y;            pair(int id,int x,long y)            {                this.x=x;                this.y=y;                this.id=id;            }                                   			public int compareTo(pair o) {                int result = x.compareTo(o.x);                if(result==0)                    result = y.compareTo(o.y);                                return result;            }                          public String toString()            {                return x+" "+y;            }                        public boolean equals(Object o)            {                if (o instanceof pair)                {                    pair p = (pair)o;                    return p.x == x && p.y == y ;                }                return false;            }                        public int hashCode()            {                return new Long(x).hashCode()*31 + new Long(y).hashCode();            }        }            } class dsu{	int parent[];	dsu(int n){		parent=new int[n+1];		for(int i=0;i<=n;i++)		{			parent[i]=i;		}	}	int root(int n) {		while(parent[n]!=n)		{ 			parent[n]=parent[parent[n]];			n=parent[n];		}		return n;	}	void union(int _a,int _b) {		int p_a=root(_a);		int p_b=root(_b);					parent[p_a]=p_b;						}	boolean find(int a,int b) {		if(root(a)==root(b))			return true;		else			return  false;	}		}class Segment{ 	int seg[]; 	int a[];	int lazy[];    Segment (int n,int b[]){		seg=new int[4*n];		lazy=new int[4*n];		a=new int[b.length];		a=b.clone();	}    public void build(int node,int start,int end) {    	if(start==end) {    		seg[node]=a[start];    		return ;    	}    	int mid=(start+end)/2;    	build(2*node+1,start,mid);    	build(2*node+2,mid+1,end);    	seg[node]=seg[2*node+1]+seg[2*node+2];    }    public void update(int node,int start,int end,int id,int val) {    	if(start==end) {    		seg[node]=a[start]=val;    		return;    	}    	int mid=(start+end)/2;    	if(id>=start && id<=mid) {    		update(2*node+1,start,mid,id,val);    	}    	else    		update(2*node+2,mid+1,end,id,val);    	seg[node]=seg[2*node+1]+seg[2*node+2];    }    public int query(int node,int start,int end,int l,int r) {    	if(l>end || r<start)    		return 0;    	if(start>=l && end<=r)    		return seg[node];    	    	int  mid=(start+end)/2;    	return (query(2*node+1,start,mid,l,r)+query(2*node+2,mid+1,end,l,r));    }    public void updateRange(int node,int start,int end,int l,int r,int val) {    	if(lazy[node]!=0) {    		if(start!=end) {    			lazy[2*node+1]+=lazy[node];    			lazy[2*node+2]+=lazy[node];    		}    		lazy[node]=0;    	}    	if(l>end || r<start)    		return ;    	if(start>=l && end<=r) {    		seg[node]=(end-start+1)*val;    		if(start!=end) {    			lazy[2*node+1]+=val;    			lazy[2*node+2]+=val;    		}    		lazy[node]=0;    		return ;    	}    	int mid=(start+end)/2;    	updateRange(2*node+1,start,mid,l,r,val);    	updateRange(2*node+2,mid+1,end,l,r,val);    	seg[node]=seg[2*node+1]+seg[2*node+2];    }    public int queryRange(int node,int start,int end,int l,int r) {    	if(l>end || r<start)    		return 0;    	if(lazy[node]!=0) {    		seg[node]=(end-start+1)*lazy[node];    		if(start!=end) {    			lazy[2*node+1]+=lazy[node];    			lazy[2*node+2]+=lazy[node];    		}    		lazy[node]=0;    	}    	if(start>=l && end<=r)    		return seg[node];    	    	int  mid=(start+end)/2;    	return (query(2*node+1,start,mid,l,r)+query(2*node+2,mid+1,end,l,r));    }    }