import java.io.*;import java.util.*; public class Solution {	 public static void main(String[] args) throws Exception    {		     FastReader fr=new FastReader();             int t=fr.nextInt();             while(t-->0) {            	 int n=fr.nextInt();                 int a[]=new int[n];                 Set<Integer> set=new HashSet<>();                 for(int i=0;i<n;i++) {                	 a[i]=fr.nextInt();                	 if(a[i]%2==0)                		 set.add(a[i]);                 }                 Arrays.sort(a);//40 40 40 1                 int ops=0;                 for(int i=n-1;i>=0;i--) {                	 if(set.contains(a[i])) {                		 set.remove(a[i]);                		 while(a[i]%2==0) {                			 a[i]/=2;                			 if(set.contains(a[i]))                				 set.remove(a[i]);                			 ops++;                		 }                	 }                 }                         System.out.println(ops);            			       		       		     }    }		         }	 		 	  class Pair{	 int x;	 int y;	 Pair(int x,int y){		 this.x=x;		 this.y=y;	 }	  }    class FastReader{    BufferedReader br;    StringTokenizer st;     public FastReader()    {        br = new BufferedReader(new                InputStreamReader(System.in));    }     String next()    {        while (st == null || !st.hasMoreElements())        {            try            {                st = new StringTokenizer(br.readLine());            }            catch (IOException e)            {                e.printStackTrace();            }        }        return st.nextToken();    }     int nextInt()    {        return Integer.parseInt(next());    }     long nextLong()    {        return Long.parseLong(next());    }     double nextDouble()    {        return Double.parseDouble(next());    }     String nextLine()    {        String str = "";        try        {            str = br.readLine();        }        catch (IOException e)        {            e.printStackTrace();        }        return str;    }} 