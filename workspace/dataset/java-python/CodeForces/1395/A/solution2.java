import java.util.*;
public class BoboniuLikestoColorBalls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			long r=sc.nextLong(),g=sc.nextLong(),b=sc.nextLong(),w=sc.nextLong(),c=0,c1=0;
			if(r%2==0&&r>0) c++; if(g%2==0&&g>0) c++;  if(b%2==0&&b>0) c++;
			if(r==0) c1++;  if(g==0)  c1++;   if(b==0)  c1++;
			//System.out.println(c1+" "+c);
			if(c1==3||(c1==1&&c==2)||(c1==1&&c==1&&w%2==0)||(c1==2&&c==1)||(c1==2&&c==0&&w%2==0))
				System.out.println("YES");
			else if(w==0&&c==2)
				System.out.println("YES");
			else if(r>0&&b>0&&g>0)
			{
				if(c==3||c==0||(c==1&&w%2!=0)||(c==2&&w%2==0))
					System.out.println("YES");
				else
					System.out.println("NO");
			}
			else
				System.out.println("NO");
				
			
		}
	}

}

