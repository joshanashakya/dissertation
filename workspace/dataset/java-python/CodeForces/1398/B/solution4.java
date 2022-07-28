
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Codeforces    {
	
	 static class FastReader
	    {BufferedReader br; 
	        StringTokenizer st; 
	 public FastReader() 
	        {  br = new BufferedReader(new
	                     InputStreamReader(System.in)); 
	        } 
	  
	       String next() 
	        { 
	            while (st == null || !st.hasMoreElements()) 
	            { 
	                try
	                { 
	                    st = new StringTokenizer(br.readLine()); 
	                } 
	                catch (IOException  e) 
	                { 
	                    e.printStackTrace(); 
	                } 
	            } 
	            return st.nextToken(); 
	        } 
	  
	        int nextInt() 
	        { 
	            return Integer.parseInt(next()); 
	        } 
	  
	        long nextLong() 
	        { 
	            return Long.parseLong(next()); 
	        } 
	  
	        double nextDouble() 
	        { 
	            return Double.parseDouble(next()); 
	        } 
	  
	        String nextLine() 
	        { 
	            String str = ""; 
	            try
	            { 
	                str = br.readLine(); 
	            } 
	            catch (IOException e) 
	            { 
	                e.printStackTrace(); 
	            } 
	            return str; 
	        } 
	    } 

	 
	 
		
		
		public static void main(String[] args) {
		FastReader s=new FastReader();
		int t=s.nextInt();
		while(t-->0)
		{
		
			
			
			String s1=s.next();
			ArrayList<Integer> l=new ArrayList<>();
			int flag=0;
			int n=s1.length();
			int count=0;
			
			for(int i=0;i<n;i++)
			{
			    if(flag==1&&s1.charAt(i)=='1')
			    	count++;
			    else if(flag==1&&s1.charAt(i)=='0')
			    {
			    	l.add(count);
			    	count=0;
			    	flag=0;
			    }else if(flag==0&&s1.charAt(i)=='0')
			    	continue;
			    else if(flag==0&&s1.charAt(i)=='1')
			    {
			    	count++;
			    	flag=1;
			    }
				
				
			}
			l.add(count);
			long sum=0;
		
			Collections.sort(l);
			
			for(int i=l.size()-1;i>=0;i--)
					{
				sum+=l.get(i);
				i--;
					}
			
			System.out.println(sum);
			
			
		}
	
		}
	    
	    
	    
	    
	    }
