import java .util.*;public class Main{	public static void main(String[] args) {	Scanner in=new Scanner (System.in);			long x=in.nextInt();	while( x>0)	{x--;	long n=in.nextInt();	long m=in.nextInt();	if(n==1)	System.out.println("0");	else if(n==2)	System.out.println(m);		else if(n>2)	System.out.println(2*m);				  		}}} 