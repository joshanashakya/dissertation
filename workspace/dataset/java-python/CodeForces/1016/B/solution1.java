import java.io.*; import java.util.*; public class Solution {	 		 public static void main(String[] args) throws Exception    {		 FastReader fr=new FastReader();		 int n=fr.nextInt();		 int m=fr.nextInt();		 int q=fr.nextInt();		 String s=fr.next();		 String t=fr.next();				 int st[]=new int[s.length()];		 for(int i=0;i<=n-m;i++) {			 if(s.charAt(i)==t.charAt(0)) {				 if(s.substring(i,i+m).equals(t)) {					st[i]++;					 				 }			 }		 }		 while(q-->0) {			 int l=fr.nextInt()-1;			 int r=fr.nextInt()-1;		     int ans=0;		     for(int i=l;i<=r;i++) {		    	 if(st[i]>0&&(i+m-1)<=r)		    		 ans++;		     }		     			 System.out.println(ans);		 }		 		 				  				 	}	 	 	 		public static long gcd(long n1,long n2) {		 if (n2 == 0) {		        return n1;		    }		    return gcd(n2, n1 % n2);	}	 public static boolean isPali(String s) {		 int i=0;		 int j=s.length()-1;		 while(i<=j) {			 if(s.charAt(i)!=s.charAt(j))				 return false;			 i++;			 j--;		 }		 return true;	 }	 public static String reverse(String s) {		 String res="";		 for(int i=0;i<s.length();i++) {			 res+=s.charAt(i);		 }		 return res;	 }				 	 public static int bsearch(long suf[],long val) {		 int i=0;		 int j=suf.length-1;		 while(i<=j) {			 int mid=(i+j)/2;			 if(suf[mid]==val)				 return mid;			 else if(suf[mid]<val)				 j=mid-1;			 else				 i=mid+1;		 }		 return -1;	 }	 	 	 		 	 	public static int[] getFreq(String s) {		int a[]=new int[26];		for(int i=0;i<s.length();i++) {			a[s.charAt(i)-'a']++;		}		return a;			}	 	 public static boolean isPrime(int n) {		 		 for(int i=2;(i*i)<=n;i++) {			 if(n%i==0)				 return false;		 }		 return true;	 }            	                                }class Pair implements Comparable<Pair>{	int cost;	int type;		Pair(int cost,int type){		this.cost=cost;				this.type=type;	}	public int compareTo(Pair o) {		return o.type-this.type;	}} 		 		 	     class FastReader{    BufferedReader br;    StringTokenizer st;     public FastReader()    {        br = new BufferedReader(new                InputStreamReader(System.in));    }     String next()    {        while (st == null || !st.hasMoreElements())        {            try            {                st = new StringTokenizer(br.readLine());            }            catch (IOException e)            {                e.printStackTrace();            }        }        return st.nextToken();    }     int nextInt()    {        return Integer.parseInt(next());    }     long nextLong()    {        return Long.parseLong(next());    }     double nextDouble()    {        return Double.parseDouble(next());    }     String nextLine()    {        String str = "";        try        {            str = br.readLine();        }        catch (IOException e)        {            e.printStackTrace();        }        return str;    }} 
