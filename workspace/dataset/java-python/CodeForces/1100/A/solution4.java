//created by Whiplash99import java.io.*;import java.util.*;public class A{    public static void main(String[] args) throws Exception    {        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));         int i,N;         String[] s=br.readLine().trim().split(" ");        N=Integer.parseInt(s[0]);        int K=Integer.parseInt(s[1]);         int c1=0,c2=0;        s=br.readLine().trim().split(" ");        int[] a=new int[N];        for(i=0;i<N;i++) a[i]=Integer.parseInt(s[i]);         for(i=0;i<N;i++)        {            if(a[i]==1) c1++;            else c2++;        }         int max=0;        for(i=0;i<K;i++)        {            int t1=0,t2=0;            for(int j=i;j<N;j+=K)            {                if(a[j]==1) t1++;                else t2++;            }            max=Math.max(max,Math.abs((c1-t1)-(c2-t2)));        }         System.out.println(max);    }}