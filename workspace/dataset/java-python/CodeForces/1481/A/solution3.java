import java.util.*;
public class SpaceNavigation
{
   public static void main(String[] args)
   {
	Scanner sc=new Scanner(System.in);
	int t,x,y,u,d,r,l;
	String s="";

	x=y=u=d=r=l=0;

	t=sc.nextInt();

	while(t-->0)
	{
	    x=sc.nextInt();
	    y=sc.nextInt();

	    s=sc.next();

	    for(int i=0;i<s.length();i++)
	    {
	        if(s.charAt(i)=='U')
		   u++;
		else if(s.charAt(i)=='D')
		   d--;
		else if(s.charAt(i)=='R')
		   r++;
		else
		   l--;
	    }

	    if((y>=d && y<=u) && (x>=l && x<=r))
		System.out.println("YES");
	    else
		System.out.println("NO");

	    l=d=r=u=0;
	}

    }

}		
