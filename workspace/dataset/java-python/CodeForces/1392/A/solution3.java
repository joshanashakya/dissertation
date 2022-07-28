import java.util.*;
public class Omkar_and_Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t-->0)
		{
			int n=sc.nextInt();
			int y=sc.nextInt();
			int c=0,sum=y;
			for(int i=1;i<n;i++)
			{
				int x=sc.nextInt();
				if(x!=sum)
				   {
					 sum=sum+x;
					 c++;
				   }
			}
			if(c>0)
			System.out.println(1);
			else
				System.out.println(n);
		}
	}

}

