//created by Whiplash99import java.io.*;import java.util.*;public class B{    public static void main(String[] args) throws Exception    {        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));         int i,N;         String[] s=br.readLine().trim().split(" ");        N=Integer.parseInt(s[0]);        int M=Integer.parseInt(s[1]);         int[] a=new int[M];        s=br.readLine().trim().split(" ");        for(i=0;i<M;i++) a[i]=Integer.parseInt(s[i]);         HashMap<Integer,Integer> map=new HashMap();        for(i=1;i<=N;i++) map.put(i,0);         int zero=N;        StringBuilder sb=new StringBuilder();         for(i=0;i<M;i++)        {            int v=map.get(a[i]);            if(v==0) zero--;            map.put(a[i],v+1);             if(zero>0) sb.append(0);            else            {                sb.append(1);                for(int j=1;j<=N;j++)                {                    v=map.get(j);                    if(v==1) zero++;                    map.put(j,v-1);                }            }        }        System.out.println(sb);    }}