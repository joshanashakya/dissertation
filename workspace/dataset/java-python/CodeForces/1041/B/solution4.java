import java.util.Scanner; public class _0705BuyingaTVSet {		static long gcd(long a,long b) {//		long min=Math.min(a, b);//		long i=min;//		long ans=1;//		while(i>1) {//			if(a%i==0 && b%i==0) {//				ans=i;//				break;//			}//			i--;//		}//		return ans;	    {	      if (b == 0)	        return a;	      return gcd(b, a % b); 	    }	}		public static void main(String[] args) {								Scanner sc = new Scanner(System.in);		long a=sc.nextLong();		long b=sc.nextLong();		long x=sc.nextLong();		long y=sc.nextLong();		long val=gcd(x,y);		x=x/val;		y=y/val;		System.out.println(Math.min(a/x, b/y));			} }