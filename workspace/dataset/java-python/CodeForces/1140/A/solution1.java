import java.util.*;public class c1{	public static void main(String[]args)	{		int n;		Scanner reader=new Scanner(System.in);		n=reader.nextInt();		int[]a=new int[n];		int days,max=0,i;		for(i=0;i<n;++i)		{			a[i]=reader.nextInt();		}		for(i=days=0;i<n;++i)		{			if(max<a[i])				max=a[i];			if(max==i+1)				++days;		}		System.out.println(days);	}}  										 	 			 		     	
