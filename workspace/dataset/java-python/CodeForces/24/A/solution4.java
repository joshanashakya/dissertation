import java.util.*;import java.io.*; public class  Ring_road{	static class Node	{		int nod;		int val;		public Node(int x,int y)		{			nod=x;			val=y;		}	}	public static long cost=0;	public static void main(String[] args) throws IOException 	{		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		PrintWriter pw=new PrintWriter(System.out); 		int t=1; 		while(t-->0)		{			int n=Integer.parseInt(br.readLine());			ArrayList<Node> adj[]=new ArrayList[n+1]; 			for(int i=0;i<=n;i++)				adj[i]=new ArrayList<>();			long sum=0;			for(int i=0;i<n;i++)			{				String str[]=br.readLine().trim().split(" ");				int x=Integer.parseInt(str[0]);				int y=Integer.parseInt(str[1]);				int z=Integer.parseInt(str[2]);				sum+=z;				adj[x].add(new Node(y,0));				adj[y].add(new Node(x,z));			} 			long min=Long.MAX_VALUE; 			for(Node x:adj[1])			{				cost=0;				min=Math.min(min,sum-dsf(adj,x,1,new boolean[n+1]));			}			pw.print(min);					}		pw.flush();	} 	public static long dsf(ArrayList<Node> adj[],Node des,int src,boolean[] vis)	{		if(vis[des.nod])			return cost; 		cost+=des.val;		vis[des.nod]=true; 		for(Node x:adj[des.nod])		{			if(x.nod!=src)				dsf(adj,x,des.nod,vis);		}		return cost; 	}}