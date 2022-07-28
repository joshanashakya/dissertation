import java.util.Scanner;

public class Main
{	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int last=sc.nextInt();
			int ans=0;
			for(int i=1;i<n;i++)
			{
				int nw=sc.nextInt();
				int a=Math.min(last, nw);
				int b=Math.max(last, nw);
				while(a*2<b)
				{
					ans++;
					a*=2;
				}
				last=nw;
			}
			System.out.println(ans);
		}
	}
}
