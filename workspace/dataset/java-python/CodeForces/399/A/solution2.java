import java.util.*;import java.lang.*;import java.io.*; /* Name of the class has to be "Main" only if the class is public. */public class Codechef{	public static void main (String[] args) throws java.lang.Exception	{		Scanner sc =new Scanner(System.in);		int l=0,n=0,r=0,i=0,f=0;		if(sc.hasNext())		l=sc.nextInt();		if(sc.hasNext())		n=sc.nextInt();		if(sc.hasNext())		r=sc.nextInt();		if(l>=3 && l<=100 && n>=1 && n<=l && r>=1 && r<=l)		{		if(n-r>1)		{		    f=n-r;		    System.out.print("<<" + " ");		}		else		{		    f=1;		}		for(i=f;i<=n+r;i++)		{		    if(i==n)		    System.out.print("(" + i + ")" + " ");		    else if(i<=l)		    System.out.print(i + " ");		}		if(n+r<l)		    System.out.print(">>");			    }	}}