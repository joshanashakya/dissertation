 import java.io.BufferedInputStream;import java.math.BigInteger;import java.util.Scanner; public class Main{	public static void main(String[] args) {		Scanner cin = new Scanner(new BufferedInputStream(System.in));		int a = cin.nextInt();		int b = cin.nextInt();		int n = a, m = b;	    int maxx = 0;	    while(a!=0)	    {	        maxx = Math.max(maxx,a%10);	        a/=10;	    }	    while(b!=0)	    {	        maxx = Math.max(maxx,b%10);	        b/=10;	    }//	    System.out.println(maxx);	    int ans = 0;	    for(int i=maxx+1;i<=16;i++)	    {	    	String nn = Integer.toString(n);	    	String mm = Integer.toString(m);	        BigInteger s1 = new BigInteger(nn,i);	        BigInteger s2 = new BigInteger(mm,i);//	        System.out.println(s1 + " " + s2 + " "+s1.add(s2).toString(i));	        ans = Math.max(ans, s1.add(s2).toString(i).length());	    }	    System.out.println(ans);	}} 	 	   	     				 		 				 	  	 	