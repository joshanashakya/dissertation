import java.util.*;   import java.io.*;public class Main {     static class Reader     {         final private int BUFFER_SIZE = 1 << 16;         private DataInputStream din;         private byte[] buffer;         private int bufferPointer, bytesRead;           public Reader()         {             din = new DataInputStream(System.in);             buffer = new byte[BUFFER_SIZE];             bufferPointer = bytesRead = 0;         }           public Reader(String file_name) throws IOException         {             din = new DataInputStream(new FileInputStream(file_name));             buffer = new byte[BUFFER_SIZE];             bufferPointer = bytesRead = 0;         }           public String readLine() throws IOException         {             byte[] buf = new byte[64]; // line length             int cnt = 0, c;             while ((c = read()) != -1)             {                 if (c == '\n')                     break;                 buf[cnt++] = (byte) c;             }             return new String(buf, 0, cnt);         }           public int nextInt() throws IOException         {             int ret = 0;             byte c = read();             while (c <= ' ')                 c = read();             boolean neg = (c == '-');             if (neg)                 c = read();             do            {                 ret = ret * 10 + c - '0';             }  while ((c = read()) >= '0' && c <= '9');               if (neg)                 return -ret;             return ret;         }           public long nextLong() throws IOException         {             long ret = 0;             byte c = read();             while (c <= ' ')                 c = read();             boolean neg = (c == '-');             if (neg)                 c = read();             do {                 ret = ret * 10 + c - '0';             }             while ((c = read()) >= '0' && c <= '9');             if (neg)                 return -ret;             return ret;         }           public double nextDouble() throws IOException         {             double ret = 0, div = 1;             byte c = read();             while (c <= ' ')                 c = read();             boolean neg = (c == '-');             if (neg)                 c = read();               do {                 ret = ret * 10 + c - '0';             }             while ((c = read()) >= '0' && c <= '9');               if (c == '.')             {                 while ((c = read()) >= '0' && c <= '9')                 {                     ret += (c - '0') / (div *= 10);                 }             }               if (neg)                 return -ret;             return ret;         }           private void fillBuffer() throws IOException         {             bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);             if (bytesRead == -1)                 buffer[0] = -1;         }           private byte read() throws IOException         {             if (bufferPointer == bytesRead)                 fillBuffer();             return buffer[bufferPointer++];         }           public void close() throws IOException         {             if (din == null)                 return;             din.close();         }     } 	static long gcd(long n,long m) {		if(n==0&&m==0)return Long.MAX_VALUE;		if(n==0)return m;		long temp=m%n;		return gcd(temp,n);	}	static long pow(int i,int j) {		return ((long)Math.pow(i,j));	}	static trouble ex_gcd(long m,long n) {		if(m==0) {			if(n!=0)			return (new trouble(0,1,n));			return(new trouble(0,1,(long)1e9));		}		trouble temp=ex_gcd(n%m,m);		long r=temp.x;		long m_=temp.y;		temp.x=(-1*n/m)*r+m_;		temp.y=r;		return temp;	}	  static class pair{	    	long x;	    	long y;	    	pair(long i,long j){	    		x=i;	    		y=j;	    	}	    }	  static String toString(trouble p) {  		return (p.x)+" "+(p.y)+" "+p.z;  	}	  static class trouble{	    	long x;	    	long y;	    	long z;	    	trouble(long i,long j,long k){	    		x=i;	    		y=j;	    		z=k;	    	}	    }	static LinkedList<Integer> div(int x){		LinkedList<Integer>arr =new LinkedList<>();        for(int i=1;i*i<=x;i++) {        	if(x%i==0) {arr.add(i);if(x/i!=i)arr.add(x/i);}        }        return arr;	}	static long bin(long i,long[] arr) {		long l=0l;		long r=Math.min(i+2,arr.length-1);		long res=r;		while(l<=r) {			long mid=l+r>>1;		    if(arr[(int)mid]>=i) {		    	r=mid-1;res=mid;		    }		    else l=mid+1;		}		return res;	}	static PrintWriter pw=new PrintWriter(System.out);    public static void main(String[] args) throws IOException,Exception    {   //  	Thread.sleep(3000);        Reader sc=new Reader();        //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));        int b0,b1,b2,b3,b4,a,b;        b0=sc.nextInt();        b1=sc.nextInt();        b2=sc.nextInt();        b3=sc.nextInt();        a=sc.nextInt();        b=sc.nextInt();        int[][]arr= {{ b0,b1,b2,b3 },{ b0,b1,b3,b2 },{ b0,b2,b1,b3 },{ b0,b2,b3,b1 },{ b0,b3,b1,b2 },{ b0,b3,b2,b1 },{ b1,b0,b2,b3 },{ b1,b0,b3,b2 },{ b1,b2,b0,b3 },{ b1,b2,b3,b0 },{ b1,b3,b0,b2 },{ b1,b3,b2,b0 },{ b2,b0,b1,b3 },{ b2,b0,b3,b1 },{ b2,b1,b0,b3 },{ b2,b1,b3,b0 },{ b2,b3,b0,b1 },{ b2,b3,b1,b0 },{ b3,b0,b1,b2 },{ b3,b0,b2,b1 },{ b3,b1,b0,b2 },{ b3,b1,b2,b0 },{ b3,b2,b0,b1 },{ b3,b2,b1,b0 }};        int res=0;        for(int i=a;i<=b;i++) {             int c=0;             for(int j=0;j<24;j++) {            	 if(i%arr[j][0]%arr[j][1]%arr[j][2]%arr[j][3]==i)c++;             }             if(c>=7) {            	 res+=1;             }        }        pw.println(res);        pw.close();    } } 	     			  	 	   	 			   	
