import java.util.*; public  class Example {    static int[] dp;     public static void main(String[] args) {        Scanner sc = new Scanner(System.in);        //  int t=sc.next         long a = sc.nextLong();        long b = sc.nextLong();        long x = sc.nextLong();        long y = sc.nextLong();       // System.out.println(gcd(x,y));         long xx=x/gcd(x,y);         long  yy=y/gcd(x,y);          long ans=Math.min(a/xx,b/yy);         System.out.println(ans);     }     private static long gcd(long a, long b) {        if (b == 0)            return a;        return gcd(b, a % b);    } } 		 			 	 		  				 	 	  	   	
