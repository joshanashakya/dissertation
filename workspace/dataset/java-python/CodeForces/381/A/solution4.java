/*package whatever //do not write package name here */ import java.util.*;public class GFG {	public static void main (String[] args) {	Scanner sc=new Scanner (System.in);	int t=1; 	while(t-->0) {	int sp=0,dp=0;	    	int n= sc.nextInt();	int []a= new int[n];	    for (int i=0; i<n; i++)	    a[i] = sc.nextInt();	    int first=0;	    int last=a.length-1;	    for(int i=0;i<n;i++)	    {	        if(a[last]>a[first])	        {	            if(i%2==0)	                sp=sp+a[last];	                else 	                dp=dp+a[last];	                last--;	        }	 else	 {	                if(i%2==0)	                sp=sp+a[first];	                else 	                dp=dp+a[first];	                first++;	 }	       	    }	    System.out.println(sp+" "+dp);	}	}}
