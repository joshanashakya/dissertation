import java.util.*;import java.util.Scanner;import java.io.*;import javax.lang.model.util.ElementScanner6; import static java.lang.System.out;  public class B441M2{            public static void main(String args[])    {           FastReader in=new FastReader();        PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));        int tc=1;             //tc=in.nextInt();        while(tc-->0)        {                    	int n=in.nextInt();        	int v=in.nextInt();        				int arr[]=new int[3002];        	        	for(int i=0;i<n;i++)        	{				int ind=in.nextInt();				arr[ind]+=in.nextInt();			}									int total=0;			int last=0;											for(int i=1;i<=3001;i++)			{												int today=Math.min(arr[i]+last,v);												int todtod=Math.max(today-last,0);													last=Math.max(arr[i]-todtod,0);							total+=today;											}			pr.println(total);					        }        				                           pr.flush();    }           static void sort(long[] a) {		ArrayList<Long> l = new ArrayList<>();		for (long i : a)			l.add(i);		Collections.sort(l);		for (int i = 0; i < a.length; i++)			a[i] = l.get(i);	}        	static void sort(int[] a) {		ArrayList<Integer> l = new ArrayList<>();		for (int i : a)			l.add(i);		Collections.sort(l);		for (int i = 0; i < a.length; i++)			a[i] = l.get(i);    }         static class FastReader    {         BufferedReader br;         StringTokenizer st;          public FastReader()         {             br = new BufferedReader(new InputStreamReader(System.in));         }          String next()         {             while (st == null || !st.hasMoreElements())             {                 try                {                     st = new StringTokenizer(br.readLine());                 }                 catch (IOException  e)                 {                     e.printStackTrace();                 }             }             return st.nextToken();         }          int nextInt()         {             return Integer.parseInt(next());         }          long nextLong()         {             return Long.parseLong(next());         }          double nextDouble()         {             return Double.parseDouble(next());         }          String nextLine()         {             String str = "";             try            {                 str = br.readLine();             }             catch (IOException e)             {                 e.printStackTrace();             }             return str;         }     } } 
