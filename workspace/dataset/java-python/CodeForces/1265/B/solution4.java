import java.awt.Desktop;  import java.io.BufferedReader;  import java.io.IOException;import java.io.InputStreamReader;import java.io.PrintWriter;import java.net.URI;import java.net.URISyntaxException;import java.sql.Array;import java.util.ArrayList;import java.util.Arrays;import java.util.Collections;import java.util.Comparator;import java.util.HashMap;import java.util.HashSet;import java.util.Iterator;import java.util.LinkedHashMap;import java.util.LinkedHashSet;import java.util.LinkedList;import java.util.List;import java.util.Map;import java.util.PriorityQueue;import java.util.Queue;import java.util.Scanner;import java.util.Set;import java.util.Stack;import java.util.StringTokenizer;import java.util.TreeSet;import java.util.Vector;   public  class codechef3 {static class comp implements Comparator<Integer>{ 	@Override	public int compare(Integer o1, Integer o2) {		if(Math.abs(o1)>Math.abs(o2))			return -1;		else return 1;		}		}      //=======================================================	  //sorting Pair   static class comp1 implements Comparator<Pair<Integer,Integer>>   { 	@Override	public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {		if(o1.k>o2.k)			return 1;		else return -1;		} 			}        //======================================================= 	      //Creating Pair class           //----------------------------------------------------------------------	           static class Pair<Integer,Intetger>       {    	   int k=0;    	   int v=0;    	   public Pair(int a,int b)    	   {    		   k=a;    		   v=b;    	   }    	       	       	          }         //--------------------------------------------------------------------------			 static class FastReader		    {BufferedReader br; 		        StringTokenizer st; 		 public FastReader() 		        {  br = new BufferedReader(new		                     InputStreamReader(System.in)); 		        } 		  		       String next() 		        { 		            while (st == null || !st.hasMoreElements()) 		            { 		                try		                { 		                    st = new StringTokenizer(br.readLine()); 		                } 		                catch (IOException  e) 		                { 		                    e.printStackTrace(); 		                } 		            } 		            return st.nextToken(); 		        } 		  		        int nextInt() 		        { 		            return Integer.parseInt(next()); 		        } 		  		        long nextLong() 		        { 		            return Long.parseLong(next()); 		        } 		  		        double nextDouble() 		        { 		            return Double.parseDouble(next()); 		        } 		  		        String nextLine() 		        { 		            String str = ""; 		            try		            { 		                str = br.readLine(); 		            } 		            catch (IOException e) 		            { 		                e.printStackTrace(); 		            } 		            return str; 		        } 		    } 				 //gcd of two number		 		    public static int gcd(int a, int b)		    {		      if (b == 0)		        return a;		      return gcd(b, a % b); 		    }		    		 //--------------------------------------------------------------------------------------------		 		 //lcm of two number		 static int x;		    public static int lcm(int a, int b)		    {		        return (a / gcd(a, b)) * b;		    }		 		  //-------------------------------------------------------------------------------------------		   		 		    		    public static void main(String[] args) 		    {		    	FastReader s=new FastReader();				int t=s.nextInt();				while(t-->0)				{				int n=s.nextInt();				int[] a=new int[n+1];								for(int i=0;i<n;i++)				{					int num=s.nextInt();					a[num]=i+1;				}								int min=Integer.MAX_VALUE;				int max=Integer.MIN_VALUE;								for(int i=1;i<=n;i++)				{					min=Math.min(min,a[i]);					max=Math.max(max, a[i]);					if(max-min==i-1)						System.out.print("1");					else System.out.print("0");				}				System.out.println();														}		    			    			    		    			    			    	}}
