import java.util.*;public class Main{	public static void main(String[] args) {	    Scanner sc=new Scanner(System.in);		int l=sc.nextInt();		int r=sc.nextInt();		int a=sc.nextInt();		int ans=0;		if(l==r)		{		    ans=l+r+(a%2==0?a:a-1);		}		else		{		    int min=Math.min(l,r);		    int max=Math.max(l,r);		    int diff=Math.abs(l-r);		    if(a==diff)		    {		        ans=l+r+a;		    }		    else if(a<diff)		    {		        ans=(a+min)*2;		    }		    else		    {		        a=a-diff;		        ans=2*max+(a%2==0?a:a-1);		    }		}		System.out.println(ans);	}}
