import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int t=s.nextInt();
		
		for(int i=0;i<t;i++)
		{
			int n=s.nextInt();
			
			int[] x=new int[n];
			int[] y=new int[n];
			
			for(int j=0;j<n;j++)
			{
				x[j]=s.nextInt();
				y[j]=s.nextInt();
			}
			
			Arrays.sort(x);
			Arrays.sort(y);
			
			if(n%2!=0)
			{
				System.out.println(1);
			}
			else
			{
				long a=x[(n/2)]-x[(n/2)-1]+1;
				long b=y[(n/2)]-y[(n/2)-1]+1;
				
				System.out.println(a*b);
			}
			
		}
		
	}
	
}
