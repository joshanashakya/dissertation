import java.util.*;import java.util.Scanner;import java.io.*;import javax.lang.model.util.ElementScanner6; import static java.lang.System.out;import java.util.Stack;import java.util.Queue;import java.util.LinkedList; public class B920{    static int mod=(int)(1e9+7);   static long MOD=(long)(1e9+7);   static FastReader in=new FastReader();   static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));            public static void main(String args[])    {           int tc=1;             tc=in.nextInt();        tcloop: while(tc-->0)        {                    	int n=in.nextInt();        	        	ArrayList<Integer> al=new ArrayList<>();        	int left=0;        	int last=0;        	for(int i=0;i<n;i++)        	{				int l=in.nextInt();				int r=in.nextInt();												if(last>=r)				{					//pr.println(i);					al.add(0);									}				else				{					last=Math.max(last+1,l);					al.add(last);									}			}						for(int i : al)pr.print(i+" ");						pr.println();                    }        pr.flush();    }           static void sort(long[] a) {		ArrayList<Long> l = new ArrayList<>();		for (long i : a)			l.add(i);		Collections.sort(l);		for (int i = 0; i < a.length; i++)			a[i] = l.get(i);	}        	static void sort(int[] a) {		ArrayList<Integer> l = new ArrayList<>();		for (int i : a)			l.add(i);		Collections.sort(l);		for (int i = 0; i < a.length; i++)			a[i] = l.get(i);    }         static class FastReader    {         BufferedReader br;         StringTokenizer st;          public FastReader()         {             br = new BufferedReader(new InputStreamReader(System.in));         }          String next()         {             while (st == null || !st.hasMoreElements())             {                 try                {                     st = new StringTokenizer(br.readLine());                 }                 catch (IOException  e)                 {                     e.printStackTrace();                 }             }             return st.nextToken();         }          int nextInt()         {             return Integer.parseInt(next());         }          long nextLong()         {             return Long.parseLong(next());         }          double nextDouble()         {             return Double.parseDouble(next());         }                 int[] readIntArray(int n)        {		int a[]=new int[n];		for(int i=0;i<n;i++)a[i]=nextInt();		return a;	}			long[] readLongArray(int n)	{		long a[]=new long[n];		for(int i=0;i<n;i++)a[i]=nextLong();		return a;	}	        String nextLine()         {             String str = "";             try            {                 str = br.readLine();             }             catch (IOException e)             {                 e.printStackTrace();             }             return str;         }     } }  
