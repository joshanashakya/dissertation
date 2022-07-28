import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) 
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			int res[]=new int[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			int max = a[n-1];
			for(int i=n-1;i>=0;i--)
			{
				max = max > a[i] ? max : a[i];
				if(max > 0)
				{
					res[i] = 1;
					max --;
				}
				else
				{
					res[i] = 0;
				}
			}
			for(int i=0;i<n;i++)
				System.out.print(res[i]+" ");
			System.out.println();
		}
	}
}
