import java.io.*; import java.util.*;   public class Mishka_and_trip {     static class FastReader     {         BufferedReader br;         StringTokenizer st;           public FastReader()         {             br = new BufferedReader(new                     InputStreamReader(System.in));         }           String next()         {             while (st == null || !st.hasMoreElements())             {                 try                {                     st = new StringTokenizer(br.readLine());                 }                 catch (IOException  e)                 {                     e.printStackTrace();                 }             }             return st.nextToken();         }           int nextInt()         {             return Integer.parseInt(next());         }           long nextLong()         {             return Long.parseLong(next());         }           double nextDouble()         {             return Double.parseDouble(next());         }           String nextLine()         {             String str = "";             try            {                 str = br.readLine();             }             catch (IOException e)             {                 e.printStackTrace();             }             return str;         }     }         public static void main(String[] args)     {         FastReader sc=new FastReader();                 PrintWriter pw=new PrintWriter(System.out);         int n=sc.nextInt();        int m=sc.nextInt();         long arr[]=new long[n+1];        long sum =0;        for(int i=1;i<n+1;i++)        {            arr[i]=sc.nextInt();            sum+=arr[i];        }        boolean capital[]=new boolean[n+1];        long ans=0;        for(int i=0;i<m;i++)        {            int x=sc.nextInt();            capital[x]=true;            sum-=arr[x];             ans+=(sum*arr[x]);        }         //System.out.println(ans);        for(int i=1;i<n;i++)        {            if(!capital[i] && !capital[i+1])                ans+=arr[i]*arr[i+1];        }         if(!capital[1] && !capital[n])            ans+=arr[1]*arr[n];         System.out.println(ans);    } }   