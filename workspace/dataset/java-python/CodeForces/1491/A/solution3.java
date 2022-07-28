import java.util.*;
public class KLargestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
		int a[]=new int[n];
		int x=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]==1)
				x++;
		}
		for(int i=0;i<q;i++)
		{
			int t=sc.nextInt();
			int m=sc.nextInt();
			if(t==1)
			{
				a[m-1]=1-a[m-1];
				if(a[m-1]==1)
					x++;
				else
					x--;
			}
			else
			{
				if(m<=x)
					System.out.println(1);
				else
					System.out.println(0);
			}
		}
	}

}

