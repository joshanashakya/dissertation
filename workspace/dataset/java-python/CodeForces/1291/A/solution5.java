/* package codechef; // don't place package name! */ import java.util.*;import java.lang.*;import java.io.*; /* Name of the class has to be "Main" only if the class is public. */public  class Codechef{	public static void main (String[] args) throws java.lang.Exception	{	    		Scanner sc=new Scanner(System.in);		int t=sc.nextInt();		for(int y=0;y<t;++y)		{		    int n=sc.nextInt();		    String s=sc.next();		    StringBuilder sb=new StringBuilder();		    int tempsum=0;		    int index=-1;		    for(int i=0;i<n;++i)		    {		        tempsum=tempsum+s.charAt(i)-48;		        if(tempsum%2==0 && (s.charAt(i)-48)%2!=0)		        {		            index=i;		            break;		        }		    }		    if(index==-1)		    {		        System.out.println(-1);		        continue;		    }		    else		    {		        for(int i=0;i<=index;++i)		        {		            System.out.print(s.charAt(i));		        }		        System.out.println();		    }		}	}}
