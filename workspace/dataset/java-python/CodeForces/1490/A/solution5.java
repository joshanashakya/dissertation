import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int t=s.nextInt();
		
		for(int i=0;i<t;i++)
		{
			int n=s.nextInt();
			
			int[] arr=new int[n];
			
			for(int j=0;j<n;j++)
			{
				arr[j]=s.nextInt();
			}
			
			int ans=0;
			
			for(int j=1;j<n;j++)
			{
				int max=Math.max(arr[j],arr[j-1]);
				int min=Math.min(arr[j],arr[j-1]);
				
				min=2*min;
				
				while(min<max)
				{
					min=min*2;
					ans++;
				}
				
				
			}
			
			System.out.println(ans);
			
		}
		
		
	}
	
}
