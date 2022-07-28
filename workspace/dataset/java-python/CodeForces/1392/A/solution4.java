import java.util.*;
public class OmkarAndPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			int c=0,a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
				if(i>0&&a[i]!=a[i-1])
					c++;
			}
			if(c>0) System.out.println(1);
			else System.out.println(n);
		}
	}

}

