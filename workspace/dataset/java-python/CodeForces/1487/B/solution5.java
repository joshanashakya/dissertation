import java.util.*;

public class A {
 
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 	while(t-->0) 
	 	{
	 		long n=sc.nextLong();	
	 		long k=sc.nextLong();	
		   k--;
		   if(n%2==0) {
			  long ans=k%n;
			   System.out.println(ans+1);
		   }
		   else
		   {
			   long mid=n/2;
			   long ans=((k/mid)+k)%n;
			   System.out.println(ans+1);
		   }
	 }	
 }	
}
