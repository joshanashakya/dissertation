import java.io.DataInputStream;import java.io.FileInputStream;import java.io.IOException;import java.util.*; public class test3{	static boolean poss;	static class Reader     {         final private int BUFFER_SIZE = 1 << 16;         private DataInputStream din;         private byte[] buffer;         private int bufferPointer, bytesRead;           public Reader()         {             din = new DataInputStream(System.in);             buffer = new byte[BUFFER_SIZE];             bufferPointer = bytesRead = 0;         }           public Reader(String file_name) throws IOException         {             din = new DataInputStream(new FileInputStream(file_name));             buffer = new byte[BUFFER_SIZE];             bufferPointer = bytesRead = 0;         }           public String readLine() throws IOException         {             byte[] buf = new byte[64]; // line length             int cnt = 0, c;             while ((c = read()) != -1)             {                 if (c == '\n')                     break;                 buf[cnt++] = (byte) c;             }             return new String(buf, 0, cnt);         }           public int nextInt() throws IOException         {             int ret = 0;             byte c = read();             while (c <= ' ')                 c = read();             boolean neg = (c == '-');             if (neg)                 c = read();             do            {                 ret = ret * 10 + c - '0';             }  while ((c = read()) >= '0' && c <= '9');               if (neg)                 return -ret;             return ret;         }           public long nextLong() throws IOException         {             long ret = 0;             byte c = read();             while (c <= ' ')                 c = read();             boolean neg = (c == '-');             if (neg)                 c = read();             do {                 ret = ret * 10 + c - '0';             }             while ((c = read()) >= '0' && c <= '9');             if (neg)                 return -ret;             return ret;         }           public double nextDouble() throws IOException         {             double ret = 0, div = 1;             byte c = read();             while (c <= ' ')                 c = read();             boolean neg = (c == '-');             if (neg)                 c = read();               do {                 ret = ret * 10 + c - '0';             }             while ((c = read()) >= '0' && c <= '9');               if (c == '.')             {                 while ((c = read()) >= '0' && c <= '9')                 {                     ret += (c - '0') / (div *= 10);                 }             }               if (neg)                 return -ret;             return ret;         }           private void fillBuffer() throws IOException         {             bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);             if (bytesRead == -1)                 buffer[0] = -1;         }           private byte read() throws IOException         {             if (bufferPointer == bytesRead)                 fillBuffer();             return buffer[bufferPointer++];         }           public void close() throws IOException         {             if (din == null)                 return;             din.close();         }     } 		static int[] dfs(int n , LinkedList<Integer> arr[] , boolean visited[] , int dp[] , int c[])	{		visited[n] = true;						if(arr[n].size() == 1 && visited[arr[n].get(0)])		{			int ans[] = new int[1];			ans[0] = n;			if(c[n] != 0)				poss = false;			dp[n] = 1;			return ans;		}				LinkedList<Integer> temp = new LinkedList<Integer>();		int sz = 0;		for(Integer i : arr[n])		{			if(!visited[i])			{				int tt[] = dfs(i,arr,visited,dp,c);				dp[n] += dp[i];				for(int j = 0 ; j < tt.length ; j++)				{					temp.add(tt[j]);				}			}		}		dp[n]++;		int ans[] = new int[temp.size()+1];		for(int i = 0 ; i < temp.size();i++)		{			ans[i] = temp.get(i);		}		if(!poss || dp[n]-1 < c[n])		{			System.out.println(dp[n] + " " + c[n]);			poss = false;			return ans;		}				else		{			if(c[n] == ans.length-1)				ans[ans.length-1] = n;						else			{			for(int i = ans.length-1 ; i > c[n] ; i--)			{				ans[i] = ans[i-1];			}			ans[c[n]] = n;			}			return ans;		}					}		public static void main(String []args) throws IOException	{		Reader sc = new Reader();		int n = sc.nextInt();		int k = sc.nextInt();				int ceil = (n-1)%k;				int nor = k - (n-1)%k;				int ans = (n-1)/k;						if(ceil > 1)			System.out.println(2*ans+2);				else if(ceil == 1)			System.out.println(2*ans+1);				else			System.out.println(2*ans);				StringBuffer str = new StringBuffer("");		int curr = 2;		for(int i = 1 ; i <= nor ; i++)		{			for(int j = 1 ; j <= ans ; j++)			{				if(j==1)					str.append(1 + " " + curr);								else					str.append((curr-1) + " " + curr);								curr++;				str.append(System.getProperty("line.separator"));			}		}						for(int i = 1 ; i <= ceil ; i++)		{			for(int j = 1 ; j <= ans+1 ; j++)			{				if(j==1)					str.append(1 + " " + curr);								else					str.append((curr-1) + " " + curr);								curr++;				str.append(System.getProperty("line.separator"));			}		}		System.out.println(str);	}}
