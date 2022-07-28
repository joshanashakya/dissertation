import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int t=s.nextInt();
		
		for(int i=0;i<t;i++)
		{
			int n=s.nextInt();
			int k=s.nextInt();
			
			String str=s.next();
			
			int count=0;
			
			int range=(n-1)/2;
			
			for(int j=0;j<range;j++)
			{
				if(str.charAt(j)!=str.charAt(n-1-j))
				{
					break;
				}
				else
				{
					count++;
				}
			}
			
			if(k<=count)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
			
		}
		
	}
	
}

