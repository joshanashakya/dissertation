import java.io.BufferedReader; import java.io.IOException; import java.io.InputStreamReader; import java.util.Scanner; import java.util.StringTokenizer; import java.util.*;public class averageNumbers{     static class FastReader     {         BufferedReader br;         StringTokenizer st;           public FastReader()         {             br = new BufferedReader(new                     InputStreamReader(System.in));         }           String next()         {             while (st == null || !st.hasMoreElements())             {                 try                {                     st = new StringTokenizer(br.readLine());                 }                 catch (IOException  e)                 {                     e.printStackTrace();                 }             }             return st.nextToken();         }           int nextInt()         {             return Integer.parseInt(next());         }           long nextLong()         {             return Long.parseLong(next());         }           double nextDouble()         {             return Double.parseDouble(next());         }           String nextLine()         {             String str = "";             try            {                 str = br.readLine();             }             catch (IOException e)             {                 e.printStackTrace();             }             return str;         }     }       public static void main(String[] args)     {         FastReader sc=new FastReader();     	int n=sc.nextInt();     	int a[]=new int[n];     	int c=0;     	double sum=0;     	int b[]=new int[n];    	for(int i=0;i<n;i++)    	{    		a[i]=sc.nextInt();    		sum=sum+a[i];    	}    	for(int i=0;i<n;i++)    	{    		if(a[i]==(sum-a[i])/(n-1))    		{    			b[c]=i;    			c++;    		}    	}    	System.out.println(c);    	for(int i=0;i<c;i++)    	{    		System.out.print(b[i]+1+" ");    	}        }    }
