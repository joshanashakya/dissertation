import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int t=s.nextInt();
		
		for(int i=0;i<t;i++) 
		{
			long n=s.nextInt();
			
			long sum=0;
			
			int p=0;
			
			for(long j=1;j<=n;j++)
			{
				sum=sum+s.nextLong();
				
				if((j*(j-1))/2>sum)
				{
					p=1;
				}
			}
			
			if(p==1)
				System.out.println("NO");
			else
				System.out.println("YES");
			
		}
				

	}
	
}
