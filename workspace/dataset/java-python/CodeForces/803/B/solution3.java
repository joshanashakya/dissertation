import java.util.*;import java.util.Scanner;import java.io.*;import javax.lang.model.util.ElementScanner6; import static java.lang.System.out;import java.util.Stack;import java.util.Queue;import java.util.LinkedList; public class B803{            public static void main(String args[])    {           FastReader in=new FastReader();        PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));        int tc=1;             //tc=in.nextInt();        while(tc-->0)        {                    	int n=in.nextInt();        	int arr[]=new int[n];        	        	int a1[]=new int[n];        	int a2[]=new int[n];        	        	for(int i=0;i<n;i++)        	{				arr[i]=in.nextInt();						}						int last=-1;			for(int i=0;i<n;i++)			{				if(arr[i]==0)				{					last=i;				}				a1[i]=last;			}						last=-1;						for(int i=n-1;i>=0;i--)			{				if(arr[i]==0)				{					last=i;				}				a2[i]=last;			}						ArrayList<Integer> al=new ArrayList<>();			for(int i=0;i<n;i++)			{				if(a1[i]!=-1&&a2[i]!=-1)				{					al.add(Math.min(i-a1[i],a2[i]-i));				}				else if(a1[i]!=-1)				{					al.add(i-a1[i]);				}				else 				{					al.add(a2[i]-i);				}			}											for(int i : al)pr.print(i+" ");			pr.println();															                   }        pr.flush();    }           static void sort(long[] a) {		ArrayList<Long> l = new ArrayList<>();		for (long i : a)			l.add(i);		Collections.sort(l);		for (int i = 0; i < a.length; i++)			a[i] = l.get(i);	}        	static void sort(int[] a) {		ArrayList<Integer> l = new ArrayList<>();		for (int i : a)			l.add(i);		Collections.sort(l);		for (int i = 0; i < a.length; i++)			a[i] = l.get(i);    }         static class FastReader    {         BufferedReader br;         StringTokenizer st;          public FastReader()         {             br = new BufferedReader(new InputStreamReader(System.in));         }          String next()         {             while (st == null || !st.hasMoreElements())             {                 try                {                     st = new StringTokenizer(br.readLine());                 }                 catch (IOException  e)                 {                     e.printStackTrace();                 }             }             return st.nextToken();         }          int nextInt()         {             return Integer.parseInt(next());         }          long nextLong()         {             return Long.parseLong(next());         }          double nextDouble()         {             return Double.parseDouble(next());         }                 int[] readIntArray(int n)        {		int a[]=new int[n];		for(int i=0;i<n;i++)a[i]=nextInt();		return a;	}			long[] readLongArray(int n)	{		long a[]=new long[n];		for(int i=0;i<n;i++)a[i]=nextLong();		return a;	}	        String nextLine()         {             String str = "";             try            {                 str = br.readLine();             }             catch (IOException e)             {                 e.printStackTrace();             }             return str;         }     } }  