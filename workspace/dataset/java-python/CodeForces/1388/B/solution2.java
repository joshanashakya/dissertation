import java.io.*;
import java.util.*;
 public class Solution {
	 public static void main(String[] args) throws Exception
    {
		     FastReader fr=new FastReader();
		      int t=fr.nextInt();
		      while(t-->0) {
		         int n=fr.nextInt();
		         int digs=4*n-n;
		         int nines=digs/4;//0
		         int eights=n-nines;
		         
		         StringBuilder sb=new StringBuilder();
		         while(nines>0) {
		        	 sb.append("9");
		        	 nines--;
		         }
		         while(eights>0) {
		         sb.append("8");
		         eights--;
		         }
		         
		         System.out.println(sb.toString());
		     }
		      
		    	
		}
	
	
	 
	
	
	
 }
 
	 
 class Pair implements Comparable<Pair>{
	 int x;
	 int y;
	 Pair(int x,int y){
		 this.x=x;
		 this.y=y;
	 }
	 public int compareTo(Pair o) {
		 if(this.x!=o.x)
			 return this.x-o.x;
		 else
			 return this.y-o.y;
	 }
	 
 }

  

class FastReader
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
            catch (IOException e)
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


