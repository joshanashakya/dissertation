/* package codechef; // don't place package name! */ import java.util.*;import java.lang.*;import java.io.*; /* Name of the class has to be "Main" only if the class is public. */public class Codechef{	public static void main (String[] args) throws java.lang.Exception	{		Scanner sc = new Scanner(System.in);		int t;		t = sc.nextInt();		while(t-->0){		int n = sc.nextInt();		int x = sc.nextInt();		int a = sc.nextInt();		int b = sc.nextInt();		int rem;	   	    int mx = a>b ? a : b;	    int mn = a<b ? a : b;		b=mx;		a=mn;				if(a==1 && b == n )		System.out.println(n-1);				else if(b+x>n)		{		    rem = (b+x)-n;		    b = n;		    if(a-rem<=0)		    a=1;		    else		    a=a-rem;		    System.out.println(b-a);		}				else		System.out.println(b+x-a);				}			}}
