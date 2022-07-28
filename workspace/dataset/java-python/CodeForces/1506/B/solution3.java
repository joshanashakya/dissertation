

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;


public class Main {
	 static class FastReader 

	    { 
	        BufferedReader br; 
	        StringTokenizer st; 
	  
	        public FastReader() 
	        { 
	            br = new BufferedReader(new
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
	 
	 
	public static void main(String[] args) throws IOException {
      FastReader sc=new FastReader();
      int t=sc.nextInt();
      StringBuilder sb=new StringBuilder();
      while(t-->0) {
    	 int n=sc.nextInt();
    	 int k=sc.nextInt();
    	 String s=sc.nextLine();
    	 int count=0;
    	 for(int i=0;i<n;i++) {
    		 if(s.charAt(i)=='*') {
    			 s=s.substring(0,i)+"x"+s.substring(i+1);
    			 count++;
    			 break;
    		 }
    	 }
    	 
    	 for(int i=n-1;i>=0;i--) {
    		 if(s.charAt(i)=='*') {
    			 s=s.substring(0,i)+"x"+s.substring(i+1);
    			 count++;
    			 break;
    		 }
    	 }
    	 for(int i=0;i<n;i++) {
    		 if(s.charAt(i)=='x') {
    			 boolean flag=false;
    			 for(int j=1;j<=k;j++) {
    				 if(i+j<n && s.charAt(i+j)=='x') {
    					 flag=true;
    					 break;
    				 }
//    				 else if(i+j>=n) {
//    					 flag=true;
//    					 break;
//    				 }
    			 }
    			 if(!flag) {
    				 for(int j=k;j>=1;j--) {
    					 if(i+j<n && s.charAt(i+j)=='*') {
    						 s=s.substring(0,i+j)+"x"+s.substring(i+j+1);
    						 count++;
    						 break;
    					 }
    				 }
    			 }
    		 }
    	 }
    	 sb.append(count);
    	 sb.append(System.lineSeparator());
    	 
      }
      System.out.println(sb);
	}

}

