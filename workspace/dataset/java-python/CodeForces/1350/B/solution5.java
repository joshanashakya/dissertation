import java.io.*;import java.util.*; public class Solution {	 public static void main(String[] args) throws Exception    {		     FastReader fr=new FastReader();		     int t=fr.nextInt();		     while(t-->0) {		    	int n=fr.nextInt();		    	int size[]=new int[n+1];		    	for(int i=1;i<=n;i++) {		    		size[i]=fr.nextInt();		    	}		    	 		    	int maxi=Integer.MIN_VALUE;		    	int dp[]=new int[n+1];		    	for(int i=1;i<=dp.length-1;i++) {		    		dp[i]=-1;		    	}		    	for(int i=1;i<=n;i++) {		    		maxi=Math.max(maxi,1+Rec(i,size,dp));		    	}		    	System.out.println(maxi);		     }                                 }	 public static int Rec(int idx,int size[],int dp[]) {		 if(idx>=size.length)			 return 0;		 if(dp[idx]!=-1)			 return dp[idx];		 int count=0;		 for(int i=idx*2;i<=size.length-1;i+=idx) {			 if(size[i]>size[idx])				 count=Math.max(count,1+Rec(i,size,dp));		 }		 return dp[idx]=count;	 }			 	} class Pair{	 int x;	 int y;	 Pair(int x,int y){		 this.x=x;		 this.y=y;	 }	  }    class FastReader{    BufferedReader br;    StringTokenizer st;     public FastReader()    {        br = new BufferedReader(new                InputStreamReader(System.in));    }     String next()    {        while (st == null || !st.hasMoreElements())        {            try            {                st = new StringTokenizer(br.readLine());            }            catch (IOException e)            {                e.printStackTrace();            }        }        return st.nextToken();    }     int nextInt()    {        return Integer.parseInt(next());    }     long nextLong()    {        return Long.parseLong(next());    }     double nextDouble()    {        return Double.parseDouble(next());    }     String nextLine()    {        String str = "";        try        {            str = br.readLine();        }        catch (IOException e)        {            e.printStackTrace();        }        return str;    }} 