import java.util.Scanner; public class eularian {	public static long solve(long n,long a,long b)	{		if(n%2==0)		{			long ans1=n*a;			long ans2=(n/2)*b;			return Math.min(ans2, ans1);		}		else		{			long ans1=(n-1)*a;			long ans2=((n-1)/2)*b;			return Math.min(ans2,ans1)+a;		}	}         public static void main(String args[])         {        	 Scanner sc=new Scanner(System.in);        	 int t=sc.nextInt();        	 while(t-->0)        	 {        		 long n=sc.nextLong();        		 long a=sc.nextLong();        		 long b=sc.nextLong();        		System.out.println(solve(n,a,b));        	 }         }}
