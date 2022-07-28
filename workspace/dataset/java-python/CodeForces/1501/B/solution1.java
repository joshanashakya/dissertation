import java.util.*;
public class Codeforces1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) 
		{
			int n=sc.nextInt();
			int arr[]=new int[n];
			int ans[]=new int[n];
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
			int m = arr[n-1];
			for(int i=n-1;i>=0;i--)
			{
				if(m<=arr[i])
					m=arr[i];
				if(m<=0)
					ans[i]=0;
				else
				{
					ans[i] = 1;
					m--;
				}
			}
			for(int i=0;i<n;i++)
				System.out.print(ans[i]+" ");
			System.out.println();
		}
	}
}
