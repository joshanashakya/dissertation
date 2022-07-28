//created by Whiplash99import java.io.*;import java.util.*;public class A{    private static ArrayDeque<Integer>[] edge;    private static long[] val, eVal, diff;    private static int[][] anc;    private static final int LOG_N=18;     private static int binaryLift(int u)    {        int cur=u;        for(int i=LOG_N;i>=0;i--)        {            if(anc[cur][i]!=0&&eVal[u]-eVal[anc[cur][i]]<=val[u])                cur=anc[cur][i];        }        return anc[cur][0];    }    private static void solve(int u)    {        for(int v:edge[u])        {            solve(v);            diff[u]+= diff[v];        }         if(anc[u][0]!=0&&eVal[u]-eVal[anc[u][0]]<=val[u])        {            int lim=binaryLift(u);            diff[anc[u][0]]+=1;            diff[lim]-=1;        }    }    private static void DFS(int u, int p)    {        anc[u][0]=p;        for(int i=1;i<=LOG_N;i++)            anc[u][i]=anc[anc[u][i-1]][i-1];         for(int v:edge[u])        {            eVal[v]+=eVal[u];            DFS(v,u);        }    }    public static void main(String[] args) throws IOException    {        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));         int i,N;         N=Integer.parseInt(br.readLine().trim());        val=new long[N+1]; edge=new ArrayDeque[N+1];        String[] s=br.readLine().trim().split(" ");        for(i=0;i<N;i++) val[i+1]=Integer.parseInt(s[i]);        for(i=0;i<=N;i++) edge[i]=new ArrayDeque<>();         eVal=new long[N+1]; edge[0].add(1);        for(i=0;i<N-1;i++)        {            s=br.readLine().trim().split(" ");            int u=Integer.parseInt(s[0]);            int w=Integer.parseInt(s[1]);             edge[u].add(i+2);            eVal[i+2]=w;        }         diff=new long[N+1]; //Difference Array        anc=new int[N+1][LOG_N+1];         DFS(0,0);        solve(1);         StringBuilder sb=new StringBuilder();        for(i=1;i<=N;i++) sb.append(diff[i]).append(" ");         System.out.println(sb);    }}
