import java.util.*;import java.util.Scanner;import java.io.*;import javax.lang.model.util.ElementScanner6; import static java.lang.System.out;  public class A358{            public static void main(String args[])    {           FastReader in=new FastReader();        PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));        int tc=1;             //tc=in.nextInt();        while(tc-->0)        {                    	int n=in.nextInt();			int arr[]=new int[n];						Pair pair[]=new Pair[n-1];						for(int i=0;i<n;i++)			{				arr[i]=in.nextInt();			}															for(int i=0;i<n-1;i++)			{				pair[i]=new Pair(arr[i],arr[i+1]);			}											int f1=0,f2=0;			for(int i=0;i<n-1;i++)			{				for(int j=0;j<n-1;j++)				{ 					                                              					if(i==j)continue;									//pr.println(pair[j].start+" "+pair[j].end);													if(pair[i].start>pair[j].start&&pair[i].end>pair[j].end&&pair[i].start<pair[j].end)f1=1;										else if (pair[i].start<pair[j].start&&pair[i].end<pair[j].end&&pair[i].end>pair[j].start)f1=1;																			}															}						if(f1==1||f2==1)pr.println("yes");			else pr.println("no"); 			         }        pr.flush();    }      static class Pair    {		int start,end;				 public Pair(int x, int y) {			start=Math.min(x,y);			end=Math.max(x,y);        }                public int start(){return start;}        public int end(){return end;}         	}     static void sort(long[] a) {		ArrayList<Long> l = new ArrayList<>();		for (long i : a)			l.add(i);		Collections.sort(l);		for (int i = 0; i < a.length; i++)			a[i] = l.get(i);	}        	static void sort(int[] a) {		ArrayList<Integer> l = new ArrayList<>();		for (int i : a)			l.add(i);		Collections.sort(l);		for (int i = 0; i < a.length; i++)			a[i] = l.get(i);    }         static class FastReader    {         BufferedReader br;         StringTokenizer st;          public FastReader()         {             br = new BufferedReader(new InputStreamReader(System.in));         }          String next()         {             while (st == null || !st.hasMoreElements())             {                 try                {                     st = new StringTokenizer(br.readLine());                 }                 catch (IOException  e)                 {                     e.printStackTrace();                 }             }             return st.nextToken();         }          int nextInt()         {             return Integer.parseInt(next());         }          long nextLong()         {             return Long.parseLong(next());         }          double nextDouble()         {             return Double.parseDouble(next());         }          String nextLine()         {             String str = "";             try            {                 str = br.readLine();             }             catch (IOException e)             {                 e.printStackTrace();             }             return str;         }     } }