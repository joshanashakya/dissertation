import java.util.*;public class Main{	public static void main(String[] args) {		Scanner sc=new Scanner(System.in);		int n=sc.nextInt();		long t=sc.nextLong();		long []arr=new long[n];		for(int i=0;i<n;i++)		{		    arr[i]=sc.nextLong();		}		//int left_Time=86400;		int c=0;		for(int i=0;i<n;i++)		{		    c++;		    if(86400-arr[i]>0)		    {		        t=t-(86400-arr[i]);		       // System.out.println(t);		        		        if(t<=0)		        {		            break;		        }		    }		    		}		System.out.println(c);	}}
