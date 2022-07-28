import java.util.Scanner;

public class Main
{	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		boolean[] vis=new boolean[100005];
		int[] a=new int[100005];
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int k=sc.nextInt();
			int mex=0;
			int max=0;
			for(int i=1;i<=n;i++)
			{
				a[i]=sc.nextInt();
				if(a[i]<=n)
					vis[a[i]]=true;
				max=Math.max(max, a[i]);
			}
			while(vis[mex])
				mex++;
			for(int i=1;i<=n;i++)
				if(a[i]<=n)
					vis[a[i]]=false;
			int mcx=(mex+1+max)/2;
			if(mcx>max)
				System.out.println(n+k);
			else
			{
				boolean ok=false;
				for(int i=1;i<=n;i++)
					ok|=(a[i]==mcx);
				System.out.println(n+(((k>0) && !ok)?1:0));
			}
		}
	}
}
