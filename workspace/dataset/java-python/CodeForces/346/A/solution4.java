import java.io.*;import java.util.*;public class Solution {	static Scanner sc=new Scanner(System.in);	static PrintWriter out=new PrintWriter(System.out);	//Main Method	static long gcd(long a,long b) {		return b==0?a:gcd(b,a%b);	}	public static void main(String args[]) {		int test=1;		while(test-->0) {			int n=sc.nextInt();			long max=0,g=0;			for(int i=0;i<n;i++) {				long a=sc.nextLong();				g=gcd(g,a);				max=Math.max(a, max);			}			long val=max/g-n;			out.println((val%2==1)?"Alice":"Bob");		}		out.flush();		out.close();	}}
