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
			int[] a=new int[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			int res=0;
			int[] cnt=new int[3];
			for(int i=0;i<n;i++)
				cnt[a[i]%3]++;
			while(Math.min(cnt[0], Math.min(cnt[1], cnt[2]))!=n/3)
			{
				for(int i=0;i<3;i++)
					if(cnt[i]>n/3)
					{
						res++;
						cnt[i]--;
						cnt[(i+1)%3]++;
					}
			}
			System.out.println(res);
		}
	}
}
