import java.io.DataInputStream;import java.io.FileInputStream;import java.io.IOException;import java.util.ArrayList;import java.util.Scanner; public class Main {		static class Reader     {         final private int BUFFER_SIZE = 1 << 16;         private DataInputStream din;         private byte[] buffer;         private int bufferPointer, bytesRead;           public Reader()         {             din = new DataInputStream(System.in);             buffer = new byte[BUFFER_SIZE];             bufferPointer = bytesRead = 0;         }           public Reader(String file_name) throws IOException         {             din = new DataInputStream(new FileInputStream(file_name));             buffer = new byte[BUFFER_SIZE];             bufferPointer = bytesRead = 0;         }           public String readLine() throws IOException         {             byte[] buf = new byte[64]; // line length             int cnt = 0, c;             while ((c = read()) != -1)             {                 if (c == '\n')                     break;                 buf[cnt++] = (byte) c;             }             return new String(buf, 0, cnt);         }           public int nextInt() throws IOException         {             int ret = 0;             byte c = read();             while (c <= ' ')                 c = read();             boolean neg = (c == '-');             if (neg)                 c = read();             do            {                 ret = ret * 10 + c - '0';             }  while ((c = read()) >= '0' && c <= '9');               if (neg)                 return -ret;             return ret;         }           public long nextLong() throws IOException         {             long ret = 0;             byte c = read();             while (c <= ' ')                 c = read();             boolean neg = (c == '-');             if (neg)                 c = read();             do {                 ret = ret * 10 + c - '0';             }             while ((c = read()) >= '0' && c <= '9');             if (neg)                 return -ret;             return ret;         }           public double nextDouble() throws IOException         {             double ret = 0, div = 1;             byte c = read();             while (c <= ' ')                 c = read();             boolean neg = (c == '-');             if (neg)                 c = read();               do {                 ret = ret * 10 + c - '0';             }             while ((c = read()) >= '0' && c <= '9');               if (c == '.')             {                 while ((c = read()) >= '0' && c <= '9')                 {                     ret += (c - '0') / (div *= 10);                 }             }               if (neg)                 return -ret;             return ret;         }           private void fillBuffer() throws IOException         {             bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);             if (bytesRead == -1)                 buffer[0] = -1;         }           private byte read() throws IOException         {             if (bufferPointer == bytesRead)                 fillBuffer();             return buffer[bufferPointer++];         }           public void close() throws IOException         {             if (din == null)                 return;             din.close();         }     } 		static int time=0;	static int found=0;		public static void main(String[] args) throws Exception	{		Reader s=new Reader();				StringBuilder sb=new StringBuilder();				int t=s.nextInt();				for(int i=0;i<t;i++)		{			int n=s.nextInt();			int m=s.nextInt();						int a=s.nextInt();			int b=s.nextInt();						ArrayList<Integer>[] arr=new ArrayList[n+1];						for(int j=0;j<n+1;j++)			{				ArrayList<Integer> list=new ArrayList<>();				arr[j]=list;			}						for(int j=0;j<m;j++)			{				int c=s.nextInt();				int d=s.nextInt();								arr[c].add(d);				arr[d].add(c);			}						ArrayList<Integer> list=new ArrayList<>();						int[] vi=new int[n+1];			int[] lo=new int[n+1];						int[] visited=new int[n+1];						articulate(arr,visited,vi,lo,list,1,-1);						int x=0;			int y=0;						for(int j=0;j<list.size();j++)			{				if(list.get(j)==a)					x++;				else if(list.get(j)==b)					y++;			}						if(x>0&&y>0)			{					long count1=0;				long count2=0;								int[] visited1=new int[n+1];				int[] visited2=new int[n+1];								visited1[a]=1;				visited2[b]=1;								for(int j=0;j<arr[a].size();j++)				{					int now=arr[a].get(j);					long ans=0;										if(visited1[now]==0)					ans=dfs(arr,visited1,now,b);										if(found==0)					{						count1=count1+ans;					}										found=0;				}								for(int j=0;j<arr[b].size();j++)				{					int now=arr[b].get(j);					long ans=0;										if(visited2[now]==0)					ans=dfs(arr,visited2,now,a);										if(found==0)					{						count2=count2+ans;					}										found=0;				}								sb.append(count1*count2);				sb.append("\n");							}			else			{				sb.append(0);				sb.append("\n");			}					}				System.out.println(sb);	}		public static void articulate(ArrayList<Integer>[] arr,int[] visited,int[] vi,int[] lo,ArrayList<Integer> list,int curr,int parent)	{		visited[curr]=1;				time++;				vi[curr]=time;		lo[curr]=time;				int count=0;		int p=0;				for(int i=0;i<arr[curr].size();i++)		{			int now=arr[curr].get(i);						if(visited[now]==0)			{				count++;								articulate(arr,visited,vi,lo,list,now,curr);								lo[curr]=Math.min(lo[curr],lo[now]);								if(vi[curr]<=lo[now])				{					p=1;				}			}			else if(now!=parent)			{				lo[curr]=Math.min(lo[curr],vi[now]);								if(vi[curr]<=lo[now])				{					p=1;				}			}		}				if(curr!=1&&p==1)		{			list.add(curr);		}		else if(curr==1&&count>1)		{			list.add(curr);		}	}		public static int dfs(ArrayList<Integer>[] arr,int[] visited,int curr,int find)	{		visited[curr]=1;				if(curr==find)			found=1;				int count=0;				for(int i=0;i<arr[curr].size();i++)		{			int now=arr[curr].get(i);						if(visited[now]==0)			{				count=count+dfs(arr,visited,now,find);			}		}				return count+1;	}	}
