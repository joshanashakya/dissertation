import java.util.*;import java.util.Scanner;import java.io.*;import javax.lang.model.util.ElementScanner6; import static java.lang.System.out;  public class B545{            public static void main(String args[])    {           FastReader in=new FastReader();        PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));        int tc=1;             //tc=in.nextInt();        while(tc-->0)        {                    	        	        	char s[]=in.nextLine().toCharArray();        	char t[]=in.nextLine().toCharArray();        	int n=s.length;        	int c=0;        	for(int i=0;i<n;i++)        	{				if(s[i]!=t[i])c++;			}        	        	if(c%2==1)        	{				pr.println("impossible");				continue;			}						c/=2;			char ans[]=new char[n];						for(int i=0;i<n;i++)			{				if(s[i]!=t[i])				{					if(c>0)					{						ans[i]=t[i];						c--;					}					else					{						ans[i]=s[i];					}				}				else ans[i]=s[i];							}							pr.println(ans);        	        		                   }        pr.flush();    }           static void sort(long[] a) {		ArrayList<Long> l = new ArrayList<>();		for (long i : a)			l.add(i);		Collections.sort(l);		for (int i = 0; i < a.length; i++)			a[i] = l.get(i);	}        	static void sort(int[] a) {		ArrayList<Integer> l = new ArrayList<>();		for (int i : a)			l.add(i);		Collections.sort(l);		for (int i = 0; i < a.length; i++)			a[i] = l.get(i);    }         static class FastReader    {         BufferedReader br;         StringTokenizer st;          public FastReader()         {             br = new BufferedReader(new InputStreamReader(System.in));         }          String next()         {             while (st == null || !st.hasMoreElements())             {                 try                {                     st = new StringTokenizer(br.readLine());                 }                 catch (IOException  e)                 {                     e.printStackTrace();                 }             }             return st.nextToken();         }          int nextInt()         {             return Integer.parseInt(next());         }          long nextLong()         {             return Long.parseLong(next());         }          double nextDouble()         {             return Double.parseDouble(next());         }                 int[] readIntArray(int n)        {		int a[]=new int[n];		for(int i=0;i<n;i++)a[i]=nextInt();		return a;	}			long[] readLongArray(int n)	{		long a[]=new long[n];		for(int i=0;i<n;i++)a[i]=nextLong();		return a;	}	        String nextLine()         {             String str = "";             try            {                 str = br.readLine();             }             catch (IOException e)             {                 e.printStackTrace();             }             return str;         }     } } 
