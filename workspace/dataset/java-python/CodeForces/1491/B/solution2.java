import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int u=sc.nextInt();
			int v=sc.nextInt();
			int[] a=new int[n+1];
			for(int i=1;i<=n;i++)
			  a[i]=sc.nextInt();
		     int ans = Integer.MAX_VALUE;
		     for(int i=2;i<=n;i++)
		     {
		     	if(Math.abs(a[i]-a[i-1])>=2)  
		     	 ans=0;
		     	if(Math.abs(a[i]-a[i-1])==1)
		     	  ans=Math.min(ans,Math.min(u,v));
		     	if(a[i]==a[i-1])
		     	  ans=Math.min(ans,v+Math.min(u,v));
		     }
		     System.out.println(ans);
		}
	}
}

