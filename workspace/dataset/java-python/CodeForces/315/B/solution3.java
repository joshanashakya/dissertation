import java.util.*;import java.util.Scanner;import java.io.*;import javax.lang.model.util.ElementScanner6; import static java.lang.System.out;  public class B315{            public static void main(String args[])    {           FastReader in=new FastReader();        PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));        int tc=1;             //tc=in.nextInt();        while(tc-->0)        {                    	int n=in.nextInt();        	int m=in.nextInt();        	long arr[][]=new long[n+1][2];        	        	for(int i=1;i<=n;i++)        	{				arr[i][0]=in.nextLong();			} 			long sum=0;			while(m-->0)			{				int t=in.nextInt();				if(t==1)				{					int v=in.nextInt();					long x=in.nextLong();					arr[v][0]=x;					arr[v][1]=sum;				}				else if(t==2)				{					sum+=in.nextLong();				}				else				{					int q=in.nextInt();					pr.println(arr[q][0]+sum-arr[q][1]);				}			}						           }        pr.flush();    } 	     static void sort(long[] a) {		ArrayList<Long> l = new ArrayList<>();		for (long i : a)			l.add(i);		Collections.sort(l);		for (int i = 0; i < a.length; i++)			a[i] = l.get(i);	}        	static void sort(int[] a) {		ArrayList<Integer> l = new ArrayList<>();		for (int i : a)			l.add(i);		Collections.sort(l);		for (int i = 0; i < a.length; i++)			a[i] = l.get(i);    }         static class FastReader    {         BufferedReader br;         StringTokenizer st;          public FastReader()         {             br = new BufferedReader(new InputStreamReader(System.in));         }          String next()         {             while (st == null || !st.hasMoreElements())             {                 try                {                     st = new StringTokenizer(br.readLine());                 }                 catch (IOException  e)                 {                     e.printStackTrace();                 }             }             return st.nextToken();         }          int nextInt()         {             return Integer.parseInt(next());         }          long nextLong()         {             return Long.parseLong(next());         }          double nextDouble()         {             return Double.parseDouble(next());         }          String nextLine()         {             String str = "";             try            {                 str = br.readLine();             }             catch (IOException e)             {                 e.printStackTrace();             }             return str;         }     } }