//package practice; import java.io.BufferedReader;import java.io.IOException;import java.io.InputStreamReader;import java.math.BigInteger;import java.text.SimpleDateFormat;import java.time.Instant;import java.time.LocalDate;import java.time.LocalDateTime;import java.time.LocalTime;import java.util.*;  public class Main {			 static class FastReader  	    { 	        BufferedReader br; 	        StringTokenizer st; 	  	        public FastReader() 	        { 	            br = new BufferedReader(new	                     InputStreamReader(System.in)); 	        } 	  	        String next() 	        { 	            while (st == null || !st.hasMoreElements()) 	            { 	                try	                { 	                    st = new StringTokenizer(br.readLine()); 	                } 	                catch (IOException  e) 	                { 	                    e.printStackTrace(); 	                } 	            } 	            return st.nextToken(); 	        } 	  	        int nextInt() 	        { 	            return Integer.parseInt(next()); 	        } 	  	        long nextLong() 	        { 	            return Long.parseLong(next()); 	        } 	  	        double nextDouble() 	        { 	            return Double.parseDouble(next()); 	        } 	  	        String nextLine() 	        { 	            String str = ""; 	            try	            { 	                str = br.readLine(); 	            } 	            catch (IOException e) 	            { 	                e.printStackTrace(); 	            } 	            return str; 	        } 	    }	 		public static void main(String[] args) throws IOException {      FastReader sc=new FastReader();      int t=sc.nextInt();      while(t-->0) {    	  int n=sc.nextInt();          if(n%2==0) {          	for(int i=n;i>=1;i--) {          		System.out.print(i+" ");          	}          	System.out.println();          }          else {          	StringBuilder s1=new StringBuilder();          	StringBuilder s2=new StringBuilder();          	s2.append(n+" ");          	for(int i=(n/2)+1;i<=n-1;i++) {          		s1.append(i+" ");          	}          	for(int i=n/2;i>=1;i--) {          		s2.append(i+" ");          	}          	s1.append(s2);          	System.out.println(s1);          }    	        }	} }
