import java.io.BufferedReader;import java.io.BufferedWriter;import java.io.IOException;import java.io.InputStreamReader;import java.io.OutputStreamWriter;import java.io.PrintWriter;import java.util.StringTokenizer;    public class temp4 {	static class FastReader     {         BufferedReader br;         StringTokenizer st;           public FastReader()         {             br = new BufferedReader(new                     InputStreamReader(System.in));         }           String next()         {             while (st == null || !st.hasMoreElements())             {                 try                {                     st = new StringTokenizer(br.readLine());                 }                 catch (IOException  e)                 {                     e.printStackTrace();                 }             }             return st.nextToken();         }           int nextInt()         {             return Integer.parseInt(next());         }           long nextLong()         {             return Long.parseLong(next());         }           double nextDouble()         {             return Double.parseDouble(next());         }           String nextLine()         {             String str = "";             try            {                 str = br.readLine();             }             catch (IOException e)             {                 e.printStackTrace();             }             return str;         }     } 	/*	static class Reader     {         final private int BUFFER_SIZE = 1 << 16;         private DataInputStream din;         private byte[] buffer;         private int bufferPointer, bytesRead;           public Reader()         {             din = new DataInputStream(System.in);             buffer = new byte[BUFFER_SIZE];             bufferPointer = bytesRead = 0;         }           public Reader(String file_name) throws IOException         {             din = new DataInputStream(new FileInputStream(file_name));             buffer = new byte[BUFFER_SIZE];             bufferPointer = bytesRead = 0;         }           public String readLine() throws IOException         {             byte[] buf = new byte[64]; // line length             int cnt = 0, c;             while ((c = read()) != -1)             {                 if (c == '\n')                     break;                 buf[cnt++] = (byte) c;             }             return new String(buf, 0, cnt);         }           public int nextInt() throws IOException         {             int ret = 0;             byte c = read();             while (c <= ' ')                 c = read();             boolean neg = (c == '-');             if (neg)                 c = read();             do            {                 ret = ret * 10 + c - '0';             }  while ((c = read()) >= '0' && c <= '9');               if (neg)                 return -ret;             return ret;         }           public long nextLong() throws IOException         {             long ret = 0;             byte c = read();             while (c <= ' ')                 c = read();             boolean neg = (c == '-');             if (neg)                 c = read();             do {                 ret = ret * 10 + c - '0';             }             while ((c = read()) >= '0' && c <= '9');             if (neg)                 return -ret;             return ret;         }           public double nextDouble() throws IOException         {             double ret = 0, div = 1;             byte c = read();             while (c <= ' ')                 c = read();             boolean neg = (c == '-');             if (neg)                 c = read();               do {                 ret = ret * 10 + c - '0';             }             while ((c = read()) >= '0' && c <= '9');               if (c == '.')             {                 while ((c = read()) >= '0' && c <= '9')                 {                     ret += (c - '0') / (div *= 10);                 }             }               if (neg)                 return -ret;             return ret;         }           private void fillBuffer() throws IOException         {             bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);             if (bytesRead == -1)                 buffer[0] = -1;         }           private byte read() throws IOException         {             if (bufferPointer == bytesRead)                 fillBuffer();             return buffer[bufferPointer++];         }           public void close() throws IOException         {             if (din == null)                 return;             din.close();         }     } */	static class Print	{	    private final BufferedWriter bw;	    public Print()	    {	        bw=new BufferedWriter(new OutputStreamWriter(System.out));	    }	    public void print(String str)throws IOException	    {	        bw.append(str);	    }	    public void println(String str)throws IOException	    {	        print(str);	        bw.append("\n");	    }	    public void close()throws IOException	    {	        bw.close();	    }} 							public static void main(String[] args) throws IOException {						FastReader scn=new FastReader();		//	Print pr=new Print();			PrintWriter out=new PrintWriter(System.out);			int n=scn.nextInt();			int[] arr=new int[n];			for(int i=0;i<n;i++){				arr[i]=scn.nextInt();							}			if(n==1){				out.println("0");				out.close();return;			}			int s=0,e=0,t=1,max=0,os=0,oe=0;			for(int i=0;i<n;i++){				if(i+1<n&&arr[i+1]==arr[i]+1){					t++;				}				else{					if(t>max||(t==max&&arr[i]==1000)){						max=t;						os=s;oe=i;					}					s=i+1;					e=i;t=1;				}			}									if(max==1){				out.println("0");			}						else if(arr[os]==1||e<n+1&&arr[oe]==1000){				out.println(max-1);			}			else{				out.println(max-2);			}			out.close();					}				public static class node{			int val;			int idx;			public node(int val,int idx){				this.val=val;this.idx=idx;			}		}}	
