//created by Whiplash99import java.io.*;import java.util.*;public class A{    private static ArrayList<Integer>[] edge;    private static int[] size,max,maxNode,set;     private static int find_set(int u)    {        if(set[u]==u) return u;        return set[u]=find_set(set[u]);    }    private static int DFS3(int u, int N) //find answer for ancestor of u    {        if(max[u]>N/2)            set[u]=DFS3(maxNode[u],N);         return set[u];    }    private static void DFS2(int u) //find answer for u    {        int tmp=find_set(u);        if(max[tmp]>size[u]/2)            set[u]=DFS3(tmp,size[u]);         for(int v:edge[u]) DFS2(v);    }    private static int DFS1(int u) //find subtree sizes    {        size[u]=1;        for(int v:edge[u])        {            int tmp=DFS1(v);            size[u]+=tmp;            if(tmp>max[u])            {                max[u]=tmp;                maxNode[u]=v;            }        }        return size[u];    }    public static void main(String[] args) throws IOException    {        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));         int i,N;         String[] s=br.readLine().trim().split(" ");        N=Integer.parseInt(s[0]);        int Q=Integer.parseInt(s[1]);         edge=new ArrayList[N];max=new int[N];        set=new int[N]; maxNode=new int[N];        size=new int[N];         for(i=0;i<N;i++) edge[i]=new ArrayList<>();        for(i=0;i<N;i++) set[i]=i;        Arrays.fill(maxNode,-1);         s=br.readLine().trim().split(" ");        for(i=0;i<N-1;i++)        {            int u=Integer.parseInt(s[i])-1;            edge[u].add(i+1);        }         DFS1(0);        DFS2(0);         StringBuilder sb=new StringBuilder();        while (Q-->0)        {            int u=Integer.parseInt(br.readLine().trim())-1;            sb.append(set[u]+1).append("\n");        }         System.out.println(sb);    }}
