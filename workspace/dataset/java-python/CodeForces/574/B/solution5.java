import java.io.*;import java.util.*;public class Solution{    public static void main(String ag[])    {        Scanner sc=new Scanner(System.in);        int i,j,k;        int N=sc.nextInt();        int M=sc.nextInt();                HashSet<Integer> adj[]=new HashSet[N+1];        for(i=0;i<=N;i++)        adj[i]=new HashSet<>();        int degree[]=new int[N+1];                for(i=1;i<=M;i++)        {            int a=sc.nextInt();            int b=sc.nextInt();            adj[a].add(b);            adj[b].add(a);            degree[a]++;            degree[b]++;        }            int min=Integer.MAX_VALUE;        for(i=1;i<=N;i++)        {            int node1=i;            Iterator<Integer> itr1=adj[node1].iterator();            while(itr1.hasNext())            {                int node2=itr1.next();                Iterator<Integer> itr2=adj[node2].iterator();                while(itr2.hasNext())                {                    int node3=itr2.next();                    if(adj[node3].contains(node1))                    min=Math.min(min,degree[node1]+degree[node2]+degree[node3]-6);                }            }        }        System.out.println(min==Integer.MAX_VALUE?-1:min);    }}
