import java.io.*;import java.util.*; public class Solution {	public static void main (String[] args) {		Scanner sc=new Scanner(System.in);		int n=sc.nextInt();		int res=0;		for(int i=1;i<=n;i++)		{		    for(int j=i;j<=n;j++)		    {		        int k=i^j;		        if(k>=i && k>=j && i+j>k && k<=n)		        {		            res++;		        }		      //  for(int k=j+1;k<=n;k++)		      //  {		      //      boolean ans=((i^j^k)==0)&&(i+j>k);		      //      if(ans)		      //      {		      //          res++;		      //      }		      //  }		    }		}		System.out.println(res);	}}