import java.util.Scanner;
import java.lang.Math; 
import java.util.Arrays;

public class pa {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[])
	{
		int t=sc.nextInt();
		for(int j=0;j<t;j++)
		{
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
			Arrays.sort(arr);
			boolean flag=true;
			for (int i=1;i<n;i++) 
			{
				if(arr[i]>arr[i-1]+1)
				{
					System.out.println("NO");
					flag=false;
					break;
				}	
			}
			if(flag==true)
				System.out.println("YES");
		}
	}


	

}
