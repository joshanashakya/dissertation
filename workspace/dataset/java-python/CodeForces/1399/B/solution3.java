import java.util.*;
public class GiftsFixing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int a[]=new int[n];
			int b[]=new int[n],l1=Integer.MAX_VALUE,l2=Integer.MAX_VALUE;
			long c=0;
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
				if(a[i]<l1)
					l1=a[i];
			}
			for(int i=0;i<n;i++)
			{
				b[i]=sc.nextInt();
				if(b[i]<l2)
					l2=b[i];
			}
			for(int i=0;i<n;i++)
			{
				if(a[i]>l1&&b[i]>l2)
				{
					int t1=a[i]-l1<b[i]-l2?a[i]-l1:b[i]-l2;
					a[i]-=t1; b[i]-=t1;
					c+=t1;
				}
				if(a[i]>l1)
				c+=a[i]-l1; 
				if(b[i]>l2) 
					c+=b[i]-l2;
				//System.out.println("c="+c);
			}
			System.out.println(c);
		}
	}

}

