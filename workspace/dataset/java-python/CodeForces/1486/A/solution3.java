import java.util.Scanner;

public class Main
{	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int need=0;
			long have=0;
			boolean ans=true;
			for(int j=0;j<n;j++)
			{
				need+=j;
				have+=sc.nextInt();
				if(have<need)
					ans=false;
			}
			if(ans)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
